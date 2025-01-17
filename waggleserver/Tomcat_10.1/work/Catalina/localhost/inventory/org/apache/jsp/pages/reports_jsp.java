/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.9
 * Generated at: 2024-01-23 06:14:55 UTC
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
      out.write("		<title>CISSOL Technologies</title>  \r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("    ");

    	String userId=(String)session.getAttribute("LOGIN_ID");
    	String rptId=request.getParameter("id");
    	String rptTitle=request.getParameter("title");
    	String fromdt=request.getParameter("fromdt");
    	String todt=request.getParameter("todt");
    	String fromdash=request.getParameter("fromdash");
		String showCSVExport=request.getParameter("showcsv");
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
      out.write("    \r\n");
      out.write("	<!-- New Report UI Starts-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<div id=\"listContainer\" class=\"card border-0\">\r\n");
      out.write("		<div class=\"card-body\">\r\n");
      out.write("			<div class=\"row w-100 mb-3\">\r\n");
      out.write("				<div class=\"col-md-2 d-flex align-items-center\">\r\n");
      out.write("					<h4 class=\"header-title\">");
      out.print(rptTitle);
      out.write("</h4>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div  class=\"col-md-10 d-flex text-right\" id=\"addGrp\">\r\n");
      out.write("						<div class=\"col-md-10\">\r\n");
      out.write("							<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("								");
if(rptId.equals("710032")){
      out.write("\r\n");
      out.write("									<div class=\"row w-100\">\r\n");
      out.write("										<div >                    \r\n");
      out.write("											<div id=\"branch1\" class=\"\"></div>\r\n");
      out.write("										</div>\r\n");
      out.write("										<div class=\"col-sm-11 col-md-11 col-lg-11\"  >                    \r\n");
      out.write("											<div id=\"mfrfilter\" class=\"sBor\">\r\n");
      out.write("					\r\n");
      out.write("											</div>\r\n");
      out.write("										</div>\r\n");
      out.write("										<div class=\"col-sm-1 col-md-1 col-lg-1\"  >\r\n");
      out.write("											<div id=\"divSecond\" class=\"\">\r\n");
      out.write("												<div class=\"col-sm-4 col-md-4 col-lg-4 mpZero\">\r\n");
      out.write("													<div class=\"form-group extrBT\" style=\"justify-content: space-between;\">\r\n");
      out.write("														<button type=\"button\" class=\"btn btn-primary\" onclick=\"reportGo(");
      out.print(rptId);
      out.write(")\"><span >Go</span></button>\r\n");
      out.write("													</div>	\r\n");
      out.write("												</div>\r\n");
      out.write("											</div>\r\n");
      out.write("										</div>\r\n");
      out.write("									</div>\r\n");
      out.write("									");
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("									");
if(!rptId.equals("710032")){
      out.write("\r\n");
      out.write("\r\n");
      out.write("										<div  class=\"col-md-6\"  id=\"noofdays\"  style=\"display: none;\">\r\n");
      out.write("											<div class=\"input-group\">\r\n");
      out.write("												<span class=\"input-group-text\">No Of Days</span>\r\n");
      out.write("												<input type=\"text\" id=\"noofDays\" name=\"noofDays\" class=\"form-control\" value=\"60\"/>\r\n");
      out.write("												<button type=\"button\" class=\"btn btn-edit\" onclick=\"reportGo('");
      out.print(rptId);
      out.write("')\">Go</button>\r\n");
      out.write("											</div>\r\n");
      out.write("										</div>\r\n");
      out.write("									\r\n");
      out.write("										<div class=\"col-md-6 input-group\" id=\"datefilter\"  >\r\n");
      out.write("											<span class=\"input-group-text\">From Date</span>\r\n");
      out.write("											<input id=\"fromDate\" name=\"fromDate\" inputType=\"date\"  type=\"text\" mandatory=\"1\"  class=\"form-control\"/>\r\n");
      out.write("											<span id=\"startDateSelected\"></span>\r\n");
      out.write("											<span class=\"input-group-text\">To Date</span>\r\n");
      out.write("											<input id=\"toDate\" name=\"toDate\" inputType=\"date\"  type=\"text\" mandatory=\"1\"  class=\"form-control\"/>\r\n");
      out.write("											<button type=\"button\" class=\"btn btn-edit\" onclick=\"reportGo('");
      out.print(rptId);
      out.write("')\">Go</button>\r\n");
      out.write("											");
if(rptId.equals("710021")){
      out.write("\r\n");
      out.write("												<button type=\"button\" class=\"btn btn-primary mRhAj btn-sm\" onclick=\"exportCSV('");
      out.print(rptId);
      out.write("')\">CSV Export</button>\r\n");
      out.write("												<button type=\"button\" class=\"btn btn-primary mRhAj btn-sm\" onclick=\"exportPDF('");
      out.print(rptId);
      out.write("')\">PDF</button>\r\n");
      out.write("											");
}
      out.write("\r\n");
      out.write("										</div>\r\n");
      out.write("\r\n");
      out.write("									");
}
      out.write("\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"col-md-2\">\r\n");
      out.write("							<button type=\"button\" class=\"btn btn-clear\" onclick='enableSearch();'><span class=\"mdi mdi-filter-variant\">Search</span></button>	\r\n");
      out.write("						</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"row \" id=\"jqcontainer\" ><div class=\"table-container\" ><div id=\"rep\" class=\"w-100\"></div></div></div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<!-- New Report UI End-->\r\n");
      out.write("\r\n");
      out.write("	<div id=\"maincontent\" style=\"display:none\">\r\n");
      out.write("        	\r\n");
      out.write("	</div>\r\n");
      out.write("	<div id=\"modifydlg\" style=\"display:none\">\r\n");
      out.write("		<div id=\"modcontent\"></div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("var l=new FlexUI.Ajax();\r\n");
      out.write("var v=l.callAjax(\"GET\",\"/inventory/service/ajax\",\"ic=0&id=userdefbranch\");\r\n");
      out.write("var defbranch=v.data;\r\n");
      out.write("var acvis=false;\r\n");
      out.write("var colno=0;\r\n");
      out.write("if(");
      out.print(rptId);
      out.write("==710032){\r\n");
      out.write("	acvis=true;\r\n");
      out.write("	colno=1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("var sProps={title:{height:125,width:100,name:\"Invoice\"},container:{id:\"callback\",isdialog:false},js:\"\",screen:[\r\n");
      out.write("  {name:\"mfrfilter\",title:\"\",pcolumns:3,colcss:\"col-sm-4 col-md-4 col-lg-4\",height:30,width:98,minWidth:500,minHeight:200,colWidth:45,float:\"left\",backColor:\"biege\",contentType:\"Fields\",\r\n");
      out.write("  fields:[\r\n");
      out.write("  {colno:0,name:\"mfrname\",inputType:0,type:\"LOV\",caption:\"Mfr Name\",mandatory:true,defaultValue:\"\",\"maxValue\":0,\"textLength\":100,\"decimalLength\":0,\"visible\":acvis,\"readOnly\":false,\"chkTag\":true,nf:\"fromdate\",lovOptions:{url:\"/inventory/service/ajax\",ajax:\"manufacturer\",scrollEnabled:true,searchFromList:false,dsi:0,params:[],results:[]}},\r\n");
      out.write("  {colno:colno,name:\"fromdate\",inputType:0,type:\"DATE\",caption:\"From Date\",mandatory:true,defaultValue:\"\",\"maxValue\":0,\"textLength\":10,\"decimalLength\":0,\"visible\":true,\"readOnly\":false,\"chkTag\":false,nf:\"todate\"},\r\n");
      out.write("  {colno:2,name:\"todate\",inputType:0,type:\"DATE\",caption:\"To Date\",mandatory:true,defaultValue:\"0\",\"maxValue\":0,\"textLength\":10,\"decimalLength\":0,\"visible\":true,\"readOnly\":false,\"chkTag\":false,nf:\"\"}  \r\n");
      out.write("  ]},\r\n");
      out.write("  {name:\"branch1\",title:\"\",height:30,width:98,minWidth:500,minHeight:200,colWidth:45,float:\"left\",backColor:\"biege\",contentType:\"Fields\",\r\n");
      out.write("  fields:[{colno:0,name:\"branch\",inputType:0,type:\"LOV\",caption:\"\",mandatory:true,defaultValue:\"0\",\"maxValue\":0,\"textLength\":10,\"decimalLength\":0,\"visible\":false,\"readOnly\":false,\"chkTag\":true,nf:\"\",lovOptions:{url:\"/inventory/service/ajax\",ajax:\"userbranch\",scrollEnabled:true,searchFromList:false,dsi:0,params:[],results:[]}}\r\n");
      out.write("  ]}]};\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("var mfrreport=null;\r\n");
      out.write("mfrreport=new FlexUI.Screen(\"mfrreport\",sProps);\r\n");
      out.write("function setDefaultBranch(){\r\n");
      out.write("		var branch=screenObjects.getScreenObject(\"branch\");\r\n");
      out.write("		branch.setTag(defbranch[0][1]);\r\n");
      out.write("		branch.setValue(defbranch[0][0]);\r\n");
      out.write("	}\r\n");
      out.write("setDefaultBranch();\r\n");
      out.write("\r\n");
      out.write("var newParams=\"&fromdate=\"+screenObjects.getScreenObject(\"fromdate\").getValue()+\"&todate=\"+screenObjects.getScreenObject(\"todate\").getValue()+\"&mfrname=0&branch=\"+screenObjects.getScreenObject(\"branch\").getTag();\r\n");
      out.write("\r\n");
      out.write("		$('#fromDate').datepicker(\r\n");
      out.write("			{\r\n");
      out.write("				language: \"en\",\r\n");
      out.write("				autoclose: true,\r\n");
      out.write("				autoOpen: false,\r\n");
      out.write("				todayHighlight: true,\r\n");
      out.write("				format:'dd/mm/yyyy'\r\n");
      out.write("			}\r\n");
      out.write("			);			\r\n");
      out.write("		$('#toDate').datepicker({\r\n");
      out.write("				language: \"en\",\r\n");
      out.write("				autoclose: true,\r\n");
      out.write("				autoOpen: false,\r\n");
      out.write("				todayHighlight: true,\r\n");
      out.write("				format:'dd/mm/yyyy'\r\n");
      out.write("			});\r\n");
      out.write("		if($('#fromDate').val()==\"\"){\r\n");
      out.write("			var cd=new Date();\r\n");
      out.write("			$('#fromDate').datepicker(\"setDate\",cd);\r\n");
      out.write("		}\r\n");
      out.write("					\r\n");
      out.write("		if($('#toDate').val()==\"\"){\r\n");
      out.write("			var cd=new Date();\r\n");
      out.write("			$('#toDate').datepicker(\"setDate\",cd);	\r\n");
      out.write("		}\r\n");
      out.write("			\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("var params=\"\";\r\n");
if(rptId.equals("710032")){
      out.write("\r\n");
      out.write("newParams =\"&fromdate=\"+$('#fromDate').val()+\"&todate=\"+$('#toDate').val()+\"&noofdays=\"+$('#noofDays').val()+\"&mfr_id=\"+escape($(\"#mfrid\").val());\r\n");
}else{
      out.write("\r\n");
      out.write("newParams =\"&fromdate=\"+$('#fromDate').val()+\"&todate=\"+$('#toDate').val()+\"&noofdays=\"+$('#noofDays').val();\r\n");
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("jqReport(");
      out.print(rptId);
      out.write(",\"#rep\",newParams);\r\n");
      out.write("\r\n");
      out.write("if(");
      out.print(showCSVExport);
      out.write("==1){\r\n");
      out.write("	showCSVExportButton(");
      out.print(rptId);
      out.write(",newParams);\r\n");
      out.write("}\r\n");
      out.write("function enableSearch(){\r\n");
      out.write("	toggleSearchToolBar(");
      out.print(rptId);
      out.write(");\r\n");
      out.write("}\r\n");
      out.write("enableSearch();\r\n");
      out.write("function loadOrderData(link,name,did){\r\n");
      out.write("		if(name==\"View\"){\r\n");
      out.write("			$(\"#jqcontainer\").css(\"display\",\"none\");\r\n");
      out.write("			$('#rep').hide();\r\n");
      out.write("			$('#filter').css(\"display\",\"none\");\r\n");
      out.write("			$('#dtfilter').css(\"display\",\"none\");\r\n");
      out.write("			$('#brdCr').css(\"display\",\"none\");\r\n");
      out.write("			$('#listContainer').hide();\r\n");
      out.write("			$('#maincontent').show();\r\n");
      out.write("			$(\"#maincontent\").empty();\r\n");
      out.write("			$('#modifycontent').hide();\r\n");
      out.write("			$('#modifycontent').empty();\r\n");
      out.write("			$('#maincontent').load(link+\"&mode=VIEW\");\r\n");
      out.write("		}else if(name==\"Print\"){\r\n");
      out.write("			printBill(undefined,false,link);\r\n");
      out.write("		}else if(name==\"Modify\"){\r\n");
      out.write("			window.open(link);\r\n");
      out.write("		}else if(name==\"AllBillsSummary\"){\r\n");
      out.write("			var rowData=$(\"#report_");
      out.print(rptId);
      out.write("\").getRowData(did);\r\n");
      out.write("			var expParams=\"summary=1&allbills=1&fromdate=\"+$('#fromDate').val()+\"&todate=\"+$('#toDate').val()+\"&patientcode=\"+rowData.sh_cust_code+\"&patientno=\"+rowData.cust_alias;\r\n");
      out.write("			window.open(\"/inventory/service/invoice/customerbills?\"+expParams,\"_blank\");			\r\n");
      out.write("		}else if(name==\"AllBillsDetail\"){\r\n");
      out.write("			var rowData=$(\"#report_");
      out.print(rptId);
      out.write("\").getRowData(did);\r\n");
      out.write("			var expParams=\"summary=0&allbills=1&fromdate=\"+$('#fromDate').val()+\"&todate=\"+$('#toDate').val()+\"&patientcode=\"+rowData.sh_cust_code+\"&patientno=\"+rowData.cust_alias;\r\n");
      out.write("			window.open(\"/inventory/service/invoice/customerbills?\"+expParams,\"_blank\");						\r\n");
      out.write("		}else if(name==\"PeriodBillsSummary\"){\r\n");
      out.write("			var rowData=$(\"#report_");
      out.print(rptId);
      out.write("\").getRowData(did);\r\n");
      out.write("			var expParams=\"summary=1&allbills=0&fromdate=\"+$('#fromDate').val()+\"&todate=\"+$('#toDate').val()+\"&patientcode=\"+rowData.sh_cust_code+\"&patientno=\"+rowData.cust_alias;\r\n");
      out.write("			window.open(\"/inventory/service/invoice/customerbills?\"+expParams,\"_blank\");						\r\n");
      out.write("		}else if(name==\"PeriodBillsDetail\"){\r\n");
      out.write("			var rowData=$(\"#report_");
      out.print(rptId);
      out.write("\").getRowData(did);\r\n");
      out.write("			var expParams=\"summary=0&allbills=0&fromdate=\"+$('#fromDate').val()+\"&todate=\"+$('#toDate').val()+\"&patientcode=\"+rowData.sh_cust_code+\"&patientno=\"+rowData.cust_alias;\r\n");
      out.write("			window.open(\"/inventory/service/invoice/customerbills?\"+expParams,\"_blank\");									\r\n");
      out.write("		}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function reportGo(id){\r\n");
      out.write("	");
if(rptId.equals("710021") || rptId.equals("1200003")){
      out.write("\r\n");
      out.write("		$.ajax({\r\n");
      out.write("		            url: \"/inventory/service/account/sales/dayend?branch=1\",\r\n");
      out.write("        		    type: \"GET\",\r\n");
      out.write("	        	    async: false,\r\n");
      out.write("	        	    contentType:\"application/json\",\r\n");
      out.write("		            dataType: \"json\",\r\n");
      out.write("        		    success: function (r) {\r\n");
      out.write("						\r\n");
      out.write("	            	}\r\n");
      out.write("        	});		\r\n");
      out.write("	");
}
      out.write("\r\n");
      out.write("	showLoader();\r\n");
      out.write("	var newParams=\"\"\r\n");
      out.write("	");
if(rptId.equals("710032")){
      out.write("\r\n");
      out.write("		newParams=\"&fromdate=\"+screenObjects.getScreenObject(\"fromdate\").getValue()+\"&todate=\"+screenObjects.getScreenObject(\"todate\").getValue()+\"&noofdays=\"+$('#noofDays').val()+\"&mfr_id=\"+screenObjects.getScreenObject(\"mfrname\").getTag();\r\n");
      out.write("	");
}else{
      out.write("\r\n");
      out.write("		newParams=\"&fromdate=\"+$('#fromDate').val()+\"&todate=\"+$('#toDate').val()+\"&noofdays=\"+$('#noofDays').val();\r\n");
      out.write("	");
}
      out.write("\r\n");
      out.write("	changeUrlAndReloadGrid(id,params,newParams);\r\n");
      out.write("	showPDFExportButton(id,newParams);\r\n");
      out.write("	if(");
      out.print(showCSVExport);
      out.write("==1){\r\n");
      out.write("		showCSVExportButton(id,newParams);\r\n");
      out.write("	}\r\n");
      out.write("	hideLoader();\r\n");
      out.write("}\r\n");
      out.write("function exportCSV(id){\r\n");
      out.write("	var newParams=\"id=");
      out.print(rptId);
      out.write("&fromdate=\"+$('#fromDate').val()+\"&todate=\"+$('#toDate').val()+\"&noofdays=\"+$('#noofDays').val();\r\n");
      out.write("	window.open(\"/inventory/service/account/sales/exportcsv?\"+newParams,\"_blank\");\r\n");
      out.write("}\r\n");
      out.write("function exportPDF(id){\r\n");
      out.write("	var newParams=\"id=");
      out.print(rptId);
      out.write("&fromdate=\"+$('#fromDate').val()+\"&todate=\"+$('#toDate').val()+\"&noofdays=\"+$('#noofDays').val();\r\n");
      out.write("	window.open(\"/inventory/service/account/incomestatement?\"+newParams,\"_blank\");\r\n");
      out.write("}\r\n");
if(rptId.equals("710011")){
      out.write("\r\n");
      out.write("	$('#filter').css(\"display\",\"none\");\r\n");
      out.write("	$('#dtfilter').css(\"display\",\"none\");\r\n");
      out.write("	$('#stkReportTitle').css(\"display\",\"block\");\r\n");
      out.write("	$('#divExpDaysFilter').css(\"display\",\"none\");\r\n");
}else if(rptId.equals("1200007")){
      out.write("\r\n");
      out.write("	$('#datefilter').css(\"display\",\"none\");\r\n");
      out.write("	$('#filter').css(\"display\",\"block\");\r\n");
      out.write("	$('#dtfilter').css(\"display\",\"none\");\r\n");
      out.write("	$('#stkReportTitle').css(\"display\",\"none\");\r\n");
      out.write("	$('#divExpDaysFilter').css(\"display\",\"block\");		\r\n");
      out.write("	$('#noofdays').css(\"display\",\"block\");		\r\n");
}else if(rptId.equals("710032")){
      out.write("\r\n");
      out.write("	$('#filter').css(\"display\",\"block\");\r\n");
      out.write("	$('#dtfilter').css(\"display\",\"block\");\r\n");
      out.write("	$('#stkReportTitle').css(\"display\",\"none\");\r\n");
      out.write("	$('#divExpDaysFilter').css(\"display\",\"none\");\r\n");
      out.write("	$('#mfrfilter').css(\"display\",\"block\");		\r\n");
}else if(rptId.equals("1200008")){
      out.write("\r\n");
      out.write("	$('#datefilter').css(\"display\",\"none\");\r\n");
}else{
      out.write("\r\n");
      out.write("	$('#filter').css(\"display\",\"block\");\r\n");
      out.write("	$('#dtfilter').css(\"display\",\"block\");\r\n");
      out.write("	$('#stkReportTitle').css(\"display\",\"none\");\r\n");
      out.write("	$('#divExpDaysFilter').css(\"display\",\"none\");\r\n");
}
      out.write('\r');
      out.write('\n');
if (fromdash!=null && fromdash.equals("true")){
      out.write("\r\n");
      out.write("	$('#spanClose').show();\r\n");
}else{
      out.write("\r\n");
      out.write("	$('#spanClose').hide();\r\n");
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function showHideFilter(){\r\n");
      out.write("	if( $('#divFirstFilter').is(':visible') ) {\r\n");
      out.write("		$('#divFirstFilter').css(\"display\",\"none\");\r\n");
      out.write("	}else{\r\n");
      out.write("		$('#divFirstFilter').css(\"display\",\"block\");\r\n");
      out.write("	}\r\n");
      out.write("}\r\n");
      out.write("function closeReport(){\r\n");
      out.write("	$(\"#divDash\").css(\"display\",\"block\");\r\n");
      out.write("	$(\"#reportcontent\").css(\"display\",\"none\");\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function printBill(data,first,link){\r\n");
      out.write("	alert(\"print rep\");\r\n");
      out.write("	console.log(\"printbill\"+ data,first,link);\r\n");
      out.write("		var printData={};\r\n");
      out.write("		if(!first){\r\n");
      out.write("			if(link==\"\"){\r\n");
      out.write("				return;\r\n");
      out.write("			}\r\n");
      out.write("			$.ajax({\r\n");
      out.write("		            url: link,\r\n");
      out.write("        		    type: \"GET\",\r\n");
      out.write("	        	    async: false,\r\n");
      out.write("	        	    contentType:\"application/json\",\r\n");
      out.write("		            dataType: \"json\",\r\n");
      out.write("        		    success: function (r) {\r\n");
      out.write("					data=r;	\r\n");
      out.write("					console.log(\"data\"+\" \"+Object.values(data));\r\n");
      out.write("	            		}\r\n");
      out.write("        		});			\r\n");
      out.write("		}\r\n");
      out.write("		if(link.indexOf(\"salesreturn\")!=-1 || link.indexOf(\"invoice\")!=-1){\r\n");
      out.write("		var isSalesReturn=false;\r\n");
      out.write("		if(link.indexOf(\"salesreturn\")!=-1){\r\n");
      out.write("			isSalesReturn=true;\r\n");
      out.write("		}\r\n");
      out.write("		var printData={};\r\n");
      out.write("		if(isSalesReturn){\r\n");
      out.write("			printData[\"type\"]=\"PGSHSR\";\r\n");
      out.write("		}else{\r\n");
      out.write("			 printData[\"type\"]=\"PGSHSR\";\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		printData[\"branchcode\"]=data[\"branch\"];\r\n");
      out.write("		printData[\"company\"]=\"Tiruvarur Medical Center(P) Ltd\";\r\n");
      out.write("		printData[\"address1\"]=\"27,Javulikara Street\";\r\n");
      out.write("		printData[\"address2\"]=\"Tiruvarur - 610 001\";\r\n");
      out.write("		printData[\"address3\"]=\"Phone - 242292,240292\";\r\n");
      out.write("		printData[\"tin\"]=\"\";\r\n");
      out.write("		printData[\"userid\"]='");
      out.print(userId);
      out.write("';\r\n");
      out.write("		printData[\"custalias\"]=data[\"custalias\"];\r\n");
      out.write("		if(isSalesReturn){\r\n");
      out.write("			printData[\"returnno\"]=data[\"returnno\"];\r\n");
      out.write("			printData[\"returndate\"]=data[\"returndate\"];\r\n");
      out.write("		}else{\r\n");
      out.write("			printData[\"billno\"]=data[\"billno\"];\r\n");
      out.write("			printData[\"billdate\"]=data[\"billdate\"];\r\n");
      out.write("			printData[\"tendered\"]=data[\"tendered\"]+\"\";\r\n");
      out.write("			printData[\"balance\"]=data[\"balance\"]+\"\";\r\n");
      out.write("			printData[\"despthro\"]=data[\"despthro\"]+\"\";\r\n");
      out.write("		}\r\n");
      out.write("		printData[\"tax\"]=data[\"taxamt\"];\r\n");
      out.write("		printData[\"totalamt\"]=data[\"totalamt\"]+\"\";\r\n");
      out.write("		printData[\"roundoff\"]=data[\"roundedoff\"]+\"\";\r\n");
      out.write("		printData[\"doctorname\"]=data[\"professional\"]+\"\";\r\n");
      out.write("		printData[\"total\"]=data[\"total\"]+\"\";		\r\n");
      out.write("		printData[\"cdiscamt\"]=data[\"cdiscamt\"]+\"\";\r\n");
      out.write("		printData[\"cardcharges\"]=data[\"cardcharges\"]+\"\";\r\n");
      out.write("		printData[\"customer\"]=data.name;\r\n");
      out.write("		printData[\"printtax\"]=\"1\";\r\n");
      out.write("		printData[\"printdisc\"]=\"0\";\r\n");
      out.write("		printData[\"printround\"]=\"1\";\r\n");
      out.write("		printData[\"printnetamount\"]=\"1\";\r\n");
      out.write("		printData[\"printcardchg\"]=\"1\";\r\n");
      out.write("		printData[\"showprintdlg\"]=\"0\";\r\n");
      out.write("		if(data.billType==\"CR\"){		\r\n");
      out.write("			printData[\"invtype\"]=\"CREDIT\";\r\n");
      out.write("		}else if(data.billType==\"CO\"){\r\n");
      out.write("			printData[\"invtype\"]=\"CORPORATE\";\r\n");
      out.write("		}else{\r\n");
      out.write("			printData[\"invtype\"]=\"TAX\";\r\n");
      out.write("		}		\r\n");
      out.write("		\r\n");
      out.write("		printData[\"items\"]=[];\r\n");
      out.write("		for(var x=0;x<data.noofitems;x++){\r\n");
      out.write("			var item={};\r\n");
      out.write("			item.name=data.products[x].productname;\r\n");
      out.write("			item.rate=data.products[x].rate+\"\";\r\n");
      out.write("			item.qty=data.products[x].qty+\"\";\r\n");
      out.write("			item.batch=data.products[x].batchno+\"\";\r\n");
      out.write("			item.expdt=data.products[x].expdt+\"\";\r\n");
      out.write("			item.amount=data.products[x].amount+\"\";				\r\n");
      out.write("			item.totalamount=data.products[x].totalamount+\"\";\r\n");
      out.write("			item.taxableamt=data.products[x].taxableamt+\"\";\r\n");
      out.write("			item.staxamt=data.products[x].staxamt+\"\";\r\n");
      out.write("			item.staxperc=data.products[x].staxperc+\"\";\r\n");
      out.write("			item.cashdiscamt=data.products[x].cashdiscamt+\"\";\r\n");
      out.write("			item.hsncode=data.products[x].hsncode+\"\";\r\n");
      out.write("			printData.items.push(item);\r\n");
      out.write("		                              }\r\n");
      out.write("		console.log(\"item\"+\" \"+Object.values(item));\r\n");
      out.write("		console.log(\"data\"+\" \"+Object.values(data));\r\n");
      out.write("		console.log(\"print values\"+\" \"+Object.values(printData));\r\n");
      out.write("		}else if(link.indexOf(\"cashhandover\")!=-1){\r\n");
      out.write("			printData=data;\r\n");
      out.write("		}else if(link.indexOf(\"vouchers\")!=-1){\r\n");
      out.write("			printData=data;\r\n");
      out.write("			printData[\"type\"]=\"VCHER\";\r\n");
      out.write("			printData[\"branchname\"]=\"Tiruvarur Medical Center(P) Ltd\";\r\n");
      out.write("			printData[\"address1\"]=\"27,Javulikara Street\";\r\n");
      out.write("			printData[\"address2\"]=\"Tiruvarur - 610 001\";\r\n");
      out.write("			printData[\"address3\"]=\"Phone - 242292,240292\";\r\n");
      out.write("		}		\r\n");
      out.write("		$.ajax({\r\n");
      out.write("	            url: \"http://localhost:9696\",\r\n");
      out.write("        	    type: \"POST\",\r\n");
      out.write("	            async: false,\r\n");
      out.write("        	    contentType:\"application/x-www-form-urlencoded\",\r\n");
      out.write("	            data:\"printdata=\"+JSON.stringify(printData),\r\n");
      out.write("	            dataType: \"json\",\r\n");
      out.write("        	    success: function (r) {\r\n");
      out.write("				//alert(r.result);	\r\n");
      out.write("					\r\n");
      out.write("        	    }\r\n");
      out.write("	        });		\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("		\r\n");
      out.write("	\r\n");
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
