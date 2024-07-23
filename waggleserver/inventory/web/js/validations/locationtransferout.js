function getAttributeDetail(id,me,row,col){
	let cols=screenObjects.getScreenObject("lout_data").getCols();
	if(me.getCellTag(row,cols.product)!="" && !toscreen.getSaveInProgress()){
		if(toNumber(me.getText(row,cols.isattribute))==1 && me.getCellPopup(row,col)){
			invokeAttributeDialog(me,row,col,"productprops",me.getInputField());
			return false;				
		}else if(toNumber(me.getText(row,cols.isattribute))==0){
			return onAttributeClose(me,row,col);			
		}		
	}
	return true;
}
function validateRow(id,me,row,col){
	let cols=me.getCols();
	if(col==cols.rate || col==cols.quantity){
		calculateAmount(row);
	}
	return true;
}
function onRateQuantityChange(id,me){
	let t=me.getParent();
	calculateAmount(t.getCurrentRow());
	calculateTotal();
	return true;
}
function onTaxChange(id,me){
	calculateTotal();
	return true;
}
function validateStock(id,me,row,col){
	let cols=screenObjects.getScreenObject("lout_data").getCols();
	let stock=me.getText(row,cols.stock);
	let qty=me.getText(row,cols.basequantity);
	let negativestock=me.getText(row,cols.allownegative);
	if(toNumber(negativestock)==0){
		if(toNumber(qty)>toNumber(stock)){
			alert("insufficient Stock");
			return false;
		}
	}
	return true;
}
function calculateTotal(){
	let total=0;
	let totalTax=0;
	let netTotal=0;
	let totalDisc=0;
	let totalServiceTax=0;
	let t=screenObjects.getScreenObject("lout_data");
	let cols=t.getCols();
	let s=t.getSize();
	for(let i=0;i<s;i++){
		total+=toNumber(t.getText(i,cols.amount));
		totalTax+=toNumber(t.getText(i,cols.ptaxamt));
		totalServiceTax+=toNumber(t.getText(i,cols.srtaxamt));
		totalDisc+=toNumber(t.getText(i,cols.discamt));
		netTotal+=toNumber(t.getText(i,cols.netamount));
	}
	screenObjects.getScreenObject("total").setValue(roundOff(total,2));
	screenObjects.getScreenObject("taxamt").setValue(roundOff(totalTax,2));
	screenObjects.getScreenObject("servtaxamt").setValue(roundOff(totalServiceTax,2));
	screenObjects.getScreenObject("discamt").setValue(roundOff(totalDisc,2));
	screenObjects.getScreenObject("totalamt").setValue(roundOff(netTotal,2));
	$("#totamt").html(roundOff(total,2));
	$("#vat").html(roundOff(totalTax,2));
	$("#disc").html(roundOff(totalDisc,2));
	$("#netAmt").html("Net Amount   "+roundOff(netTotal,2));
	
}
function calculateAmount(row){
	let t=screenObjects.getScreenObject("lout_data");
	let cols=t.getCols();	
	let baseqty=0;
	baseqty=toNumber(t.getText(row,cols.conversionvalue))*toNumber(t.getText(row,cols.quantity));
	t.setText(row,cols.basequantity,baseqty);
	let amt=roundOff(toNumber(t.getText(row,cols.rate))*baseqty,2);
	let tax=0;
	let netAmt=0;
	let servTax=0;
	let taxableamt=((amt / (100 + toNumber(t.getText(row,cols.ptaxperc)))) * 100);	
	if(toNumber(t.getText(row,cols.taxincl))==0){
		taxableamt=amt;
	}
	let disc=roundOff(taxableamt*toNumber(t.getText(row,cols.discperc))/100,2);
	taxableamt-=disc;	
	tax=roundOff(taxableamt*toNumber(t.getText(row,cols.ptaxperc))/100,2);
	servTax=roundOff(taxableamt*toNumber(t.getText(row,cols.srtaxperc))/100,2);
	netAmt=roundOff(taxableamt+toNumber(servTax)+toNumber(tax),2);
	t.setText(row,cols.ptaxamt,tax);
	t.setText(row,cols.srtaxamt,servTax);
	t.setText(row,cols.discamt,roundOff(disc,2));
	t.setText(row,cols.amount,amt);
	t.setText(row,cols.netamount,netAmt);
	t.setText(row,cols.taxableamt,roundOff(taxableamt,2));
}    
function save(id,me){
	let d=toscreen.processDataToSave();
	if("FAILED"!=d){
		let s=new FlexUI.Ajax();
		showLoader();
		let r=s.callAjax("POST","/inventory/service/transferout/location",d);
		hideLoader();
		if(r.result=="Success"){
			alert(r.message+" [No:"+r.outno+"]");
			toscreen.clearScreen();
			setDefaultBranch();
			return r.key;			
		}else{
			alert(r.message);		
		}
	return 0;
}
}
function delete1(id,me){
	toscreen.setOperation("DELETE");	
	let l={url:"/inventory/service/ajax",ajax:"transferlocationedit",scrollEnabled:true,searchFromList:false,dsi:2,params:[{n:"branch",src:"branch",ft:true},{n:"location",src:"location",ft:true}],results:[{tgt:"code",id:"0",tt:false}],closeFunction:"onEscClose"};
	let lov=new FlexUI.LOV("e_lov",me,l);
	lov.onLovClose.subscribe(onEditClose);
	lov.show();
}	
function add(id,me){
	toscreen.clearScreen();
	setDefaultBranch();
	toscreen.setOperation("ADD");
	screenObjects.getScreenObject("branch").focus();
}
function edit(id,me){
	toscreen.setOperation("EDIT");	
	let l={url:"/inventory/service/ajax",ajax:"transferlocationedit",scrollEnabled:true,searchFromList:false,dsi:2,params:[{n:"branch",src:"branch",ft:true},{n:"location",src:"location",ft:true}],results:[{tgt:"code",id:"0",tt:false}],closeFunction:"onEscClose"};
	let lov=new FlexUI.LOV("e_lov",me,l);
	lov.onLovClose.subscribe(onEditClose);
	lov.show();
}
function onEditClose(e,args){	
	let branch=screenObjects.getScreenObject("branch");
	branch.focus();
	let a=new FlexUI.Ajax();
	showLoader();
	let r=a.callAjax("GET","/inventory/service/transferout/location","transferin=false&outno="+args.result[0]+"&branch="+branch.getTag());
	add('','');
	toscreen.setOperation("EDIT");
	toscreen.loadData(r);
	calculateTotal();
	hideLoader();
}
function loadDataView(no){	
	let branch=screenObjects.getScreenObject("branch");
	branch.focus();
	let a=new FlexUI.Ajax();
	showLoader();
	let r=a.callAjax("GET","/inventory/service/transferout/location","transferin=false&outno="+no+"&branch="+branch.getTag());
	toscreen.disableInputs(true);
	toscreen.loadData(r);
	calculateTotal();
	hideLoader();
}
function onAttributeClose(me,row,col){
	let cols=screenObjects.getScreenObject("lout_data").getCols();
	let branch=screenObjects.getScreenObject("branch");
	let location=screenObjects.getScreenObject("location");
	let v=null;
	if(toNumber(me.getText(row,cols.isattribute))==1 && me.getRelatedValues(row,col)){
		v=l.callAjax("GET","/inventory/service/ajax","ic=0&id=transtock&branch="+branch.getTag()+"&location="+location.getTag()+"&pmcode="+me.getCellTag(row,col)+"&udw="+me.getRelatedValues(row,col).condition);
	}else{
		v=l.callAjax("GET","/inventory/service/ajax","ic=0&id=transtock&branch="+branch.getTag()+"&location="+location.getTag()+"&pmcode="+me.getCellTag(row,col));
	}	
	if(v!=null){
		if(v.data && v.data.length==1){
			setBatchInfo(v.data[0]);
			return true;
		}else if(v.data && v.data.length>1){
			let d=null;
			if(toNumber(me.getText(row,cols.isattribute))==1 && me.getRelatedValues(row,col)){
				d={url:"/inventory/service/ajax?udw="+me.getRelatedValues(row,col).condition,ajax:"transtock",scrollEnabled:true,searchFromList:false,dsi:1,params:[{n:"branch",src:"branch",ft:true},{n:"location",src:"location",ft:true},{n:"pmcode",src:"lout_data",ft:true,row:"cr",col:"1"}],results:[],standalone:true};
			}else{
				d={url:"/inventory/service/ajax",ajax:"transtock",scrollEnabled:true,searchFromList:false,dsi:1,params:[{n:"branch",src:"branch",ft:true},{n:"location",src:"location",ft:true},{n:"pmcode",src:"lout_data",ft:true,row:"cr",col:"1"}],results:[],standalone:true};
			}
			let lov=new FlexUI.LOV("s_lov",me,d,v.data);
			lov.onLovClose.subscribe(onStockClose);
			lov.show();
			return false;
		}else{
			let r=l.callAjax("GET","/inventory/service/ajax","ic=0&id=productrate&pmcode="+me.getCellTag(row,col));
			if(r!=null){
				if(r.data && r.data.length==1){
					setRateDetails(me,cols,r)
				}
			}
		}	
	}	
	return true;
}
function getSerialDetail(id,me,row,col){
	let cols=screenObjects.getScreenObject("lout_data").getCols();
	if(me.getCellTag(row,cols.product)!=""){
		if(toNumber(me.getText(row,cols.serialized))==1 && me.getCellPopup(row,col)){
			invokeSerialDialog(me,row,col,"productserial",me.getInputField(),toNumber(me.getText(row,col)),true);
			return false;				
		}
	}
	let stock=me.getText(row,cols.stock);
	let qty=me.getText(row,cols.basequantity);
	let negativestock=me.getText(row,cols.allownegative);
	if(toNumber(negativestock)==0){
		if(toNumber(qty)>toNumber(stock)){
			alert("insufficient Stock");
			return false;
		}
	}	
	return true;
}
function setDefaultBranch(){
	let branch=screenObjects.getScreenObject("branch");
	let location=screenObjects.getScreenObject("location");
	branch.setTag(defbranch[0][1]);
	branch.setValue(defbranch[0][0]);
	location.setTag(defbranch[0][3]);
	location.setValue(defbranch[0][2]);
	screenObjects.getScreenObject("branch").focus();	
}
function onStockClose(e,args){
	setBatchInfo(args.result);
	screenObjects.getScreenObject("lout_data").checkAndMove('Next',false);
}
function setBatchInfo(result){
	let products=screenObjects.getScreenObject("lout_data");
	let cols=products.getCols();
	
	products.setCurrentRowText(cols.csdid,result[2]);
	products.setCurrentRowText(cols.batchno,result[4]);
	products.setCurrentRowText(cols.expdt,result[5]);
	products.setCurrentRowText(cols.rate,result[3]);
	products.setCurrentRowText(cols.stock,result[13]);
	products.setCurrentRowText(cols.batchdt,result[9]);
	products.setCurrentRowText(cols.selling,result[11]);
	products.setCurrentRowText(cols.mrp,result[10]);
	products.setCurrentRowText(cols.discperc,result[6]);
	products.setCurrentRowText(cols.ptaxperc,result[7]);
	products.setCurrentRowText(cols.isdid,result[12]);
	products.setCurrentRowText(cols.barcode,result[14]);
	products.setCurrentRowText(cols.obranch,result[15]);
	products.setCurrentRowText(cols.oisdid,result[16]);	
	products.setCurrentRowText(cols.attribid,result[17]);
	products.setCurrentRowText(cols.srtaxperc,result[8]);
	products.setCurrentRowText(cols.netcost,result[18]);
}
function setRateDetails(me,cols,v){
	me.setCurrentRowText(cols.rate,v.data[0][0]);
	me.setCurrentRowText(cols.discperc,v.data[0][1]);
	me.setCurrentRowText(cols.mrp,v.data[0][2]);
	me.setCurrentRowText(cols.selling,v.data[0][3]);
	
	me.setCurrentRowText(cols.csdid,0);
	me.setCurrentRowText(cols.batchno,0);
	me.setCurrentRowText(cols.expdt,"01/04/2012");
	me.setCurrentRowText(cols.stock,0);
	me.setCurrentRowText(cols.batchdt,0);
	me.setCurrentRowText(cols.isdid,0);
	me.setCurrentRowText(cols.discperc,0);
	me.setCurrentRowText(cols.isdid,0);
	me.setCurrentRowText(cols.barcode,0);
	me.setCurrentRowText(cols.obranch,0);
	me.setCurrentRowText(cols.oisdid,0);
	me.setCurrentRowText(cols.attribid,0);
	me.setCurrentRowText(cols.srtaxperc,0);
	me.setCurrentRowText(cols.netcost,0);
}

function closeScreen(){
		$('#rep').show();
		$('#filter').css("display","block");
		$('#dtfilter').css("display","block");
		$('#brdCr').css("display","block");
		$('#maincontent').empty();
}
function onEscClose(){	
	add('','');
}