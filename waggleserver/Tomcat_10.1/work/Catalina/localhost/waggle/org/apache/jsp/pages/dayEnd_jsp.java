/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.9
 * Generated at: 2024-07-19 08:16:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class dayEnd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <title>Day End</title>\r\n");
      out.write("</head>\r\n");
String mode=request.getParameter("mode");
String code=request.getParameter("code");

      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"card border-0 shadow\">\r\n");
      out.write("		<div class=\"card-body lpage\">\r\n");
      out.write("			<div class=\"row w-100\">\r\n");
      out.write("				<div class=\"col-md-6 d-flex align-items-center\">\r\n");
      out.write("					<h4 class=\"header-title\">Day End Details</h4>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"row \" id=\"jqcontainer\" style=\"display:none\"> <div class=\"table-container\" > <div id=\"xyz\" class=\"w-100\"></div></div></div>	\r\n");
      out.write("			<div id=\"callback\"  >\r\n");
      out.write("				\r\n");
      out.write("			<div class=\"table-container\">\r\n");
      out.write("				<div class=\"row w-100 ml-12\">\r\n");
      out.write("					<div class=\"col-sm-12 col-md-12 col-lg-12\">                    \r\n");
      out.write("						<div id=\"group1\" class=\"row\"></div>\r\n");
      out.write("					</div>                    \r\n");
      out.write("					\r\n");
      out.write("				</div>\r\n");
      out.write("			   \r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<div class=\"row w-100 mt-3\">\r\n");
      out.write("				<div class=\"col-md-3\">\r\n");
      out.write("				  <div class=\"hstack justify-content-start\">\r\n");
      out.write("					<div id=\"actButton\">\r\n");
      out.write("						<button id=\"btnGenerate\" class=\"btn btn-primary priBut\" type=\"button\" onclick=\"doDayEnd()\">Generate</button>\r\n");
      out.write("	                	<button id=\"btnCensus\"   class=\"btn btn-primary priBut\" type=\"button\" onclick=\"doCensus()\">Run Census</button>\r\n");
      out.write("		                <button id=\"btnClear\"    class=\"btn btn-light\" type=\"button\" onclick=\"clearInnerScreen()\">Clear</button>\r\n");
      out.write("					</div>\r\n");
      out.write("				  </div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>	\r\n");
      out.write("			   \r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!--  -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<script>\r\n");
      out.write(" 	var l=new FlexUI.Ajax();\r\n");
      out.write("	var v=l.callAjax(\"GET\",\"/waggle/service/ajax\",\"ic=0&id=userdefbranch\");\r\n");
      out.write("	var defbranch=v.data;\r\n");
      out.write("	\r\n");
      out.write(" 	var sProps={js:\"\",screen:[\r\n");
      out.write(" 	{name:\"branch1\",title:\"\",pcolumns:0,height:30,width:98,minWidth:500,minHeight:200,colWidth:45,float:\"left\",backColor:\"biege\",contentType:\"Fields\",\r\n");
      out.write("	  fields:[ {colno:0,name:\"branch\",inputType:0,type:\"LOV\",caption:\"\",mandatory:true,defaultValue:\"0\",\"maxValue\":0,\"textLength\":10,\"decimalLength\":0,\"visible\":false,\"readOnly\":false,\"chkTag\":true,nf:\"location\",lovOptions:{url:\"/waggle/service/ajax\",ajax:\"userbranch\",scrollEnabled:true,searchFromList:false,dsi:0,params:[],results:[{tgt:\"branch\",tt:true,id:\"1\"},{tgt:\"branch\",tt:false,id:\"0\"},{tgt:\"location\",tt:false,id:\"5\"},{tgt:\"location\",tt:true,id:\"6\"}]}},\r\n");
      out.write("	  {colno:0,name:\"location\",inputType:0,type:\"LOV\",caption:\"\",mandatory:true,defaultValue:\"0\",\"maxValue\":0,\"textLength\":10,\"decimalLength\":0,\"visible\":false,\"readOnly\":false,\"chkTag\":true,nf:\"custname\",lovOptions:{url:\"/waggle/service/ajax\",ajax:\"branchlocations\",scrollEnabled:true,searchFromList:false,dsi:0,params:[{n:\"branch\",src:\"branch\",ft:true}],results:[]}}\r\n");
      out.write("	]},\r\n");
      out.write("  	{name:\"group1\",contentType:\"Fields\",pcolumns:1,\r\n");
      out.write("  	fields:[\r\n");
      out.write("  	{colno:0,name:\"fromtime\",inputType:0,type:\"DATE\",caption:\"Start Time\",mandatory:true,defaultValue:\"\",\"maxValue\":0,\"textLength\":10,\"decimalLength\":0,\"visible\":true,\"readOnly\":false,\"chkTag\":false,nf:\"btnGenerate\"},\r\n");
      out.write("  	{colno:0,name:\"totime\",inputType:0,type:\"DATE\",caption:\"End Time\",mandatory:false,defaultValue:\"0\",\"maxValue\":0,\"textLength\":10,\"decimalLength\":0,\"visible\":false,\"readOnly\":true,\"chkTag\":false,nf:\"btnGenerate\"},\r\n");
      out.write("  	{colno:0,name:\"trandate\",inputType:0,type:\"TDATE\",caption:\"\",mandatory:false,defaultValue:\"1\",\"maxValue\":0,\"textLength\":10,\"decimalLength\":0,\"visible\":false,\"readOnly\":true,\"chkTag\":false,nf:\"\"},\r\n");
      out.write("  	]}]};\r\n");
      out.write("	var dayend=null;	\r\n");
      out.write("    $(document).ready(function () {\r\n");
      out.write("    		dayend=new FlexUI.Screen(\"dayend\",sProps);\r\n");
      out.write("    		setDefaultBranch();    		\r\n");
      out.write("            $('#subtitle').text(\"\");\r\n");
      out.write("            //screenObjects.getScreenObject(\"fromtime\").setValue(formatDateddMMyyyy(new Date())+\" 12:00 AM\");\r\n");
      out.write("            screenObjects.getScreenObject(\"fromtime\").setValue(formatDateddMMyyyy(new Date()));\r\n");
      out.write("            screenObjects.getScreenObject(\"trandate\").setValue(formatDateddMMyyyy(new Date()));\r\n");
      out.write("            $('#screentitle').text(\"Day End\");\r\n");
      out.write("     });\r\n");
      out.write("    function clearInnerScreen(){\r\n");
      out.write("    	dayend.clearScreen();\r\n");
      out.write("    	setDefaultBranch();\r\n");
      out.write("    	$(\"starttime\").focus();\r\n");
      out.write("    }\r\n");
      out.write("	function doDayEnd(){\r\n");
      out.write("	    var data;\r\n");
      out.write("	    var startTime=screenObjects.getScreenObject(\"fromtime\").getValue()+\" 12:00 AM\";\r\n");
      out.write("	    //var endTime=screenObjects.getScreenObject(\"totime\").getValue();\r\n");
      out.write("	    var endTime=screenObjects.getScreenObject(\"fromtime\").getValue()+\" 11:59 PM\";\r\n");
      out.write("	    var branch=screenObjects.getScreenObject(\"branch\").getTag();\r\n");
      out.write("	    var tranDate=screenObjects.getScreenObject(\"trandate\").getValue();\r\n");
      out.write("		$.ajax({\r\n");
      out.write("            url: \"/waggle/service/account/dayend\",\r\n");
      out.write("            type: \"POST\",\r\n");
      out.write("            async: false,\r\n");
      out.write("            contentType:\"application/x-www-form-urlencoded\",\r\n");
      out.write("            data: \"&branchcode=\"+branch+\"&fromtime=\"+startTime+\"&totime=\"+endTime+\"&trandate=\"+tranDate,\r\n");
      out.write("            success: function (r) {\r\n");
      out.write("				data=r;		\r\n");
      out.write("            }\r\n");
      out.write("        });			\r\n");
      out.write("		if(data.status==\"Success\"){\r\n");
      out.write("			alert(\"Day End Processed Successfully\");\r\n");
      out.write("	    }else{\r\n");
      out.write("	    	alert(data.message);\r\n");
      out.write("	    }						\r\n");
      out.write("	}\r\n");
      out.write("	function doCensus(){\r\n");
      out.write("	    var data;\r\n");
      out.write("		$.ajax({\r\n");
      out.write("            url: \"/waggle/service/discharge/updatebalances?branchcode=1\",\r\n");
      out.write("            type: \"GET\",\r\n");
      out.write("            async: false,\r\n");
      out.write("            success: function (r) {\r\n");
      out.write("				data=r;		\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("		if(data==\"Success\"){\r\n");
      out.write("			alert(\"Census Generated Successfully\");\r\n");
      out.write("	    }else{\r\n");
      out.write("	    	alert(\"Census not completed\");\r\n");
      out.write("	    }						\r\n");
      out.write("	}\r\n");
      out.write("	function setDefaultBranch(){\r\n");
      out.write("		var branch=screenObjects.getScreenObject(\"branch\");\r\n");
      out.write("		var location=screenObjects.getScreenObject(\"location\");\r\n");
      out.write("		branch.setTag(defbranch[0][1]);\r\n");
      out.write("		branch.setValue(defbranch[0][0]);\r\n");
      out.write("		location.setTag(defbranch[0][3]);\r\n");
      out.write("		location.setValue(defbranch[0][2]);	\r\n");
      out.write("	}\r\n");
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
