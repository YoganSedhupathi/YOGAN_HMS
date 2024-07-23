<!DOCTYPE HTML>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
  <title>Suppliers</title>
</head>
<body>


	<div class="card border-0 shadow">
		<div class="card-body lpage" >
			<div class="row w-100" >
				<div class="col-md-6 d-flex align-items-center">
					<h4 class="header-title">Suppliers</h4>
				</div>
				<div  class="col-md-6 text-right" id="addGrp">
					
				</div>
				<div  class="col-md-6 text-right" id="saveGrp" style='display:none'>
					<div class="mb-3">
						<button type="button" class="btn btn-edit" onclick='onSaveClicked()'><span class="mdi mdi-check-circle-outline me-2"></span>Save</button>
						<button type="button" class="btn btn-clear mx-3" onclick='hideMasterData()'><span class="mdi mdi-refresh me-2"></span>Cancel</button>
					</div>
				</div>
			   </div>
			   <div class="row" id="jqcontainer" ><div class="table-container" ><div id="xyz" class="w-100"></div></div></div>	
			
			<div id="callback" style="display:none" >

				<div class="table-container">
					<div class="row w-100 ml-8">                    
						<div id="group1" class="row"></div>
					</div>
					<div class="row w-100 ml-8">
							<div id="group2" class="row"></div>
					</div>
					<div class="row w-100 ml-8">
							<div id="group3" class="row"></div>
						</div>
				</div>
			   
			</div>
		</div>
	</div>

		



<!-- JQ grid ends-->

<script>
  	var l=new FlexUI.Ajax();
    var sProps={title:{height:30,width:100,name:"AMC"},container:{id:"callback",isdialog:false},js:"",screen:[
  	{name:"group1",title:"Supplier Details",pcolumns:3,colcss:"col-sm-4 col-md-4 col-lg-4",height:40,width:98,minWidth:500,minHeight:200,colWidth:45,float:"left",backColor:"beige",contentType:"Fields",
  	fields:[{colno:0,name:"code",inputType:0,type:"INT",caption:"Code",mandatory:false,defaultValue:"0","maxValue":0,"textLength":10,"decimalLength":0,"visible":false,"readOnly":true,"chkTag":false,nf:"name"},
  	{colno:1,name:"branch",inputType:0,type:"LOV",caption:"Branch",mandatory:false,defaultValue:"0","maxValue":0,"textLength":10,"decimalLength":0,"visible":false,"readOnly":false,"chkTag":false,nf:"name",lovOptions:{url:"/inventory/service/ajax",ajax:"userbranch",scrollEnabled:true,searchFromList:false,dsi:0,params:[],results:[]}},
  	{colno:0,name:"name",inputType:0,type:"TEXT",caption:"Name",mandatory:true,defaultValue:"","maxValue":0,"textLength":100,"decimalLength":0,"visible":true,"readOnly":false,"chkTag":false,nf:"alias"},
  	{colno:1,name:"alias",inputType:0,type:"TEXT",caption:"Alias",mandatory:false,defaultValue:"","maxValue":0,"textLength":100,"decimalLength":0,"visible":true,"readOnly":false,"chkTag":false,nf:"supptype"},
  	{colno:2,name:"supptype",inputType:0,type:"LOV",caption:"Type",mandatory:true,defaultValue:"0","maxValue":0,"textLength":10,"decimalLength":0,"visible":true,"readOnly":false,"chkTag":true,nf:"address1",lovOptions:{url:"/inventory/service/ajax",ajax:"supptype",scrollEnabled:true,searchFromList:false,dsi:0,params:[],results:[]}},
  	]
  	},{name:"group2",title:"Contact Details",pcolumns:2,height:40,width:98,minWidth:500,minHeight:200,colWidth:45,float:"left",backColor:"beige",contentType:"Fields",
  	fields:[
  	{colno:0,name:"address1",inputType:0,type:"TEXT",caption:"Building",mandatory:false,defaultValue:"","maxValue":0,"textLength":100,"decimalLength":0,"visible":true,"readOnly":false,"chkTag":false,nf:"address2"},
  	{colno:1,name:"address2",inputType:0,type:"TEXT",caption:"Street",mandatory:false,defaultValue:"","maxValue":0,"textLength":100,"decimalLength":0,"visible":true,"readOnly":false,"chkTag":false,nf:"city"},
  	{colno:0,name:"city",inputType:0,type:"TEXT",caption:"City",mandatory:false,defaultValue:"","maxValue":0,"textLength":50,"decimalLength":0,"visible":true,"readOnly":false,"chkTag":false,nf:"pincode"},
	{colno:1,name:"pincode",inputType:0,type:"TEXT",caption:"PinCode",mandatory:false,defaultValue:"0","maxValue":0,"textLength":10,"decimalLength":0,"visible":true,"readOnly":false,"chkTag":false,nf:"mobile"},
	{colno:0,name:"mobile",inputType:0,type:"TEXT",caption:"Mobile",mandatory:false,defaultValue:"0","maxValue":0,"textLength":10,"decimalLength":0,"visible":true,"readOnly":false,"chkTag":false,nf:"phone"},  
	{colno:1,name:"phone",inputType:0,type:"TEXT",caption:"Phone",mandatory:false,defaultValue:"0","maxValue":0,"textLength":10,"decimalLength":0,"visible":true,"readOnly":false,"chkTag":false,nf:"creditdays"}
	]
  	},{name:"group3",title:"Account Details",pcolumns:2,height:40,width:98,minWidth:500,minHeight:200,colWidth:45,float:"left",backColor:"beige",contentType:"Fields",
  	fields:[
  	{colno:0,name:"chequename",inputType:0,type:"TEXT",caption:"Cheque Name",mandatory:false,defaultValue:"","maxValue":0,"textLength":100,"decimalLength":0,"visible":false,"readOnly":false,"chkTag":false,nf:"taxno"},
  	{colno:1,name:"taxno",inputType:0,type:"TEXT",caption:"TaxNo",mandatory:false,defaultValue:"","maxValue":0,"textLength":20,"decimalLength":0,"visible":false,"readOnly":false,"chkTag":false,nf:"license1"},  		
  	{colno:0,name:"license1",inputType:0,type:"TEXT",caption:"DLNo",mandatory:false,defaultValue:"","maxValue":0,"textLength":20,"decimalLength":0,"visible":false,"readOnly":false,"chkTag":false,nf:"panno"},
  	{colno:1,name:"panno",inputType:0,type:"TEXT",caption:"PanNo",mandatory:false,defaultValue:"","maxValue":0,"textLength":20,"decimalLength":0,"visible":false,"readOnly":false,"chkTag":false,nf:"creditdays"},
	{colno:0,name:"creditdays",inputType:0,type:"INT",caption:"Credit Days",mandatory:false,defaultValue:"0","maxValue":300,"textLength":30,"decimalLength":0,"visible":true,"readOnly":false,"chkTag":false,nf:"creditlimit"},
	{colno:1,name:"creditlimit",inputType:0,type:"DECIMAL",caption:"Credit Limit",mandatory:false,defaultValue:"0","maxValue":999999.99,"textLength":30,"decimalLength":2,"visible":true,"readOnly":false,"chkTag":false,nf:"opening"},
	{colno:0,name:"opening",inputType:0,type:"DECIMAL",caption:"Opening Balance",mandatory:false,defaultValue:"0","maxValue":999999.99,"textLength":30,"decimalLength":2,"visible":true,"readOnly":false,"chkTag":false,nf:"status"},
	{colno:1,name:"status",inputType:1,type:"TEXT",caption:"Status",mandatory:true,defaultValue:"","textLength":10,"visible":true,"readOnly":false,"chkTag":false,nf:"",keys:"Active~InActive",values:"Active~InActive"}
	]
  	}]};
  var screenProps=changeScreenAttributes(110005,sProps);
  
  var supplierm=new FlexUI.Screen("supplier",screenProps);
  jqReport(14,"#xyz");
  function addMasterData(){ 
  	supplierm.clearScreen(); 
  	$('#callback').css('display','block');
  	$('#saveGrp').css('display','block');
  	$('#history').css('display','block');
  	$('#addGrp').css('display','none');
  	$('#xyz').css('display','none');
	$('#jqcontainer').css('display','none');
  	screenObjects.getScreenObject("name").focus();
  }
  function hideMasterData(){
  	$('#callback').css('display','none');
  	$('#saveGrp').css('display','none');
  	$('#history').css('display','none');
  	$('#addGrp').css('display','block');
  	$('#xyz').css('display','block');
	$('#jqcontainer').css('display','block');
  }  
  function toggleHeaderRow(){
  	toggleSearchToolBar("14");
  }
  toggleHeaderRow();
  function onSaveClicked(id,me){
	
    var code=screenObjects.getScreenObject("code").getValue();
	
    if(code!="0" && code!=""){
		
    	supplierm.setOperation("EDIT");
    }
	
	var d=supplierm.processDataToSave();
	
	if("FAILED"!=d){
		
		var s=new FlexUI.Ajax();
		
		showLoader();
		var r=s.callAjax("POST","/inventory/service/supplier",d);
		hideLoader();
		if(r.result=="Success"){
			setErrorMessage(r.message+" [No:"+r.code+"]");
			supplierm.clearScreen();
			hideMasterData();
			reloadGrid("14");
			return r.key;			
		}else{
			setErrorMessage(r.message);		
		}
		return 0;
	}
  }
  
  function loadOrderData(url,code,did){
  	if(url==""){
  		url="/inventory/service/supplier";
  	}
  	if(code!=""){
  		code="code="+code+"";
  	}
  	showLoader();
	var v=l.callAjax("GET",url,code);
	supplierm.loadData(v);
	$('#callback').css('display','block');
  	$('#saveGrp').css('display','block');
  	$('#history').css('display','block');
  	$('#addGrp').css('display','none');
  	$('#xyz').css('display','none');
	  $('#jqcontainer').css('display','none');
  	hideLoader();
  	screenObjects.getScreenObject("name").focus();
  }
</script> 
</body>
</html>