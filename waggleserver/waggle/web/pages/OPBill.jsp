<!DOCTYPE HTML>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
  <title>Admission</title>
</head>
<%
   String mode=request.getParameter("mode");
   String code=request.getParameter("code");
   String userId=(String)session.getAttribute("LOGIN_ID");
   String branch=request.getParameter("branch");   
   String screenCode=request.getParameter("screencode");
   if(screenCode==null){
   		screenCode="11";
   }
   String rptTitle=(String)request.getParameter("title");
%>
<body>



	<div class="card border-0 shadow">
		<div class="card-body ">
		  <!--Header-->
		  <div class="row w-100">
					  <div class="col-md-6 d-flex align-items-center">
						  <h4 class="header-title"><%=rptTitle%></h4>
					  </div>
					  <div  class="col-md-6 text-right">
			  </div>
		  </div>
		  <!--Header End-->
		  <!--Content -->
			<div class="row" id="jqcontainer" style="display:none;">
			  <div class="table-container">
				<div id="xyz" class="w-100">
	  
				</div>
			  </div>
			</div>	
			<div id="callback" class="mt-3">
			  <div class="row  cBor">
				<div class="col-sm-12 col-md-12 col-lg-12 ">     
				 	<div  class="col-md-2 col-sm-2 mpZero " style="display:none">
						<div class="form-group mbotto">
						<div class="col-md-12"><label>Search By </label></div>
						<div class="col-md-4" style="display:none">
						<select class="form-control" id="searchtype">
						<option value="all">All</option>
						<option value="casuality">Casuality</option>
						<option value="corporate">Claim Patients</option>
						<option value="rtpatient">RT Patients</option>					
						<option value="appointments">Appointments</option>
						</select>
						</div>
						<div class="col-md-4" style="display:none">
						<select class="form-control" id="searchpatient">
						<option value="regno">Casuality No/Reg No/Claim No/RT No</option>						
						<option value="pname">Name</option>
						<option value="mobile">Mobile No</option>
						</select>
						</div>
						</div>
					</div>
					<div class="input-group mb-1"> 
							<div class="col-md-2"><label for="smobileno" class="form-lable">Search By </label></div>
							<div class="col-md-4"><input type="text" class="form-control" id="smobileno"/></div>
							<div  class="col-md-6 col-sm-6 mpZero">
								<div class="col-md-12 form-lable">Reg No:&nbsp;<label  class="form-lable" id="lcsno"></label>&nbsp;|&nbsp;IP.No:&nbsp;<label class="form-lable" id="lipno">IPNo</label>&nbsp;|&nbsp;Room No:&nbsp;<label class="form-lable" id="lroomno">RoomNo</label></div>
							</div>
					</div>
				</div>
				
				<div class="col-sm-12 col-md-12 col-lg-12">  
					<div class="input-group mb-1">
						           <div class="col-md-2"><label for="patientname" class="form-lable">Patient Name </label></div>
								   <div class="col-md-4"><input type="text" class="form-control" id="patientname"><input type="hidden" class="form-control" id="patientcode"><input type="hidden" class="form-control" id="hospregcode"><input type="hidden" class="form-control" id="appid"><input type="hidden" class="form-control" id="casualityno"><input type="hidden" class="form-control" id="csno"><input type="hidden" class="form-control" id="claimno"></div>
								   
								   <div class="col-md-2"><label for="mobileno" class="form-lable">Mobile  </label></div>
								   <div class="col-md-4"><input type="text" class="form-control" id="mobileno"></div>
					</div>
				</div>
				<div class="col-sm-12 col-md-12 col-lg-12">  
					<div class="input-group mb-1">
						<div class="col-md-2"><label for="patientage" class="form-lable">Age </label></div>
						<div class="col-md-4"><input type="text" class="form-control" id="patientage"></div>
						<div class="col-md-2"><label for="gender" class="form-lable">Gender</label></div>
						<div class="col-md-4"><select class="form-control" id="gender"></select></div>
					</div>
				</div>
				<div class="col-sm-12 col-md-12 col-lg-12">  
					<div class="input-group mb-1">
						<div class="col-md-2"><label for="doctorname" class="form-lable">Doctor name</label></div>
								   <div class="col-md-4"><input type="text" class="form-control" id="doctorname"><input type="hidden" id="doctorcode"/></div>
								   
								   <div class="col-md-2"><label for="referredby" class="form-lable">Refer By</label></div>
								   <div class="col-md-4"><input type="text" class="form-control" id="referredby"><input type="hidden" id="referralcode"/></div>
						</div>
				</div>

				<div class="col-sm-12 col-md-12 col-lg-12">                     
					<div class="input-group mb-1">
						<div class="col-md-2">	
						 <label for="buname" class="form-lable">Business Unit</label>	
						 
						</div>
						<div class="col-md-4">
								 <input type="text" class="form-control" id="buname">
								 <input type="hidden" class="form-control" id="bucode">
								 <input type="hidden" class="form-control" id="butype">
								 <input type="hidden" class="form-control" id="allowedtypes">
								 <input type="hidden" class="form-control" id="crno">
								 <input type="hidden" class="form-control" id="crsno">
								 <input type="hidden" class="form-control" id="crstatus" value="1">
					   </div>
					</div>
				</div>
			</div>
	  
			   <div class="row ">
				  <div class="table-container">
					  <div class="col-md-12 col-sm-12 garea" id="billgrid"></div>
				  </div>
				</div>
				<div class="row w-100 mt-3">
					<div class="col-md-6">
					  <div class="hstack justify-content-start">
						<div id="saveGrp">
						  <button type="button" id="btnLoadCR" class="btn btn-edit" onclick="loadClinicalRequests()" style="display:none"><span class="mdi mdi-pencil me-2"></span>Edit</button>
						  <button type="button" id="btnClearScr" class="btn btn-clear mx-3" onclick="clearInnerScreen()"><span class="mdi mdi-refresh me-2"></span>Clear</button>
						</div>
					  </div>
					</div>
					<div class="col-md-6">
						<div class="hstack justify-content-end">
                            <div class="">
                                <div class="card-total px-3 rounded-3">
                                    <h6 class="dicount-type hstack gap-1">
                                        <span class="text-dark me-2"><h3>Net Amount:</h3></span>
                                        <h3><span class="net-amount me-2" style="color:Green" id="netAmt"></span></h3>
                                    </h6>
                                </div>
        				 		 <div class="col-md-8" style="display:none"><label id="totalamt"></label></div>
                            </div>
                        </div>
					</div>
				</div>
				
		  </div>
		 <!--Content End-->
		</div>
	  </div>





	
	
	    <div class="col-md-12 col-sm-12 marLfBx panelOrange hcH">		
			<div class="col-md-12 col-sm-12 mpZero">
			<div class="clearfix"></div> 
			<div class="col-md-12 col-sm-12 mpZero" style="display:none">
				<div  class="col-md-6 col-sm-6 mpZero">		
				<div class="form-group mbotto">
					<div class="col-md-4"><label>IP No</label></div>
					<div class="col-md-8"><input type="text" class="form-control" id="ipno"><input type="hidden" id="billno"/><input type="hidden" id="code"/><input type="hidden" id="billdate"/></div>
				</div>
				</div>	
				<div  class="col-md-6 col-sm-6 mpZero">		
				<div class="form-group mbotto">
					<div class="col-md-4"><label>Room No</label></div>
					<div class="col-md-8"><label id="roomno">Room No</label><input type="hidden" id="roomcode"/></div>
				</div>
				</div>
			</div>
		 </div>
 	    </div>
 

 <div class="modal" id="tenderdlg" tabindex="-1"  aria-modal="true" role="dialog">
	 <div id="tender" class="modal-dialog" role="document">
		 <div class="modal-content">
			<div class="modal-header">
			   <div class='pop_lov_hed_txt'>Bill Amount Rs. <span id="dispTotalAmt"></span></div>
			</div>
			<div class="modal-body">
					 <div id='tender' class='pop_lov_inp_box'>
						 <div class="col-md-12 col-sm-12 mpZero" id="">
							 <div  class="col-md-12 col-sm-12 mpZero" name="cashtender">		
								 <div class="form-group mbotto">
									 <div class="col-md-4"><label>Cash</label></div>
									 <div class="col-md-8"><input type="text" class="form-control" id="tcashamount"><input type="hidden" class="form-control" id="cashamount"></div>
								 </div>
							 </div>
							 <div class='clearfix'></div>
							 <div  class="col-md-12 col-sm-12 mpZero" name="credittender">		
								 <div class="form-group mbotto">
									 <div class="col-md-4"><label>Credit</label></div>
									 <div class="col-md-8"><input type="text" class="form-control" id="creditamount"></div>
								 </div>
							 </div>
							 <div class='clearfix'></div>
							 <div  class="col-md-12 col-sm-12 mpZero" name="cardtender">		
								 <div class="form-group mbotto">
									 <div class="col-md-4"><label>Machine</label></div>
									 <div class="col-md-8"><select class="form-control" id="cardbank"></select></div>
								 </div>
							 </div>																																		
							 <div class='clearfix'></div>
							 <div  class="col-md-12 col-sm-12 mpZero" name="cardtender">		
								 <div class="form-group mbotto">
									 <div class="col-md-4"><label>Credit Card</label></div>
									 <div class="col-md-8"><input type="text" class="form-control" id="tcardamount"></div>
								 </div>
							 </div>	
							 <div class='clearfix'></div>
							 <div  class="col-md-12 col-sm-12 mpZero" name="cardtender">		
								 <div class="form-group mbotto">
									 <div class="col-md-4"><label>Service Charge</label></div>
									 <div class="col-md-8"><input type="text" class="form-control" id="srvchgamount" disabled></div>
								 </div>
							 </div>
							 <div class='clearfix'></div>
							 <div  class="col-md-12 col-sm-12 mpZero" name="cardtender">		
								 <div class="form-group mbotto">
									 <div class="col-md-4"><label>Card Amount</label></div>
									 <div class="col-md-8"><input type="text" class="form-control" id="cardamount" disabled></div>
								 </div>
							 </div>																								
							 <div class='clearfix'></div>
							 <div  class="col-md-12 col-sm-12 mpZero" name="corptender">		
								 <div class="form-group mbotto">
									 <div class="col-md-4"><label>Corporate</label></div>
									 <div class="col-md-8"><input type="text" class="form-control" id="sponsoramount"></div>
								 </div>
							 </div>
							 <div class='clearfix'></div>
							 <div  class="col-md-12 col-sm-12 mpZero">		
								 <div class="form-group mbotto">
									 <div class="col-md-4"><label>Tendered</label></div>
									 <div class="col-md-8"><input type="text" class="form-control" id="tenderamount" disabled><input type="hidden" class="form-control" id="netamount"></div>
								 </div>
							 </div>
							 <div class='clearfix'></div>
							 <div  class="col-md-12 col-sm-12 mpZero">		
								 <div class="form-group mbotto">
									 <div class="col-md-4"><label>Balance</label></div>
									 <div class="col-md-8"><input type="text" class="form-control" id="balanceamount" disabled></div>
								 </div>
							 </div>																																										
						 </div>
						 <div class="col-md-12 col-sm-12 mpZero" name="corptender">
							 <div class="col-md-12 col-sm-12 mpZero">
								<div class="form-group mbotto">
								<div class="col-md-4"><label>Corporate</label></div>
								<div class="col-md-8"><input type="text" class="form-control" id="sponsorname"><input type="hidden" class="form-control" id="sponsorcode"></div>
								</div>
							 </div>
							 <div class="clearfix"></div>
							 <div class="col-md-12 col-sm-12 mpZero">
								<div class="form-group mbotto">
								<div class="col-md-4"><label>Card No</label></div>
								<div class="col-md-8"><input type="text" class="form-control" id="sponsorcardno"></div>
								</div>
							 </div>					
							 <div class="clearfix"></div>
							 <div class="col-md-12 col-sm-12 mpZero">
								<div class="form-group mbotto">
								<div class="col-md-4"><label>Approval No</label></div>
								<div class="col-md-8"><input type="text" class="form-control" id="sponsorapprovalno"></div>
								</div>
							 </div>															
						 </div>
					 </div>
					 
					 <div style="display: flex; justify-content: right;"  id="actButton">
						<button style="width: 100px; height: 50px;" id="btnSave" class="btn btn-primary priBut" type="button" onclick="saveBill()">Save</button>
						<button style="width: 100px; height: 50px;" id="btnClear" class="btn btn-default" type="button" onclick="cancelTenderDlg()">Cancel</button>
					  </div>
			</div>
		 </div>
	 </div>
 </div>
	


	
	<script>
	loadBranchData();
	var banks=loadCardBankData();
	var tenderData=getBillTenderConfig();
    var sProps={js:"",screen:[
  	{name:"group1",predesigned:true,contentType:"Fields",
  	fields:[{name:"bucode",inputType:0,type:"INT",caption:"",mandatory:true,defaultValue:"0","maxValue":0,"textLength":10,"decimalLength":0,"visible":false,"readOnly":true,"chkTag":false,nf:"code"},
  	{name:"code",inputType:0,type:"INT",caption:"",mandatory:false,defaultValue:"0","maxValue":0,"textLength":10,"decimalLength":0,"visible":false,"readOnly":true,"chkTag":false,nf:"billno"},
  	{name:"billno",inputType:0,type:"INT",caption:"",mandatory:false,defaultValue:"0","maxValue":0,"textLength":10,"decimalLength":0,"visible":false,"readOnly":true,"chkTag":false,nf:"branchcode"},
  	{name:"billtype",inputType:0,type:"INT",caption:"",mandatory:false,defaultValue:"2","maxValue":0,"textLength":10,"decimalLength":0,"visible":false,"readOnly":true,"chkTag":false,nf:"branchcode"},
  	{name:"patienttype",inputType:0,type:"INT",caption:"",mandatory:false,defaultValue:"2","maxValue":0,"textLength":10,"decimalLength":0,"visible":false,"readOnly":true,"chkTag":false,nf:"branchcode"},
  	{name:"branchcode",inputType:0,type:"INT",caption:"",mandatory:true,defaultValue:"0","maxValue":0,"textLength":10,"decimalLength":0,"visible":false,"readOnly":true,"chkTag":false,nf:"ipno"},
  	{name:"smobileno",inputType:0,type:"TEXT",caption:"",mandatory:false,defaultValue:"","maxValue":0,"textLength":10,"decimalLength":0,"visible":false,"readOnly":false,"chkTag":false,nf:"buname",validation:"checkPatientExists"},

  	{name:"ipno",inputType:0,type:"TEXT",caption:"",mandatory:false,defaultValue:"","maxValue":0,"textLength":10,"decimalLength":0,"visible":false,"readOnly":false,"chkTag":false,nf:"patientname"},
  	{name:"roomno",inputType:4,type:"SPAN",caption:"",mandatory:false,defaultValue:"","maxValue":0,"textLength":100,"decimalLength":0,"visible":false,"readOnly":true,"chkTag":false,nf:"patientname"},
  	{name:"roomcode",inputType:0,type:"INT",caption:"",mandatory:false,defaultValue:"0","maxValue":0,"textLength":100,"decimalLength":0,"visible":false,"readOnly":true,"chkTag":false,nf:"patientname"},
  	{name:"patientname",inputType:0,type:"TEXT",caption:"",mandatory:true,defaultValue:"","maxValue":0,"textLength":100,"decimalLength":0,"visible":true,"readOnly":false,"chkTag":false,nf:"mobileno"},
  	{name:"patientcode",inputType:0,type:"INT",caption:"",mandatory:false,defaultValue:"0","maxValue":0,"textLength":10,"decimalLength":0,"visible":false,"readOnly":true,"chkTag":false,nf:"patientage"},
  	{name:"mobileno",inputType:0,type:"INT",caption:"",mandatory:false,defaultValue:"","maxValue":0,"textLength":10,"decimalLength":0,"visible":true,"readOnly":false,"chkTag":false,nf:"patientage"},
  	{name:"patientage",inputType:0,type:"TEXT",caption:"",mandatory:true,defaultValue:"0","maxValue":0,"textLength":3,"decimalLength":0,"visible":true,"readOnly":false,"chkTag":false,nf:"gender"},
  	{name:"gender",inputType:1,type:"TEXT",caption:"",mandatory:true,defaultValue:"M","maxValue":0,"textLength":10,"decimalLength":0,"visible":true,"readOnly":false,"chkTag":false,nf:"doctorname",values:"M~F",keys:"Male~Female"},
  	{name:"doctorname",inputType:0,type:"LOV",caption:"",mandatory:true,defaultValue:"","maxValue":0,"textLength":10,"decimalLength":0,"visible":true,"readOnly":false,"chkTag":true,nf:"referredby",lovOptions:{url:"/waggle/service/ajax",ajax:"doctors",scrollEnabled:true,searchFromList:false,cs:0,dsi:0,params:[],results:[{tgt:"doctorcode",tt:false,id:"dr_code"},{tgt:"doctorname",tt:true,id:"dr_name"},{tgt:"doctorname",tt:false,id:"dr_name"},{tgt:"referralcode",tt:false,id:"dr_code"},{tgt:"referredby",tt:false,id:"dr_name"},{tgt:"referredby",tt:true,id:"dr_name"}]}},
  	{name:"doctorcode",inputType:0,type:"INT",caption:"",mandatory:true,defaultValue:"0","maxValue":0,"textLength":10,"decimalLength":0,"visible":false,"readOnly":true,"chkTag":false,nf:"referredby"},
  	{name:"referralcode",inputType:0,type:"INT",caption:"",mandatory:true,defaultValue:"0","maxValue":0,"textLength":10,"decimalLength":0,"visible":false,"readOnly":true,"chkTag":false,nf:"buname"},
  	
	{name:"referredby",inputType:0,type:"LOV",caption:"",mandatory:true,defaultValue:"","maxValue":0,"textLength":10,"decimalLength":0,"visible":true,"readOnly":false,"chkTag":true,nf:"buname",lovOptions:{url:"/waggle/service/ajax",ajax:"doctors",scrollEnabled:true,searchFromList:false,cs:0,dsi:0,params:[],results:[{tgt:"referralcode",tt:false,id:"dr_code"},{tgt:"referredby",tt:false,id:"dr_name"},{tgt:"referredby",tt:true,id:"dr_name"}]}},
	{name:"buname",inputType:0,type:"LOV",caption:"",mandatory:true,defaultValue:"","maxValue":0,"textLength":10,"decimalLength":0,"visible":false,"readOnly":true,"chkTag":true,nf:"billgrid_data",lovOptions:{url:"/waggle/service/ajax",ajax:"opbusinessunits",scrollEnabled:true,searchFromList:false,dsi:0,params:[{n:"unittypes",src:"allowedtypes",ft:false}],results:[
  	{tgt:"buname",tt:false,id:"bum_buname"},
  	{tgt:"buname",tt:true,id:"bum_buname"},  	
  	{tgt:"bucode",tt:false,id:"bum_code"},
  	{tgt:"butype",tt:false,id:"bum_type"}
  	]}},
	{name:"totalamt",inputType:4,type:"SPAN",caption:"",mandatory:true,defaultValue:"0","maxValue":0,"textLength":10,"decimalLength":2,"visible":false,"readOnly":true,"chkTag":false,nf:"billgrid_data"},
  	{name:"tcashamount",inputType:0,type:"DECIMAL",caption:"",mandatory:false,defaultValue:"0","maxValue":0,"textLength":10,"decimalLength":2,"visible":false,"readOnly":false,"chkTag":false,nf:"cardbank",onchange:"onTenderDetailChange"},
  	{name:"cashamount",inputType:0,type:"DECIMAL",caption:"",mandatory:false,defaultValue:"0","maxValue":0,"textLength":10,"decimalLength":2,"visible":false,"readOnly":true,"chkTag":false,nf:"cardbank"},
  	{name:"creditamount",inputType:0,type:"DECIMAL",caption:"",mandatory:false,defaultValue:"0","maxValue":0,"textLength":10,"decimalLength":2,"visible":false,"readOnly":false,"chkTag":false,nf:"tcardamount",onchange:"onTenderDetailChange"},
  	{name:"cardbank",inputType:1,type:"TEXT",caption:"",mandatory:false,defaultValue:"0","maxValue":0,"textLength":10,"decimalLength":0,"visible":false,"readOnly":false,"chkTag":false,nf:"tcardamount",values:banks.values,keys:banks.keys},
  	{name:"tcardamount",inputType:0,type:"DECIMAL",caption:"",mandatory:false,defaultValue:"0","maxValue":0,"textLength":10,"decimalLength":2,"visible":false,"readOnly":false,"chkTag":false,nf:"sponsoramount",onchange:"onTenderDetailChange"},
  	{name:"srvchgamount",inputType:0,type:"DECIMAL",caption:"",mandatory:false,defaultValue:"0","maxValue":0,"textLength":10,"decimalLength":2,"visible":false,"readOnly":true,"chkTag":false,nf:"sponsoramount"},  	
  	{name:"cardamount",inputType:0,type:"DECIMAL",caption:"",mandatory:false,defaultValue:"0","maxValue":0,"textLength":10,"decimalLength":2,"visible":false,"readOnly":false,"chkTag":false,nf:"sponsoramount"},  	
  	{name:"sponsoramount",inputType:0,type:"DECIMAL",caption:"",mandatory:false,defaultValue:"0","maxValue":0,"textLength":10,"decimalLength":2,"visible":false,"readOnly":false,"chkTag":false,nf:"sponsorname",onchange:"onTenderDetailChange",validation:"validateSponsorAmount"},
  	{name:"tenderamount",inputType:0,type:"DECIMAL",caption:"",mandatory:true,defaultValue:"0","maxValue":0,"textLength":10,"decimalLength":2,"visible":false,"readOnly":true,"chkTag":false,nf:"sponsorname"},
  	{name:"netamount",inputType:0,type:"DECIMAL",caption:"",mandatory:true,defaultValue:"0","maxValue":0,"textLength":10,"decimalLength":2,"visible":false,"readOnly":true,"chkTag":false,nf:"sponsorname"},
  	{name:"balanceamount",inputType:0,type:"DECIMAL",caption:"",mandatory:false,defaultValue:"0","maxValue":0,"textLength":10,"decimalLength":2,"visible":false,"readOnly":true,"chkTag":false,nf:"sponsorname"},
  	{name:"sponsorname",inputType:0,type:"LOV",caption:"",mandatory:false,defaultValue:"","maxValue":0,"textLength":10,"decimalLength":0,"visible":false,"readOnly":false,"chkTag":true,nf:"sponsorcardno",lovOptions:{url:"/waggle/service/ajax",ajax:"insurancecompany",scrollEnabled:true,searchFromList:false,dsi:0,params:[],results:[{tgt:"sponsorname",tt:false,id:"icm_name"},{tgt:"sponsorname",tt:true,id:"icm_name"},{tgt:"sponsorcode",tt:false,id:"icm_code"}]}},
  	{name:"sponsorcode",inputType:0,type:"INT",caption:"",mandatory:false,defaultValue:"0","maxValue":0,"textLength":10,"decimalLength":0,"visible":false,"readOnly":false,"chkTag":false,nf:"sponsorcardno"},
  	{name:"sponsorcardno",inputType:0,type:"TEXT",caption:"",mandatory:false,defaultValue:"0","maxValue":0,"textLength":10,"decimalLength":0,"visible":false,"readOnly":false,"chkTag":false,nf:"sponsorapprovalno"},
  	{name:"sponsorapprovalno",inputType:0,type:"TEXT",caption:"",mandatory:false,defaultValue:"0","maxValue":0,"textLength":10,"decimalLength":0,"visible":false,"readOnly":false,"chkTag":false,nf:"btnSave"},
  	{name:"billdate",inputType:0,type:"TDATE",caption:"",mandatory:false,defaultValue:"1","maxValue":0,"textLength":10,"decimalLength":0,"visible":false,"readOnly":true,"chkTag":false,nf:"btnSave"},  	
  	{name:"butype",inputType:0,type:"INT",caption:"",mandatory:false,defaultValue:"1","maxValue":0,"textLength":10,"decimalLength":0,"visible":false,"readOnly":true,"chkTag":false,nf:"btnSave"},
  	{name:"allowedtypes",inputType:0,type:"TEXT",caption:"",mandatory:false,defaultValue:"1","maxValue":0,"textLength":10,"decimalLength":0,"visible":false,"readOnly":true,"chkTag":false,nf:"btnSave"},
  	{name:"hospregcode",inputType:0,type:"INT",caption:"",mandatory:false,defaultValue:"0","maxValue":0,"textLength":10,"decimalLength":0,"visible":false,"readOnly":true,"chkTag":false,nf:"btnSave"},
  	{name:"appid",inputType:0,type:"TEXT",caption:"",mandatory:false,defaultValue:"0","maxValue":0,"textLength":10,"decimalLength":0,"visible":false,"readOnly":true,"chkTag":false,nf:"btnSave"},  	
  	{name:"crno",inputType:0,type:"TEXT",caption:"",mandatory:false,defaultValue:"0","maxValue":0,"textLength":10,"decimalLength":0,"visible":false,"readOnly":true,"chkTag":false,nf:"btnSave"},
  	{name:"crsno",inputType:0,type:"TEXT",caption:"",mandatory:false,defaultValue:"0","maxValue":0,"textLength":10,"decimalLength":0,"visible":false,"readOnly":true,"chkTag":false,nf:"btnSave"},
  	{name:"casualityno",inputType:0,type:"TEXT",caption:"",mandatory:false,defaultValue:"0","maxValue":0,"textLength":10,"decimalLength":0,"visible":false,"readOnly":true,"chkTag":false,nf:"btnSave"},
  	{name:"csno",inputType:0,type:"TEXT",caption:"",mandatory:false,defaultValue:"0","maxValue":0,"textLength":10,"decimalLength":0,"visible":false,"readOnly":true,"chkTag":false,nf:"btnSave"},
  	{name:"crstatus",inputType:0,type:"TEXT",caption:"",mandatory:false,defaultValue:"1","maxValue":0,"textLength":10,"decimalLength":0,"visible":false,"readOnly":true,"chkTag":false,nf:"btnSave"},
  	{name:"claimno",inputType:0,type:"TEXT",caption:"",mandatory:false,defaultValue:"0","maxValue":0,"textLength":10,"decimalLength":0,"visible":false,"readOnly":true,"chkTag":false,nf:"btnSave"},
  	{name:"btnSave",inputType:3,caption:"",visible:false,readOnly:true},
    {name:"btnClear",inputType:3,caption:"",visible:false,readOnly:true}
  	]},
  	{name:"billgrid",title:"",contentType:"Table",tableProperties:{rowObject:true,serialNumberColumn:"sno",rowEmptyCheckColumn:"productcode",optional:false,columns:[
    {order:"0",id: "sno", name: "SNo", field: "sno",defaultValue:"0","inputType":0,"type":"INT","maxValue":0,"textLength":10,"decimalLength":0,"visible":true,"readOnly":true,"mandatory":true,"chkTag":false,width:50,sno:true},
    {order:"1",id: "productcode", name: "ItemCode", field: "productcode",defaultValue:"0","inputType":0,"type":"INT","maxValue":0,"textLength":10,"decimalLength":0,"visible":true,"readOnly":true,"mandatory":true,width:0,"chkTag":false},    
    {order:"2",id: "product", name: "Description", field: "product",defaultValue:"0","inputType":0,"type":"LOV","maxValue":0,"textLength":10,"decimalLength":0,"visible":true,"readOnly":false,"mandatory":true,width:200,"chkTag":true,lovOptions:{url:"/waggle/service/ajax",ajax:"buitems",scrollEnabled:true,searchFromList:false,dsi:0,params:[{n:"bucode",src:"bucode",tt:false}],results:[
  	{tgt:"billgrid_data",tt:false,row:"cr",id:"buim_code",col:"productcode"},
  	{tgt:"billgrid_data",tt:false,row:"cr",id:"buim_itemname",col:"product"},  	
  	{tgt:"billgrid_data",tt:true,row:"cr",id:"buim_itemname",col:"product"},
  	{tgt:"billgrid_data",tt:false,row:"cr",id:"buim_itemrate",col:"rate"}
  	]},validation:"validateBillItem"},
    {order:"3",id: "quantity", name: "Quantity", field: "quantity",defaultValue:"0","inputType":0,"type":"INT","maxValue":0,"textLength":10,"decimalLength":2,"visible":true,"readOnly":false,"mandatory":true,width:150,onchange:"onRateQuantityChange",align:"center"},
    {order:"4",id: "rate", name: "Rate", field: "rate",defaultValue:"0","inputType":0,"type":"DECIMAL","maxValue":0,"textLength":10,"decimalLength":2,"visible":true,"readOnly":true,"mandatory":true,width:150,onchange:"onRateQuantityChange",align:"right"},
    {order:"5",id: "amount", name: "Amount", field: "amount",defaultValue:"0","inputType":0,"type":"DECIMAL","maxValue":0,"textLength":10,"decimalLength":2,"visible":true,"readOnly":true,"mandatory":true,width:150,align:"right"}
    ]
    }}]};
	var billing=new FlexUI.Screen("billing",sProps);
	//ajax columns
	var showTender=true;
	var crLov=false;
	if(<%=screenCode%>==20){
		showTender=false;
	}
	var l=new FlexUI.Ajax();
	var businessUnitData = null;	
    $(document).ready(function () {
            screenObjects.getScreenObject("branchcode").setValue($('#branch').val());
            screenObjects.getScreenObject("crstatus").setValue("1");
            screenObjects.getScreenObject("billgrid_data").getInputField().onTextKeyDown.subscribe(tableTextKeyDown);
            screenObjects.getScreenObject("billgrid_data").onAfterDeleteRow.subscribe(tableRowDelete);
            $('#subtitle').text("");
            if(<%=screenCode%>==20){
            	$('#screentitle').text("Clinical Request");
            }else{
            	$('#screentitle').text("Billing");
            }
            screenObjects.getScreenObject("allowedtypes").setValue("0,1,2,3,4");
            screenObjects.getScreenObject("smobileno").focus();
            if(<%=screenCode%>==20){
            	$('#btnLoadCR').css("display","none");
            	if('<%=mode%>'=="View"){
	            	loadBillData("/waggle/service/screen/data?screencode=<%=screenCode%>&branchcode=<%=branch%>&code=<%=code%>");
	            	$('#btnSave').css("display","none");
	            }else if('<%=mode%>'=="Edit"){
	            	loadBillData("/waggle/service/screen/data?screencode=<%=screenCode%>&branchcode=<%=branch%>&code=<%=code%>");
	            	$('#btnSave').css("display","block");
	            }else{
	            	$('#btnSave').css("display","block");
	            }
            }else{
	            if('<%=mode%>'=="View"){
	            	loadBillData("/waggle/service/screen/data?screencode=<%=screenCode%>&branchcode=<%=branch%>&code=<%=code%>");
	            	$('#btnSave').css("display","none");
	            }else if('<%=mode%>'=="Edit"){
	            	loadBillData("/waggle/service/screen/data?screencode=<%=screenCode%>&branchcode=<%=branch%>&code=<%=code%>");
	            	$('#btnSave').css("display","block");
	            }else{
	            	$('#btnSave').css("display","block");
	            }
	        }
        });
        function saveBill(){
        	if('<%=mode%>'=="View") return;
        	if(billing.getSaveInProgress()) return;
        	var r=null;
        	var bucode=screenObjects.getScreenObject("bucode").getValue();
        	if(bucode==26){
        		if(!checkAlliedItems()){
        			return;
        		} 
        	}
        	if('<%=mode%>'=="Edit"){
    			billing.setOperation("MOD");
        	}else{
    			billing.setOperation("ADD");
    		}
    		billing.setScreenCode(<%=screenCode%>);    		
    		if(<%=screenCode%>!=20 && toNumber(screenObjects.getScreenObject("cardamount").getValue())>0 && screenObjects.getScreenObject("cardbank").getValue()=="0"){
    			alert("Please select card machine to continue");
    			return;
    		}
    		if(<%=screenCode%>!=20 && toNumber(screenObjects.getScreenObject("cardamount").getValue())==0 && screenObjects.getScreenObject("cardbank").getValue()!="0"){
    			screenObjects.getScreenObject("cardbank").setValue("0");    			
    		} 
    		if(<%=screenCode%>!=20 && toNumber(screenObjects.getScreenObject("totalamt").getValue())>toNumber(screenObjects.getScreenObject("tenderamount").getValue())){
    			alert("Tender Amount cannot be less than the Bill Amount");
    			return;
    		}else if(<%=screenCode%>==20){
    			screenObjects.getScreenObject("tenderamount").setValue(screenObjects.getScreenObject("totalamt").getValue());
    		}
    		var d=billing.processDataToSave();
    		billing.setSaveInProgress(true);    		
			if("FAILED"!=d){
				var s=new FlexUI.Ajax();
				showLoader();
				r=s.callAjax("POST","/waggle/service/screen/save",d);
				hideLoader();
		 	}else{
		 		alert("Please correct the validation errors and continue...");
		 		billing.setSaveInProgress(false);
		 		return;
		 	}		 
		 	if(r.result=="Success"){
				alert(r.message+" [No:"+r.code+"]");
				
				if(showTender){
					// $('#tenderdlg').dialog('close');
					// $('#tenderdlg').dialog('destroy');
					$('#tenderdlg').modal('hide');
				}
				clearInnerScreen();
				var ps=JSON.parse(d.replace("data=","")).savedata;
				ps["billno"]=r.billno;
				printBill(ps);				
				return r.key;
			}else{
				billing.setSaveInProgress(false);								
				alert(r.message);	
			}
        }
        function clearInnerScreen(){
        	$('#overlapdiv').css('display','none');
        	billing.clearScreen();
        	billing.setSaveInProgress(false);        	
        	screenObjects.getScreenObject("allowedtypes").setValue("0,1,2,3,4");
        	screenObjects.getScreenObject("crstatus").setValue("1");
        	screenObjects.getScreenObject("branchcode").setValue($('#branch').val());
        	screenObjects.getScreenObject("smobileno").focus();
        	screenObjects.getScreenObject("billgrid_data").getOptions().enableAddRow=true;
        	screenObjects.getScreenObject("billgrid_data").getOptions().enableDeleteRow=true;
        	screenObjects.getScreenObject("billgrid_data").getOptions().tableIsReadOnly=false;
        	$('#lcsno').text("");
		$('#lipno').text("");
		$('#lroomno').text("");
        	$('#smobileno').prop("disabled",false);        	        
        	if("<%=mode%>"=="View" || "<%=mode%>"=="Edit"){
        		$('.ui-dialog').children().remove();
				$('.ui-dialog').remove();
				$("#bodyContainer").children().remove();
				$("#bodyContainer").html("");
				if(<%=screenCode%>==20){
					$("#bodyContainer").load("/waggle/billPrintRequest.do?id=<%=screenCode%>&title=ClinicalRequests");
				}else{
					$("#bodyContainer").load("/waggle/billPrintRequest.do?id=<%=screenCode%>&title=Bills");
				}
        	}
        	crLov=false;
        }
        function onRateQuantityChange(id,me){
			var t=me.getParent();
			calculateAmount(t.getCurrentRow());
			calculateTotal();
			return true;
		}
		function calculateTotal(){
			var total=0;
			var t=screenObjects.getScreenObject("billgrid_data");
			var cols=t.getCols();
			var s=t.getSize();
			for(var i=0;i<s;i++){
				total+=toNumber(t.getText(i,cols.amount));
			}


			screenObjects.getScreenObject("totalamt").setValue(roundOff(total,2));
			// $("#totalamt").text(roundOff(total,2));

			screenObjects.getScreenObject("netamount").setValue(roundOff(total,2));
			$("#netAmt").html(roundOff(total,2));
		}
		function calculateAmount(row){
			var t=screenObjects.getScreenObject("billgrid_data");
			var cols=t.getCols();	
			var baseqty=0;
			baseqty=toNumber(t.getText(row,cols.quantity));
			var amt=roundOff(toNumber(t.getText(row,cols.rate))*baseqty,2);
			t.setText(row,cols.amount,amt);
		}
		function tableTextKeyDown(e,args){
			var bucode=screenObjects.getScreenObject("bucode").getValue();
			var butype=screenObjects.getScreenObject("butype").getValue();		
			var patienttype=screenObjects.getScreenObject("patienttype").getValue();
			var sponsorcode=screenObjects.getScreenObject("sponsorcode").getValue();
			var key=e.which || e.keyCode;
			if(key==113){
				//get tender config
				var pcode=screenObjects.getScreenObject("patientcode").getValue();
				if(<%=screenCode%>!=20 && pcode!=undefined && pcode!="" && pcode!="0"){
					var l=new FlexUI.Ajax();								
					var	v=l.callAjax("GET","/waggle/service/ajax","ic=0&ro=true&id=getconfig&code=STIP");
					if(v.data && v.data.length>0){
						showTender=v.data[0].config_value=="0"?false:true;						
					}				
				}
				if(butype=="0"){
					showTender=true;
				}
				if(showTender){
					$('#dispTotalAmt').text($('#totalamt').text());	
					$('#tenderdlg').modal({backdrop:'static',width:'auto',minHeight:400,minWidth:300});
					$('#tenderdlg').modal('show');
					
					// $('#tenderdlg').dialog({autoOpen:false,modal:true,height:'auto',minHeight:400,minWidth:700,position:'center'});
					// $('#tenderdlg').dialog('open');
					renderTenderConfig(patienttype);
					var clmno=screenObjects.getScreenObject("claimno").getValue();
					if((clmno!="0" && clmno!="")){
						screenObjects.getScreenObject("sponsoramount").setEnabled(true);
						screenObjects.getScreenObject("sponsoramount").setValue(screenObjects.getScreenObject("netamount").getValue());
						screenObjects.getScreenObject("tcashamount").setEnabled(false);
						screenObjects.getScreenObject("tcardamount").setEnabled(false);			
						screenObjects.getScreenObject("cardamount").setEnabled(false);
						screenObjects.getScreenObject("srvchgamount").setEnabled(false);
						onTenderDetailChange();
					}else{
						screenObjects.getScreenObject("sponsoramount").setEnabled(false);
					}
					screenObjects.getScreenObject("sponsorname").setEnabled(false);
					screenObjects.getScreenObject("sponsorcardno").setEnabled(false);
					screenObjects.getScreenObject("sponsorapprovalno").setEnabled(false);					
				}else if(<%=screenCode%>!=20){
					screenObjects.getScreenObject("creditamount").setValue($('#totalamt').text());
					onTenderDetailChange();
				}
				e.preventDefault();
				if(showTender){
					screenObjects.getScreenObject("tcashamount").focus();
				}else if(<%=screenCode%>==20){
					saveBill();
				}
			}
		}
		function tableRowDelete(e,args){
			calculateTotal();
		}
		function onTenderDetailChange(){
			 var totalAmount=toNumber(roundOff(screenObjects.getScreenObject("totalamt").getValue(),2));
			//var totalAmount=toNumber(roundOff($("#totalamt").text(),2));
			//alert("totalAmount"+" "+totalAmount);
			var cashAmount=toNumber(roundOff(screenObjects.getScreenObject("tcashamount").getValue(),2));
			var creditAmount=toNumber(roundOff(screenObjects.getScreenObject("creditamount").getValue(),2));
			var cardAmount=toNumber(roundOff(screenObjects.getScreenObject("tcardamount").getValue(),2));
			var sponsorAmount=toNumber(roundOff(screenObjects.getScreenObject("sponsoramount").getValue(),2));
			var totalCardAmount=cardAmount;
			var netAmount=totalAmount;
			if(cardAmount>0){
				var cardServChg=cardAmount*2/100;
				var totalCardAmount=cardAmount+cardServChg;
				var netAmount=totalAmount+cardServChg;
				screenObjects.getScreenObject("cardamount").setValue(roundOff(totalCardAmount,2));
				screenObjects.getScreenObject("srvchgamount").setValue(roundOff(cardServChg,2));
				screenObjects.getScreenObject("netamount").setValue(roundOff(netAmount,2));
			}else{
				screenObjects.getScreenObject("srvchgamount").setValue("0.00");
				screenObjects.getScreenObject("netamount").setValue(roundOff(totalAmount,2));
				screenObjects.getScreenObject("cardamount").setValue("0.00");
			}			
			var tenderedAmount=cashAmount+creditAmount+totalCardAmount+sponsorAmount;
			var balanceAmount=tenderedAmount-netAmount;
			if(cashAmount>totalAmount){
				screenObjects.getScreenObject("cashamount").setValue(roundOff(totalAmount,2));
			}else{
				screenObjects.getScreenObject("cashamount").setValue(roundOff(cashAmount,2));
			}
			screenObjects.getScreenObject("tenderamount").setValue(roundOff(tenderedAmount,2));
			screenObjects.getScreenObject("balanceamount").setValue(roundOff(balanceAmount,2));
		}
		function cancelTenderDlg(){
			$('#tenderdlg').modal('hide');
			$('#tenderdlg').modal('destroy');
			$('#tenderdlg').on('hidden.bs.modal', function (e) {
				//handleClose();
			});
			screenObjects.getScreenObject("billgrid_data").getInputField().focus();
		}
		function validateBillItem(id,me,row,col){
			if(!billing.getSaveInProgress()){
				var t=screenObjects.getScreenObject("billgrid_data");
				var bucode=screenObjects.getScreenObject("bucode").getValue();
				var butype=screenObjects.getScreenObject("butype").getValue();
				var cols=t.getCols();
				var columnProps=t.getColumnProperties();

				if(butype==4){
					columnProps[cols.rate].readOnly=false;
					columnProps[cols.quantity].readOnly=false;
				}else if(butype!=1){
					columnProps[cols.rate].readOnly=false;
					columnProps[cols.quantity].readOnly=true;
				}else{
					columnProps[cols.rate].readOnly=true;
					columnProps[cols.quantity].readOnly=false;
				}
				t.setText(row,cols.quantity,"1");
			}
			return true;
		}
		function validateSponsorAmount(){
			var amt=screenObjects.getScreenObject("sponsoramount").getValue();
			var clmno=screenObjects.getScreenObject("claimno").getValue();
			if(Number(amt)!=0 || (clmno!="0" && clmno!="")){
				sProps.screen[0].fields[32].mandatory=true;					
				sProps.screen[0].fields[34].mandatory=true;
				sProps.screen[0].fields[35].mandatory=true;
				screenObjects.getScreenObject("sponsorname").setAttributes(sProps.screen[0].fields[32]);
				screenObjects.getScreenObject("sponsorcardno").setAttributes(sProps.screen[0].fields[34]);
				screenObjects.getScreenObject("sponsorapprovalno").setAttributes(sProps.screen[0].fields[35]);			
				screenObjects.getScreenObject("sponsorname").setEnabled(true);
				screenObjects.getScreenObject("sponsorcardno").setEnabled(true);
				screenObjects.getScreenObject("sponsorapprovalno").setEnabled(true);
				screenObjects.getScreenObject("sponsoramount").setNextFocus("sponsorname");				
			}else{
				sProps.screen[0].fields[32].mandatory=false;					
				sProps.screen[0].fields[34].mandatory=false;
				sProps.screen[0].fields[35].mandatory=false;
				screenObjects.getScreenObject("sponsorname").setValue("");
				screenObjects.getScreenObject("sponsorcode").setValue("");
				screenObjects.getScreenObject("sponsorcardno").setValue("");
				screenObjects.getScreenObject("sponsorapprovalno").setValue("");
				screenObjects.getScreenObject("sponsorname").setAttributes(sProps.screen[0].fields[32]);
				screenObjects.getScreenObject("sponsorcardno").setAttributes(sProps.screen[0].fields[34]);
				screenObjects.getScreenObject("sponsorapprovalno").setAttributes(sProps.screen[0].fields[35]);			
				screenObjects.getScreenObject("sponsorname").setEnabled(false);
				screenObjects.getScreenObject("sponsorcardno").setEnabled(false);
				screenObjects.getScreenObject("sponsorapprovalno").setEnabled(false);
				screenObjects.getScreenObject("sponsoramount").setNextFocus("btnSave");				
			}
			return true;
		}
		function loadBillData(url,code,did){
		  	showLoader();
			var l=new FlexUI.Ajax();
			var v=l.callAjax("GET",url,"");
			billing.disableInputs(true);
			billing.loadObjectData(v);
			if(v["csno"]!="0"){
				$('#lcsno').text(v["csno"]);
			}
			calculateTotal();			
		  	hideLoader();
		}  		
		function printBill(data){
			var t=screenObjects.getScreenObject("billgrid_data");
			var cols=t.getCols();		
			var printData={};
			printData["type"]="OPBILL";
			printData["branchname"]=$('#branch option:selected').text();
			printData["address1"]="52,SOUTH STREET";
			printData["address2"]="ARUPPUKOTTAI - 626 101";
			printData["address3"]="Phone - 222273,220936";
			printData["tin"]="";
			printData["buname"]=data["buname"];
			printData["billno"]=data["billno"];
			printData["billdate"]=data["billdate"]+" "+formatTimeHHMM(new Date());
			printData["totalamt"]=data["totalamt"]+"";
			printData["netamount"]=data["netamount"]+"";
			printData["srvchgamount"]=data["srvchgamount"]+"";
			printData["tenderamount"]=data["tenderamount"]+"";
			printData["balanceamount"]=data["balanceamount"]+"";
			printData["sponsorname"]=data["sponsorname"]+"";
			printData["doctorname"]=data["doctorname"]+"";
			printData["referredby"]=data["referredby"]+"";
			printData["roundoff"]="0.00";
			printData["patientname"]=data["patientname"];		
			printData["patientage"]=data["patientage"];
			printData["gender"]=data["gender"];
			printData["csno"]=data["csno"];
			printData["hospregcode"]=data["hospregcode"];
			printData["userid"]="<%=userId%>";
			printData["invtype"]="CASH";
			printData["billprefix"]="GSH";
			printData["items"]=[];
			for(var x=0;x<data["billgrid_data"].length;x++){
				var item={};
				item.name=data["billgrid_data"][x].product+"";
				item.rate=roundOff(data["billgrid_data"][x].rate,2)+"";
				item.qty=data["billgrid_data"][x].quantity+"";
				item.amount=data["billgrid_data"][x].amount+"";;				
				printData.items.push(item);
			}
			$.ajax({
	            url: "http://localhost:9191",
	            type: "POST",
	            async: true,
	            contentType:"application/x-www-form-urlencoded",
	            data:"printdata="+JSON.stringify(printData),
	            dataType: "json",
	            success: function (r) {
					//alert(r.result);		
	            }
	        });						
		}
				function onPatientClose(e,args){
				//to do here
				var branch=screenObjects.getScreenObject("branchcode").getValue();
				var params="";
				var paramName="F1";
				var dsi=0;
				params="&F2="+args.result[1];
				paramName="F2";
				dsi=1;
				var l=new FlexUI.Ajax();								
				var	v=l.callAjax("GET","/waggle/service/ajax","ic=0&id=hospinpatients&branchcode="+branch+params+"&searchtxt="+args.result[1]);
				if(v.data && v.data.length==1){
					setPatientInfo(v.data[0]);
				}else{
					setPatientInfo(args.result);
				}
		}		
		function checkPatientExists(id,me){
			if(!billing.getSaveInProgress() ){//&& screenObjects.getScreenObject("patientname").getValue()=="" && screenObjects.getScreenObject("smobileno").getTag()==""
				var branch=screenObjects.getScreenObject("branchcode").getValue();
				var stext=screenObjects.getScreenObject("smobileno").getValue();
				var params="";
				var paramName="F1";
				var dsi=0;
				var searchType=$('#searchtype').val();
				if($('#searchpatient').val()=="mobile"){
					params="&F1="+stext;
					dsi=0;
				}else if($('#searchpatient').val()=="pname"){
					params="&F3="+stext;
					paramName="F3";
					dsi=2;
				}else{
					if(searchType=="casuality" || searchType=="rtpatient"){
						params="&F19="+stext;
						paramName="F19";
						dsi=18;
					}else if(searchType=="corporate"){
						params="&F19="+stext;
						paramName="F19";
						dsi=18;
					}else{
						params="&F2="+stext;
						paramName="F2";
						dsi=1;					
					}
				}
				if(stext!=""){
					var v=null;
					var l=new FlexUI.Ajax();
					if(searchType=="all"){
						v=l.callAjax("GET","/waggle/service/ajax","ic=0&id=hospinpatients&branchcode="+branch+"&searchtxt="+escape(stext));
						if(!v || !v.data || v.data.length==0){
							v=l.callAjax("GET","/waggle/service/ajax","ic=0&id=hosppatients&branchcode="+branch+params);
						}
					}else if(searchType=="appointments"){
						v=l.callAjax("GET","/waggle/service/ajax","ic=0&id=hospapppatients&branchcode="+branch+params);
					}else if(searchType=="casuality"){
						v=l.callAjax("GET","/waggle/service/ajax","ic=0&id=casualityslips&branchcode="+branch+params);
					}else if(searchType=="corporate"){
						v=l.callAjax("GET","/waggle/service/ajax","ic=0&id=opinspatients&branchcode="+branch+params);
					}else if(searchType=="rtpatient"){
						v=l.callAjax("GET","/waggle/service/ajax","ic=0&id=rtpatients&branchcode="+branch+params);
					}
					if(v!=null){
						if(v.data && v.data.length==1){
							setPatientInfo(v.data[0]);					
							return true;
						}else if(v.data && v.data.length>1){
							screenObjects.getScreenObject("smobileno").setTag(stext);
							var d=null;
							if(searchType=="casuality"){
								d={url:"/waggle/service/ajax",ajax:"casualityslips",scrollEnabled:true,searchFromList:false,dsi:dsi,edsi:1,params:[{n:"branchcode",src:"branchcode",ft:false}],results:[],standalone:true};
							}else if(searchType=="corporate"){
								d={url:"/waggle/service/ajax",ajax:"opinspatients",scrollEnabled:true,searchFromList:false,dsi:dsi,edsi:1,params:[{n:"branchcode",src:"branchcode",ft:false}],results:[],standalone:true};
							}else if(searchType=="rtpatient"){
								d={url:"/waggle/service/ajax",ajax:"rtpatients",scrollEnabled:true,searchFromList:false,dsi:dsi,edsi:1,params:[{n:"branchcode",src:"branchcode",ft:false}],results:[],standalone:true};
							}else{
								d={url:"/waggle/service/ajax",ajax:"hosppatients",scrollEnabled:true,searchFromList:false,dsi:dsi,edsi:1,params:[{n:"branchcode",src:"branchcode",ft:false}],results:[],standalone:true};
							}
							var lov=new FlexUI.LOV("s_lov",me,d,v.data);
							lov.onLovClose.subscribe(onPatientClose);
							lov.show();					
							return false;
						}else{
							if($('#searchpatient').val()=="mobile"){
								screenObjects.getScreenObject("mobileno").setValue(stext);
							}
						}		
					}
				}
			}else{
				screenObjects.getScreenObject("smobileno").setTag("");
			}
			return true;
		}
		function setPatientInfo(result){
			clearInnerScreen();
			screenObjects.getScreenObject("patientname").setValue(result[2]);
			screenObjects.getScreenObject("hospregcode").setValue(result[1]);
			screenObjects.getScreenObject("gender").setValue(result[4]);
			screenObjects.getScreenObject("patientage").setValue(result[3]);
			screenObjects.getScreenObject("doctorcode").setValue(result[5]);
			screenObjects.getScreenObject("doctorname").setValue(result[6]);
			screenObjects.getScreenObject("doctorname").setTag(result[6]);
			screenObjects.getScreenObject("referralcode").setValue(result[7]);
			screenObjects.getScreenObject("referredby").setValue(result[8]);
			screenObjects.getScreenObject("referredby").setTag(result[8]);
			screenObjects.getScreenObject("mobileno").setValue(result[0]);
			if($('#searchpatient').val()=="mobile"){
				screenObjects.getScreenObject("smobileno").setValue(result[0]);
			}else if($('#searchtype').val()=="corporate"){
				screenObjects.getScreenObject("smobileno").setValue(result[19]);
			}else if($('#searchtype').val()=="rtpatient"){
				screenObjects.getScreenObject("smobileno").setValue(result[19]);
			}else{
				screenObjects.getScreenObject("smobileno").setValue(result[1]);
			}
			if($('#searchtype').val()=="appointments"){
				screenObjects.getScreenObject("appid").setValue(result[18]);				
			}
			if($('#searchtype').val()=="all"){
				if(result[20]>0){
					screenObjects.getScreenObject("patienttype").setValue("1");
					screenObjects.getScreenObject("billtype").setValue("1");
					screenObjects.getScreenObject("allowedtypes").setValue("0,1,2,3,4");
				}else{
					screenObjects.getScreenObject("patienttype").setValue("2");
					screenObjects.getScreenObject("billtype").setValue("2");
					screenObjects.getScreenObject("allowedtypes").setValue("1,2,4");
				}
				$('#lcsno').text(result[1]);
				$('#lipno').text(result[19]);
				$('#lroomno').text(result[22]);
				screenObjects.getScreenObject("ipno").setValue(result[19]);
				screenObjects.getScreenObject("patientcode").setValue(result[20]);
				screenObjects.getScreenObject("roomcode").setValue(result[21]);
				screenObjects.getScreenObject("roomno").setValue(result[22]);
				screenObjects.getScreenObject("sponsorname").setValue(result[10]);
				screenObjects.getScreenObject("sponsorname").setTag(result[10]);
				screenObjects.getScreenObject("sponsorcode").setValue(result[9]);
				screenObjects.getScreenObject("sponsorcardno").setValue(result[11]);
				screenObjects.getScreenObject("sponsorapprovalno").setValue(result[18]);
				if(<%=screenCode%>==11){
					loadClinicalRequests();
				}		
			}
			if($('#searchtype').val()=="casuality"){
				screenObjects.getScreenObject("casualityno").setValue(result[19]);
				screenObjects.getScreenObject("csno").setValue(result[18]);
				//populate casuality BU
				screenObjects.getScreenObject("buname").setValue("Casuality Billing");
				screenObjects.getScreenObject("buname").setTag("Casuality Billing");
            	screenObjects.getScreenObject("bucode").setValue("4");				
            	screenObjects.getScreenObject("butype").setValue("1");
            	screenObjects.getScreenObject("buname").setEnabled(false);
            	$('#smobileno').prop("disabled",true);
				$('#lcsno').text(result[18]);
			}else if($('#searchtype').val()=="rtpatient"){
				//populate RT BU
				screenObjects.getScreenObject("buname").setValue("Radiotherapy");
				screenObjects.getScreenObject("buname").setTag("Radiotherapy");
            	screenObjects.getScreenObject("bucode").setValue("26");				
            	screenObjects.getScreenObject("butype").setValue("1");
            	screenObjects.getScreenObject("buname").setEnabled(false);
            	$('#smobileno').prop("disabled",true);
				$('#lcsno').text(result[18]);
				var v=null;
				var l=new FlexUI.Ajax();
				v=l.callAjax("GET","/waggle/service/ajax","ro=true&ic=0&id=rtbillno&hospregcode="+result[1]);
				if(v!=null){
					if(v.data && v.data.length>0){
						v=l.callAjax("GET","/waggle/service/ajax","ro=true&ic=0&id=nextbuitem&billno="+v.data[0].bh_no);
						if(v!=null && v.data.length>0){							
							var t=screenObjects.getScreenObject("billgrid_data");							
							t.clear();
							for(var j=0;j<v.data.length;j++){
								if(j==t.getSize()){
									t.addRow();
								}
								t.setText(j,t.getCols().productcode,v.data[j].buim_code);
								t.setText(j,t.getCols().product,v.data[j].buim_itemname);
								t.setCellTag(j,t.getCols().product,v.data[j].buim_itemname);
								t.setText(j,t.getCols().rate,v.data[j].buim_itemrate);
								t.checkAndMove("Next",true);															
							}
						}
					}
				}				
			}else if($('#searchtype').val()=="corporate"){
				screenObjects.getScreenObject("claimno").setValue(result[19]);
				screenObjects.getScreenObject("sponsorname").setValue(result[10]);
				screenObjects.getScreenObject("sponsorname").setTag(result[10]);
				screenObjects.getScreenObject("sponsorcode").setValue(result[9]);
				screenObjects.getScreenObject("sponsorcardno").setValue(result[11]);
				screenObjects.getScreenObject("sponsorapprovalno").setValue(result[20]);
				$('#lcsno').text(result[18]);
			}else{
				$('#lcsno').text(result[1]);
			}				
			screenObjects.getScreenObject("smobileno").goToNextField();			
			screenObjects.getScreenObject("smobileno").setTag("");
		}
		function loadClinicalRequests(id,me){
			var op=billing.getOperation();
			var branch=screenObjects.getScreenObject("branchcode").getValue();
			var regcode=screenObjects.getScreenObject("hospregcode").getValue();
			var crstatus=screenObjects.getScreenObject("crstatus").getValue();
			if(op=="ADD"){
				var v=null;
				var l=new FlexUI.Ajax();
				v=l.callAjax("GET","/waggle/service/ajax","ic=0&id=opclinicalrequests&branchcode="+branch+"&status="+crstatus+"&regcode="+regcode);
				if(v!=null){
					/*if(v.data && v.data.length==1){
						var args={};
						args.result=v.data[0];
						onClinicalRequestLoad(undefined,args);
						return true;
					}else */
					if(v.data && v.data.length>=1){
					
						var l={url:"/waggle/service/ajax",ajax:"opclinicalrequests",scrollEnabled:true,autoLoad:false,searchFromList:false,dsi:0,params:[{n:"branchcode",src:"branchcode",ft:false},{n:"status",src:"crstatus",ft:false},{n:"regcode",src:"hospregcode",ft:false}],results:[],standalone:true};
						var lov=new FlexUI.LOV("cr_lov",me,l);
						lov.onLovClose.subscribe(onClinicalRequestLoad);
						lov.show();
						crLov=true;
						setTimeout(focusCrLov,500);
					}
				}
			}else{
				alert("Sorry... You Cannot Load Clinical Requests in Edit Mode");
			}
		}
		function onClinicalRequestLoad(e,args){
			showLoader();
			var branch=screenObjects.getScreenObject("branchcode").getValue();
			var code=args.result[5];
			var l=new FlexUI.Ajax();
			var v=l.callAjax("GET","/waggle/service/screen/data?screencode=20&branchcode="+branch+"&code="+code,"");
			screenObjects.getScreenObject("billno").setValue("0");
			screenObjects.getScreenObject("code").setValue("0");
			billing.loadObjectData(v);
			calculateTotal();
			screenObjects.getScreenObject("billgrid_data").getOptions().enableAddRow=false;
        	screenObjects.getScreenObject("billgrid_data").getOptions().enableDeleteRow=false;
        	screenObjects.getScreenObject("billgrid_data").getOptions().tableIsReadOnly=true;
        	hideLoader();
        	screenObjects.getScreenObject("tenderamount").setValue("0");
        	screenObjects.getScreenObject("balanceamount").setValue("0");
		}
		function checkAlliedItems(){
			var bcodes="0";
			var itemcode="0";
			var l=new FlexUI.Ajax();
			var t=screenObjects.getScreenObject("billgrid_data");
			for(var j=0;j<t.getValidRowSize();j++){
				bcodes=bcodes+","+t.getText(j,t.getCols().productcode);
			}										
			var v=undefined;
			for(var j=0;j<t.getValidRowSize();j++){
				v=l.callAjax("GET","/waggle/service/ajax","ro=true&ic=0&id=checkallieditem&bcodes="+bcodes+"&itemcode="+t.getText(j,t.getCols().productcode));
				if(v!=null && v.data.length>0){
					if(v.data[0].available==0){
						alert("Please select moulding item for "+t.getText(j,t.getCols().product));
						return false;
					}													
				}				
			}
			return true;
		}
		function getBillTenderConfig(){
			var ajaxObj=new FlexUI.Ajax();
			var bData=ajaxObj.callAjax("GET","/waggle/service/ajax","ic=0&ro=true&id=billtenderconfig");
			var tenders=bData.data;
		 	return tenders;
		}
		function renderTenderConfig(patienttype){
			var tender=tenderData[patienttype-1];
			if(tender){
				if(tender.btc_cash_enabled==1){
					$('[name="cashtender"]').css("display","block");
				}else{
					$('[name="cashtender"]').css("display","none");
				}
				if(tender.btc_credit_enabled==1){
					$('[name="credittender"]').css("display","block");
				}else{
					$('[name="credittender"]').css("display","none");
				}
				if(tender.btc_card_enabled==1){
					$('[name="cardtender"]').css("display","block");
				}else{
					$('[name="cardtender"]').css("display","none");
				}
				if(tender.btc_corporate_enabled==1){
					$('[name="corptender"]').css("display","block");
					$('#tenderleft').attr("class",'col-md-6 col-sm-6 mpZero');
				}else{
					$('[name="corptender"]').css("display","none");
					$('#tenderleft').attr("class",'col-md-12 col-sm-12 mpZero');					
				}			
			}
		}
		function focusCrLov(){
			$('#lov_cr_lov').focus();
		}				
	</script>
</body>
</html>