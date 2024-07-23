/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.9
 * Generated at: 2024-07-19 08:16:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class reports_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01//EN\" \"http://www.w3.org/TR/html4/strict.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("    <head>\r\n");
      out.write("        \r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("    <script>\r\n");
      out.write("    ");

    	String userId=(String)session.getAttribute("LOGIN_ID");
    	String rptId=request.getParameter("id");
		String screencode=(String)request.getParameter("screencode");
    	String rptTitle=request.getParameter("title");
    	String fromdt=request.getParameter("fromdt");
    	String todt=request.getParameter("todt");
    	String fromdash=request.getParameter("fromdash");
    	if(fromdt!=null && !fromdt.equals("")){
      out.write("\r\n");
      out.write("    		$('#fromDate').val(fromdt);\r\n");
      out.write("    	");
}
    	if(todt!=null && !todt.equals("")){
      out.write("\r\n");
      out.write("			$('#toDate').val(todt);\r\n");
      out.write("		");
}

      out.write("\r\n");
      out.write("\r\n");
      out.write("    </script>\r\n");
      out.write("    \r\n");
      out.write("	<div class=\"card border-0 shadow\">\r\n");
      out.write("		<div class=\"card-body lpage\">\r\n");
      out.write("			<div class=\"row w-100\">\r\n");
      out.write("				<div class=\"col-md-3 d-flex align-items-center\">\r\n");
      out.write("					<h4 class=\"header-title\">");
      out.print(rptTitle);
      out.write("</h4>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<div class=\"col-md-3 d-flex align-items-center\">\r\n");
      out.write("					<!-- <div class=\"input-group\" id=\"branchdiv\">\r\n");
      out.write("						<span class=\"input-group-text\">Branch</span>\r\n");
      out.write("						<select class=\"form-select\" id=\"branch\" onchange=\"loadBranchUserData()\"></select>\r\n");
      out.write("					</div> -->\r\n");
      out.write("					<div class=\"input-group\" id=\"userdiv\">\r\n");
      out.write("						<span class=\"input-group-text\">User</span>\r\n");
      out.write("						<select class=\"form-select\" id=\"username\"></select>\r\n");
      out.write("\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"input-group\"  id=\"budiv\">\r\n");
      out.write("						<span class=\"input-group-text\">BU</span>\r\n");
      out.write("						<select class=\"form-select\" id=\"buname\"></select>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<div  class=\"col-md-6\" id=\"addGrp\">\r\n");
      out.write("					<div class=\"row\">\r\n");
      out.write("						<div class=\"col-md-8 d-flex text-right\">\r\n");
      out.write("							\r\n");
      out.write("							<div class=\"input-group\">\r\n");
      out.write("								<span class=\"input-group-text\">From</span>\r\n");
      out.write("								<input id=\"fromDate\" name=\"fromDate\" inputType=\"date\"  type=\"text\" mandatory=\"1\"  class=\"form-control\"/>\r\n");
      out.write("								<span class=\"input-group-text\">To</span>\r\n");
      out.write("								<input id=\"toDate\" name=\"toDate\" inputType=\"date\"  type=\"text\" mandatory=\"1\"  class=\"form-control\"/> &ensp;\r\n");
      out.write("								<button type=\"button\" class=\"btn btn-edit\" onclick=\"reportGo('");
      out.print(rptId);
      out.write("')\">Go</button> &ensp;\r\n");
      out.write("								<button type=\"button\" class=\"btn btn-edit\" onclick=\"printCurrentSession()\">Print</button>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("						\r\n");
      out.write("						<div class=\"col-md-4\" style=\"text-align: right;\">\r\n");
      out.write("							<button type=\"button\" class=\"btn btn-clear\" onclick='toggleHeaderRow()'><span class=\"mdi mdi-filter-variant\">Search</span></button>	\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"row \" id=\"jqcontainer\" >\r\n");
      out.write("			  <div class=\"table-container\" >\r\n");
      out.write("				 <div id=\"rep\" class=\"w-100\"></div>\r\n");
      out.write("			  </div>\r\n");
      out.write("			</div>	\r\n");
      out.write("			<div id=\"callback\" class=\"row \" style=\"display:none;\"></div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- <div id=\"content\" >\r\n");
      out.write("			<div class=\"clearfix\"></div>\r\n");
      out.write("			<div id=\"filter\" style=\"display:block\" class=\"col-sm-15 col-md-15 col-lg-15 mpRhZ mTBx\">\r\n");
      out.write("			\r\n");
      out.write("				<div class=\"panelOrange hcH\">\r\n");
      out.write("				<span id=\"spanClose\" class=\"pull-right right-btn\" onclick=\"closeReport()\" style=\"width:50px;text-align:right;\"><b id=\"settingsBtn\" class=\"fa fa-times-circle\"></b></span>\r\n");
      out.write("				<div class=\"subHe\" id=\"dtfilter\" name=\"dtfilter\" style=\"display: block\">");
      out.print(rptTitle);
      out.write("<span class=\"pull-right\" onclick=\"showHideFilter()\"><b class=\"fa fa-caret-down\"></b></span></div>\r\n");
      out.write("  					<div id=\"divFirstFilter\" style=\"display:block\">\r\n");
      out.write("  						<div class=\"col-sm-4 col-md-4 col-lg-4\" id=\"branchdiv\">\r\n");
      out.write("	  						<div class=\"form-group extrBT\"><label class=\"col-sm-5 control-label mpRes\" for=\"inputEmail3\">Branch</label><div class=\"col-sm-7 mpRes\"><select class=\"form-control\" id=\"branch\" onchange=\"loadBranchUserData()\"></select></div></div>\r\n");
      out.write("	  					</div>  						\r\n");
      out.write("  						<div class=\"col-sm-4 col-md-4 col-lg-4\" id=\"userdiv\">\r\n");
      out.write("	  						<div class=\"form-group extrBT\"><label class=\"col-sm-5 control-label mpRes\" for=\"inputEmail3\">User</label><div class=\"col-sm-7 mpRes\"><select class=\"form-control\" id=\"username\"></select></div></div>\r\n");
      out.write("	  					</div>\r\n");
      out.write("	  					<div class=\"col-sm-4 col-md-4 col-lg-4\" id=\"budiv\">\r\n");
      out.write("	  						<div class=\"form-group extrBT\"><label class=\"col-sm-5 control-label mpRes\" for=\"inputEmail3\">BU</label><div class=\"col-sm-7 mpRes\"><select class=\"form-control\" id=\"buname\"></select></div></div>\r\n");
      out.write("	  					</div>\r\n");
      out.write("	  					<div class=\"clearfix\"></div>\r\n");
      out.write("	  					<div class=\"col-sm-4 col-md-4 col-lg-4\">\r\n");
      out.write("	  						<div class=\"form-group extrBT\"><label class=\"col-sm-5 control-label mpRes\" for=\"inputEmail3\">From Date</label><div class=\"col-sm-7 mpRes\"><input id=\"fromDate\" name=\"fromDate\" inputType=\"date\"  type=\"text\" maxlength=\"50\" mandatory=\"1\" readonly class=\"form-control\"/></div></div>\r\n");
      out.write("	  					</div>\r\n");
      out.write("		    			<div class=\"col-sm-4 col-md-4 col-lg-4\">\r\n");
      out.write("		  						<div class=\"form-group extrBT\"><label class=\"col-sm-5 control-label mpRes\" for=\"inputEmail3\">To Date</label><div class=\"col-sm-7 mpRes\"><input id=\"toDate\" name=\"toDate\" inputType=\"date\"  type=\"text\" maxlength=\"50\" mandatory=\"1\" readonly class=\"form-control\"/></div></div>\r\n");
      out.write("		  				</div>\r\n");
      out.write("		  				<div class=\"col-sm-4 col-md-4 col-lg-4 mpZero\">\r\n");
      out.write("		  					<div class=\"form-group extrBT\"><button type=\"button\" class=\"btn btn-primary mRhAj btn-sm\" onclick=\"reportGo('");
      out.print(rptId);
      out.write("')\">Go</button><button type=\"button\" id=\"prntBtn\" class=\"btn btn-primary mRhAj btn-sm\" onclick=\"printCurrentSession()\">Print</button></div>	\r\n");
      out.write("					    </div>\r\n");
      out.write("					</div>   \r\n");
      out.write("  				</div>\r\n");
      out.write("      		</div>			 -->\r\n");
      out.write("      				    \r\n");
      out.write("		    <script>\r\n");
      out.write("		    if(");
      out.print(rptId);
      out.write("==400014 || ");
      out.print(rptId);
      out.write("==400015 || ");
      out.print(rptId);
      out.write("==400016 || ");
      out.print(rptId);
      out.write("==300010 || ");
      out.print(rptId);
      out.write("==300011 || ");
      out.print(rptId);
      out.write("==200011 || ");
      out.print(rptId);
      out.write("==400020 || ");
      out.print(rptId);
      out.write("==300013 || ");
      out.print(rptId);
      out.write("==200012){\r\n");
      out.write("			    $('#fromDate').datepicker({\r\n");
      out.write("						language: \"en\",\r\n");
      out.write("       				 	autoclose: true,\r\n");
      out.write("       					todayHighlight: true,\r\n");
      out.write("	 	 	     		format:'dd/mm/yyyy'\r\n");
      out.write("				});\r\n");
      out.write("				if($('#fromDate').val()==\"\"){\r\n");
      out.write("					var cd=new Date();\r\n");
      out.write("					$('#fromDate').datepicker(\"setDate\",cd);\r\n");
      out.write("				}\r\n");
      out.write("				$('#toDate').datepicker({\r\n");
      out.write("					language: \"en\",\r\n");
      out.write("					autoclose: true,\r\n");
      out.write("					todayHighlight: true,\r\n");
      out.write("					format:'dd/mm/yyyy'\r\n");
      out.write("				});			\r\n");
      out.write("				if($('#toDate').val()==\"\"){\r\n");
      out.write("					var cd=new Date();\r\n");
      out.write("					$('#toDate').datepicker(\"setDate\",cd);\r\n");
      out.write("				}		    \r\n");
      out.write("		    }else{\r\n");
      out.write("				$('#fromDate').datepicker({\r\n");
      out.write("				 language: \"en\",\r\n");
      out.write("       			 autoclose: true,\r\n");
      out.write("       			 todayHighlight: true,\r\n");
      out.write("	 	 	     format:'dd/mm/yyyy',\r\n");
      out.write("				 timeFormat: 'hh:mm TT'\r\n");
      out.write("					});\r\n");
      out.write("				if($('#fromDate').val()==\"\"){\r\n");
      out.write("					var cd=new Date();\r\n");
      out.write("					$('#fromDate').datepicker(\"setDate\",cd);\r\n");
      out.write("				}\r\n");
      out.write("				$('#toDate').datepicker({\r\n");
      out.write("						language: \"en\",\r\n");
      out.write("					autoclose: true,\r\n");
      out.write("					todayHighlight: true,\r\n");
      out.write("					format:'dd/mm/yyyy',\r\n");
      out.write("					timeFormat: 'hh:mm TT'\r\n");
      out.write("					});\r\n");
      out.write("				if($('#toDate').val()==\"\"){\r\n");
      out.write("					var cd=new Date();\r\n");
      out.write("					$('#toDate').datepicker(\"setDate\",cd);\r\n");
      out.write("				}\r\n");
      out.write("			}\r\n");
      out.write("		    </script>\r\n");
      out.write("			\r\n");
      out.write("            <!-- <div id=\"rep\" style='position:relative;border:0px;display:block;' class=\"mTBx\">\r\n");
      out.write("            	<div class=\"\"><span class=\"pull-right\" style=\"margin-top:-50px\" ><button class=\"btn btn-sm seaColB\" onclick=\"enableSearch();\"><i class=\"fa fa-search\"></i></button></span></div>\r\n");
      out.write("				<div class=\"clearfix\"></div>\r\n");
      out.write("        	</div> -->\r\n");
      out.write("      \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		\r\n");
      out.write("\r\n");
      out.write("var showAll=false;\r\n");
      out.write("if(");
      out.print(rptId);
      out.write("==400008){\r\n");
      out.write("	showAll=true;\r\n");
      out.write("}\r\n");
      out.write("loadBranchData(showAll);\r\n");
      out.write("loadBranchUserData();\r\n");
      out.write("loadBUData();\r\n");
      out.write("if(");
      out.print(rptId);
      out.write("==400006){\r\n");
      out.write("	$('#userdiv').css(\"display\",\"none\");\r\n");
      out.write("	$('#budiv').css(\"display\",\"none\");\r\n");
      out.write("}else if(");
      out.print(rptId);
      out.write("==400014 || ");
      out.print(rptId);
      out.write("==300010 || ");
      out.print(rptId);
      out.write("==300011 || ");
      out.print(rptId);
      out.write("==200011 || ");
      out.print(rptId);
      out.write("==300013  || ");
      out.print(rptId);
      out.write("==200012 || ");
      out.print(rptId);
      out.write("==300015 ){\r\n");
      out.write("	$('#userdiv').css(\"display\",\"none\");\r\n");
      out.write("	$('#branchdiv').css(\"display\",\"none\");\r\n");
      out.write("	$('#budiv').css(\"display\",\"none\");\r\n");
      out.write("	if(");
      out.print(rptId);
      out.write("==200011 ||");
      out.print(rptId);
      out.write("==300013 || ");
      out.print(rptId);
      out.write("==200012){\r\n");
      out.write("		$('#prntBtn').css(\"display\",\"none\");\r\n");
      out.write("	}\r\n");
      out.write("}else if(");
      out.print(rptId);
      out.write("==400015 || ");
      out.print(rptId);
      out.write("==400016 || ");
      out.print(rptId);
      out.write("==400020){\r\n");
      out.write("	$('#userdiv').css(\"display\",\"none\");\r\n");
      out.write("	$('#branchdiv').css(\"display\",\"none\");\r\n");
      out.write("}\r\n");
      out.write("var params=\"\";\r\n");
      out.write("newParams=\"&fromdate=\"+$('#fromDate').val()+\"&todate=\"+$('#toDate').val()+\"&empid=\"+$('#username').val()+\"&branch=\"+$('#branch').val()+\"&bucode=\"+$('#buname').val()+\"&buname=\"+escape($('#buname option:selected').text());\r\n");
      out.write("jqReport(");
      out.print(rptId);
      out.write(",\"#rep\",newParams);\r\n");
      out.write("\r\n");
      out.write("function enableSearch(){\r\n");
      out.write("	toggleSearchToolBar(");
      out.print(rptId);
      out.write(");\r\n");
      out.write("}\r\n");
      out.write("enableSearch();\r\n");
      out.write("function reportGo(id){\r\n");
      out.write("	");
if(rptId.equals("400014") || rptId.equals("400015") || rptId.equals("400016")){
      out.write("\r\n");
      out.write("		$.ajax({\r\n");
      out.write("		            url: \"/waggle/service/account/bills/dayend?branch=1\",\r\n");
      out.write("        		    type: \"GET\",\r\n");
      out.write("	        	    async: false,\r\n");
      out.write("	        	    contentType:\"application/json\",\r\n");
      out.write("		            dataType: \"json\",\r\n");
      out.write("        		    success: function (r) {\r\n");
      out.write("	            	}\r\n");
      out.write("        	});		\r\n");
      out.write("	");
}
      out.write("	\r\n");
      out.write("	showLoader();\r\n");
      out.write("	var newParams=\"&fromdate=\"+$('#fromDate').val()+\"&todate=\"+$('#toDate').val()+\"&empid=\"+$('#username').val()+\"&branch=\"+$('#branch').val()+\"&bucode=\"+$('#buname').val()+\"&buname=\"+escape($('#buname option:selected').text());\r\n");
      out.write("	changeUrlAndReloadGrid(id,params,newParams);\r\n");
      out.write("	");
if(rptId.equals("400014") || rptId.equals("400015") || rptId.equals("400016")){
      out.write("\r\n");
      out.write("		showCSVExportButton(id,newParams);\r\n");
      out.write("	");
}
      out.write("\r\n");
      out.write("	hideLoader();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function toggleHeaderRow(){\r\n");
      out.write("  	toggleSearchToolBar(");
      out.print(rptId);
      out.write(");\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("function showHideFilter(){\r\n");
      out.write("	if( $('#divFirstFilter').is(':visible') ) {\r\n");
      out.write("		$('#divFirstFilter').css(\"display\",\"none\");\r\n");
      out.write("	}else{\r\n");
      out.write("		$('#divFirstFilter').css(\"display\",\"block\");\r\n");
      out.write("	}\r\n");
      out.write("}\r\n");
      out.write("function printCurrentSession(){\r\n");
      out.write("		var printData={};\r\n");
      out.write("		printData[\"type\"]=\"DCHBILL\";\r\n");
      out.write("		printData[\"branch\"]=$('#branch').val();\r\n");
      out.write("		printData[\"branchname\"]=$('#branch option:selected').text();\r\n");
      out.write("		printData[\"address1\"]=\"52, South Street\";\r\n");
      out.write("		printData[\"address2\"]=\"ARUPPUKOTTAI - 626 101\";\r\n");
      out.write("		printData[\"address3\"]=\"Phone - 222273,220936\";		\r\n");
      out.write("		printData[\"empid\"]=$('#username').val();\r\n");
      out.write("		printData[\"bucode\"]=$('#buname').val();\r\n");
      out.write("		printData[\"buname\"]=$('#buname option:selected').text();\r\n");
      out.write("		printData[\"username\"]=$('#username option:selected').text();\r\n");
      out.write("		printData[\"fromdate\"]=$('#fromDate').val();\r\n");
      out.write("		printData[\"todate\"]=$('#toDate').val();\r\n");
      out.write("		printData[\"login_id\"]='");
      out.print(userId);
      out.write("';\r\n");
      out.write("		printData[\"reportid\"]='");
      out.print(rptId);
      out.write("';\r\n");
      out.write("		printData[\"host\"]='192.168.1.6:8282/waggle';\r\n");
      out.write("		printData[\"rows\"]=\"52\";\r\n");
      out.write("		$.ajax({\r\n");
      out.write("            url: \"http://localhost:8282\",\r\n");
      out.write("            type: \"POST\",\r\n");
      out.write("            async: true,\r\n");
      out.write("            contentType:\"application/x-www-form-urlencoded\",\r\n");
      out.write("            data:\"printdata=\"+JSON.stringify(printData),\r\n");
      out.write("            dataType: \"json\",\r\n");
      out.write("            success: function (r) {\r\n");
      out.write("				//alert(r.result);		\r\n");
      out.write("            }\r\n");
      out.write("        });			\r\n");
      out.write("}\r\n");
      out.write("function loadOrderData(url,name,did){\r\n");
      out.write("	if(");
      out.print(rptId);
      out.write("==300010){\r\n");
      out.write("	  	if(name==\"Print\"){\r\n");
      out.write("	  		var rowData=$(\"#report_");
      out.print(rptId);
      out.write("\").getRowData(did);\r\n");
      out.write("		  	var printData={};	  		  	\r\n");
      out.write("		  	var data;\r\n");
      out.write("			$.ajax({\r\n");
      out.write("	            url: \"/waggle/service/screen/data?screencode=16&branchcode=\"+rowData.branchcode+\"&code=\"+rowData.cs_no,\r\n");
      out.write("	            type: \"GET\",\r\n");
      out.write("	            async: false,\r\n");
      out.write("	            contentType:\"application/json\",\r\n");
      out.write("	            dataType: \"json\",\r\n");
      out.write("	            success: function (r) {\r\n");
      out.write("					data=r;		\r\n");
      out.write("	            }\r\n");
      out.write("	        });	        \r\n");
      out.write("		    printData[\"type\"]=\"CS\";\r\n");
      out.write("			printData[\"branchname\"]=$('#branch option:selected').text();\r\n");
      out.write("			printData[\"address1\"]=\"52, South Street\";\r\n");
      out.write("			printData[\"address2\"]=\"ARUPPUKOTTAI - 626 101\";\r\n");
      out.write("			printData[\"address3\"]=\"Phone - 222273,220936\";\r\n");
      out.write("			printData[\"billno\"]=data[\"billno\"];\r\n");
      out.write("			printData[\"billdate\"]=data[\"addeddate\"];\r\n");
      out.write("			printData[\"doctorname\"]=data[\"doctorname\"]+\"\";\r\n");
      out.write("			printData[\"referredby\"]=data[\"referredby\"]+\"\";\r\n");
      out.write("			printData[\"patientname\"]=data[\"patientname\"];		\r\n");
      out.write("			printData[\"patientage\"]=data[\"patientage\"];\r\n");
      out.write("			printData[\"gender\"]=data[\"gender\"];\r\n");
      out.write("			printData[\"mlccode\"]=data[\"mlccode\"];\r\n");
      out.write("			$.ajax({\r\n");
      out.write("	            url: \"http://localhost:9191\",\r\n");
      out.write("	            type: \"POST\",\r\n");
      out.write("	            async: true,\r\n");
      out.write("	            contentType:\"application/x-www-form-urlencoded\",\r\n");
      out.write("	            data:\"printdata=\"+JSON.stringify(printData),\r\n");
      out.write("	            dataType: \"json\",\r\n");
      out.write("	            success: function (r) {\r\n");
      out.write("					//alert(r.result);		\r\n");
      out.write("	            }\r\n");
      out.write("	        });						\r\n");
      out.write("		 }\r\n");
      out.write("	}else if(");
      out.print(rptId);
      out.write("==200011){\r\n");
      out.write("		if(name==\"Print\"){\r\n");
      out.write("			var rowData=$(\"#report_");
      out.print(rptId);
      out.write("\").getRowData(did);\r\n");
      out.write("			var data;\r\n");
      out.write("			$.ajax({\r\n");
      out.write("	            url: \"/waggle/service/ajax?id=medrequest&ic=0&ro=true&branch=\"+rowData.branchcode+\"&code=\"+rowData.soh_no,\r\n");
      out.write("	            type: \"GET\",\r\n");
      out.write("	            async: false,\r\n");
      out.write("	            contentType:\"application/json\",\r\n");
      out.write("	            dataType: \"json\",\r\n");
      out.write("	            success: function (r) {\r\n");
      out.write("					data=r;		\r\n");
      out.write("	            }\r\n");
      out.write("	        });	        \r\n");
      out.write("			\r\n");
      out.write("			var printData={};\r\n");
      out.write("			printData[\"type\"]=\"SOA\";\r\n");
      out.write("			printData[\"branchcode\"]=rowData.branchcode;\r\n");
      out.write("			printData[\"company\"]=rowData.branchname;\r\n");
      out.write("			printData[\"address1\"]=\"52, South Street\";\r\n");
      out.write("			printData[\"address2\"]=\"ARUPPUKOTTAI - 626 101\";\r\n");
      out.write("			printData[\"address3\"]=\"Phone - 222273,220936\";\r\n");
      out.write("			printData[\"orderno\"]=rowData.soh_order_no;\r\n");
      out.write("			printData[\"orderdate\"]=rowData.soh_date;\r\n");
      out.write("			printData[\"tax\"]=\"\";\r\n");
      out.write("			printData[\"totalamt\"]=\"\";\r\n");
      out.write("			printData[\"custname\"]=rowData.soh_cust_name;\r\n");
      out.write("			printData[\"custalias\"]=rowData.cust_alias;\r\n");
      out.write("			printData[\"items\"]=[];\r\n");
      out.write("			for(var x=0;x<data.data.length;x++){\r\n");
      out.write("				var item={};\r\n");
      out.write("				item.name=data.data[x].pm_name;\r\n");
      out.write("				item.sno=data.data[x].sod_sno;\r\n");
      out.write("				item.unit=data.data[x].um_name;\r\n");
      out.write("				item.quantity=data.data[x].sod_qty;\r\n");
      out.write("				printData.items.push(item);\r\n");
      out.write("			}\r\n");
      out.write("			$.ajax({\r\n");
      out.write("	            url: \"http://localhost:9191\",\r\n");
      out.write("	            type: \"POST\",\r\n");
      out.write("	            async: true,\r\n");
      out.write("	            contentType:\"application/x-www-form-urlencoded\",\r\n");
      out.write("	            data:\"printdata=\"+JSON.stringify(printData),\r\n");
      out.write("	            dataType: \"json\",\r\n");
      out.write("	            success: function (r) {\r\n");
      out.write("					//alert(r.result);		\r\n");
      out.write("	            }\r\n");
      out.write("	        });		\r\n");
      out.write("		}\r\n");
      out.write("	}\r\n");
      out.write("}\r\n");
      out.write("</script>        \r\n");
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