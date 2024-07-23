/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.9
 * Generated at: 2023-09-08 08:01:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class manufacturer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <title>Manufacture</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"card border-0 shadow\">\r\n");
      out.write("		<div class=\"card-body lpage\">\r\n");
      out.write("			<div class=\"row w-100 mb-3\">\r\n");
      out.write("				<div class=\"col-md-6 d-flex align-items-center\">\r\n");
      out.write("					<h4 class=\"header-title\">Manufacturer</h4>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div  class=\"col-md-6 text-right\" id=\"addGrp\"></div>\r\n");
      out.write("				<div  class=\"col-md-6 text-right\" id=\"saveGrp\" style='display:none'>\r\n");
      out.write("					<div class=\"mb-3\">\r\n");
      out.write("						<button type=\"button\" class=\"btn btn-edit\" onclick='onSaveClicked()'><span class=\"mdi mdi-content-save\"></span>Save</button>\r\n");
      out.write("						<button type=\"button\" class=\"btn btn-clear mx-3\" onclick='hideMasterData()'><span class=\"mdi mdi-close-box\"></span>Close</button>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"row\" id=\"jqcontainer\"> <div class=\"table-container\" > <div id=\"xyz\" class=\"w-100\" > </div></div></div>	\r\n");
      out.write("			<div id=\"callback\" style=\"display:none\" >	\r\n");
      out.write("				<div class=\"table-container\">\r\n");
      out.write("					<div class=\"row w-100 ml-8\">                    \r\n");
      out.write("						<div id=\"group1\" class=\"row\"></div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div> \r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("  	var l=new FlexUI.Ajax();\r\n");
      out.write("    var sProps={title:{height:30,width:100,name:\"AMC\"},container:{id:\"callback\",isdialog:false},js:\"\",screen:[\r\n");
      out.write("  	{name:\"group1\",title:\"Brand/Marketer Details\",height:40,width:98,minWidth:500,minHeight:200,colWidth:98,float:\"left\",backColor:\"beige\",contentType:\"Fields\",\r\n");
      out.write("  	fields:[{name:\"code\",inputType:0,type:\"INT\",caption:\"Code\",mandatory:false,defaultValue:\"0\",\"maxValue\":0,\"textLength\":10,\"decimalLength\":0,\"visible\":false,\"readOnly\":true,\"chkTag\":false,nf:\"manufacturername\"},\r\n");
      out.write("  	{name:\"manufacturername\",inputType:0,type:\"TEXT\",caption:\"Name\",mandatory:true,defaultValue:\"\",\"maxValue\":0,\"textLength\":100,\"decimalLength\":0,\"visible\":true,\"readOnly\":false,\"chkTag\":false,nf:\"status\"},\r\n");
      out.write("  	{name:\"mfrtype\",inputType:1,type:\"TEXT\",caption:\"Type\",mandatory:true,defaultValue:\"\",\"textLength\":10,\"visible\":true,\"readOnly\":false,\"chkTag\":false,nf:\"\",keys:\"Manufacturer~Marketing Company\",values:\"MFR~MKT\"},\r\n");
      out.write("  	{name:\"status\",inputType:1,type:\"TEXT\",caption:\"Status\",mandatory:true,defaultValue:\"\",\"textLength\":10,\"visible\":true,\"readOnly\":false,\"chkTag\":false,nf:\"\",keys:\"Active~InActive\",values:\"Active~InActive\"}\r\n");
      out.write("  	]\r\n");
      out.write("  	}]};\r\n");
      out.write("  var screenProps=changeScreenAttributes(110001,sProps);\r\n");
      out.write("  var manufacturerm=new FlexUI.Screen(\"manufacturer\",screenProps);\r\n");
      out.write("  jqReport(11,\"#xyz\");\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  function addMasterData(){ \r\n");
      out.write("  	manufacturerm.clearScreen(); \r\n");
      out.write("  	$('#callback').css('display','block');\r\n");
      out.write("  	$('#saveGrp').css('display','block');\r\n");
      out.write("  	$('#history').css('display','block');\r\n");
      out.write("  	$('#addGrp').css('display','none');\r\n");
      out.write("  	$('#xyz').css('display','none');\r\n");
      out.write("    $('#jqcontainer').css('display','none');\r\n");
      out.write("  	screenObjects.getScreenObject(\"manufacturername\").focus();\r\n");
      out.write("  }\r\n");
      out.write("  function hideMasterData(){\r\n");
      out.write("  	$('#callback').css('display','none');\r\n");
      out.write("  	$('#saveGrp').css('display','none');\r\n");
      out.write("  	$('#history').css('display','none');\r\n");
      out.write("  	$('#addGrp').css('display','block');\r\n");
      out.write("  	$('#xyz').css('display','block');\r\n");
      out.write("	$('#jqcontainer').css('display','block');\r\n");
      out.write("  }  \r\n");
      out.write("  function toggleHeaderRow(){\r\n");
      out.write("  	toggleSearchToolBar(\"11\");\r\n");
      out.write("  }\r\n");
      out.write("  toggleHeaderRow();\r\n");
      out.write("  function onSaveClicked(id,me){\r\n");
      out.write("    var code=screenObjects.getScreenObject(\"code\").getValue();\r\n");
      out.write("    if(code!=\"0\" && code!=\"\"){\r\n");
      out.write("    	manufacturerm.setOperation(\"EDIT\");\r\n");
      out.write("    }\r\n");
      out.write("	var d=manufacturerm.processDataToSave();\r\n");
      out.write("	if(\"FAILED\"!=d){\r\n");
      out.write("		var s=new FlexUI.Ajax();\r\n");
      out.write("		showLoader();\r\n");
      out.write("		var r=s.callAjax(\"POST\",\"/inventory/service/manufacturer\",d);\r\n");
      out.write("		hideLoader();\r\n");
      out.write("		if(r.result==\"Success\"){\r\n");
      out.write("			setErrorMessage(r.message+\" [No:\"+r.code+\"]\" );\r\n");
      out.write("			manufacturerm.clearScreen();\r\n");
      out.write("			hideMasterData();\r\n");
      out.write("			reloadGrid(\"11\");\r\n");
      out.write("			return r.key;			\r\n");
      out.write("		}else{\r\n");
      out.write("			setErrorMessage(r.message);		\r\n");
      out.write("		}\r\n");
      out.write("		return 0;\r\n");
      out.write("	}\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  function loadOrderData(url,code,did){\r\n");
      out.write("  	if(url==\"\"){\r\n");
      out.write("  		url=\"/inventory/service/manufacturer\";\r\n");
      out.write("  	}\r\n");
      out.write("  	if(code!=\"\"){\r\n");
      out.write("  		code=\"code=\"+code+\"\";\r\n");
      out.write("  	}\r\n");
      out.write("  	showLoader();\r\n");
      out.write("	var v=l.callAjax(\"GET\",url,code);\r\n");
      out.write("	manufacturerm.loadData(v);\r\n");
      out.write("	$('#callback').css('display','block');\r\n");
      out.write("  	$('#saveGrp').css('display','block');\r\n");
      out.write("  	$('#history').css('display','block');\r\n");
      out.write("  	$('#addGrp').css('display','none');\r\n");
      out.write("  	$('#xyz').css('display','none');\r\n");
      out.write("	$('#jqcontainer').css('display','none');\r\n");
      out.write("  	hideLoader();\r\n");
      out.write("  	screenObjects.getScreenObject(\"manufacturername\").focus();\r\n");
      out.write("  }\r\n");
      out.write("</script> \r\n");
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
