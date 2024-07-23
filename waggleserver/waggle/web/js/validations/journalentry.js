function setDefaultBranch(){
	var branch=screenObjects.getScreenObject("branch");
	var mode=screenObjects.getScreenObject("mode");
	branch.setTag(defbranch[0][1]);
	branch.setValue(defbranch[0][0]);
	onModeChange('mode',mode);	
	screenObjects.getScreenObject("trantype").focus();
}
function onModeChange(id,me){
	if(me.getValue()=='CA'){
		voucher.showHideGroup('chequedetails',false);
		voucher.showHideGroup('carddetails',false);
	}else if(me.getValue()=='CC'){
		voucher.showHideGroup('chequedetails',false);
		voucher.showHideGroup('carddetails',true);	
	}else if(me.getValue()=='CQ'){
		voucher.showHideGroup('chequedetails',true);
		voucher.showHideGroup('carddetails',false);	
	}
}
function validateCrdr(id,me,row,col){
	var t=screenObjects.getScreenObject("ledgers_data");
	var cols=t.getCols();
	if("Cr"==t.getText(row,cols.crdr)){
		t.setText(row,cols.dramount,"0.00");
	}else{
		t.setText(row,cols.cramount,"0.00");
	}
	amountChange(id,me.getInputField());
	return true;
}
function amountChange(id,me){
	var t=me.getParent();
	var cols=t.getCols();
	var crAmount=0;
	var drAmount=0;
	var s=t.getSize();
	for(var x=0;x<s;x++){
			if(t.getText(x,cols.crdr)=='Cr'){
				crAmount=crAmount+toNumber(t.getText(x,cols.cramount));
			}else{
				drAmount=drAmount+toNumber(t.getText(x,cols.dramount));
			}
	}
	screenObjects.getScreenObject("debitamount").setValue(drAmount);
	screenObjects.getScreenObject("creditamount").setValue(crAmount);
}
function crDrChange(id,me){
	var t=me.getParent();
	var cols=t.getCols();
	var row=t.getCurrentRow();
	if(t.getText(row,cols.crdr)=='C' || t.getText(row,cols.crdr)=='c' || t.getText(row,cols.crdr)=='Cr' || t.getText(row,cols.crdr)=='cr'){
		t.setText(row,cols.crdr,'Cr');
	}else if(t.getText(row,cols.crdr)=='D' || t.getText(row,cols.crdr)=='d' || t.getText(row,cols.crdr)=='Dr' || t.getText(row,cols.crdr)=='dr'){
		t.setText(row,cols.crdr,'Dr');
	}else{
		t.setText(row,cols.crdr,'');
	}
}

function delete1(id,me){
	voucher.setOperation("DELETE");	
	var l={url:"/waggle/service/ajax",ajax:"vouchers",scrollEnabled:true,searchFromList:false,dsi:2,params:[{n:"branch",src:"branch",ft:true}],results:[{tgt:"code",id:"0",tt:false}],closeFunction:"onEscClose"};
	var lov=new FlexUI.LOV("e_lov",me,l);
	lov.onLovClose.subscribe(onEditClose);
	lov.show();
}	
function add(id,me){
	voucher.clearScreen();
	setDefaultBranch();
	voucher.setOperation("ADD");
	screenObjects.getScreenObject("refno").focus();
}
function edit(id,me){
	voucher.setOperation("EDIT");	
	var l={url:"/waggle/service/ajax",ajax:"vouchers",scrollEnabled:true,searchFromList:false,dsi:2,params:[{n:"branch",src:"branch",ft:true}],results:[{tgt:"code",id:"0",tt:false}],closeFunction:"onEscClose"};
	var lov=new FlexUI.LOV("e_lov",me,l);
	lov.onLovClose.subscribe(onEditClose);
	lov.show();
}
function onEditClose(e,args){	
	screenObjects.getScreenObject("refno").focus();
	var a=new FlexUI.Ajax();
	showLoader();
	voucher.setOperation("EDIT");		
	var r=a.callAjax("GET","/waggle/service/account/vouchers","code="+args.result[0]+"&branchcode="+args.result[9]);
	voucher.loadData(r);
	onModeChange("mode",screenObjects.getScreenObject("mode"));
	amountChange("ledgers_data",screenObjects.getScreenObject("ledgers_data").getInputField());
	hideLoader();
}
function onEscClose(){	
	add('','');
}
function save(id,me){
	var totalCrAmt=screenObjects.getScreenObject('creditamount');
	var totalDrAmt=screenObjects.getScreenObject('debitamount');
	var tranType=screenObjects.getScreenObject('trantype').getValue();
	if(toNumber(totalCrAmt.getValue())!=toNumber(totalDrAmt.getValue())){
		alert("Credit and Debit Amount must be equal");
		return;
	}
	var d=voucher.processDataToSave();
	if("FAILED"!=d){
		var s=new FlexUI.Ajax();
		showLoader();
		var r=s.callAjax("POST","/waggle/service/account/vouchers",d);
		hideLoader();
		if(r.result=="Success"){
			alert(r.message+" [No:"+r.billno+"]");
			if(tranType=="1" || tranType=="2"){
				printPayment(r.key);
			}
			voucher.clearScreen();
			setDefaultBranch();
			return r.key;			
		}else{
			alert(r.message);		
		}
		return 0;
	}
}
function onEscClose(){	
	add('','');
}
function printPayment(code){
	var branch=screenObjects.getScreenObject("branch");
	var printData={};
	$.ajax({
    url: "/waggle/service/account/vouchers/print?branch="+branch.getTag()+"&code="+code,
    type: "GET",
    async: false,
    contentType:"application/json",
    dataType: "json",
    success: function (r) {
		printData=r;		
    }
	});			
	printData["branchname"]=branch.getValue();
	printData["address1"]="27,Javulikara Street";
	printData["address2"]="Tiruvarur - 610 001";
	printData["address3"]="Phone - 242292,240292";		
	printData["type"]="VCHER";
	$.ajax({
        url: "http://localhost:9191",
        type: "POST",
        async: false,
        contentType:"application/x-www-form-urlencoded",
        data:"printdata="+JSON.stringify(printData),
        dataType: "json",
        success: function (r) {
			//alert(r.result);		
        }
    });		
}