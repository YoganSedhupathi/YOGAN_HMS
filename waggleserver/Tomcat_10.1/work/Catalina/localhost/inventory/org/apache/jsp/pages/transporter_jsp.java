/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.9
 * Generated at: 2023-08-21 05:30:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class transporter_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <title>Transporter</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"col-sm-10 col-md-10 col-lg-10 mpZero\"><h1>Transporter</h1><ol class=\"breadcrumb mpZero\"><li><a href=\"#\">Home</a></li><li><a>Master</a></li><li class=\"active breaCSel\"><strong>Transporter</strong></li></ol></div>\r\n");
      out.write("	\r\n");
      out.write("<!--add and search-->\r\n");
      out.write("<div class=\"col-sm-2 col-md-2 col-lg-2 mpZero marTp\" id='addGrp'>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"clearfix\"></div>\r\n");
      out.write("<!-- JQ grid starts-->\r\n");
      out.write("<div id=\"xyz\" style='position:relative;border:0px;display:block;' class=\"mTBx\"></div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"callback\" style=\"display:none\" >\r\n");
      out.write("	<div class=\"col-sm-12 col-md-12 col-lg-12 mTBx\">                    \r\n");
      out.write("    	<div id=\"group1\" class=\"panelOrange hcH\">\r\n");
      out.write("   </div></div>\r\n");
      out.write("   <div class=\"clearfix\"></div>\r\n");
      out.write("   <div class=\"col-sm-12 col-md-12 col-lg-12 mTBx\">\r\n");
      out.write("    <div id=\"group2\" class=\"panelOrange hcH\">\r\n");
      out.write("   </div></div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- JQ grid ends-->\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"clearfix\"></div>   \r\n");
      out.write("<div id=\"saveGrp\" style='display:none' class=\"mTBx\">\r\n");
      out.write("<span>\r\n");
      out.write("<button type=\"button\" class=\"btn btn-primary mRhAj\" onclick='onSaveClicked()'>Save</button>\r\n");
      out.write("<button type=\"button\" class=\"btn btn-default\" onclick='hideMasterData()'>Cancel</button>\r\n");
      out.write("</span>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("  	var l=new FlexUI.Ajax();\r\n");
      out.write("    var sProps={title:{height:30,width:100,name:\"AMC\"},container:{id:\"callback\",isdialog:false},js:\"\",screen:[\r\n");
      out.write("  	{name:\"group1\",title:\"Transporter Details\",pcolumns:2,height:40,width:98,minWidth:500,minHeight:200,colWidth:45,float:\"left\",backColor:\"beige\",contentType:\"Fields\",\r\n");
      out.write("  	fields:[{colno:1,name:\"code\",inputType:0,type:\"INT\",caption:\"Code\",mandatory:false,defaultValue:\"0\",\"maxValue\":0,\"textLength\":10,\"decimalLength\":0,\"visible\":false,\"readOnly\":true,\"chkTag\":false,nf:\"name\"},\r\n");
      out.write("  	{colno:0,name:\"branch\",inputType:0,type:\"LOV\",caption:\"Branch\",mandatory:false,defaultValue:\"0\",\"maxValue\":0,\"textLength\":10,\"decimalLength\":0,\"visible\":false,\"readOnly\":false,\"chkTag\":false,nf:\"name\",lovOptions:{url:\"/inventory/service/ajax\",ajax:\"userbranch\",scrollEnabled:true,searchFromList:false,dsi:0,params:[],results:[]}},\r\n");
      out.write("  	{colno:0,name:\"name\",inputType:0,type:\"TEXT\",caption:\"Name\",mandatory:true,defaultValue:\"\",\"maxValue\":0,\"textLength\":100,\"decimalLength\":0,\"visible\":true,\"readOnly\":false,\"chkTag\":false,nf:\"alias\"},\r\n");
      out.write("  	{colno:1,name:\"alias\",inputType:0,type:\"TEXT\",caption:\"Alias\",mandatory:false,defaultValue:\"\",\"maxValue\":0,\"textLength\":100,\"decimalLength\":0,\"visible\":true,\"readOnly\":false,\"chkTag\":false,nf:\"address1\"}\r\n");
      out.write("  	]\r\n");
      out.write("  	},{name:\"group2\",title:\"Contact Details\",pcolumns:2,height:40,width:98,minWidth:500,minHeight:200,colWidth:45,float:\"left\",backColor:\"beige\",contentType:\"Fields\",\r\n");
      out.write("  	fields:[\r\n");
      out.write("  	{colno:0,name:\"address1\",inputType:0,type:\"TEXT\",caption:\"Building\",mandatory:false,defaultValue:\"\",\"maxValue\":0,\"textLength\":100,\"decimalLength\":0,\"visible\":true,\"readOnly\":false,\"chkTag\":false,nf:\"address2\"},\r\n");
      out.write("  	{colno:1,name:\"address2\",inputType:0,type:\"TEXT\",caption:\"Street\",mandatory:false,defaultValue:\"\",\"maxValue\":0,\"textLength\":100,\"decimalLength\":0,\"visible\":true,\"readOnly\":false,\"chkTag\":false,nf:\"city\"},\r\n");
      out.write("  	{colno:0,name:\"city\",inputType:0,type:\"TEXT\",caption:\"City\",mandatory:false,defaultValue:\"\",\"maxValue\":0,\"textLength\":50,\"decimalLength\":0,\"visible\":true,\"readOnly\":false,\"chkTag\":false,nf:\"pincode\"},\r\n");
      out.write("	{colno:1,name:\"pincode\",inputType:0,type:\"TEXT\",caption:\"PinCode\",mandatory:false,defaultValue:\"0\",\"maxValue\":0,\"textLength\":10,\"decimalLength\":0,\"visible\":true,\"readOnly\":false,\"chkTag\":false,nf:\"mobile\"},\r\n");
      out.write("	{colno:0,name:\"mobile\",inputType:0,type:\"TEXT\",caption:\"Mobile\",mandatory:false,defaultValue:\"0\",\"maxValue\":0,\"textLength\":30,\"decimalLength\":0,\"visible\":true,\"readOnly\":false,\"chkTag\":false,nf:\"phone\"},  \r\n");
      out.write("	{colno:1,name:\"phone\",inputType:0,type:\"TEXT\",caption:\"Phone\",mandatory:false,defaultValue:\"0\",\"maxValue\":0,\"textLength\":30,\"decimalLength\":0,\"visible\":true,\"readOnly\":false,\"chkTag\":false,nf:\"status\"},\r\n");
      out.write("	{colno:0,name:\"status\",inputType:1,type:\"TEXT\",caption:\"Status\",mandatory:true,defaultValue:\"\",\"textLength\":10,\"visible\":true,\"readOnly\":false,\"chkTag\":false,nf:\"\",keys:\"Active~InActive\",values:\"Active~InActive\"}\r\n");
      out.write("	]\r\n");
      out.write("  	}]};\r\n");
      out.write("  var screenProps=changeScreenAttributes(110004,sProps);\r\n");
      out.write("  var transporterm=new FlexUI.Screen(\"transporter\",screenProps);\r\n");
      out.write("  jqReport(28,\"#xyz\");\r\n");
      out.write("  function addMasterData(){ \r\n");
      out.write("  	transporterm.clearScreen(); \r\n");
      out.write("  	$('#callback').css('display','block');\r\n");
      out.write("  	$('#saveGrp').css('display','block');\r\n");
      out.write("  	$('#history').css('display','block');\r\n");
      out.write("  	$('#addGrp').css('display','none');\r\n");
      out.write("  	$('#xyz').css('display','none');\r\n");
      out.write("  	screenObjects.getScreenObject(\"name\").focus();\r\n");
      out.write("  }\r\n");
      out.write("  function hideMasterData(){\r\n");
      out.write("  	$('#callback').css('display','none');\r\n");
      out.write("  	$('#saveGrp').css('display','none');\r\n");
      out.write("  	$('#history').css('display','none');\r\n");
      out.write("  	$('#addGrp').css('display','block');\r\n");
      out.write("  	$('#xyz').css('display','block');\r\n");
      out.write("  }  \r\n");
      out.write("  function toggleHeaderRow(){\r\n");
      out.write("  	toggleSearchToolBar(\"28\");\r\n");
      out.write("  }\r\n");
      out.write("  toggleHeaderRow();\r\n");
      out.write("  function onSaveClicked(id,me){\r\n");
      out.write("    var code=screenObjects.getScreenObject(\"code\").getValue();\r\n");
      out.write("    if(code!=\"0\" && code!=\"\"){\r\n");
      out.write("    	transporterm.setOperation(\"EDIT\");\r\n");
      out.write("    }\r\n");
      out.write("	var d=transporterm.processDataToSave();\r\n");
      out.write("	if(\"FAILED\"!=d){\r\n");
      out.write("		var s=new FlexUI.Ajax();\r\n");
      out.write("		showLoader();\r\n");
      out.write("		var r=s.callAjax(\"POST\",\"/inventory/service/transporter\",d);\r\n");
      out.write("		hideLoader();\r\n");
      out.write("		if(r.result==\"Success\"){\r\n");
      out.write("			setErrorMessage(r.message+\" [No:\"+r.code+\"]\");\r\n");
      out.write("			transporterm.clearScreen();\r\n");
      out.write("			hideMasterData();\r\n");
      out.write("			reloadGrid(\"28\");\r\n");
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
      out.write("  		url=\"/inventory/service/transporter\";\r\n");
      out.write("  	}\r\n");
      out.write("  	if(code!=\"\"){\r\n");
      out.write("  		code=\"code=\"+code+\"\";\r\n");
      out.write("  	}\r\n");
      out.write("  	showLoader();\r\n");
      out.write("	var v=l.callAjax(\"GET\",url,code);\r\n");
      out.write("	transporterm.loadData(v);\r\n");
      out.write("	$('#callback').css('display','block');\r\n");
      out.write("  	$('#saveGrp').css('display','block');\r\n");
      out.write("  	$('#history').css('display','block');\r\n");
      out.write("  	$('#addGrp').css('display','none');\r\n");
      out.write("  	$('#xyz').css('display','none');\r\n");
      out.write("  	hideLoader();\r\n");
      out.write("  	screenObjects.getScreenObject(\"name\").focus();\r\n");
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
