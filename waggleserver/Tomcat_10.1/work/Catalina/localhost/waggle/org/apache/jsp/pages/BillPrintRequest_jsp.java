/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.9
 * Generated at: 2024-07-19 08:16:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class BillPrintRequest_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <title>Admission</title>\r\n");
      out.write("</head>\r\n");
String mode=request.getParameter("mode");
String code=request.getParameter("code");
String rptId=request.getParameter("id");
String userId=(String)session.getAttribute("LOGIN_ID");
String title=request.getParameter("title");

      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	<div id=\"listContainer\" class=\"card border-0\">\r\n");
      out.write("		<div class=\"card-body lpage\">\r\n");
      out.write("			<div class=\"row w-100 mb-3\">\r\n");
      out.write("				<div class=\"col-md-6 d-flex align-items-center\">\r\n");
      out.write("					\r\n");
      out.write("					<h4 class=\"header-title\">");
      out.print(title);
      out.write("</h4>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div  class=\"col-md-6 d-flex text-right\" id=\"addGrp\">\r\n");
      out.write("						<div class=\"col-md-7\">\r\n");
      out.write("							<div class=\"input-group\">\r\n");
      out.write("								<span class=\"input-group-text\">From</span>\r\n");
      out.write("								<input id=\"fromDate\" name=\"fromDate\" inputType=\"date\"  type=\"text\" mandatory=\"1\"  class=\"form-control\"/>\r\n");
      out.write("								<span class=\"input-group-text\">To</span>\r\n");
      out.write("								<input id=\"toDate\" name=\"toDate\" inputType=\"date\"  type=\"text\" mandatory=\"1\"  class=\"form-control\"/>&nbsp;\r\n");
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
      out.write("			<div class=\"row \" id=\"jqcontainer\"  ><div class=\"table-container\" ><div id=\"xyz\" class=\"w-100\"></div></div></div>\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--\r\n");
      out.write("    <div class=\"col-sm-12 col-md-12 col-lg-12 mpZero marTp\">\r\n");
      out.write("    	<div class=\"col-md-12 col-sm-12 marLfBx panelOrange hcH\">\r\n");
      out.write("    	<div class=\"subHe\" id=\"dtfilter\" name=\"dtfilter\" style=\"display: block\">");
      out.print(title);
      out.write("</div>\r\n");
      out.write("    	\r\n");
      out.write("    	<div class=\"col-sm-4 col-md-4 col-lg-4\">\r\n");
      out.write("	  						<div class=\"form-group extrBT\"><label class=\"col-sm-5 control-label mpRes\" for=\"inputEmail3\">From Date</label><div class=\"col-sm-7 mpRes\"></div></div>\r\n");
      out.write("	  					</div>\r\n");
      out.write("		    			<div class=\"col-sm-4 col-md-4 col-lg-4\">\r\n");
      out.write("		  						<div class=\"form-group extrBT\"><label class=\"col-sm-5 control-label mpRes\" for=\"inputEmail3\">To Date</label><div class=\"col-sm-7 mpRes\"></div></div>\r\n");
      out.write("		  				</div>\r\n");
      out.write("		  				<div class=\"col-sm-4 col-md-4 col-lg-4 mpZero\">\r\n");
      out.write("		  					<div class=\"form-group extrBT\"></div>	\r\n");
      out.write("					    </div>\r\n");
      out.write("			\r\n");
      out.write("		<div id=\"addGrp\" class=\"btn-group pull-right\">    	\r\n");
      out.write("		<div class=\"btn-group pull-right\" id=\"actionicons\">\r\n");
      out.write("			<button onclick=\"toggleHeaderRow()\" class=\"btn btn-sm seaColB\"><i class=\"fa fa-search\"></i></button>\r\n");
      out.write("			");
if("400013".equals(rptId)){
      out.write("\r\n");
      out.write("				<button onclick=\"printCensus()\" class=\"btn btn-sm seaColB\"><i class=\"fa fa-print\"></i></button>\r\n");
      out.write("			");
}
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>    \r\n");
      out.write("	<div class=\"col-md-12 col-sm-12 mpZero marTp\">\r\n");
      out.write("		<div class=\"col-md-12 col-sm-12 mpZero\" id=\"xyz\">\r\n");
      out.write("		\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	-->\r\n");
      out.write("		\r\n");
      out.write("		<div id='cancelcrdlg' class='modal'>\r\n");
      out.write("			<div class=\"modal-dialog modal-lg  modal-dialog-scrollable\">\r\n");
      out.write("			  <div class=\"modal-content\">\r\n");
      out.write("					<div id='canceltitle' class='modal-header'>\r\n");
      out.write("						<div class='pop_lov_hed_txt'><h3><label> Bill No :&nbsp;</label><span id=\"crbno\"></span></h3></div>\r\n");
      out.write("\r\n");
      out.write("						<div class='pop_lov_clos'>\r\n");
      out.write("							<a href='#'>\r\n");
      out.write("								<span class='fa fa-times-circle'>\r\n");
      out.write("								</span>\r\n");
      out.write("							</a>\r\n");
      out.write("						</div>	\r\n");
      out.write("\r\n");
      out.write("						<button type=\"button\" class=\"btn-close\" onclick=\"cancelCancelCrDlg()\" data-bs-dismiss=\"modal\"></button>\r\n");
      out.write("						\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class='modal-body' id='cancelcrd'>\r\n");
      out.write("						<div class=\"col-md-12 col-sm-12 mpZero\">\r\n");
      out.write("							<div  class=\"col-md-12 col-sm-12 mpZero\">		\r\n");
      out.write("							<div class=\"form-group mbotto\">\r\n");
      out.write("								<div class=\"col-md-4\"><label>IP No</label></div>\r\n");
      out.write("								<div class=\"col-md-8\">\r\n");
      out.write("									<input class=\"form-control\" id=\"ipno\" disabled/>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div  class=\"col-md-12 col-sm-12 mpZero\">		\r\n");
      out.write("							<div class=\"form-group mbotto\">\r\n");
      out.write("								<div class=\"col-md-4\"><label>Patient Name</label></div>\r\n");
      out.write("								<div class=\"col-md-8\">\r\n");
      out.write("									<input class=\"form-control\" id=\"ipatientname\" disabled/>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div  class=\"col-md-12 col-sm-12 mpZero\">		\r\n");
      out.write("								<div class=\"form-group mbotto\">\r\n");
      out.write("									<div class=\"col-md-4\"><label> UHID</label></div>\r\n");
      out.write("									<div class=\"col-md-8\">\r\n");
      out.write("										<input class=\"form-control\" id=\"crh_hospreg_code\" disabled/>\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("						\r\n");
      out.write("							<div  class=\"col-md-12 col-sm-12 mpZero\">		\r\n");
      out.write("										<div class=\"form-group mbotto\">\r\n");
      out.write("											<div class=\"col-md-4\"><label> Bill Date</label></div>\r\n");
      out.write("											<div class=\"col-md-8\">\r\n");
      out.write("												<input class=\"form-control\" id=\"billdate\" disabled/>\r\n");
      out.write("											</div>\r\n");
      out.write("										</div>\r\n");
      out.write("							</div>	\r\n");
      out.write("							<div  class=\"col-md-12 col-sm-12 mpZero\">		\r\n");
      out.write("								<div class=\"form-group mbotto\">\r\n");
      out.write("									<div class=\"col-md-4\"><label> BU Name</label></div>\r\n");
      out.write("									<div class=\"col-md-8\">\r\n");
      out.write("										<input class=\"form-control\" id=\"buname\" disabled/>\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>		\r\n");
      out.write("							<div  class=\"col-md-12 col-sm-12 mpZero\">		\r\n");
      out.write("								<div class=\"form-group mbotto\">\r\n");
      out.write("									<div class=\"col-md-4\"><label> Amount</label></div>\r\n");
      out.write("									<div class=\"col-md-8\">\r\n");
      out.write("										<input class=\"form-control\" id=\"totalamt\" disabled/>\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>		\r\n");
      out.write("							<div  class=\"col-md-12 col-sm-12 mpZero\">		\r\n");
      out.write("							<div class=\"form-group mbotto\">\r\n");
      out.write("								<div class=\"col-md-4\"><label>Cancel Remarks*</label></div>\r\n");
      out.write("								<div class=\"col-md-8\">\r\n");
      out.write("									<textarea  class=\"form-control\" id=\"cancelremarks\" row=10 col=50  ></textarea>\r\n");
      out.write("									<input type=\"hidden\" id=\"crhno\" value=\"0\"/>\r\n");
      out.write("									<input type=\"hidden\" id=\"branchcode\" value=\"0\"/>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div id=\"actButton\" class=\"modal-footer\">\r\n");
      out.write("						<button id=\"btnPrint\" class=\"btn btn-primary priBut\" type=\"button\" onclick=\"cancelClinicalRequest()\">Save</button>\r\n");
      out.write("	                <button id=\"btnCancel\" class=\"btn btn-default\" type=\"button\" onclick=\"cancelCancelCrDlg()\">Cancel</button>\r\n");
      out.write("            	</div>\r\n");
      out.write("			  </div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		\r\n");
      out.write("	<script>\r\n");
      out.write("\r\n");
      out.write("	$('#fromDate').val(localStorage.getItem(\"fromdate\")==undefined?\"\":localStorage.getItem(\"fromdate\"));\r\n");
      out.write("	$('#toDate').val(localStorage.getItem(\"todate\")==undefined?\"\":localStorage.getItem(\"todate\"));\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		$('#fromDate').datepicker({\r\n");
      out.write("				 language: \"en\",\r\n");
      out.write("       			 autoclose: true,\r\n");
      out.write("       			 todayHighlight: true,\r\n");
      out.write("	 	 	     format:'dd/mm/yyyy'\r\n");
      out.write("		});\r\n");
      out.write("		$('#toDate').datepicker({\r\n");
      out.write("				language: \"en\",\r\n");
      out.write("				autoclose: true,\r\n");
      out.write("				todayHighlight: true,\r\n");
      out.write("				format:'dd/mm/yyyy'\r\n");
      out.write("		});\r\n");
      out.write("		if($('#fromDate').val()==\"\"){\r\n");
      out.write("			var cd=new Date();\r\n");
      out.write("			$('#fromDate').datepicker(\"setDate\",cd);\r\n");
      out.write("		}\r\n");
      out.write("					\r\n");
      out.write("		if($('#toDate').val()==\"\"){\r\n");
      out.write("			var cd=new Date();\r\n");
      out.write("			$('#toDate').datepicker(\"setDate\",cd);\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("\r\n");
      out.write("		\r\n");
      out.write("\r\n");
      out.write(" 	loadBranchData();	\r\n");
      out.write(" 	var params=\"\";\r\n");
      out.write(" 	var newParams=\"&fromdate=\"+$('#fromDate').val()+\"&todate=\"+$('#toDate').val()+\"&branchcode=\"+$('#branch').val();\r\n");
      out.write("	jqReport(");
      out.print(rptId);
      out.write(",\"#xyz\",newParams);\r\n");
      out.write("    $(document).ready(function () {\r\n");
      out.write("            $('#subtitle').text(\"\");\r\n");
      out.write("            $('#screentitle').text(\"Bills\");\r\n");
      out.write("     });\r\n");
      out.write("  	function toggleHeaderRow(){\r\n");
      out.write("  		toggleSearchToolBar(");
      out.print(rptId);
      out.write(");\r\n");
      out.write("  	}\r\n");
      out.write("  function reportGo(id){\r\n");
      out.write("	showLoader();\r\n");
      out.write("	localStorage.setItem(\"fromdate\",$('#fromDate').val());\r\n");
      out.write("	localStorage.setItem(\"todate\",$('#toDate').val());\r\n");
      out.write("	var newParams=\"&fromdate=\"+$('#fromDate').val()+\"&todate=\"+$('#toDate').val()+\"&branchcode=\"+$('#branch').val();\r\n");
      out.write("	changeUrlAndReloadGrid(id,params,newParams);\r\n");
      out.write("	hideLoader();\r\n");
      out.write("}\r\n");
      out.write("  \r\n");
      out.write("  	toggleHeaderRow();\r\n");
      out.write("    function loadOrderData(url,name,did){\r\n");
      out.write("	  	var rowData=$(\"#report_");
      out.print(rptId);
      out.write("\").getRowData(did);\r\n");
      out.write("	  	if(name==\"Print\"){\r\n");
      out.write("		  	var printData={};	  		  	\r\n");
      out.write("		  	if(");
      out.print(rptId);
      out.write("==11 || ");
      out.print(rptId);
      out.write("==20){\r\n");
      out.write("			  	var data;\r\n");
      out.write("				$.ajax({\r\n");
      out.write("		            url: \"/waggle/service/screen/data?screencode=");
      out.print(rptId);
      out.write("&branchcode=\"+rowData.branchcode+\"&code=\"+rowData.code,\r\n");
      out.write("		            type: \"GET\",\r\n");
      out.write("		            async: false,\r\n");
      out.write("		            contentType:\"application/json\",\r\n");
      out.write("		            dataType: \"json\",\r\n");
      out.write("		            success: function (r) {\r\n");
      out.write("						data=r;		\r\n");
      out.write("		            }\r\n");
      out.write("		        });			\r\n");
      out.write("				if(data.billtype==1){\r\n");
      out.write("					printData[\"type\"]=\"IPBILL\";\r\n");
      out.write("				}else{\r\n");
      out.write("					printData[\"type\"]=\"OPBILL\";\r\n");
      out.write("				}\r\n");
      out.write("				printData[\"branchname\"]=$('#branch option:selected').text();\r\n");
      out.write("				printData[\"address1\"]=\"52, SOUTH STREET\";\r\n");
      out.write("				printData[\"address2\"]=\"ARUPPUKOTTAI - 626 101\";\r\n");
      out.write("				printData[\"address3\"]=\"Phone - 222273,220936\";\r\n");
      out.write("				printData[\"tin\"]=\"\";\r\n");
      out.write("				printData[\"buname\"]=data[\"buname\"];\r\n");
      out.write("				printData[\"billno\"]=data[\"billno\"];\r\n");
      out.write("				printData[\"billdate\"]=data[\"billtime\"]+\"\";\r\n");
      out.write("				printData[\"totalamt\"]=roundOff(data[\"totalamt\"])+\"\";\r\n");
      out.write("				printData[\"netamount\"]=roundOff(data[\"netamount\"],2)+\"\";\r\n");
      out.write("				printData[\"srvchgamount\"]=roundOff(data[\"srvchgamount\"],2)+\"\";\r\n");
      out.write("				printData[\"tenderamount\"]=roundOff(data[\"tenderamount\"],2)+\"\";\r\n");
      out.write("				printData[\"balanceamount\"]=roundOff(data[\"balanceamount\"],2)+\"\";\r\n");
      out.write("				printData[\"roundoff\"]=\"0.00\";\r\n");
      out.write("				printData[\"sponsorname\"]=data[\"sponsorname\"]+\"\";\r\n");
      out.write("				printData[\"doctorname\"]=data[\"doctorname\"]+\"\";\r\n");
      out.write("				printData[\"referredby\"]=data[\"referredby\"]+\"\";\r\n");
      out.write("				printData[\"fromplace\"]=data[\"fromplace\"]+\"\";\r\n");
      out.write("				printData[\"toplace\"]=data[\"toplace\"]+\"\";\r\n");
      out.write("				printData[\"fromkm\"]=data[\"fromkm\"]+\"\";\r\n");
      out.write("				printData[\"tokm\"]=data[\"tokm\"]+\"\";							\r\n");
      out.write("				printData[\"roundoff\"]=\"0.00\";\r\n");
      out.write("				printData[\"patientname\"]=data[\"patientname\"];		\r\n");
      out.write("				printData[\"patientage\"]=data[\"patientage\"];\r\n");
      out.write("				printData[\"ipno\"]=data[\"ipno\"];\r\n");
      out.write("				printData[\"csno\"]=data[\"csno\"];\r\n");
      out.write("				printData[\"hospregcode\"]=data[\"hospregcode\"];\r\n");
      out.write("				printData[\"userid\"]=\"");
      out.print(userId);
      out.write("\";\r\n");
      out.write("				printData[\"gender\"]=data[\"gender\"];\r\n");
      out.write("				printData[\"invtype\"]=\"CASH\";\r\n");
      out.write("				printData[\"billprefix\"]=\"GSH\";\r\n");
      out.write("				printData[\"items\"]=[];\r\n");
      out.write("				for(var x=0;x<data[\"billgrid_data\"].length;x++){\r\n");
      out.write("					var item={};\r\n");
      out.write("					item.name=data[\"billgrid_data\"][x].product+\"\";\r\n");
      out.write("					item.rate=roundOff(data[\"billgrid_data\"][x].rate,2)+\"\";\r\n");
      out.write("					item.qty=data[\"billgrid_data\"][x].quantity+\"\";\r\n");
      out.write("					item.amount=data[\"billgrid_data\"][x].amount+\"\";;				\r\n");
      out.write("					printData.items.push(item);\r\n");
      out.write("				}\r\n");
      out.write("			}else{\r\n");
      out.write("			  	var data;\r\n");
      out.write("				$.ajax({\r\n");
      out.write("		            url: url,\r\n");
      out.write("		            type: \"GET\",\r\n");
      out.write("		            async: false,\r\n");
      out.write("		            contentType:\"application/json\",\r\n");
      out.write("		            dataType: \"json\",\r\n");
      out.write("		            success: function (r) {\r\n");
      out.write("						data=r;		\r\n");
      out.write("		            }\r\n");
      out.write("		        });\r\n");
      out.write("		        printData=data;	\r\n");
      out.write("		        if(");
      out.print(rptId);
      out.write("==500012){\r\n");
      out.write("		        	printData[\"type\"]=\"VCHER\";\r\n");
      out.write("		        	printData[\"branchname\"]=\"GOMATHI SPECIALITY HOSPITAL\";\r\n");
      out.write("		        	printData[\"address1\"]=\"52,South Street\";\r\n");
      out.write("		printData[\"address2\"]=\"ARUPPUKOTTAI - 626 101\";\r\n");
      out.write("		printData[\"address3\"]=\"Phone - 222273,220936\";			        	\r\n");
      out.write("		        }								\r\n");
      out.write("			}\r\n");
      out.write("			$.ajax({\r\n");
      out.write("	            url: \"http://localhost:9696\",\r\n");
      out.write("	            type: \"POST\",\r\n");
      out.write("	            async: true,\r\n");
      out.write("	            contentType:\"application/x-www-form-urlencoded\",\r\n");
      out.write("	            data:\"printdata=\"+JSON.stringify(printData),\r\n");
      out.write("	            dataType: \"json\",\r\n");
      out.write("	            success: function (r) {\r\n");
      out.write("					//alert(r.result);		\r\n");
      out.write("	            }\r\n");
      out.write("	        });\r\n");
      out.write("	      }else if(");
      out.print(rptId);
      out.write("==11 && name==\"View\"){\r\n");
      out.write("	      		$('.ui-dialog').children().remove();\r\n");
      out.write("				$('.ui-dialog').remove();\r\n");
      out.write("				$(\"#bodyContainer\").children().remove();\r\n");
      out.write("				$(\"#bodyContainer\").html(\"\");\r\n");
      out.write("				$(\"#bodyContainer\").css(\"display\",\"block\");\r\n");
      out.write("				if(rowData.billtype==2){\r\n");
      out.write("					if(rowData.buname!=\"Ambulance\"){				\r\n");
      out.write("						$(\"#bodyContainer\").load(\"/waggle/opbill.do?mode=View&screencode=11&branch=\"+rowData.branchcode+\"&code=\"+rowData.code);\r\n");
      out.write("					}else{\r\n");
      out.write("						$(\"#bodyContainer\").load(\"/waggle/ambulanceBill.do?mode=View&screencode=11&branch=\"+rowData.branchcode+\"&code=\"+rowData.code);\r\n");
      out.write("					}\r\n");
      out.write("				}else{\r\n");
      out.write("					$(\"#bodyContainer\").load(\"/waggle/bill.do?mode=View&screencode=11&branch=\"+rowData.branchcode+\"&code=\"+rowData.code);\r\n");
      out.write("				}	  				\r\n");
      out.write("	      }else if(");
      out.print(rptId);
      out.write("==11 && name==\"Edit\"){\r\n");
      out.write("	      		$('.ui-dialog').children().remove();\r\n");
      out.write("				$('.ui-dialog').remove();\r\n");
      out.write("				$(\"#bodyContainer\").children().remove();\r\n");
      out.write("				$(\"#bodyContainer\").html(\"\");\r\n");
      out.write("				if(rowData.billtype==2){			\r\n");
      out.write("					if(rowData.buname!=\"Ambulance\"){	\r\n");
      out.write("						$(\"#bodyContainer\").load(\"/waggle/opbill.do?mode=Edit&screencode=11&branch=\"+rowData.branchcode+\"&code=\"+rowData.code);\r\n");
      out.write("					}else{\r\n");
      out.write("						$(\"#bodyContainer\").load(\"/waggle/ambulanceBill.do?mode=Edit&screencode=11&branch=\"+rowData.branchcode+\"&code=\"+rowData.code);\r\n");
      out.write("					}\r\n");
      out.write("				}else{\r\n");
      out.write("					$(\"#bodyContainer\").load(\"/waggle/bill.do?mode=View&screencode=11&branch=\"+rowData.branchcode+\"&code=\"+rowData.code);\r\n");
      out.write("				}	  				\r\n");
      out.write("	      }else if(");
      out.print(rptId);
      out.write("==20 && name==\"View\"){\r\n");
      out.write("	      		$('.ui-dialog').children().remove();\r\n");
      out.write("				$('.ui-dialog').remove();\r\n");
      out.write("				$(\"#bodyContainer\").children().remove();\r\n");
      out.write("				$(\"#bodyContainer\").html(\"\");\r\n");
      out.write("				// if(rowData.billtype==2){	\r\n");
      out.write("					$(\"#bodyContainer\").load(\"/waggle/opbill.do?mode=Edit&screencode=20&branch=\"+rowData.branchcode+\"&code=\"+rowData.code);\r\n");
      out.write("				// }					\r\n");
      out.write("	      }else if(");
      out.print(rptId);
      out.write("==20 && name==\"Edit\"){\r\n");
      out.write("	      		$('.ui-dialog').children().remove();\r\n");
      out.write("				$('.ui-dialog').remove();\r\n");
      out.write("				$(\"#bodyContainer\").children().remove();\r\n");
      out.write("				$(\"#bodyContainer\").html(\"\");\r\n");
      out.write("				// if(rowData.billtype==2){				\r\n");
      out.write("					$(\"#bodyContainer\").load(\"/waggle/opbill.do?mode=Edit&screencode=20&branch=\"+rowData.branchcode+\"&code=\"+rowData.code);\r\n");
      out.write("				// }	  				\r\n");
      out.write("	      }else if(");
      out.print(rptId);
      out.write("==20 && name==\"Cancel\"){\r\n");
      out.write("				if(rowData.crh_status!=1){				\r\n");
      out.write("					alert(\"This clinical request is already billed or cancelled\");\r\n");
      out.write("				}else{\r\n");
      out.write("					showCRCancelDialog(rowData.code,rowData.billno,rowData.ipno,rowData.patientname,rowData.branchcode,rowData.billdate,rowData.buname,rowData.totalamt,rowData.crh_hospreg_code);\r\n");
      out.write("				}	  				\r\n");
      out.write("	      }\r\n");
      out.write("	      					\r\n");
      out.write("	 }\r\n");
      out.write("	 function printCensus(){\r\n");
      out.write("	 	var printData={};\r\n");
      out.write("	 	printData[\"title\"]=\"CENSUS\";\r\n");
      out.write("		printData[\"gendate\"]=formatDateddMMyyyy(new Date());\r\n");
      out.write("		printData[\"type\"]=\"CENS\";\r\n");
      out.write("		printData[\"branchname\"]=$('#branch option:selected').text();\r\n");
      out.write("		printData[\"branch\"]=$('#branch').val();\r\n");
      out.write("		printData[\"address1\"]=\"52,Javulikara Street\";\r\n");
      out.write("		printData[\"address2\"]=\"ARUPPUKOTTAI - 626 101\";\r\n");
      out.write("		printData[\"address3\"]=\"Phone - 222273,220936\";\r\n");
      out.write("		printData[\"login_id\"]='");
      out.print(userId);
      out.write("';\r\n");
      out.write("		printData[\"reportid\"]='");
      out.print(rptId);
      out.write("';\r\n");
      out.write("		//printData[\"host\"]='192.168.1.101:8080/HMS';\r\n");
      out.write("		printData[\"host\"]='localhost:9090/HMS';\r\n");
      out.write("		printData[\"rows\"]=\"200\";		\r\n");
      out.write("		$.ajax({\r\n");
      out.write("            url: \"http://localhost:9696\",\r\n");
      out.write("            type: \"POST\",\r\n");
      out.write("            async: true,\r\n");
      out.write("            contentType:\"application/x-www-form-urlencoded\",\r\n");
      out.write("            data:\"printdata=\"+JSON.stringify(printData),\r\n");
      out.write("            dataType: \"json\",\r\n");
      out.write("            success: function (r) {\r\n");
      out.write("				//alert(r.result);		\r\n");
      out.write("            }\r\n");
      out.write("        });			\r\n");
      out.write("	 	\r\n");
      out.write("	 }\r\n");
      out.write("\r\n");
      out.write("	 function cancelCancelCrDlg(){\r\n");
      out.write("	 	$('#cancelcrdlg').modal('hide');\r\n");
      out.write("		$('#cancelcrdlg').modal('dispose');	 	\r\n");
      out.write("		$('#cancelcrdlg').removeData('row');\r\n");
      out.write("	 } \r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	 function showCRCancelDialog(crNo,crBno,ipno,patientName,branchCode,billdate,buname,totalamt,crh_hospreg_code){\r\n");
      out.write("	  		$('#cancelcrdlg').modal({autoOpen:false,modal:true,height:'auto',minHeight:400,minWidth:600,position:'center'});\r\n");
      out.write("			$('#cancelcrdlg').modal('show');\r\n");
      out.write("			$('#crbno').text(crBno);\r\n");
      out.write("			$('#ipno').val(ipno);					\r\n");
      out.write("			$('#crhno').val(crNo);\r\n");
      out.write("			$('#branchcode').val(branchCode);\r\n");
      out.write("			$('#ipatientname').val(patientName);\r\n");
      out.write("			$('#billdate').val(billdate);\r\n");
      out.write("			$('#buname').val(buname);\r\n");
      out.write("			$('#totalamt').val(totalamt);\r\n");
      out.write("			$('#crh_hospreg_code').val(crh_hospreg_code);\r\n");
      out.write("	 }\r\n");
      out.write("\r\n");
      out.write("	 function cancelClinicalRequest(){\r\n");
      out.write("		    var val = $(\"#cancelremarks\").val();\r\n");
      out.write("			\r\n");
      out.write("			if (val == \"\") {\r\n");
      out.write("					  alert(\"Cancel Remarks  is required\");\r\n");
      out.write("					  return false;\r\n");
      out.write("  			  } \r\n");
      out.write("	 	   var saveData={};\r\n");
      out.write("	 	   saveData[\"operation\"]=\"CAN\";\r\n");
      out.write("	 	   saveData[\"screencode\"]=\"20\";\r\n");
      out.write("	 	   var dData={};\r\n");
      out.write("	 	   dData[\"branchcode\"]=$('#branchcode').val();\r\n");
      out.write("	 	   dData[\"code\"]=$('#crhno').val();\r\n");
      out.write("	 	   saveData[\"savedata\"]=dData;	 	   \r\n");
      out.write("	 	   var s=new FlexUI.Ajax();\r\n");
      out.write("		   showLoader();\r\n");
      out.write("		   var r=s.callAjax(\"POST\",\"/waggle/service/screen/save\",\"data=\"+JSON.stringify(saveData));\r\n");
      out.write("		   if(r.result==\"Success\"){\r\n");
      out.write("		   		alert(\"Request Cancelled Successfully\");\r\n");
      out.write("		   		cancelCancelCrDlg();\r\n");
      out.write("		   		reloadGrid(");
      out.print(rptId);
      out.write(");\r\n");
      out.write("		   }else{\r\n");
      out.write("		   		alert(r.message);\r\n");
      out.write("		   }\r\n");
      out.write("		   hideLoader();\r\n");
      out.write("	 }\r\n");
      out.write("\r\n");
      out.write("function cancelrem(){\r\n");
      out.write("	\r\n");
      out.write("}\r\n");
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
