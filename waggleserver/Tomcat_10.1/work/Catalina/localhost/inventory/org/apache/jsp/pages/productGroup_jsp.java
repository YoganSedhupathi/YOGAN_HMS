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

public final class productGroup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <title>Product Groups</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"col-sm-10 col-md-10 col-lg-10 mpZero\"><h1>Product Groups</h1><ol class=\"breadcrumb mpZero\"><li><a href=\"#\">Home</a></li><li><a>Master</a></li><li class=\"active breaCSel\"><strong>Product Groups</strong></li></ol></div>\r\n");
      out.write("<!--add and search-->\r\n");
      out.write("<div class=\"col-sm-2 col-md-2 col-lg-2 mpZero marTp\" id='addGrp'>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- JQ grid starts-->\r\n");
      out.write("<div style=\"width:100%;float:left\">\r\n");
      out.write("<div id=\"xyz\" style='position:relative;border:0px;display:block;' class=\"mTBx\"></div>			    	 \r\n");
      out.write("<div id=\"callback\" style=\"display:none\" >\r\n");
      out.write("<div class=\"col-sm-12 col-md-12 col-lg-12 mTBx\">                    \r\n");
      out.write("    <div id=\"group1\" class=\"panelOrange hcH\">\r\n");
      out.write("   </div></div>\r\n");
      out.write("   <div class=\"clearfix\"></div>\r\n");
      out.write("   <div class=\"col-sm-12 col-md-12 col-lg-12 mTBx1\">\r\n");
      out.write("    <div id=\"group2\" class=\"panelOrange hcH\">\r\n");
      out.write("   </div></div>\r\n");
      out.write("   <div class=\"clearfix\"></div>\r\n");
      out.write("   <div class=\"col-sm-12 col-md-12 col-lg-12 mTBx1\">\r\n");
      out.write("    <div id=\"attributes\" class=\"panelOrange hcH\" style=\"height:200px;\">\r\n");
      out.write("   </div></div>   \r\n");
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
      out.write("<!-- JQ grid ends-->\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("  	var l=new FlexUI.Ajax();\r\n");
      out.write("    var sProps={title:{height:30,width:100,name:\"AMC\"},container:{id:\"callback\",isdialog:false},js:\"\",screen:[\r\n");
      out.write("  	{name:\"group1\",title:\"Group Details\",pcolumns:2,colcss:\"col-sm-6 col-md-6 col-lg-6\",height:40,width:98,minWidth:500,minHeight:200,colWidth:98,float:\"left\",backColor:\"beige\",contentType:\"Fields\",\r\n");
      out.write("  	fields:[{colno:0,name:\"code\",inputType:0,type:\"INT\",caption:\"Code\",mandatory:false,defaultValue:\"0\",\"maxValue\":0,\"textLength\":10,\"decimalLength\":0,\"visible\":false,\"readOnly\":true,\"chkTag\":false,nf:\"productname\"},\r\n");
      out.write("  	{colno:0,name:\"groupname\",inputType:0,type:\"TEXT\",caption:\"Name\",mandatory:true,defaultValue:\"\",\"maxValue\":0,\"textLength\":100,\"decimalLength\":0,\"visible\":true,\"readOnly\":false,\"chkTag\":false,nf:\"type\"},\r\n");
      out.write("  	{colno:1,name:\"type\",inputType:0,type:\"LOV\",caption:\"Type\",mandatory:true,defaultValue:\"0\",\"maxValue\":0,\"textLength\":10,\"decimalLength\":0,\"visible\":true,\"readOnly\":false,\"chkTag\":true,nf:\"hasattribute\",lovOptions:{url:\"/inventory/service/ajax\",ajax:\"producttype\",scrollEnabled:true,searchFromList:false,dsi:0,params:[],results:[]}}\r\n");
      out.write("  	]\r\n");
      out.write("  	},\r\n");
      out.write("  	{name:\"group2\",title:\"Additional Details\",pcolumns:2,colcss:\"col-sm-6 col-md-6 col-lg-6\",height:40,width:98,minWidth:500,minHeight:200,colWidth:98,float:\"left\",backColor:\"beige\",contentType:\"Fields\",\r\n");
      out.write("  	fields:[{colno:0,name:\"hasattribute\",inputType:1,type:\"TEXT\",caption:\"Has Attributes\",mandatory:false,defaultValue:\"0\",\"maxValue\":0,\"textLength\":50,\"decimalLength\":0,\"visible\":true,\"readOnly\":false,\"chkTag\":false,nf:\"noattribute\",keys:\"No~Yes\",values:\"0~1\"},\r\n");
      out.write("  	{colno:0,name:\"pnoattribute\",inputType:0,type:\"INT\",caption:\"No Of Attributes\",mandatory:false,defaultValue:\"0\",\"maxValue\":0,\"textLength\":50,\"decimalLength\":0,\"visible\":false,\"readOnly\":true,\"chkTag\":false,nf:\"status\"},\r\n");
      out.write("  	{colno:1,name:\"noattribute\",inputType:0,type:\"INT\",caption:\"No Of Attributes\",mandatory:false,defaultValue:\"0\",\"maxValue\":10,\"textLength\":50,\"decimalLength\":0,\"visible\":true,\"readOnly\":false,\"chkTag\":false,nf:\"status\",validation:\"validateNoOfAttributes\"},\r\n");
      out.write("  	{colno:0,name:\"status\",inputType:1,type:\"TEXT\",caption:\"Status\",mandatory:true,defaultValue:\"\",\"textLength\":10,\"visible\":true,\"readOnly\":false,\"chkTag\":false,nf:\"attributes_data\",keys:\"Active~InActive\",values:\"Active~InActive\"}  	  	\r\n");
      out.write("  	]\r\n");
      out.write("  	},{name:\"attributes\",title:\"Attributes\",height:30,width:98,minWidth:500,minHeight:200,colWidth:98,float:\"left\",backColor:\"biege\",contentType:\"Table\",tableProperties:{enableAddRow:false,enableDeleteRow:false,rowEmptyCheckColumn:2,optional:true,columns:[\r\n");
      out.write("    {order:\"0\",id: \"sno\", name: \"SNo\", field: \"sno\",defaultValue:\"0\",\"inputType\":0,\"type\":\"INT\",\"maxValue\":0,\"textLength\":10,\"decimalLength\":0,\"visible\":true,\"readOnly\":true,\"mandatory\":true,\"chkTag\":false,width:100,sno:true},\r\n");
      out.write("    {order:\"1\",id: \"attributeno\", name: \"Attribute\", field: \"attribute\",defaultValue:\"0\",\"inputType\":1,\"type\":\"TEXT\",\"maxValue\":0,\"textLength\":10,\"decimalLength\":0,\"visible\":true,\"readOnly\":true,\"mandatory\":true,width:150,\"chkTag\":false,keys:\"Attribute1~Attribute2~Attribute3~Attribute4~Attribute5~Attribute6~Attribute7~Attribute8~Attribute9~Attribute10\",values:\"1~2~3~4~5~6~7~8~9~10\"},\r\n");
      out.write("    {order:\"2\",id: \"name\", name: \"Name\", field: \"name\",defaultValue:\"0\",\"inputType\":0,\"type\":\"TEXT\",\"maxValue\":0,\"textLength\":10,\"decimalLength\":0,\"visible\":true,\"readOnly\":false,\"mandatory\":true,width:200},\r\n");
      out.write("    {order:\"3\",id: \"caption\", name: \"Caption\", field: \"caption\",defaultValue:\"0\",\"inputType\":0,\"type\":\"TEXT\",\"maxValue\":0,\"textLength\":10,\"decimalLength\":0,\"visible\":true,\"readOnly\":false,\"mandatory\":true,width:200},\r\n");
      out.write("    {order:\"4\",id: \"mandatory\", name: \"Mandatory\", field: \"mandatory\",defaultValue:\"0\",\"inputType\":1,\"type\":\"TEXT\",\"maxValue\":0,\"textLength\":10,\"decimalLength\":0,\"visible\":true,\"readOnly\":false,\"mandatory\":true,width:100,keys:\"Yes~No\",values:\"1~0\"},\r\n");
      out.write("    {order:\"5\",id: \"type\", name: \"Type\", field: \"type\",defaultValue:\"0\",\"inputType\":1,\"type\":\"TEXT\",\"maxValue\":0,\"textLength\":10,\"decimalLength\":0,\"visible\":true,\"readOnly\":false,\"mandatory\":true,width:100,keys:\"List~String~Number\",values:\"L~S~N\"},\r\n");
      out.write("    {order:\"6\",id: \"order\", name: \"Order\", field: \"order\",defaultValue:\"0\",\"inputType\":0,\"type\":\"INT\",\"maxValue\":0,\"textLength\":10,\"decimalLength\":0,\"visible\":true,\"readOnly\":false,\"mandatory\":true,width:100}\r\n");
      out.write("    ]\r\n");
      out.write("    }}]};\r\n");
      out.write("  var screenProps=changeScreenAttributes(110002,sProps);\r\n");
      out.write("  var productg=new FlexUI.Screen(\"productgroup\",screenProps);\r\n");
      out.write("  jqReport(9,\"#xyz\");\r\n");
      out.write("  function addMasterData(){ \r\n");
      out.write("  	productg.clearScreen(); \r\n");
      out.write("  	$('#callback').css('display','block');\r\n");
      out.write("  	$('#saveGrp').css('display','block');\r\n");
      out.write("  	$('#history').css('display','block');\r\n");
      out.write("  	$('#addGrp').css('display','none');\r\n");
      out.write("  	$('#xyz').css('display','none');\r\n");
      out.write("  	screenObjects.getScreenObject(\"groupname\").focus();\r\n");
      out.write("  }\r\n");
      out.write("  function hideMasterData(){\r\n");
      out.write("  	$('#callback').css('display','none');\r\n");
      out.write("  	$('#saveGrp').css('display','none');\r\n");
      out.write("  	$('#history').css('display','none');\r\n");
      out.write("  	$('#addGrp').css('display','block');\r\n");
      out.write("  	$('#xyz').css('display','block');\r\n");
      out.write("  }  \r\n");
      out.write("  function toggleHeaderRow(){\r\n");
      out.write("  	toggleSearchToolBar(\"9\");\r\n");
      out.write("  }\r\n");
      out.write("  toggleHeaderRow();\r\n");
      out.write("  function onSaveClicked(id,me){\r\n");
      out.write("    var code=screenObjects.getScreenObject(\"code\").getValue();\r\n");
      out.write("    if(code!=\"0\" && code!=\"\"){\r\n");
      out.write("    	productg.setOperation(\"EDIT\");\r\n");
      out.write("    }\r\n");
      out.write("	var d=productg.processDataToSave();\r\n");
      out.write("	if(\"FAILED\"!=d){\r\n");
      out.write("		var s=new FlexUI.Ajax();\r\n");
      out.write("		showLoader();\r\n");
      out.write("		var r=s.callAjax(\"POST\",\"/inventory/service/productgroup\",d);\r\n");
      out.write("		hideLoader();\r\n");
      out.write("		if(r.result==\"Success\"){\r\n");
      out.write("			setErrorMessage(r.message+\" [No:\"+r.code+\"]\");\r\n");
      out.write("			productg.clearScreen();\r\n");
      out.write("			hideMasterData();\r\n");
      out.write("			reloadGrid(\"9\");\r\n");
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
      out.write("  		url=\"/inventory/service/productgroup\";\r\n");
      out.write("  	}\r\n");
      out.write("  	if(code!=\"\"){\r\n");
      out.write("  		code=\"code=\"+code+\"\";\r\n");
      out.write("  	}\r\n");
      out.write("  	showLoader();\r\n");
      out.write("	var v=l.callAjax(\"GET\",url,code);\r\n");
      out.write("	productg.loadData(v);\r\n");
      out.write("	createAttributeRows(0);\r\n");
      out.write("	screenObjects.getScreenObject(\"type\").setEnabled(false);\r\n");
      out.write("	if(screenObjects.getScreenObject(\"hasattribute\").getValue()){\r\n");
      out.write("		screenObjects.getScreenObject(\"hasattribute\").setEnabled(false);\r\n");
      out.write("	}		\r\n");
      out.write("	$('#callback').css('display','block');\r\n");
      out.write("  	$('#saveGrp').css('display','block');\r\n");
      out.write("  	$('#history').css('display','block');\r\n");
      out.write("  	$('#addGrp').css('display','none');\r\n");
      out.write("  	$('#xyz').css('display','none');\r\n");
      out.write("  	hideLoader();\r\n");
      out.write("  	screenObjects.getScreenObject(\"groupname\").focus();\r\n");
      out.write("  }\r\n");
      out.write("  function validateNoOfAttributes(id,me){\r\n");
      out.write("	var noOfAttributes=me.getValue();\r\n");
      out.write("	var pNo=screenObjects.getScreenObject(\"pnoattribute\").getValue();\r\n");
      out.write("	if(pNo>noOfAttributes){\r\n");
      out.write("		alert(\"Cannot reduce the number of the attributes for the product group\");\r\n");
      out.write("		me.setValue(pNo);\r\n");
      out.write("		return false;\r\n");
      out.write("	}\r\n");
      out.write("	createAttributeRows(noOfAttributes);\r\n");
      out.write("	return true;\r\n");
      out.write("	}\r\n");
      out.write("	function createAttributeRows(noOfAttributes){\r\n");
      out.write("		var g=screenObjects.getScreenObject(\"attributes_data\");\r\n");
      out.write("		if(noOfAttributes==0){\r\n");
      out.write("			noOfAttributes=g.getSize();\r\n");
      out.write("		}\r\n");
      out.write("		for(var k=0;k<noOfAttributes;k++){\r\n");
      out.write("			if(g.getSize()==k){\r\n");
      out.write("				g.addRow();\r\n");
      out.write("			}\r\n");
      out.write("			g.getCell(k,1).getWidgetRef().setValue((k+1)+'');\r\n");
      out.write("			g.getCell(k,1).getWidgetRef().getSelect().attr('disabled','disabled');\r\n");
      out.write("		}		\r\n");
      out.write("	}  \r\n");
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
