/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.9
 * Generated at: 2024-07-19 08:16:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class dischargeHistory_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\">\r\n");
      out.write("  <title>Discharge History</title>\r\n");
      out.write("</head>\r\n");
String mode=request.getParameter("mode");
String code=request.getParameter("code");
String rptId=request.getParameter("id");
String fromDate=request.getParameter("fromdate");
String toDate=request.getParameter("todate");
String reportTitle="Discharge History";
if("400017".equals(rptId)){
	reportTitle="Hospital Bill Detail";
}else if("400011".equals(rptId)){
	reportTitle="Admissions";
}else if("500016".equals(rptId) || "500017".equals(rptId)){
	reportTitle="Doctor Fees";
}
if(fromDate==null){
	fromDate="";
}
if(toDate==null){
	toDate="";
}

      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"card border-0\">\r\n");
      out.write("		<div class=\"card-body lpage\">\r\n");
      out.write("			<div class=\"row w-100 mb-3\">\r\n");
      out.write("				<div class=\"col-md-6 d-flex align-items-center\">\r\n");
      out.write("					<h4 class=\"header-title\">");
      out.print(reportTitle);
      out.write("</h4>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div  class=\"col-md-6 d-flex text-right\" id=\"addGrp\">\r\n");
      out.write("						<div class=\"col-md-7\">\r\n");
      out.write("							<div class=\"input-group\">\r\n");
      out.write("								<span class=\"input-group-text\">From</span>\r\n");
      out.write("								<input id=\"fromDate\" name=\"fromDate\" inputType=\"date\"  type=\"text\" mandatory=\"1\"  class=\"form-control\"/>\r\n");
      out.write("								<span class=\"input-group-text\">To</span>\r\n");
      out.write("								<input id=\"toDate\" name=\"toDate\" inputType=\"date\"  type=\"text\" mandatory=\"1\"  class=\"form-control\"/>\r\n");
      out.write("								<button type=\"button\" class=\"btn btn-edit\" onclick=\"reportGo('");
      out.print(rptId);
      out.write("')\">Go</button>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"col-md-5\">\r\n");
      out.write("							<button type=\"button\" class=\"btn btn-clear\" onclick='toggleHeaderRow()'><span class=\"mdi mdi-filter-variant\">Search</span></button>	\r\n");
      out.write("						</div>\r\n");
      out.write("					\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"row \" id=\"jqcontainer\" ><div class=\"table-container\" ><div id=\"xyz\" class=\"w-100\"></div></div></div>\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("   \r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	<div id='printdlg' class='pop_lov_box' style=\"display:none\">\r\n");
      out.write("			<div id='printtitle' class='pop_lov_hed_box'>\r\n");
      out.write("			<div class='pop_lov_clos'>\r\n");
      out.write("				<a href='#'>\r\n");
      out.write("					<span class='fa fa-times-circle'>\r\n");
      out.write("					</span>\r\n");
      out.write("				</a>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class='pop_lov_hed_txt'><span id=\"ipno\"></span></div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div id='printd' class='pop_lov_inp_box'>\r\n");
      out.write("				<div class=\"col-md-12 col-sm-12 mpZero\">\r\n");
      out.write("					<div  class=\"col-md-12 col-sm-12 mpZero\">		\r\n");
      out.write("					<div class=\"form-group mbotto\">\r\n");
      out.write("						<div class=\"col-md-4\"><label>Summary</label></div>\r\n");
      out.write("						<div class=\"col-md-8\"><input type=\"checkbox\" class=\"form-control\" id=\"printsummary\" checked disabled></div>\r\n");
      out.write("					</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class='clearfix'></div>\r\n");
      out.write("					<div  class=\"col-md-12 col-sm-12 mpZero\">		\r\n");
      out.write("					<div class=\"form-group mbotto\">\r\n");
      out.write("						<div class=\"col-md-4\"><label>Investigation</label></div>\r\n");
      out.write("						<div class=\"col-md-8\"><input type=\"checkbox\" class=\"form-control\" id=\"printlabs\"></div>\r\n");
      out.write("					</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class='clearfix'></div>\r\n");
      out.write("					<div  class=\"col-md-12 col-sm-12 mpZero\">		\r\n");
      out.write("					<div class=\"form-group mbotto\">\r\n");
      out.write("						<div class=\"col-md-4\"><label>Pharmacy</label></div>\r\n");
      out.write("						<div class=\"col-md-8\"><input type=\"checkbox\" class=\"form-control\" id=\"printpharmacy\"></div>\r\n");
      out.write("					</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div id=\"actButton\" class=\"col-md-12 text-right\">\r\n");
      out.write("                	<button id=\"btnPrint\" class=\"btn btn-primary priBut\" type=\"button\" onclick=\"printDischarge()\">Print</button>\r\n");
      out.write("	                <button id=\"btnCancel\" class=\"btn btn-default\" type=\"button\" onclick=\"cancelPrintDlg()\">Cancel</button>\r\n");
      out.write("            	</div>\r\n");
      out.write("			</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<script>\r\n");
      out.write("	var newParams=\"\";\r\n");
      out.write("\r\n");
      out.write("	$('#fromDate').datepicker({\r\n");
      out.write("				 language: \"en\",\r\n");
      out.write("       			 autoclose: true,\r\n");
      out.write("       			 todayHighlight: true,\r\n");
      out.write("	 	 	     format:'dd/mm/yyyy'\r\n");
      out.write("		});\r\n");
      out.write("	$('#toDate').datepicker({\r\n");
      out.write("				 language: \"en\",\r\n");
      out.write("       			 autoclose: true,\r\n");
      out.write("       			 todayHighlight: true,\r\n");
      out.write("	 	 	     format:'dd/mm/yyyy'\r\n");
      out.write("		});\r\n");
      out.write("	\r\n");
      out.write("	if($('#fromDate').val()==\"\"){\r\n");
      out.write("		if(\"");
      out.print(fromDate);
      out.write("\"==\"\"){	\r\n");
      out.write("			var cd=new Date();\r\n");
      out.write("			$('#fromDate').datepicker(\"setDate\",cd);\r\n");
      out.write("		}else{\r\n");
      out.write("			$('#fromDate').val(\"");
      out.print(fromDate);
      out.write("\");\r\n");
      out.write("		}\r\n");
      out.write("	}\r\n");
      out.write("			\r\n");
      out.write("	if($('#toDate').val()==\"\"){\r\n");
      out.write("		if(\"");
      out.print(toDate);
      out.write("\"==\"\"){\r\n");
      out.write("			var cd=new Date();\r\n");
      out.write("			$('#toDate').datepicker(\"setDate\",cd);\r\n");
      out.write("		}else{\r\n");
      out.write("			$('#toDate').val(\"");
      out.print(toDate);
      out.write("\");\r\n");
      out.write("		}\r\n");
      out.write("	}\r\n");
      out.write(" 	loadBranchData();	\r\n");
      out.write(" 	newParams=\"&fromdate=\"+$('#fromDate').val()+\"&todate=\"+$('#toDate').val()+\"&branchcode=\"+$('#branch').val();\r\n");
      out.write("	jqReport(");
      out.print(rptId);
      out.write(",\"#xyz\",newParams);\r\n");
      out.write("	showCSVExportButton(");
      out.print(rptId);
      out.write(",newParams);\r\n");
      out.write("    $(document).ready(function () {\r\n");
      out.write("            $('#subtitle').text(\"\");\r\n");
      out.write("            $('#screentitle').text(\"Bills\");\r\n");
      out.write("     });\r\n");
      out.write("  	function toggleHeaderRow(){\r\n");
      out.write("  		toggleSearchToolBar(");
      out.print(rptId);
      out.write(");\r\n");
      out.write("  	}\r\n");
      out.write("  \r\n");
      out.write("  	toggleHeaderRow();\r\n");
      out.write("  	\r\n");
      out.write("  	function reportGo(id){\r\n");
      out.write("		showLoader();\r\n");
      out.write("		var newParams=\"&fromdate=\"+$('#fromDate').val()+\"&todate=\"+$('#toDate').val()+\"&branchcode=\"+$('#branch').val();\r\n");
      out.write("		changeUrlAndReloadGrid(id,\"\",newParams);\r\n");
      out.write("		showCSVExportButton(id,newParams);\r\n");
      out.write("		hideLoader();\r\n");
      out.write("	}\r\n");
      out.write("    function loadOrderData(url,colname,did){\r\n");
      out.write("	  	var rowData=$(\"#report_");
      out.print(rptId);
      out.write("\").getRowData(did);\r\n");
      out.write("	  	if(colname==\"Print\"){\r\n");
      out.write("	  		if(");
      out.print(rptId);
      out.write("==500017){\r\n");
      out.write("	  			printProfessionalPDF(rowData.branchcode,rowData.drcode);\r\n");
      out.write("	  		}else{\r\n");
      out.write("		  		/*$('#printdlg').dialog({autoOpen:false,modal:true,height:'auto',minHeight:400,minWidth:600,position:'center'});\r\n");
      out.write("				$('#printdlg').dialog('open');\r\n");
      out.write("				$('#printdlg').data(\"row\",rowData);\r\n");
      out.write("				$('#ipno').text(rowData.dh_patient_no);*/\r\n");
      out.write("				printDischarge(rowData);\r\n");
      out.write("			}					\r\n");
      out.write("	    }else if(colname==\"Pay\"){\r\n");
      out.write("	    	var fDate=$('#fromDate').val();\r\n");
      out.write("			var tDate=$('#toDate').val();	    \r\n");
      out.write("	    	$('.ui-dialog').children().remove();\r\n");
      out.write("			$('.ui-dialog').remove();\r\n");
      out.write("			$(\"#bodyContainer\").children().remove();\r\n");
      out.write("			$(\"#bodyContainer\").html(\"\");\r\n");
      out.write("			$(\"#bodyContainer\").load(\"/waggle/professionalPayments.do?screencode=500015&mode=Pay&branch=\"+rowData.branchcode+\"&doctorcode=\"+rowData.drcode+\"&doctorname=\"+escape(rowData.doctorname)+\"&fromdate=\"+fDate+\"&todate=\"+tDate,onSuccess);	  					    \r\n");
      out.write("	    }else{\r\n");
      out.write("	    	var fDate=$('#fromDate').val();\r\n");
      out.write("			var tDate=$('#toDate').val();	    \r\n");
      out.write("	    	$('.ui-dialog').children().remove();\r\n");
      out.write("			$('.ui-dialog').remove();\r\n");
      out.write("			$(\"#bodyContainer\").children().remove();\r\n");
      out.write("			$(\"#bodyContainer\").html(\"\");\r\n");
      out.write("			$(\"#bodyContainer\").load(\"/waggle/discharge.do?id=");
      out.print(rptId);
      out.write("&mode=View&branch=\"+rowData.dh_branchcode+\"&dhno=\"+rowData.dh_no+\"&fromdate=\"+fDate+\"&todate=\"+tDate,onSuccess);	  				\r\n");
      out.write("	    }\r\n");
      out.write("	 }\r\n");
      out.write("	 function printDischarge(rowData){\r\n");
      out.write("	    //var rowData=$('#printdlg').data(\"row\");\r\n");
      out.write("	    var printSummary=$('#printsummary').prop(\"checked\")?\"1\":\"0\";\r\n");
      out.write("	    var printLab=$('#printlabs').prop(\"checked\")?\"1\":\"0\";\r\n");
      out.write("	    var printPharmacy=$('#printpharmacy').prop(\"checked\")?\"1\":\"0\";\r\n");
      out.write(" 		var data;\r\n");
      out.write("		$.ajax({\r\n");
      out.write("            url: \"/waggle/service/discharge/print?branchcode=\"+rowData.dh_branchcode+\"&code=\"+rowData.dh_no,\r\n");
      out.write("            type: \"GET\",\r\n");
      out.write("            async: false,\r\n");
      out.write("            contentType:\"application/json\",\r\n");
      out.write("            dataType: \"json\",\r\n");
      out.write("            success: function (r) {\r\n");
      out.write("				data=r;		\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("        data[\"type\"]=\"DLBILL\";			\r\n");
      out.write("		data[\"address1\"]=\"27,Javulikara Street\";\r\n");
      out.write("		data[\"address2\"]=\"Tiruvarur - 610 001\";\r\n");
      out.write("		data[\"address3\"]=\"Phone - 242292,240292\";\r\n");
      out.write("		data[\"id\"]=\"");
      out.print(rptId);
      out.write("\";	\r\n");
      out.write("		data[\"summary\"]=printSummary;\r\n");
      out.write("		data[\"labs\"]=printLab;\r\n");
      out.write("		data[\"pharmacy\"]=printPharmacy;\r\n");
      out.write("		data[\"printdod\"]=\"1\";\r\n");
      out.write("		data[\"printdodtime\"]=\"0\";\r\n");
      out.write("		$.ajax({\r\n");
      out.write("            url: \"http://localhost:9191\",\r\n");
      out.write("            type: \"POST\",\r\n");
      out.write("            async: true,\r\n");
      out.write("            contentType:\"application/x-www-form-urlencoded\",\r\n");
      out.write("            data:\"printdata=\"+JSON.stringify(data),\r\n");
      out.write("            dataType: \"json\",\r\n");
      out.write("            success: function (r) {\r\n");
      out.write("				//alert(r.result);		\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("        cancelPrintDlg();\r\n");
      out.write("	 }\r\n");
      out.write("	 function cancelPrintDlg(){\r\n");
      out.write("	 	$('#printdlg').removeData('row');\r\n");
      out.write("	 	$('#printdlg').dialog('close');\r\n");
      out.write("		$('#printdlg').dialog('destroy');	 	\r\n");
      out.write("	 }\r\n");
      out.write("	 function printProfessionalPDF(branchcode,code){\r\n");
      out.write("			var url=\"/waggle/service/account/printmonthlydoctorfee?branchcode=\"+branchcode+\"&code=\"+code+\"&fromdate=\"+$('#fromDate').val()+\"&todate=\"+$('#toDate').val();\r\n");
      out.write("			window.open(url,\"_blank\");\r\n");
      out.write("	 }\r\n");
      out.write("  </script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
