/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.9
 * Generated at: 2024-01-05 13:35:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class stockInwardReport_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta charset=\"utf-8\" name=\"viewport\" content= \"width=device-width, initial-scale=1.0\">\r\n");
      out.write("		<title>Stock Report</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("    <script>\r\n");
      out.write("    ");

    	String userId=(String)session.getAttribute("LOGIN_ID");
    	String rptId=request.getParameter("id");
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
      out.write("\r\n");
      out.write("<div class=\"card border-0\">\r\n");
      out.write("	<div class=\"card-body\">\r\n");
      out.write("		<div class=\"row w-100\">\r\n");
      out.write("			<div class=\"col-md-3 d-flex align-items-center\">\r\n");
      out.write("				<h4 class=\"header-title\">");
      out.print(rptTitle);
      out.write("</h4>\r\n");
      out.write("			</div>\r\n");
      out.write("		\r\n");
      out.write("			<div class=\"col-md-9\">\r\n");
      out.write("				<div class=\"row\">\r\n");
      out.write("					<div class=\"col-md-10 h-30 text-right\">\r\n");
      out.write("						<div class=\"d-flex\">\r\n");
      out.write("							<div id=\"productc\" class=\"col-md-6\">\r\n");
      out.write("								<div class=\"input-group\">\r\n");
      out.write("									<span class=\"input-group-text\">Product</span>\r\n");
      out.write("									<input type=\"text\" id=\"productname\" autocomplete=\"off\" class=\"form-control\" data-server=\"/inventory/service/autocomplete?id=manufacturer&term=\" data-live-server=\"true\" data-value-field=\"id\"  data-label-field=\"name\"/>\r\n");
      out.write("									<button id=\"prodSearch\" type=\"button\" class=\"btn btn-edit\" onclick=\"reportGo('");
      out.print(rptId);
      out.write("')\">Go</button>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"input-group\" id=\"datefilc\" >\r\n");
      out.write("								<span class=\"input-group-text\">From</span>\r\n");
      out.write("								<input id=\"fromDate\" name=\"fromDate\" inputType=\"date\"  type=\"text\" mandatory=\"1\"  class=\"form-control\"/>\r\n");
      out.write("								<span class=\"input-group-text\">To </span>\r\n");
      out.write("								<input id=\"toDate\" name=\"toDate\" inputType=\"date\"  type=\"text\" mandatory=\"1\"  class=\"form-control\"/>\r\n");
      out.write("								<button type=\"button\" class=\"btn btn-edit\" onclick=\"reportGo('");
      out.print(rptId);
      out.write("')\">Go</button>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div id=\"daysc\" class=\"col-md-6\">\r\n");
      out.write("								<div class=\"input-group\">\r\n");
      out.write("									<span class=\"input-group-text\">Last N' Days</span>\r\n");
      out.write("									<input type=\"text\" id=\"lastndays\" class=\"form-control\" value=\"7\"/>\r\n");
      out.write("									<span class=\"input-group-text\">Quantity</span>\r\n");
      out.write("									<input type=\"text\" id=\"saleqty\" class=\"form-control\" value=\"0\"/>\r\n");
      out.write("									<button type=\"button\" class=\"btn btn-edit\" onclick=\"reportGo('");
      out.print(rptId);
      out.write("')\">Go</button>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("							<div id=\"orderdayc\" class=\"col-md-2\" style=\"display:none\">\r\n");
      out.write("								<span class=\"input-group-text\">Order Days</span>\r\n");
      out.write("								<input type=\"text\" id=\"orderdays\" class=\"form-control\" value=\"30\"/>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div id=\"begindatec\" class=\"col-md-2\" style=\"display:none\">\r\n");
      out.write("								<span class=\"input-group-text\">Total Avg. Date</span>\r\n");
      out.write("								<input id=\"beginDate\" name=\"beginDate\" inputType=\"date\"  type=\"text\" maxlength=\"50\" mandatory=\"1\" readonly class=\"form-control\" value=\"01/07/2015\"/>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div id=\"qtybasedon\" class=\"col-md-2\" style=\"display:none\">\r\n");
      out.write("								<span class=\"input-group-text\">Based On</span>\r\n");
      out.write("								<select id=\"basedon\" name=\"basedon\" class=\"form-control\"><option value='1'>Order Stock</option><option value='0'>Min Qty</option></select>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div id=\"orderqtyc\" class=\"col-md-2\" style=\"display:none\">\r\n");
      out.write("								<span class=\"input-group-text\">Order Quantity Above</span>\r\n");
      out.write("								<input id=\"orderQtyFilter\" name=\"orderQtyFilter\" type=\"text\" class=\"form-control\" value=\"0\"/>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div  class=\"col-md-2 text-right mb-2\" id=\"addGrp\">\r\n");
      out.write("						<button type=\"button\" class=\"btn btn-clear\" onclick='enableSearch();'><span class=\"mdi mdi-filter-variant\">Search</span></button>	\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("		<div class=\"row\" id=\"jqcontainer\" ><div class=\"table-container\" ><div id=\"rep\" class=\"w-100\"></div></div></div>\r\n");
      out.write("	</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("       \r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("		$('#fromDate').datepicker({format:'dd/mm/yyyy'});			\r\n");
      out.write("		if($('#fromDate').val()==\"\"){\r\n");
      out.write("			var cd=new Date();\r\n");
      out.write("			$('#fromDate').datepicker(\"setDate\",cd);\r\n");
      out.write("		}\r\n");
      out.write("		$('#toDate').datepicker({format:'dd/mm/yyyy'});			\r\n");
      out.write("		if($('#toDate').val()==\"\"){\r\n");
      out.write("			var cd=new Date();\r\n");
      out.write("			$('#toDate').datepicker(\"setDate\",cd);\r\n");
      out.write("		}\r\n");
      out.write("		$('#beginDate').datepicker({format:'dd/mm/yyyy'});			\r\n");
      out.write("		if($('#beginDate').val()==\"\"){\r\n");
      out.write("			var cd=new Date();\r\n");
      out.write("			$('#beginDate').datepicker(\"setDate\",cd);\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("	ConstructPrevPurchaseGrid();\r\n");
      out.write("});\r\n");
      out.write("var l=new FlexUI.Ajax();\r\n");
      out.write("var v=l.callAjax(\"GET\",\"/inventory/service/ajax\",\"ic=0&id=userbranch\");\r\n");
      out.write("var branches=v.data;\r\n");
      out.write("if(branches!=null){\r\n");
      out.write("	var s=branches.length;\r\n");
      out.write("	$('#branch').children().remove();\r\n");
      out.write("	for(var j=0;j<s;j++){\r\n");
      out.write("		$('#branch').append(\"<option value='\"+branches[j][1]+\"'>\"+branches[j][0]+\"</option>\");	\r\n");
      out.write("	}\r\n");
      out.write("}\r\n");
      out.write("var orderqtyabv=\"0\";\r\n");
      out.write("if($('#orderQtyFilter').val()!=\"\"){\r\n");
      out.write("	orderqtyabv=$('#orderQtyFilter').val();\r\n");
      out.write("}\r\n");
      out.write("var params=\"\";\r\n");
      out.write("newParams=\"&fromdate=\"+$('#fromDate').val()+\"&todate=\"+$('#toDate').val()+\"&branch=\"+$('#branch').val()+\"&productname=\"+escape($(\"#productname\").val())+\"&lastndays=\"+$('#lastndays').val()+\"&saleqty=\"+$('#saleqty').val()+\"&begindate=\"+$('#beginDate').val()+\"&orderdays=\"+$('#orderdays').val()+\"&orderqtyabv=\"+orderqtyabv+\"&basedon=\"+$('#basedon').val();\r\n");
      out.write("\r\n");
      out.write("jqReport(");
      out.print(rptId);
      out.write(",\"#rep\",newParams);\r\n");
      out.write("showCSVExportButton(");
      out.print(rptId);
      out.write(",newParams);\r\n");
      out.write("function enableSearch(){\r\n");
      out.write("	toggleSearchToolBar(");
      out.print(rptId);
      out.write(");\r\n");
      out.write("}\r\n");
      out.write("enableSearch();\r\n");
      out.write("function reportGo(id){\r\n");
      out.write("	showLoader();\r\n");
      out.write("	if($('#orderQtyFilter').val()!=\"\"){\r\n");
      out.write("		orderqtyabv=$('#orderQtyFilter').val();\r\n");
      out.write("	}else{\r\n");
      out.write("		orderqtyabv=\"0\";\r\n");
      out.write("	}\r\n");
      out.write("	newParams=\"&fromdate=\"+$('#fromDate').val()+\"&todate=\"+$('#toDate').val()+\"&branch=\"+$('#branch').val()+\"&productname=\"+escape($(\"#productname\").val().trim())+\"&lastndays=\"+$('#lastndays').val()+\"&saleqty=\"+$('#saleqty').val()+\"&begindate=\"+$('#beginDate').val()+\"&orderdays=\"+$('#orderdays').val()+\"&orderqtyabv=\"+orderqtyabv+\"&basedon=\"+$('#basedon').val();\r\n");
      out.write("	changeUrlAndReloadGrid(id,params,newParams);\r\n");
      out.write("	showPDFExportButton(id,newParams);\r\n");
      out.write("	showCSVExportButton(id,newParams);	\r\n");
      out.write("	hideLoader();\r\n");
      out.write("}\r\n");
      out.write("function showHideFilter(){\r\n");
      out.write("	if( $('#divFirstFilter').is(':visible') ) {\r\n");
      out.write("		$('#divFirstFilter').css(\"display\",\"none\");\r\n");
      out.write("	}else{\r\n");
      out.write("		$('#divFirstFilter').css(\"display\",\"block\");\r\n");
      out.write("	}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("new Autocomplete(document.getElementById(\"productname\"), {\r\n");
      out.write("    	// options\r\n");
      out.write("			});\r\n");
      out.write("// $(\"#productname\").autocomplete({\r\n");
      out.write("// 		source: \"/inventory/service/autocomplete?id=product\",\r\n");
      out.write("// 		minLength: 0,\r\n");
      out.write("// 		select: function( event, ui ) {\r\n");
      out.write("// 			this.value=ui.item.label;\r\n");
      out.write("// 			reportGo(");
      out.print(rptId);
      out.write(");\r\n");
      out.write("// 		},messages : {\r\n");
      out.write("// 	      	noResults : 'No results found.',\r\n");
      out.write("// 	      	results : function(count) {\r\n");
      out.write("// 	        	return count + (count > 1 ? ' results' : ' result ') + ' found';\r\n");
      out.write("// 	      	}\r\n");
      out.write("//     	}\r\n");
      out.write("// });\r\n");
      out.write("\r\n");
      out.write("// $('#productname').autoComplete({\r\n");
      out.write("//     resolver: 'custom',\r\n");
      out.write("//     events: {\r\n");
      out.write("//         search: function (qry, callback) {\r\n");
      out.write("// 	            $.ajax('/inventory/service/autocomplete?id=product',\r\n");
      out.write("//             ).done(function (res) {\r\n");
      out.write("//                 //callback(res.results)\r\n");
      out.write("//             });\r\n");
      out.write("//         }\r\n");
      out.write("//     }\r\n");
      out.write("// });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("if(\"");
      out.print(rptId);
      out.write("\"==\"1200004\"){\r\n");
      out.write("	$('#datefilc').css(\"display\",\"none\");\r\n");
      out.write("	$('#daysc').css(\"display\",\"none\");\r\n");
      out.write("}else if(\"");
      out.print(rptId);
      out.write("\"==\"1200005\"){\r\n");
      out.write("	$('#productc').css(\"display\",\"none\");\r\n");
      out.write("	$('#daysc').css(\"display\",\"inline-flex\");\r\n");
      out.write("	$('#datefilc').css(\"display\",\"none\");	\r\n");
      out.write("	if(\"");
      out.print(rptId);
      out.write("\"==\"1200005\"){\r\n");
      out.write("		$('#qtyc').css(\"display\",\"inline-flex\");\r\n");
      out.write("		\r\n");
      out.write("	}\r\n");
      out.write("}else if(\"");
      out.print(rptId);
      out.write("\"==\"1200006\"){\r\n");
      out.write("	$('#datefilc').css(\"display\",\"none\");\r\n");
      out.write("	$('#productc').css(\"display\",\"none !important\");\r\n");
      out.write("	$('#daysc').css(\"display\",\"block\");\r\n");
      out.write("	$('#orderdayc').css(\"display\",\"block\");\r\n");
      out.write("	$('#begindatec').css(\"display\",\"block\");\r\n");
      out.write("	$('#orderqtyc').css(\"display\",\"block\");\r\n");
      out.write("	$('#qtybasedon').css(\"display\",\"block\");\r\n");
      out.write("}else if(\"");
      out.print(rptId);
      out.write("\"==\"1200009\"){\r\n");
      out.write("	$('#datefilc').css(\"display\",\"none\");\r\n");
      out.write("	$('#productc').css(\"display\",\"none\");\r\n");
      out.write("	$('#daysc').css(\"display\",\"none\");\r\n");
      out.write("	$('#orderdayc').css(\"display\",\"none\");\r\n");
      out.write("	$('#begindatec').css(\"display\",\"none\");\r\n");
      out.write("	$('#orderqtyc').css(\"display\",\"none\");\r\n");
      out.write("	$('#qtybasedon').css(\"display\",\"none\");\r\n");
      out.write("	$('#productc').css(\"display\",\"block\");\r\n");
      out.write("}else if(\"");
      out.print(rptId);
      out.write("\"==\"710023\"){\r\n");
      out.write("	$('#daysc').css(\"display\",\"none\");\r\n");
      out.write("	$('#prodSearch').css(\"display\",\"none\");\r\n");
      out.write("}else if(\"");
      out.print(rptId);
      out.write("\"==\"710022\"){\r\n");
      out.write("	$('#daysc').css(\"display\",\"none\");\r\n");
      out.write("	$('#prodSearch').css(\"display\",\"none\");\r\n");
      out.write("	\r\n");
      out.write("}\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function showIndentDlg(){\r\n");
      out.write("		$('#indentdlg').dialog({\r\n");
      out.write("			autoOpen:false,\r\n");
      out.write("			modal:true,\r\n");
      out.write("			minHeight:600,\r\n");
      out.write("			minWidth:900,\r\n");
      out.write("			position:'center'\r\n");
      out.write("		});\r\n");
      out.write("		$('#indentdlg').dialog('open');		\r\n");
      out.write("}\r\n");
      out.write("function closeIndentDlg(){\r\n");
      out.write("	clearIndent();\r\n");
      out.write("	$('#indentdlg').dialog('close');\r\n");
      out.write("	$('#indentdlg').dialog('destroy');	\r\n");
      out.write("}\r\n");
      out.write("function loadOrderData(link,name,did){\r\n");
      out.write("		var rowData=$(\"#report_");
      out.print(rptId);
      out.write("\").getRowData(did);\r\n");
      out.write("		if(name==\"Indent\"){\r\n");
      out.write("			showIndentDlg();\r\n");
      out.write("			var data=null;\r\n");
      out.write("			if(toNumber(rowData.ind_id)>0){\r\n");
      out.write("				$.ajax({\r\n");
      out.write("		            url: \"/inventory/service/purchaseorder/indent?branch=\"+$('#branch').val()+\"&indentid=\"+rowData.ind_id,\r\n");
      out.write("		            type: \"GET\",\r\n");
      out.write("		            async: false,\r\n");
      out.write("		            contentType:\"application/json\",\r\n");
      out.write("		            dataType: \"json\",\r\n");
      out.write("		            success: function (r) {\r\n");
      out.write("						data=r;		\r\n");
      out.write("		            }\r\n");
      out.write("		        });\r\n");
      out.write("			}\r\n");
      out.write("			if(data!=null){\r\n");
      out.write("				$('#suppcode').val(data.suppcode);\r\n");
      out.write("    			$('#suppname').val(data.suppname);\r\n");
      out.write("    			$('#orderqty').val(data.orderqty);\r\n");
      out.write("    			$('#indentid').val(data.indentid);\r\n");
      out.write("    			$('#orderfreeqty').val(data.orderfreeqty);\r\n");
      out.write("    			$('#orderbasefreeqty').val(data.orderbasefreeqty);\r\n");
      out.write("    		}else{\r\n");
      out.write("    			$('#orderqty').val(toNumber(rowData.orderqty));\r\n");
      out.write("    		}\r\n");
      out.write("    		$('#productcode').val(rowData.pm_code);\r\n");
      out.write("    		$('#productn').text(rowData.pm_name);\r\n");
      out.write("    		$('#manun').text(rowData.mm_name);\r\n");
      out.write("    		$('#genericn').text(rowData.pgm_name);\r\n");
      out.write("    		$('#unitn').text(rowData.um_name);\r\n");
      out.write("    		$('#indentqty').val(rowData.orderqty);\r\n");
      out.write("    		$('#rowid').val(did);\r\n");
      out.write("    		var purdata=[];\r\n");
      out.write("    		$.ajax({\r\n");
      out.write("		            url: \"/inventory/service/ajax?ro=true&ic=0&id=prevpurchases&pmcode=\"+rowData.pm_code,\r\n");
      out.write("		            type: \"GET\",\r\n");
      out.write("		            async: false,\r\n");
      out.write("		            contentType:\"application/json\",\r\n");
      out.write("		            dataType: \"json\",\r\n");
      out.write("		            success: function (r) {\r\n");
      out.write("						purdata=r;		\r\n");
      out.write("		            }\r\n");
      out.write("		    });\r\n");
      out.write("		    $grid = $(\"#prevpurchase\");\r\n");
      out.write("    		$grid.clearGridData();\r\n");
      out.write("    		$grid.jqGrid('setGridParam', { data:purdata.data  });\r\n");
      out.write("    		$grid[0].refreshIndex();\r\n");
      out.write("    		$grid.trigger(\"reloadGrid\");\r\n");
      out.write("		}\r\n");
      out.write("}\r\n");
      out.write("function ConstructPrevPurchaseGrid() {\r\n");
      out.write("        var areaWidth = 700;\r\n");
      out.write("        $(\"#prevpurchase\").jqGrid({\r\n");
      out.write("            datatype: \"local\",\r\n");
      out.write("            width: areaWidth,\r\n");
      out.write("            height:290,\r\n");
      out.write("            autowidth: true,\r\n");
      out.write("            shrinktofit:true,\r\n");
      out.write("            colNames: ['SupplierName', 'Date', 'InvNo', 'Qty','Free','Rate','Discount','NetCost','SuppCode','Select'],\r\n");
      out.write("            colModel: [\r\n");
      out.write("                        { name: 'supp_name', index: 'supp_name', sorttype: \"text\", sortable: false, width: 250, align: 'left'},\r\n");
      out.write("                        { name: 'ph_inv_date', index: 'ph_inv_date', sorttype: \"text\", sortable: false, width: 80, align: 'left' },\r\n");
      out.write("                        { name: 'ph_inv_no', index: 'ph_inv_no', sorttype: \"text\", sortable: false, width: 80, align: 'left' },\r\n");
      out.write("						{ name: 'pd_qty', index: 'pd_qty', sorttype: \"integer\", sortable: false, width: 80, align: 'left'},\r\n");
      out.write("						{ name: 'pd_freeqty', index: 'pd_freeqty', sorttype: \"text\", sortable: false, width: 80, align: 'left' },\r\n");
      out.write("						{ name: 'pd_rate', index: 'pd_rate', sorttype: \"text\", sortable: false, width: 80, align: 'left' },\r\n");
      out.write("						{ name: 'pd_disc_perc', index: 'pd_freeqty', sorttype: \"text\", sortable: false, width: 80, align: 'left' },\r\n");
      out.write("						{ name: 'pd_netcost', index: 'pd_netcost', sorttype: \"text\", sortable: false, width: 80, align: 'left' },\r\n");
      out.write("						{ name: 'ph_supp_code', index: 'ph_supp_code', sorttype: \"text\", sortable: false, hidden:true,width: 0, align: 'left' },\r\n");
      out.write("						{ name: 'select', index: 'select', sorttype: \"text\", sortable: false, formatter: SelectFormatter, width: 70 }\r\n");
      out.write("            ],\r\n");
      out.write("            rowNum: 50,\r\n");
      out.write("            datatype: \"jsonstring\",\r\n");
      out.write("            jsonReader: { repeatitems: false },\r\n");
      out.write("            viewrecords: true,\r\n");
      out.write("            gridview: true,\r\n");
      out.write("            loadtext: \"Loading....\",\r\n");
      out.write("            multiselect: false,\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("function SelectFormatter(cellVlue, option) {\r\n");
      out.write("    var selectForm = \"<div align=center style=cursor:pointer><span class='fa fa-check' title='Select' onclick=selectSupplier(event,\" + option.rowId + \")></span></div>\";\r\n");
      out.write("    return selectForm;\r\n");
      out.write("}    \r\n");
      out.write("function selectSupplier(event, rowid){\r\n");
      out.write("    var rowData = $('#prevpurchase').jqGrid('getRowData', rowid);\r\n");
      out.write("    $('#suppname').val(rowData.supp_name);\r\n");
      out.write("    $('#suppcode').val(rowData.ph_supp_code);\r\n");
      out.write("    if(toNumber(rowData.pd_freeqty)>0){\r\n");
      out.write("    	var baseFreeQty=Math.floor(toNumber(rowData.pd_qty)/toNumber(rowData.pd_freeqty));\r\n");
      out.write("    	$('#orderbasefreeqty').val(baseFreeQty);\r\n");
      out.write("    }\r\n");
      out.write("    calculateFreeQty();\r\n");
      out.write("}\r\n");
      out.write("function calculateFreeQty(){\r\n");
      out.write("	var freeqty=0;\r\n");
      out.write("	if(toNumber($('#orderbasefreeqty').val())>0){		\r\n");
      out.write("    	 freeqty=toNumber($('#orderqty').val())/toNumber($('#orderbasefreeqty').val());\r\n");
      out.write("    }\r\n");
      out.write("    $('#orderfreeqty').val(freeqty);\r\n");
      out.write("}\r\n");
      out.write("function onOrderQtyKeyUp(){\r\n");
      out.write("	calculateFreeQty();\r\n");
      out.write("}\r\n");
      out.write("$('#orderqty').bind(\"keyup\",onOrderQtyKeyUp);\r\n");
      out.write("function saveIndent() {\r\n");
      out.write("	var operation=\"ADD\";\r\n");
      out.write("	if(toNumber($('#indentid').val())>0){\r\n");
      out.write("    		operation=\"EDIT\";\r\n");
      out.write("    }	\r\n");
      out.write("    if($('#suppcode').val()==\"\" || $('#suppcode').val()==\"0\"){\r\n");
      out.write("    	alert(\"Please select the supplier\");\r\n");
      out.write("    	return;\r\n");
      out.write("    }\r\n");
      out.write("    if($('#orderqty').val()==\"\" || $('#orderqty').val()==\"0\" || toNumber($('#orderqty').val())<=0){\r\n");
      out.write("    	alert(\"Please enter the valid order quantity\");\r\n");
      out.write("    	return;\r\n");
      out.write("    }\r\n");
      out.write("	var data='data={\"operation\":\"'+operation+'\",\"savedata\":';\r\n");
      out.write("    var saveData = {};\r\n");
      out.write("    saveData[\"orderdays\"]=$('#orderdays').val();\r\n");
      out.write("    saveData[\"suppcode\"]=$('#suppcode').val();\r\n");
      out.write("    saveData[\"productcode\"]=$('#productcode').val();\r\n");
      out.write("    saveData[\"begindate\"]=$('#beginDate').val();\r\n");
      out.write("    saveData[\"indentid\"]=$('#indentid').val();\r\n");
      out.write("    saveData[\"branchcode\"]=$('#branch').val();\r\n");
      out.write("    saveData[\"indentqty\"]=$('#indentqty').val();\r\n");
      out.write("    saveData[\"orderqty\"]=$('#orderqty').val();\r\n");
      out.write("    saveData[\"orderbasefreeqty\"]=$('#orderbasefreeqty').val();\r\n");
      out.write("    saveData[\"orderfreeqty\"]=$('#orderfreeqty').val();\r\n");
      out.write("    saveData[\"status\"]=$('#status').val();\r\n");
      out.write("    data=data+JSON.stringify(saveData)+\"}\";\r\n");
      out.write("    $.ajax({\r\n");
      out.write("        url: \"/inventory/service/purchaseorder/indent\",\r\n");
      out.write("        type: \"POST\",\r\n");
      out.write("        data: data,\r\n");
      out.write("        contentType: \"application/x-www-form-urlencoded\",\r\n");
      out.write("        async: false,\r\n");
      out.write("        dataType: \"json\",\r\n");
      out.write("        success: function (data) {\r\n");
      out.write("			if(data.result==\"Success\"){\r\n");
      out.write("				var rid=$('#rowid').val();\r\n");
      out.write("				if(saveData[\"status\"]==\"0\"){\r\n");
      out.write("					$(\"#report_");
      out.print(rptId);
      out.write("\").jqGrid('setCell', rid,'ind_id',\"0\");		\r\n");
      out.write("					$(\"#report_");
      out.print(rptId);
      out.write("\").jqGrid('setCell', rid,'supp_name',\"\");\r\n");
      out.write("					$(\"#report_");
      out.print(rptId);
      out.write("\").jqGrid('setCell', rid,'ind_order_qty',\"0\");\r\n");
      out.write("					$(\"#report_");
      out.print(rptId);
      out.write("\").jqGrid('setCell', rid,'ind_orderdays',\"0\");\r\n");
      out.write("				}else{\r\n");
      out.write("					$(\"#report_");
      out.print(rptId);
      out.write("\").jqGrid('setCell', rid,'ind_id',data.key);		\r\n");
      out.write("					$(\"#report_");
      out.print(rptId);
      out.write("\").jqGrid('setCell', rid,'supp_name',$('#suppname').val());\r\n");
      out.write("					$(\"#report_");
      out.print(rptId);
      out.write("\").jqGrid('setCell', rid,'ind_order_qty',$('#orderqty').val());\r\n");
      out.write("					$(\"#report_");
      out.print(rptId);
      out.write("\").jqGrid('setCell', rid,'ind_orderdays',$('#orderdays').val());\r\n");
      out.write("				}\r\n");
      out.write("				clearIndent();\r\n");
      out.write("				closeIndentDlg();\r\n");
      out.write("			}else{\r\n");
      out.write("				alert(data.result);\r\n");
      out.write("			}\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("}\r\n");
      out.write("function clearIndent(){\r\n");
      out.write("    $('#suppcode').val(\"0\");\r\n");
      out.write("    $('#suppname').val(\"\");\r\n");
      out.write("    $('#productcode').val(\"0\");\r\n");
      out.write("    $('#indentid').val(\"0\");\r\n");
      out.write("    $('#indentqty').val(\"0\");\r\n");
      out.write("    $('#orderqty').val(\"0\");\r\n");
      out.write("    $('#orderbasefreeqty').val(\"0\");\r\n");
      out.write("    $('#orderfreeqty').val(\"0\");\r\n");
      out.write("    $('#status').val(\"1\");\r\n");
      out.write("    $('#rowid').val(\"\");\r\n");
      out.write("	$grid = $(\"#prevpurchase\");\r\n");
      out.write("    $grid.clearGridData();\r\n");
      out.write("    $grid.jqGrid('setGridParam', { data: [] });\r\n");
      out.write("    $grid[0].refreshIndex();\r\n");
      out.write("    $grid.trigger(\"reloadGrid\");\r\n");
      out.write("}\r\n");
      out.write("// $(\"#suppname\").autocomplete({\r\n");
      out.write("// 		source: \"/inventory/service/autocomplete?id=supplier\",\r\n");
      out.write("// 		minLength: 0,\r\n");
      out.write("// 		select: function( event, ui ) {\r\n");
      out.write("// 			this.value=ui.item.label;\r\n");
      out.write("// 			$('#suppcode').val(ui.item.id);\r\n");
      out.write("// 		},messages : {\r\n");
      out.write("// 	      	noResults : 'No results found.',\r\n");
      out.write("// 	      	results : function(count) {\r\n");
      out.write("// 	        	return count + (count > 1 ? ' results' : ' result ') + ' found';\r\n");
      out.write("// 	      	}\r\n");
      out.write("//     	}\r\n");
      out.write("// });\r\n");
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
