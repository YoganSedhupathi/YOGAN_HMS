/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.9
 * Generated at: 2023-08-21 05:30:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import java.util.Random;

public final class configuration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.Random");
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
      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("    <head>\r\n");
      out.write("    <title>CISSOL Technologies</title>\r\n");
      out.write("	<link rel=\"shortcut icon\" href=\"images/titleicon.gif\">\r\n");
      out.write("  	<link rel=\"icon\" href=\"images/titleicon.gif\">\r\n");
      out.write("	 <!-- <link rel=\"stylesheet\" href=\"css/jquery-ui.css\" type=\"text/css\"/>\r\n");
      out.write("	 <link rel=\"stylesheet\" href=\"css/jqgrid/ui.jqgrid.css\" type=\"text/css\"/>\r\n");
      out.write("	 <link href=\"css/styles.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("	 <link href=\"css/style1.css\" rel=\"stylesheet\" type=\"text/css\" />	 \r\n");
      out.write("	 \r\n");
      out.write("	  -->\r\n");
      out.write("	 \r\n");
      out.write("	 \r\n");
      out.write("	\r\n");
      out.write("    <link href=\"css/xgrid.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/jqgrid/ui.jqgrid.css\" type=\"text/css\"/>\r\n");
      out.write("     <link rel=\"stylesheet\" href=\"css/jquery-ui.css\" type=\"text/css\"/>\r\n");
      out.write("     \r\n");
      out.write("     <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"assets/css/icomoon.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"assets/css/font-awesome.css\" rel=\"stylesheet\">\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("    <link href=\"assets/css/custom.css\" rel=\"stylesheet\">\r\n");
      out.write("	 \r\n");
      out.write("	 \r\n");
      out.write("	 \r\n");
      out.write("	 <script type=\"text/javascript\" src=\"js/jquery/jquery-1.8.3.min.js\"></script>\r\n");
      out.write("	 <script src=\"js/jquery/jquery-ui.min.js\"></script>\r\n");
      out.write("	<script src=\"js/jquery/jquery-ui-timepicker-addon.js\"></script>\r\n");
      out.write("	<script src=\"js/jquery/jquery-ui-sliderAccess.js\"></script>\r\n");
      out.write("	<script src=\"js/jqgrid/i18n/grid.locale-en.js\"></script>\r\n");
      out.write("	<script src=\"js/jqgrid/jquery.jqGrid.min.js\"></script>\r\n");
      out.write("	<script type=\"text/javascript\" src=\"js/core.js\"></script>	 \r\n");
      out.write("	<script type=\"text/javascript\" src=\"js/newtext.js\"></script>\r\n");
      out.write("	\r\n");
      out.write("	<script type=\"text/javascript\" src=\"js/table.js\"></script>\r\n");
      out.write("	<script type=\"text/javascript\" src=\"js/lov.js\"></script>\r\n");
      out.write("	<script type=\"text/javascript\" src=\"js/xgrid.js\"></script>\r\n");
      out.write("	<script type=\"text/javascript\" src=\"js/newscreen.js\"></script>\r\n");
      out.write("	<script type=\"text/javascript\" src=\"js/jqimpl.js\"></script>\r\n");
      out.write("	<script type=\"text/javascript\" src=\"js/actions.js\"></script>\r\n");
      out.write("	<script type=\"text/javascript\" src=\"js/dateextn.js\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    \r\n");
      out.write("    <body>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"col-sm-6 col-md-6 col-lg-6 mTBx\">                    \r\n");
      out.write("    	<div id=\"group1\" class=\"panelOrange hcH\">\r\n");
      out.write("    		<div  class=\"form-group extrBT hcHeHo\">\r\n");
      out.write("				<label class=\"col-sm-4 control-label mpRes\">Enable Hamali</label>\r\n");
      out.write("				<div class=\"col-sm-8 mpRes\">\r\n");
      out.write("					<input id=\"enablehamali\" name=\"enablehamali\"  type=\"checkbox\" value=\"0\" class=\"form-control\" onchange=\"changeValue(this);\" />\r\n");
      out.write("				</div>\r\n");
      out.write("		   </div>\r\n");
      out.write("   		</div>\r\n");
      out.write("   </div>\r\n");
      out.write("   <div class=\"clearfix\"></div>  \r\n");
      out.write("   <div id=\"saveGrp\" class=\"mTBx\">\r\n");
      out.write("   		<span>\r\n");
      out.write("			<button type=\"button\" class=\"btn btn-primary mRhAj\" onclick='onSaveClicked()'>Save</button>\r\n");
      out.write("			<button type=\"button\" class=\"btn btn-default\" onclick='clearData()'>Cancel</button>\r\n");
      out.write("		</span>\r\n");
      out.write("   </div>\r\n");
      out.write("  \r\n");
      out.write("<script>\r\n");
      out.write("function saveConfig(){\r\n");
      out.write("		 	var data='{\"savedata\":\"\",';\r\n");
      out.write("		 		data+='\"detail\":[';\r\n");
      out.write("				data+='{\"name\":\"enablehamali\",\"value\":\"'+$('#enablehamali').val()+'\"}';\r\n");
      out.write("				data+=']}';\r\n");
      out.write("				var s=new FlexUI.Ajax();\r\n");
      out.write("			var res=s.callAjax('POST','/inventory/service/config',\"data=\"+escape(data));\r\n");
      out.write("			return res;\r\n");
      out.write("		}\r\n");
      out.write("		function onSaveClicked() {\r\n");
      out.write("	        var valid = saveConfig();\r\n");
      out.write("	        alert(valid.message);\r\n");
      out.write("	        if(valid.result != 'Success'){\r\n");
      out.write("	            return false;\r\n");
      out.write("        	}\r\n");
      out.write("        }\r\n");
      out.write("        function clearData() {\r\n");
      out.write("        	$(\"#bodyContainer\").empty();\r\n");
      out.write("        }\r\n");
      out.write("        function loadOrderData(url,code){\r\n");
      out.write("			if(url==\"\"){\r\n");
      out.write("		  		url=\"/inventory/service/config\";\r\n");
      out.write("		  	}\r\n");
      out.write("		  	var s=new FlexUI.Ajax();\r\n");
      out.write("			var v=s.callAjax(\"GET\",url,\"\");\r\n");
      out.write("			v=v.config;\r\n");
      out.write("			for (var property in v) {\r\n");
      out.write("	   			$('#'+v[property].v).val(v[property].t);\r\n");
      out.write("	   			changeValueonLoad(v[property].v,v[property].t);\r\n");
      out.write("			}\r\n");
      out.write("		}\r\n");
      out.write("		function changeValue(id){\r\n");
      out.write("			if(id.checked){\r\n");
      out.write("				id.value=\"1\";\r\n");
      out.write("			}else{\r\n");
      out.write("				id.value=\"0\";\r\n");
      out.write("			}\r\n");
      out.write("		}\r\n");
      out.write("		function changeValueonLoad(id,value){\r\n");
      out.write("			if($('#'+id+'').attr('type')==\"checkbox\"){\r\n");
      out.write("				if(value==1){\r\n");
      out.write("					$('#'+id+'').attr('checked',\"checked\")\r\n");
      out.write("				}else{\r\n");
      out.write("					$('#'+id+'').removeAttr('checked')\r\n");
      out.write("				}\r\n");
      out.write("			}\r\n");
      out.write("		}\r\n");
      out.write("//defineTabUI();\r\n");
      out.write("loadOrderData(\"\",\"\");\r\n");
      out.write("</script>		      \r\n");
      out.write("    </body>\r\n");
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