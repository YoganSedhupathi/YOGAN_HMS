var userCode=0;
var currentView="";
var hospitalName="Tiruvarur Medical Center Pvt Ltd";
var hospitalCode="1";
var doctorName="";
var oVisitID="0";
var oVisitDate="";
var searchProductTxt="";
var timer=null;
var app = {
    changeView:function(viewName,callback){
    	$('#view_'+currentView).css('display','none');
		if($('#view_'+viewName).length==0){
			$('#container').append("<div id='view_"+viewName+"'></div>");
		}
		$('#view_'+viewName).load(viewName+".html",callback);
		currentView=viewName;
		$('#view_'+currentView).css('display','block');
    },
    backToView:function(viewName){
    	$('#view_'+currentView).css('display','none');
		currentView=viewName;
		$('#view_'+currentView).css('display','block');
    },
    initialize:function(){
    	$('#buitemsdlg').popup();    	
    },
    callAjax:function(method,url,parameters,contentType){
    	var response;
		$.ajax({
		url:url,
		data:parameters,
		type:method,
		contentType:contentType,
		async:false,
		success:function(data){
			response=data;
		},
		error:function(x,status,error){
			alert(status+" "+error +" ");
		}
		});
		console.log(JSON.stringify(response));
		return response;
    },
    loginVerification:function(){
    	var v=app.callAjax("POST","/waggle/service/prescription/login","userid="+$('#user').val()+"&password="+$('#password').val(),"application/x-www-form-urlencoded");
		if(v.result=="Success"){
			userCode=v.code;
			//hospitalCode=v.hospitalCode;
			//hospitalName=v.hospital;
			doctorName=v.drname;
			oVisitID=v.visitID;
			oVisitDate=v.visitDate;
			$.mobile.changePage($("#menupage"));
			if(v.userType=="User"){
				$('#btnDoctorConsole').css("display","none");
				$('#btnDoctorVisit').css("display","none");
				$('#btnDoctorProducts').css("display","none");								
			}else{
				$('#btnPatientReg').css("display","none");
				$('#btnAppointments').css("display","none");
				//$('#btnDoctorConsole').click();				
			}
		}else{
			alert(result.message );
		}    	
    },
    logout:function(){
    	window.location.href="/waggle/app/prescription/index.html";
    },
    showPatientRegistration:function(){
    	$.mobile.changePage($("#patientregistration"));
    },
    showBUItems:function(bucode,buname){
        app.constructBUItemsLov(bucode,buname);
        app.showSearchItems();
    },
    showDoctorVisits:function(){
        $("#selectdoctor").data("for","0");
    	app.getDoctorList();
    	$.mobile.changePage($("#selectdoctor"));
    },
    showVisitLists:function(callfrom,btn,drcode,drname){
    	if(callfrom=="doctorconsole"){
	        drcode=userCode;
	        drname=doctorName;    		
    	}else if(btn!=undefined){
	        drcode=$(btn).attr("drcode");
	        drname=$(btn).attr("drname");
	    }else if(drcode==undefined){
	        drcode=$('#visits').data("drcode");
	        drname=$('#visits').data("drname");	    
	    }
	    if(callfrom!=undefined){
	    	$("#visitslist").data("callfrom",callfrom);
	    }
    	app.getDoctorVisits(drcode,drname);
    	$.mobile.changePage($("#visitslist"));
    },
    backFromVisitList:function(){
    	if($('#visitslist').data("callfrom")=="doctorconsole"){
    		$.mobile.changePage($("#menupage"));
    	}else{
    		app.showDoctorVisits();
    	}
    },
    showCreateVisit:function(){
    	$.mobile.changePage($("#visits"));
    	$('#doctorname').val($("#visits").data("drname"));
    	$('#doctorcode').val($("#visits").data("drcode"));
    	$('#hospitalname').val(hospitalName);
    	$('#hospitalcode').val(hospitalCode);    	
    },    
    showPatientAppointments:function(){
    	$("#selectdoctor").data("for","2");
    	app.getDoctorList();
    	$.mobile.changePage($("#selectdoctor"));
    },
    bookAppointment:function(){
    	$('#svisitdate').val($("#patients").data("pvisitdate"));
    	$('#sdoctorcode').val($("#patients").data("drcode"));
    	$('#sdoctorname').val($("#patients").data("drname"));
    	$('#dvmid').val($("#patients").data("dvmid"));
    	$.mobile.changePage($("#appointments"));
    },
    showReception:function(){
    	app.getPatientList();	
    	$.mobile.changePage($("#patientlist"));
    },
    showPatientList:function(callfrom,btn){
    	var visitID="0";
    	var visitDate="";
    	var drName="";
    	var drCode="0";
    	if(callfrom=='visits'){    	
	    	visitID=$(btn).attr("dvmid");
	    	visitDate=$(btn).attr("visitdate");
	    	drName=$(btn).attr("drname");
	    	drCode=$(btn).attr("drcode");
	    	$("#patients").data("pvisitdate",visitDate);
    		$("#patients").data("drcode",drCode);
    		$("#patients").data("drname",drName);
    		$("#patients").data("dvmid",visitID);	    	
    		$("#patients").data("isvisit",1);
    		$('#btnBookAppointment').css("display","block");
	    }else if(callfrom=='initialstatus' || callfrom=="appointments"){
	    	visitID=$("#patients").data("dvmid");
	    	drCode=$("#patients").data("drcode");	    
	    }else if(callfrom=="doctorconsole"){
	    	visitID=oVisitID;
	    	drCode=userCode;
	    	$("#patients").data("pvisitdate",oVisitDate);
    		$("#patients").data("drcode",drCode);
    		$("#patients").data("drname",doctorName);
    		$("#patients").data("dvmid",visitID);	    		    	
	    	$("#patients").data("isvisit",2);
	    	$('#btnBookAppointment').css("display","block");	    	
	    }
    	app.getPatientList(visitID,drCode);
    	$.mobile.changePage($("#patientlist"));
    },
    backFromPatientList:function(){
    	if($("#patients").data("isvisit")==1){
    		app.showVisitLists();	
    	}else{
    		$.mobile.changePage($("#menupage"));
    	}
    },
    showDoctorConsole:function(){
    	app.showPatientList("doctorconsole");
    },
    showPatientDetails:function(btn){
    	var data=$(btn).data("row");
    	$('#dpatientname').text(data.patientname);
    	$('#dpatientcode').val(data.patientcode);
    	$('#dgender').text(data.gender);
    	$('#dage').text(data.age);
    	$('#dappid').val(data.appid);
    	$('#dtemperature').val(data.temperature);
    	$('#dweight').val(data.weight);
    	$('#dbp').val(data.bp);
    	$('#dvisitdate').val(oVisitDate);
    	$('#ovisit').text(oVisitDate);
    	app.showDiagnose($('#navg').find("li").eq(0));
    	$.mobile.changePage($("#doctorconsole"));
    },
    getDoctorList:function(){
    	var dl=$('#doctorlist');
    	var doc=app.callAjax("GET","/waggle/service/prescription/doctors","page=1&rows=100","");
    	var s=doc.rows.length;
    	var action="";
    	action="app.showVisitLists('appointment',this)";
    	$('#doctorlist').children().remove();
    	for(var i=0;i<s;i++){
    		    dl.append('<div class="col-md-12 col-xs-12 mpZ borBot1 borBot2">'+
				    	'<div class="col-md-8 col-xs-8">'+
      					'<h3 class="prhead">'+doc.rows[i].dr_name+'</h3>'+
      					'</div>'+
      					'<div class="col-md-4 col-xs-4 padAdj text-right">'+
      					'<div><button type="button" class="btn btn-info" drcode="'+doc.rows[i].dr_code+'" drname="'+doc.rows[i].dr_name+'" onclick="'+action+'">Select</button>'+
				    	'</div>'+
				    	'</div>' + 
				        '</div>');
    	}
    },
    getDoctorVisits:function(drcode,drname){
    	var vl=$('#visitdates');
    	var v=app.callAjax("GET","/waggle/service/prescription/doctorvisits","page=1&rows=100&doctorcode="+drcode+"&hospitalcode=1","");
    	var s=v.rows.length;
    	var action="";    	
    	$('#visitdates').children().remove();
    	for(var i=0;i<s;i++){
    		    vl.append('<div class="col-md-12 col-xs-12 mpZ borBot1 borBot2">'+
    		    		'<div class="col-md-2 col-xs-2"><span class="badge">'+v.rows[i].tokenno+'</span></div>'+
				    	'<div class="col-md-6 col-xs-6">'+
      					'<h3 class="prhead">'+v.rows[i].visitdate+'</h3>'+
      					'</div>'+
      					'<div class="col-md-4 col-xs-4 padAdj text-right">'+
      					'<div><button type="button" class="btn btn-info" dvmid="'+v.rows[i].dvm_id+'" drcode="'+v.rows[i].dvm_doctor_code+'" drname="'+drname+'" onclick="app.cancelDoctorVisit(this)">Cancel Visit</button> <button type="button" class="btn btn-info" visitdate="'+v.rows[i].visitdate+'" dvmid="'+v.rows[i].dvm_id+'" drcode="'+v.rows[i].dvm_doctor_code+'" drname="'+drname+'" onclick="app.showPatientList(\'visits\',this)">Appointments</button>'+
				    	'</div>'+
				    	'</div>' + 
				        '</div>');
    	}
    	$("#visits").data("drcode",drcode);
    	$("#visits").data("drname",drname);
    },
    getPatientList:function(pVisitID,drCode){
    	var vl=$('#patients');
    	var v=app.callAjax("GET","/waggle/service/prescription/appointments","page=1&rows=100&visitid="+pVisitID+"&doctorcode="+drCode+"&hospitalcode=1","");
    	var s=v.rows.length;
    	var action="";    	
    	$('#patients').children().remove();
    	for(var i=0;i<s;i++){
    		    vl.append('<div class="col-md-12 col-xs-12 mpZ borBot1 borBot2">'+
				    	'<div class="col-md-8 col-xs-8">'+
      					'<h3 class="prhead">'+v.rows[i].patientname+'</h3>'+
      					'<div  class="prTxt">Age: '+v.rows[i].age+' Gender:'+v.rows[i].gender+'</div>'+
      					'<div  class="prTxt">Weight: '+v.rows[i].weight+' | BP:'+v.rows[i].bp+' | Temp:'+v.rows[i].temperature+'</div>'+
      					'</div>'+
      					'<div class="col-md-2 col-xs-2 padAdj text-right">'+
      						'<div><button type="button" class="btn btn-info" >'+v.rows[i].tokenno+'</button>'+
				    		'</div>'+
				    	'</div>'+
      					'<div class="col-md-2 col-xs-2 padAdj text-right">'+
      						'<div><button type="button" id="b_'+v.rows[i].tokenno+'" class="btn btn-info" onclick="app.UpdateInitialStatus(this)">Select</button><button type="button" id="b1_'+v.rows[i].tokenno+'" class="btn btn-info" onclick="app.showPatientDetails(this)">Select</button>'+
				    		'</div>'+
				    	'</div>'+  
				    '</div>'
    		    );
    		    if($('#patients').data("isvisit")==1){
    		        $('#b_'+v.rows[i].tokenno).data("row",v.rows[i]);    		    
    		    	$('#b_'+v.rows[i].tokenno).css("display","block");
    		    	$('#b1_'+v.rows[i].tokenno).css("display","none");
    		    }else{
    		    	$('#b1_'+v.rows[i].tokenno).data("row",v.rows[i]);
    		    	$('#b_'+v.rows[i].tokenno).css("display","none");
    		    	$('#b1_'+v.rows[i].tokenno).css("display","block");    		    
    		    }
    	}
    },
    UpdateInitialStatus:function(btn){
    	var data=$(btn).data("row");
    	$('#ipatientname').val(data.patientname);
    	$('#ipatientcode').val(data.patientcode);
    	$('#igender').text(data.gender);
    	$('#ipatientage').val(data.age);
    	$('#appid').val(data.appid);
    	$('#temperature').val(data.temperature);
    	$('#weight').val(data.weight);
    	$('#bp').val(data.bp);
    	$.mobile.changePage($("#updateinitialstatus"));
    },
    updateInitialInvestigation:function(){
    	var inves={};
		inves.patientcode=Number($('#ipatientcode').val());    
		inves.appid=Number(Number($('#appid').val()));
		inves.temperature=Number(Number($('#temperature').val()));
		inves.weight=Number(Number($('#weight').val()));
		inves.bp=Number(Number($('#bp').val()));
		var v=app.callAjax("POST","/waggle/service/prescription/initialinvestigation",JSON.stringify(inves),"application/json");
		if(v.result=="Success"){
			alert("Status updated successfully");
			app.showPatientList('initialstatus',undefined);
		}else{
			alert("Status Update unsuccessfuly");
		}
    },
    createVisit:function(){
		var visit={};
		visit.doctorcode=Number($('#doctorcode').val());    
		visit.hospitalcode=Number($('#hospitalcode').val());
		visit.visitdate=$('#visitdate').val();
		visit.fromtime=$('#visitdate').val()+" "+$('#fromtime').val();
		visit.totime=$('#visitdate').val()+" "+$('#totime').val();
		visit.branchcode=1;
		if(visit.visitdate=="" || visit.fromtime=="" || visit.totime==""){
			alert("Please fill in all the details and continue..");
		} 
		var v=app.callAjax("POST","/waggle/service/prescription/createvisit",JSON.stringify(visit),"application/json");
		if(v.result=="Success"){
			alert("Visit Created Successfully");
			app.showVisitLists('doctorconsole',null,$('#doctorcode').val(),$('#doctorname').val());
			$('#doctorcode').val("");
			$('#hospitalcode').val("");
			$('#doctorname').val("");
			$('#hospitalname').val("");
			$('#visitdate').val("");
			$('#fromtime').val("");
			$('#totime').val("");
		}else{
			alert("Visit Creation unsuccessful");
		}
    },
    createAppointment:function(){
    	if($('#spatientname').val()=="" || $('#spatientage').val()==""){
    		alert("Please fill in all the details to continue");
    		return;
    	} 
    	if($('#regcode').val()=="" || $('#regcode').val()=="0"){
	    	var reg={};
	        reg.savedata={};
	    	reg.savedata.code="0";
	    	reg.savedata.branchcode="1";
	    	reg.savedata.patientname=$('#spatientname').val();
	    	reg.savedata.patientage=$('#spatientage').val();
	    	reg.savedata.gender=$('#sgender').val();
	    	reg.savedata.doctorcode="0";
	    	reg.savedata.referralcode="0";
	    	reg.savedata.guardiantype="";
	    	reg.savedata.guardianname="";
	    	reg.savedata.address1="";
	    	reg.savedata.address2="";
	    	reg.savedata.address3=$('#scity').val();
	    	reg.savedata.mobileno=$('#smobileno').val();
	    	reg.savedata.sponsorcode="0"
	    	reg.savedata.sponsorcardno="";
	    	reg.userid="1";
	    	reg.screencode="23";
	    	reg.operation="ADD";
	    	var v1=app.callAjax("POST","/waggle/service/screen/save","data="+JSON.stringify(reg),"application/x-www-form-urlencoded");
			if(v1.result=="Success"){
				$('#regcode').val(v1.code);
			}else{
				alert(v.message );
				return;
			}
		}    	
		var visit={};
		visit.doctorcode=Number($('#sdoctorcode').val());    
		visit.regcode=Number($('#regcode').val());
		visit.dvmid=Number($('#dvmid').val());
		var v=app.callAjax("POST","/waggle/service/prescription/gettoken",JSON.stringify(visit),"application/json");
		if(v.result=="Success"){
			alert("Token No :"+v.tokenno);
			//app.showVisitLists(null,$('#sdoctorcode').val(),$('#sdoctorname').val());
			if($("#patients").data("isvisit")==2){
				app.showPatientList("doctorconsole");
			}else{
				app.showPatientList('appointments',undefined);
			}
			$('#sdoctorcode').val("");
			$('#sdoctorname').val("");
			$('#svisitdate').val("");
			$('#spatientname').val("");
			$('#spatientage').val("");
			$('#sgender').val("M");
			$('#smobileno').val("");
			$('#scity').val("");
			$('#regcode').val("");
			$('#dvmid').val("");
		}else{
			alert("Token Generation Failed");
		}
    },
    cancelDoctorVisit:function(btn){
		var visit={};
		visit.doctorcode=Number($(btn).attr('drcode'));    
		visit.dvmid=Number($(btn).attr('dvmid'));
		var v=app.callAjax("POST","/waggle/service/prescription/cancelvisit",JSON.stringify(visit),"application/json");
		if(v.result=="Success"){
			alert("Visit Cancelled Successfully");
			app.showVisitLists('doctorconsole',null,visit.doctorcode,$(btn).attr('drname'));
		}else{
			alert("Visit Creation unsuccessful");
		}
    },
    registerPatient:function(){
    	if($('#patientname').val()=="" || $('#patientage').val()==""){
    		alert("Please fill in all the details to continue");
    		return;
    	}
        var reg={};
        reg.savedata={};
    	reg.savedata.code="0";
    	reg.savedata.branchcode="1";
    	reg.savedata.patientname=$('#patientname').val();
    	reg.savedata.patientage=$('#patientage').val();
    	reg.savedata.gender=$('#gender').val();
    	reg.savedata.doctorcode="0";
    	reg.savedata.referralcode="0";
    	reg.savedata.guardiantype="";
    	reg.savedata.guardianname="";
    	reg.savedata.address1="";
    	reg.savedata.address2="";
    	reg.savedata.address3=$('#city').val();
    	reg.savedata.mobileno=$('#mobileno').val();;
    	reg.savedata.sponsorcode="0"
    	reg.savedata.sponsorcardno="";
    	reg.userid="1";
    	reg.screencode="23";
    	reg.operation="ADD";
    	var v=app.callAjax("POST","/waggle/service/screen/save","data="+JSON.stringify(reg),"application/x-www-form-urlencoded");
		if(v.result=="Success"){
			alert("Patient Registered Successfully. Please note the registration number for further communications ["+v.code+"]");
			$('#patientname').val("");
			$('#patientage').val("");
			$('#gender').val("M");
			$('#mobileno').val("");
			$('#city').val("");
		}else{
			alert(v.message);
		}
    },
    saveDiagnose:function(){
		var dg={};
		dg.doctorcode=userCode;    
		dg.hospitalcode=hospitalCode;
		dg.notedate=$('#dvisitdate').val();
		dg.appid=$('#dappid').val();
		dg.pdnid=$('#pdnid').val();
		dg.patientcode=$('#dpatientcode').val();    
		dg.temperature=$('#dtemperature').val();
		dg.weight=$('#dweight').val();
		dg.bp=$('#dbp').val();
		dg.notes=$('#diagnosenotes').val()
		dg.bs=$('#dbs').val();		
		dg.pr=$('#dpr').val();
		var v=app.callAjax("POST","/waggle/service/prescription/savenotes",JSON.stringify(dg),"application/json");
		if(v.result=="Success"){
			setErrorMessage("Notes Updated Successfully");
			$('#pdnid').val(v.code);
		}else{
			setErrorMessage("Notes Update unsuccessful");
		}
    },
    searchPatient:function(){
    	var rcode="";
    	var mobileNo="";
    	if($('#regsearchtype').val()=="mobile"){
    		mobileNo=$('#searchtxt').val();
    	}else{
    		rcode=$('#searchtxt').val();
    	}
    	var v=app.callAjax("GET","/waggle/service/prescription/searchpatient","regcode="+rcode+"&mobileno="+mobileNo,"");
    	if(v!=null){
    		$('#regcode').val(v.prm_code);
    		$('#spatientname').val(v.prm_name);
    		$('#spatientage').val(v.prm_age);
    		$('#sgender').val(v.prm_gender);
    		$('#smobileno').val(v.prm_mobileno);
    		$('#scity').val(v.prm_address3);
    	}else{
    		$('#regcode').val("0");
    	}
    },
    getPrevDiagnose:function(){
    	var hl=$('#historylist');
    	hl.children().remove();
    	var v=app.callAjax("GET","/waggle/service/prescription/prevdiagnose","regcode="+$('#dpatientcode').val()+"&doctorcode="+userCode+"&appid="+$('#dappid').val(),"");
    	if(v!=null){
    		var s=v.previous.length;
    		for(var i=0;i<s;i++){
    			hl.append('<div class="col-md-12 col-xs-12 mpZero  mt-3" style="border-bottom: 1px solid #d4d4d4;">'+
						  '<div class="col-md-12 col-xs-12" >'+
      					  '<h5 class="prhead1">'+v.previous[i].pdn_date+'</h5>'+
      					  '<div>'+v.previous[i].pdn_notes+      								
      					  '</div>'+
      					  '</div>'+
      					  '</div>');
      					  hl.append('<div class="col-md-12 col-xs-12 mpZero borBot1 borBot2" style="border-bottom: 1px solid #d4d4d4;">'+
						  '<div class="row">'+
						  '<div class="col-md-2 col-xs-2"><div>Height :'+v.previous[i].prevheight+'</div></div>'+
						  '<div class="col-md-2 col-xs-2"><div>Weight :'+v.previous[i].prevweight+'</div></div>'+
						  '<div class="col-md-2 col-xs-2"><div>BP :'+v.previous[i].prevbp+'</div></div>'+
						  '<div class="col-md-2 col-xs-2"><div>BS :'+v.previous[i].prevbs + v.previous[i].app_patient_bstime+'</div></div>'+
						  '<div class="col-md-2 col-xs-2"><div>PR :'+v.previous[i].prevpr+'</div></div>'+
						  '<div class="col-md-2 col-xs-2"><div>BMI :'+v.previous[i].app_patient_bmi+'</div></div>'+
						  '</div>'+
      					  '</div>');
    		}
    		$('#dweight').val(v.weight);
    		$('#dtemperature').val(v.temperature);
    		$('#dbp').val(v.bp);
    		$('#diagnosenotes').text(v.pdn_notes);
    		$('#pdnid').val(v.pdn_id);
    	}
    },
    constructBU:function(){
    	var vl=$('#bunames');
    	var v=app.callAjax("GET","/waggle/service/prescription/doctorbu","page=1&rows=100&doctorcode="+userCode+"&hospitalcode=1","");
    	var s=v.rows.length;
    	var action="";    	
    	$('#bunames').children().remove();
    	for(var i=0;i<s;i++){
				
    		    vl.append('<div name="bunames" class="col-md-12 col-xs-12 mpZero borBot1 borBot2" onclick="app.showBUItems('+v.rows[i].bum_code+',\''+v.rows[i].bum_buname+'\')">'+
      					  '<div class="col-md-12 col-xs-12">'+
      					  '<h5 class="prhead1 bg-light text-dark" style="cursor: pointer">'+v.rows[i].bum_buname+'</h5>'+
      					  '<div> </div>'+
						  '</div>'+
						  '</div>');
    	}
    	vl.find("[name='bunames']").eq(0).click();    
    },
    constructBUItemsLov:function(bucode,buname){
    	var vl=$('#buitems');
    	var st=$('#buitemsearch').val();
    	var v=app.callAjax("GET","/waggle/service/prescription/doctorbuitems","page=1&rows=100&bucode="+bucode+"&hospitalcode=1&searchTxt="+st,"");
    	var s=v.rows.length;
    	var action="";    	
    	$('#buitems').children().remove();
    	$('#buname').text(buname);
    	$('#bucode').val(bucode);
		
    	for(var i=0;i<s;i++){
			var str="";
				str=str+'<div class="col-md-12 col-xs-12 mpZero borBot1 borBot2 mt-3" style="border-bottom: 1px solid #d4d4d4 ; padding: 5px">';
				str=str+'<div class="row">';
			  str=str+'<div class="col-md-5 col-xs-5">';
			  str=str+'<h6 class="prhead1">'+v.rows[i].buim_itemname+'</h6>';
			  if(v.rows[i].ltg_groupname!=null && v.rows[i].ltg_groupname!=undefined){
				  str=str+'<div>'+v.rows[i].ltg_groupname+'</div>';
			  }
			  if(v.rows[i].buim_shortcode!=null && v.rows[i].buim_shortcode!=undefined){
				  str=str+'<div>'+v.rows[i].buim_shortcode+'</div>';
			  }
			  if(v.rows[i].buim_method!=null && v.rows[i].buim_method!=undefined){
				  str=str+'<div>'+v.rows[i].buim_method+'</div>';
			  }
			  
						str=str+'</div>'; 
						str=str+'<div class="col-md-6 col-xs-6 padAdj text-right">';
						str=str+'<textarea style="font-size: 20pt" id="txtTestNotes_'+v.rows[i].buim_code+'" class="form-control" data-role="none" col=200 row=200></textarea>';     
						str=str+'</div>';
						str=str+'<div class="col-md-1 col-xs-1 padAdj text-right">';
						str=str+'<button type="button" style="color: white;"  class="btn btn-info" id="btnBuItemAdd_'+v.rows[i].buim_code+'" onclick="app.saveBUItem('+v.rows[i].buim_code+')">Add</button>';     
						str=str+'</div>';
						str=str+'</div>';
						str=str+'</div>';
					  vl.append(str);  
    	}    
    },
    searchBUItems:function(){
    	app.constructBUItemsLov($('#bucode').val(),$('#buname').val());
    },
    saveBUItem:function(buitemcode){
		var dg={};
		dg.doctorcode=userCode;    
		dg.hospitalcode=hospitalCode;
		dg.testdate=$('#dvisitdate').val();
		dg.appid=$('#dappid').val();
		dg.patientcode=$('#dpatientcode').val();    
		dg.testnotes=$('#txtTestNotes_'+buitemcode).val();
		dg.testcode=buitemcode+'';		
		var v=app.callAjax("POST","/waggle/service/prescription/savetests",JSON.stringify(dg),"application/json");
		if(v.result=="Success"){
			setErrorMessage("Test Added Successfully");
			app.getSelectedBUItems();
		}else{
			setErrorMessage("Test Update unsuccessful");
		}    	
    },
    getSelectedBUItems:function(){
    	var vl=$('#buitemslist');
    	var v=app.callAjax("GET","/waggle/service/prescription/patienttests","page=1&rows=100&appid="+$('#dappid').val()+"&doctorcode="+userCode+"&patientcode="+$('#dpatientcode').val()+"&hospitalcode=1","");
    	var s=v.rows.length;
    	var action="";    	
    	$('#buitemslist').children().remove();
    	for(var i=0;i<s;i++){
    		    vl.append('<div class="col-md-12 col-xs-12 mpZero borBot1 borBot2">'+
						  '<div class="col-md-11 col-xs-11">'+
      					  '<h5 class="prhead1">'+v.rows[i].buim_itemname+'</h5>'+
      					  '<div>'+v.rows[i].pci_notes+
      					  '&nbsp;&nbsp;</div>'+
      					  '</div>'+
      					  '<div class="col-md-1 col-xs-1">'+
      					  '<span class="fa fa-trash-o" onclick="app.deleteBUItem('+v.rows[i].pci_id+')"></span>'+
      					  '</div>'+
      					  '</div>');
      			if(v.rows[i].pci_cr_no>0){
      				vl.find('.fa-trash-o').eq(i).css("display","none");
      			}      					  
    	}    
    },
    deleteBUItem:function(id){
    	var dg={};
		dg.doctorcode=userCode;    
		dg.hospitalcode=hospitalCode;
		dg.testdate=$('#dvisitdate').val();
		dg.appid=$('#dappid').val();
		dg.patientcode=$('#dpatientcode').val();
		dg.pciid=id+'';    
		var v=app.callAjax("POST","/waggle/service/prescription/deletetests",JSON.stringify(dg),"application/json");
		if(v.result=="Success"){
			setErrorMessage("Test Deleted Successfully");
			app.getSelectedBUItems();
		}else{
			setErrorMessage("Test Update unsuccessful");
		}
    },
    constructMedicineItemsLov:function(){
    	var type=$('#searchtype').val();
    	var vl=$('#doctormedicines');
    	var st=$('#medicinesearch').val();
    	var ajaxid="profproducts_rev";
    	if(type=="generic"){
    		ajaxid="profgenproducts_rev";
    	}

    	var v=app.callAjax("GET","/inventory/service/ajax","&ic=0&ro=true&id="+ajaxid+"&profcode="+userCode+"&branch=1&searchTxt="+st,"");
    	var s=v.data.length;
    	var action="";    	
    	$('#doctormedicines').children().remove();
    	for(var i=0;i<s;i++){
			var str="";
			str='<div class="col-md-12 col-xs-12 mpZero borBot1 borBot2 mt-3 " style="border-bottom: 1px solid #d4d4d4;">'+
					'<div class="row " >' +
					  '<div class="col-md-11 col-xs-11 mpZero mb-3">'+
					        '<div class="row">' +
							    	'<div class="col-md-5 col-xs-5 mpZero">'+
										'<h6 class="prhead1">'+v.data[i].productname+'</h6>'+
										'<div class="prTxt" style="font-size: 80%">'+v.data[i].genericname+' | '+v.data[i].stock+'</div>'+
										'<div class="clearfix"></div>'+
								    '</div>'+
									'<div class="col-md-2 col-xs-2 padAdj text-right">'+
										'<div class="input-group">'+
											'<input type="text" class="form-control" placeholder="No Of Days" id="nod_'+v.data[i].productcode+'" data-role="none" inputType="NUMERIC"  decimal="0" mandatory="1"   maxlength="5" onkeydown="return validate(this,event)">'+
					 				   '</div>'+
									'</div>'+
					 				'<div class="col-md-2 col-xs-2 padAdj text-right">'+
												'<div class="input-group">';
													if(v.data[i].PCT_consumetype!="No"){
														str=str+'<input type="text" class="form-control" placeholder="Total" id="tot_'+v.data[i].productcode+'" data-role="none" inputType="NUMERIC"  decimal="0" mandatory="1" value="1"  maxlength="5" onkeydown="return validate(this,event)">';
													}else{
														str=str+'<input type="text" class="form-control" disabled placeholder="Total" id="tot_'+v.data[i].productcode+'" data-role="none" inputType="NUMERIC"  decimal="0" mandatory="1"   maxlength="5" onkeydown="return validate(this,event)">';
													}
													
													str=str+'<input type="hidden"  id="medtype_'+v.data[i].productcode+'" value="'+v.data[i].PCT_consumetype+'">'+
													'<input type="hidden"  id="medtypeid_'+v.data[i].productcode+'" value="'+v.data[i].PCT_ID+'">'+
													'<input type="hidden"  id="hidecourse_'+v.data[i].productcode+'" value="'+v.data[i].pct_hidecourse+'"></div>'+
								 	'</div>'+
									'<div class="col-md-3 col-xs-3 padAdj text-right">'+
										'<div class="input-group">'+
										'<input type="text" class="form-control" placeholder="Addl.Info" id="remarks_'+v.data[i].productcode+'" data-role="none" inputType="ALPHANUMERIC"  decimal="0" mandatory="0"   maxlength="50" onkeydown="return validate(this,event)">'+
									'</div>'+
									'</div>'+
							'</div>'+
					 				 '<div class="clearfix"></div>'+
					  '<div style="padding-top:5px" class="col-md-12 col-xs-12 mpZero">'+
					  '<div class="row">' +
					  '<div class="col-md-2 col-xs-2 mpZero">'+
						'<div class="">Course  -  '+v.data[i].PCT_consumetype+'</div>'+
					  '</div>';
					  if(v.data[i].pct_hidecourse=="1"){
					  
					  }else  if(v.data[i].PCT_consumetype!="No"){
						  str=str+'<div class="col-md-2 col-xs-2 mpZero text-center">'+
							'<div class="input-group">'+
							'<input type="text" class="form-control" placeholder="'+v.data[i].PCT_consumetype+'" id="c1_'+v.data[i].productcode+'" data-role="none" inputType="NUMERIC"  decimal="0" mandatory="1"   maxlength="5" onkeydown="return validate(this,event)">'+
						   '</div>'+
							'</div>'+
							'<div class="col-md-2 col-xs-2 mpZero text-center">'+
							'<div class="input-group">'+
							'<input type="text" class="form-control" placeholder="'+v.data[i].PCT_consumetype+'" id="c2_'+v.data[i].productcode+'" data-role="none" inputType="NUMERIC"  decimal="0" mandatory="1"   maxlength="5" onkeydown="return validate(this,event)">'+
						   '</div>'+
							'</div>'+
							'<div class="col-md-2 col-xs-2 mpZero text-center">'+
							'<div class="input-group">'+
							'<input type="text" class="form-control" placeholder="'+v.data[i].PCT_consumetype+'" id="c3_'+v.data[i].productcode+'" data-role="none" inputType="NUMERIC"  decimal="0" mandatory="1"   maxlength="5" onkeydown="return validate(this,event)">'+
						   '</div>'+
							'</div>'+
							'<div class="col-md-2 col-xs-2 mpZero text-center">'+
							'<div class="input-group">'+
							'<input type="text" class="form-control" placeholder="'+v.data[i].PCT_consumetype+'" id="c4_'+v.data[i].productcode+'" data-role="none" inputType="NUMERIC"  decimal="0" mandatory="1"   maxlength="5" onkeydown="return validate(this,event)">'+
						   '</div>'+
							'</div>'+
							'<div class="col-md-2 col-xs-2 mpZero text-center">'+
							'<div class="input-group">'+
							'<select data-role="none" class="form-control" id="am_'+v.data[i].productcode+'"><option value="AM">After Meal</option><option value="BM">Before Meal</option></select>'+
						   '</div>'+
							'</div>';
					  }else{
						  str=str+'<div class="col-md-2 col-xs-2 mpZero text-center">'+
							'<div class="input-group">'+
							'<select data-role="none" class="form-control" id="c1_'+v.data[i].productcode+'"><option value="0">None</option><option value="0.5">Half</option><option value="1">1</option><option value="1.5">1 and Half</option><option value="2">2</option><option value="3">3</option><option value="4">4</option><option value="5">5</option></select>'+
						   '</div>'+
							'</div>'+
							'<div class="col-md-2 col-xs-2 mpZero text-center">'+
							'<div class="input-group">'+
							'<select data-role="none" class="form-control" id="c2_'+v.data[i].productcode+'"><option value="0">None</option><option value="0.5">Half</option><option value="1">1</option><option value="1.5">1 and Half</option><option value="2">2</option><option value="3">3</option><option value="4">4</option><option value="5">5</option></select>'+
						   '</div>'+
							'</div>'+
							'<div class="col-md-2 col-xs-2 mpZero text-center">'+
							'<div class="input-group">'+
							'<select data-role="none" class="form-control" id="c3_'+v.data[i].productcode+'"><option value="0">None</option><option value="0.5">Half</option><option value="1">1</option><option value="1.5">1 and Half</option><option value="2">2</option><option value="3">3</option><option value="4">4</option><option value="5">5</option></select>'+
						   '</div>'+
							'</div>'+
							'<div class="col-md-2 col-xs-2 mpZero text-center">'+
							'<div class="input-group">'+
							'<select data-role="none" class="form-control" id="c4_'+v.data[i].productcode+'"><option value="0">None</option><option value="0.5">Half</option><option value="1">1</option><option value="1.5">1 and Half</option><option value="2">2</option><option value="3">3</option><option value="4">4</option><option value="5">5</option></select>'+
						   '</div>'+
							'</div>'+
							'<div class="col-md-2 col-xs-2 mpZero text-center">'+
							'<div class="input-group">'+
							'<select data-role="none" class="form-control" id="am_'+v.data[i].productcode+'"><option value="AdappidM">After Meal</option><option value="BM">Before Meal</option></select>'+
						   '</div>'+
							'</div>';
					  }
																														 
					  str=str+'</div>'+'</div>'+
					  '</div>'+
					  '<div class="col-md-1 col-xs-1 mpZero">'+
					  '<div class="col-md-12 col-xs-12 text-right mpZero">&nbsp;</div><div class="col-md-12 col-xs-12 text-right mpZero">'+
						'<button style="color: white;" class="btn btn-info ui-btn ui-shadow ui-corner-all" type="button" onclick="app.addMedicineItem('+v.data[i].productcode+')">Add</button>'+
					  '</div>'+
					  '</div>'+
					  '</div>'+
					  '</div>';
					  vl.append(str);
					  
	}    
},
    addMedicineItem:function(itemcode){
		var dg={};
		dg.doctorcode=userCode;    
		dg.hospitalcode=hospitalCode;
		dg.presdate=$('#dvisitdate').val();
		dg.appid=$('#dappid').val();
		dg.patientcode=$('#dpatientcode').val();    
		dg.ifreqnotes=$('#remarks_'+itemcode).val();
		dg.medicinecode=itemcode+'';
		dg.course1=$('#c1_'+itemcode).val();
		dg.course2=$('#c2_'+itemcode).val();
		dg.course3=$('#c3_'+itemcode).val();
		dg.course4=$('#c4_'+itemcode).val();
		dg.abmeal=$('#am_'+itemcode).val();		
		dg.numbers=$('#nod_'+itemcode).val();
		dg.ifrequred="0";
		dg.mtype="1";
		if(dg.numbers=="" || dg.numbers=="0"){
			setErrorMessage("Please enter number of days");
			return; 
		}
		if(dg.course1=="0" && dg.course2=="0" && dg.course3=="0" && dg.course4=="0"){
			setErrorMessage("Please select any one of the course of medicine to continue");
			return; 
		}
		var v=app.callAjax("POST","/waggle/service/prescription/saveprescription",JSON.stringify(dg),"application/json");
		if(v.result=="Success"){
			setErrorMessage("Medicine Added Successfully");
			app.getSelectedMedicineItems();
		}else{
			setErrorMessage("Medicine Update unsuccessful");
		}    	
    },
    getSelectedMedicineItems:function(){
    	var vl=$('#medicineslist');
		
    	var v=app.callAjax("GET","/waggle/service/prescription/patientmedicines","page=1&rows=100&appid="+$('#dappid').val()+"&doctorcode="+userCode+"&patientcode="+$('#dpatientcode').val()+"&hospitalcode=1","");
    	
		var s=v.rows.length;
    	var action="";    	
    	$('#medicineslist').children().remove();
    	for(var i=0;i<s;i++){
    		    vl.append('<div class="col-md-12 col-xs-12 mpZero borBot1 borBot2  mt-3 "  style="border-bottom: 1px solid #d4d4d4;">'+
						  '<div class="row">'+
						  '<div class="col-md-8 col-xs-8 mpZero">'+
      					  '<h6 class="prhead1">'+v.rows[i].productname+'</h6>'+
      					  '<div class="prTxt">'+v.rows[i].genericname+'</div>'+
      					  '<div class="prTxt"><span>'+v.rows[i].pdp_course1+'-'+v.rows[i].pdp_course2+'-'+v.rows[i].pdp_course3+'-'+v.rows[i].pdp_course4+'&nbsp;&nbsp;<span class="badge">'+v.rows[i].pdp_ABMeal+'</span></div>'+
      					  '</div>'+
      					  '<div class="col-md-4 col-xs-4 text-right mpZero mt-3">'+
      					  '<span class="badge">'+v.rows[i].pdp_numbers+'</span>&nbsp;&nbsp;<span class="mdi mdi-delete" onclick="app.deleteMedicineItem('+v.rows[i].pdp_id+')"></span>'+
      					  '</div>'+
						  '</div>'+
      					  '<div class="col-md-12 col-xs-12 mpZero borBot1 borBot2 mb-3">Note : '+v.rows[i].pdp_ifreqnotes+'</div>'+
      					  '</div>');
    	}    
    },
    deleteMedicineItem:function(id){
    	var dg={};
		dg.doctorcode=userCode;    
		dg.hospitalcode=hospitalCode;
		dg.presdate=$('#dvisitdate').val();
		dg.appid=$('#dappid').val();
		dg.patientcode=$('#dpatientcode').val();
		dg.pdpid=id+'';    
		var v=app.callAjax("POST","/waggle/service/prescription/deleteprescription",JSON.stringify(dg),"application/json");
		if(v.result=="Success"){
			setErrorMessage("Medicine Deleted Successfully");
			app.getSelectedMedicineItems();
		}else{
			setErrorMessage("Medicine Update unsuccessful");
		}
    },
    medicineSearchKeyDown:function(e,inp){
    	var key=e.which || e.keyCode;    	
    	if(key==13){
    		app.constructMedicineItemsLov();
    	}    
    },
    testSearchKeyDown:function(e,inp){
    	var key=e.which || e.keyCode;    	
    	if(key==13){
    		app.searchBUItems();
    	}    
    },
    patientSearchKeyDown:function(e,inp){
    	var key=e.which || e.keyCode;    	
    	if(key==13){
    		app.searchPatient();
    	}    
    },
    saveFees:function(){
    	var dg={};
		dg.doctorcode=userCode;    
		dg.hospitalcode=hospitalCode;
		dg.feedate=$('#dvisitdate').val();
		dg.appid=$('#dappid').val();
		dg.patientcode=$('#dpatientcode').val();    
		dg.amount=$('#dfees').val();
		dg.status=$('#dfeestatus').val();
		dg.nextvisit=$('#dnextvisit').val();
		if(dg.nextvisit==""){
			dg.nextvisit="0";
		}
		if(dg.amount==""){
			dg.amount="0";
		}
		var v=app.callAjax("POST","/waggle/service/prescription/savefees",JSON.stringify(dg),"application/json");
		if(v.result=="Success"){
			setErrorMessage("Fee details updated Successfully");
			app.showPatientList("doctorconsole");
		}else{
			setErrorMessage("Fee details update unsuccessful");
		}
    },    
    showDiagnose:function(li){
    	var elem=$(li);
    	$('#navg>li>span').removeClass("selTab");
    	elem.find("span").addClass("selTab");
    	$('#diagnose').css("display","block");
    	$('#tests').css("display","none");
    	$('#prescription').css("display","none");
    	$('#fees').css("display","none");
    	$('#nextvisit').css("display","none");
    	app.getPrevDiagnose();
    },
    showClinicalTests:function(li){
    	var elem=$(li);
    	$('#navg>li>span').removeClass("selTab");
    	elem.find("span").addClass("selTab");
    	$('#diagnose').css("display","none");
    	$('#tests').css("display","block");
    	$('#prescription').css("display","none");
    	$('#fees').css("display","none");
    	$('#nextvisit').css("display","none");
    	app.constructBU();
    	app.getSelectedBUItems();
    },
    showPrescription:function(li){
    	var elem=$(li);
    	$('#navg>li>span').removeClass("selTab");
    	elem.find("span").addClass("selTab");
    	$('#diagnose').css("display","none");
    	$('#tests').css("display","none");
    	$('#prescription').css("display","block");
    	$('#fees').css("display","none");
    	$('#nextvisit').css("display","none");
    	app.constructMedicineItemsLov();
    	app.getSelectedMedicineItems();
    },
    showFees:function(li){
    	var elem=$(li);
    	$('#navg>li>span').removeClass("selTab");
    	elem.find("span").addClass("selTab");
    	$('#diagnose').css("display","none");
    	$('#tests').css("display","none");
    	$('#prescription').css("display","none");
    	$('#fees').css("display","block");
    	$('#nextvisit').css("display","none");
    },
    showNextVisit:function(li){
    	var elem=$(li);
    	$('#navg>li>span').removeClass("selTab");
    	elem.find("span").addClass("selTab");
    	$('#diagnose').css("display","none");
    	$('#tests').css("display","none");
    	$('#prescription').css("display","none");
    	$('#fees').css("display","none");
    	$('#nextvisit').css("display","block");
    },    
	clearScreen:function(){
	},
    showDoctorProducts:function(){
    	$.mobile.changePage($("#doctorproducts"));
    	var hgt=$(window).height()-250;
    	searchProductTxt="";
    	jqReport(710026,"#dproducts","&branch=1&login_id=admin&doctorcode="+userCode,null,hgt,500);
    	$('#gs_productname').bind("keydown",app.onTextKeyDown);
    	$('#gs_productname').bind("keypress",app.onTextKeyPress);
    },
    onTextKeyDown:function(e){
    	var key=e.which || e.keyCode;
    	var tgt=$(e.target);
    	if(key==8){
    		app.sendRequestOnKeyPress(key,tgt.val());
    	}
    },
    onTextKeyPress:function(e){
    	var key=e.which || e.keyCode;
    	var tgt=$(e.target);    	
    	app.sendRequestOnKeyPress(key,tgt.val());
    },
    sendRequestOnKeyPress:function(key,val){
    	var t="";
    	if(key==8){
    		t=val.substring(0,val.length-1);
    	}else{
	    	t=val+String.fromCharCode(key);
	    }
	    searchProductTxt=t;
	    window.clearTimeout(timer);
	    timer=window.setTimeout(app.ajaxCall,600);
    },
    ajaxCall:function(){
	    changeUrlAndReloadGrid(710026,"&branch=1&login_id=admin&doctorcode="+userCode,"&_search=true&productname="+escape(searchProductTxt));
    },
    showSelectedItems:function(){
    	$('#selectedtests').css("display","block");
    	$('#bitemsearch').css("display","none");
    },
    showSearchItems:function(){
    	$('#selectedtests').css("display","none");
    	$('#bitemsearch').css("display","block");
    },
    confirmTests:function(){
		var ct={};
		ct.doctorcode=userCode;    
		ct.hospitalcode=hospitalCode;
		ct.patientcode=$('#dpatientcode').val();
		ct.appid=$('#dappid').val();
		ct.branchcode="1";
		var v=app.callAjax("POST","/waggle/service/prescription/confirmtests",JSON.stringify(ct),"application/json");
		if(v.result=="Success"){
			setErrorMessage("Test Confirmation Successful");
		}else{
			setErrorMessage("Test Confirmation unsuccessful");
		}
    },
    confirmMedicines:function(){
		var ct={};
		ct.doctorcode=userCode;    
		ct.hospitalcode=hospitalCode;
		ct.patientcode=$('#dpatientcode').val();
		ct.custcode=$('#dcustcode').val();
		ct.custname=$('#dpatientname').text();
		ct.appid=$('#dappid').val();
		ct.branchcode="1";
		ct.locationcode="1";
		ct.doctorname=doctorName;
		ct.custage=$('#dage').text();
		ct.gender=$('#dgender').text();
		var v=app.callAjax("POST","/waggle/service/prescription/confirmmedicines",JSON.stringify(ct),"application/json");
		if(v.result=="Success"){
			setErrorMessage("Medicine Confirmation Successful");
		}else{
			setErrorMessage("Medicine Confirmation unsuccessful");
		}
    }
	};
function formatDateddMMyyyy(d){
		var formattedDate="";
		var curr_date = d.getDate();
		var curr_month = d.getMonth();
		var curr_year = d.getFullYear();
		curr_month++;
		
   		var mon="";
   		var day="";
   		if(curr_month<=9){
   			mon="0"+curr_month;
   		}else{
   			mon=curr_month+"";
   		}
   		if(curr_date<=9){
   			day="0"+curr_date;
   		}else{
   			day=curr_date+"";
   		}   		
   		formattedDate=day+"/"+mon+"/"+curr_year;
   		return formattedDate;
  }
  function formatDateddMMyyyyNumber(d){
		var formattedDate="";
		var curr_date = d.getDate();
		var curr_month = d.getMonth();
		var curr_year = d.getFullYear();
		curr_month++;
		
   		var mon="";
   		var day="";
   		if(curr_month<=9){
   			mon="0"+curr_month;
   		}else{
   			mon=curr_month+"";
   		}
   		if(curr_date<=9){
   			day="0"+curr_date;
   		}else{
   			day=curr_date+"";
   		}   		
   		formattedDate=curr_year+""+mon+""+day;
   		return toNumber(formattedDate);
  }
  function formatDateyyyyMMdd(d){
		var formattedDate="";
		var curr_date = d.getDate();
		var curr_month = d.getMonth();
		var curr_year = d.getFullYear();
		curr_month++;

   		var mon="";
   		var day="";
   		if(curr_month<=9){
   			mon="0"+curr_month;
   		}else{
   			mon=curr_month+"";
   		}
   		if(curr_date<=9){
   			day="0"+curr_date;
   		}else{
   			day=curr_date+"";
   		}   		
   		formattedDate=curr_year+"-"+mon+"-"+day;
   		return formattedDate;
  }
  function formatTimeHHMM(d){
		var formattedDate="";
		var curr_hour = d.getHours();
		var curr_min = d.getMinutes();
		
   		var h="";
   		var m="";
   		if(curr_hour<=9){
   			h="0"+curr_hour;
   		}else{
   			h=curr_hour+"";
   		}
   		if(curr_min<=9){
   			m="0"+curr_min;
   		}else{
   			m=curr_min+"";
   		}
   		formattedDate=h+":"+m;
   		return formattedDate;
  }
  function formatDateYMD(datestring){
		var formattedDate="";
		if(datestring!=""){
			var year=datestring.split("/")[2];
			var month=datestring.split("/")[1];
			var day=datestring.split("/")[0];
			formattedDate=year+"-"+month+"-"+day;
		}
   		return formattedDate;
  }
  function toNumber(value){
	if(value!='NaN' && value!=null && value.trim().length>0){
		return Number(value);
	}else{
		return 0.0;
	}
 }
 function roundOff(value, digits){
    return (Math.round((value*Math.pow(10,digits)).toFixed(digits-1))/Math.pow(10,digits)).toFixed(digits);
	}
 