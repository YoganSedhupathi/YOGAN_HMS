/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.9
 * Generated at: 2024-02-07 10:10:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class billPayments_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <title>Bill Payments</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");

	String code=(String)request.getParameter("code");
	String branch=(String)request.getParameter("branch");

      out.write("\r\n");
      out.write("<script src=\"js/inputvalidation.js\"></script>\r\n");
      out.write("<script src=\"js/tenderdialog.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"card border-0 shadow\">\r\n");
      out.write("  <div class=\"card-body\">\r\n");
      out.write("    <!--Header-->\r\n");
      out.write("    <div class=\"row w-100\">\r\n");
      out.write("      <div class=\"col-md-6 d-flex align-items-center\">\r\n");
      out.write("        <h4 class=\"header-title\">Bill Payments</h4>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div  class=\"col-md-6 text-right\" id=\"addGrp\"></div>\r\n");
      out.write("    \r\n");
      out.write("    </div>\r\n");
      out.write("    <!--Header End-->\r\n");
      out.write("    <!--Content -->\r\n");
      out.write("      <div class=\"row lpage\" id=\"jqcontainer\" style=\"display:none;\">\r\n");
      out.write("        <div class=\"table-container\">\r\n");
      out.write("          <div id=\"xyz\" class=\"w-100\">\r\n");
      out.write("\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>	\r\n");
      out.write("			<!--Listing End-->\r\n");
      out.write("		<!--Content Start-->	\r\n");
      out.write("      <div id=\"callback\">\r\n");
      out.write("        <div id=\"divHide\">\r\n");
      out.write("          <div  id=\"divFirst\">\r\n");
      out.write("        <div class=\"row w-100\">\r\n");
      out.write("          <div class=\"col-sm-3 col-md-3 col-lg-3\">                    \r\n");
      out.write("            <div id=\"group1\" class=\"cBor\"></div>\r\n");
      out.write("            <div id=\"dummyDiv\" class=\"\"></div>\r\n");
      out.write("          </div>\r\n");
      out.write("           <div class=\"col-sm-3 col-md-3 col-lg-3\">                       \r\n");
      out.write("            <div id=\"paymentdetail\" class=\"cBor\">\r\n");
      out.write("            </div>\r\n");
      out.write("           </div>\r\n");
      out.write("            <div class=\"col-sm-6 col-md-6 col-lg-6 cBor\" id=\"cashdetails\">\r\n");
      out.write("               <div id=\"bankdetails\" class=\"\">\r\n");
      out.write("               </div>\r\n");
      out.write("               <div id=\"chequedetails\" class=\"\">  \r\n");
      out.write("               </div>\r\n");
      out.write("               <div id=\"carddetails\" class=\"\">    \r\n");
      out.write("               </div>\r\n");
      out.write("           </div>\r\n");
      out.write("          \r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write("    </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("     <div class=\"row\">\r\n");
      out.write("            <div class=\"table-container\">\r\n");
      out.write("                <div class=\"col-md-12 col-sm-12 acarea\" id=\"outstanding\"></div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("     </div>\r\n");
      out.write("\r\n");
      out.write("     <div class=\"row w-100 mt-3\">\r\n");
      out.write("          <div class=\"col-md-12\">\r\n");
      out.write("            <div class=\"hstack justify-content-start\">\r\n");
      out.write("              <div id=\"group2\" style=\"display:block;\"></div>\r\n");
      out.write("              <div  id=\"group7\" ></div>\r\n");
      out.write("              <div  id=\"group3\" style=\"display:none;\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("         <div class=\"row w-100 mt-3\">\r\n");
      out.write("          <div class=\"col-md-5\">\r\n");
      out.write("            <div class=\"hstack justify-content-start\">\r\n");
      out.write("              <div id=\"saveGrp\">\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"col-md-7\">\r\n");
      out.write("              <div class=\"hstack justify-content-end\">\r\n");
      out.write("                                <div class=\"gap-2 bg-white\">\r\n");
      out.write("                                    <div class=\"card-total px-3 rounded-3\">\r\n");
      out.write("                                            <span class=\"text-dark\">Net Amount:</span>\r\n");
      out.write("                                            <span class=\"net-amount\" id=\"netAmt\">0.00</span>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("          </div>\r\n");
      out.write("      </div>\r\n");
      out.write("  \r\n");
      out.write("      <!--Content End-->                    \r\n");
      out.write("        </div>  \r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id='ttender'>\r\n");
      out.write("<div id='tenderdlg'>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<script>\r\n");
      out.write("$('.butt_sav').click(function(e){\r\n");
      out.write("	e.preventDefault();\r\n");
      out.write("});\r\n");
      out.write("$('.butt_can').click(function(e){\r\n");
      out.write("	e.preventDefault();\r\n");
      out.write("});			 \r\n");
      out.write("var l=new FlexUI.Ajax();\r\n");
      out.write("var v=l.callAjax(\"GET\",\"/inventory/service/ajax\",\"ic=0&id=userdefbranch\");\r\n");
      out.write("var defbranch=v.data;\r\n");
      out.write("\r\n");
      out.write("  var sProps={title:{height:25,width:100,name:\"Invoice\"},container:{id:\"callback\",isdialog:false},js:\"js/validations/billpayments.js\",screen:[\r\n");
      out.write("  {name:\"group1\",title:\"\",pcolumns:0,height:30,width:98,minWidth:500,minHeight:200,colWidth:45,float:\"left\",backColor:\"biege\",contentType:\"Fields\",\r\n");
      out.write("  fields:[\r\n");
      out.write("  {colno:0,name:\"code\",inputType:0,type:\"INT\",caption:\"Code\",mandatory:false,defaultValue:\"0\",\"maxValue\":0,\"textLength\":10,\"decimalLength\":0,\"visible\":false,\"readOnly\":true,\"chkTag\":false,nf:\"branch\"},\r\n");
      out.write("  {colno:0,name:\"trantype\",inputType:0,type:\"INT\",caption:\"Type\",mandatory:false,defaultValue:\"2\",\"maxValue\":0,\"textLength\":10,\"decimalLength\":0,\"visible\":false,\"readOnly\":true,\"chkTag\":false,nf:\"branch\"},\r\n");
      out.write("  {colno:0,name:\"dummy1\",inputType:4,type:\"TEXT\",caption:\"\",keys:\"Cash~Cheque\",values:\"C~Q\",defaultValue:\"C\",\"readOnly\":false,\"chkTag\":false,nf:\"documents\",visible:false},\r\n");
      out.write("  {colno:0,name:\"account\",inputType:0,type:\"LOV\",caption:\"Name\",mandatory:true,defaultValue:\"\",\"maxValue\":0,\"textLength\":100,\"decimalLength\":0,\"visible\":true,\"readOnly\":false,\"chkTag\":true,nf:\"go\",lovOptions:{url:\"/inventory/service/ajax\",ajax:\"supplier\",scrollEnabled:true,searchFromList:false,dsi:1,params:[],results:[{tgt:\"account\",tt:true,id:\"0\"},{tgt:\"account\",tt:false,id:\"1\"},{tgt:\"mobile\",tt:false,id:\"2\"},{tgt:\"address\",tt:false,id:\"3,4,5,6\",m:true},{tgt:\"address1\",tt:false,id:\"3\"},{tgt:\"address2\",tt:false,id:\"4\"},{tgt:\"city\",tt:false,id:\"5\"},{tgt:\"pincode\",tt:false,id:\"6\"},{tgt:\"creditdays\",tt:false,id:\"7\"},{tgt:\"showcreditdays\",tt:false,id:\"7\"}]}},\r\n");
      out.write("  {colno:0,name:\"address\",inputType:4,type:\"SPAN\",caption:\"Address\",mandatory:false,defaultValue:\"\",\"maxValue\":0,\"textLength\":100,\"decimalLength\":0,\"visible\":true,\"readOnly\":true,\"chkTag\":false,nf:\"address2\"},  \r\n");
      out.write("  {colno:1,name:\"address1\",inputType:0,type:\"TEXT\",caption:\"Building\",mandatory:false,defaultValue:\"\",\"maxValue\":0,\"textLength\":100,\"decimalLength\":0,\"visible\":false,\"readOnly\":true,\"chkTag\":false,nf:\"address2\"},\r\n");
      out.write("  {colno:0,name:\"address2\",inputType:0,type:\"TEXT\",caption:\"Street\",mandatory:false,defaultValue:\"\",\"maxValue\":0,\"textLength\":100,\"decimalLength\":0,\"visible\":false,\"readOnly\":true,\"chkTag\":false,nf:\"city\"},\r\n");
      out.write("  {colno:1,name:\"city\",inputType:0,type:\"TEXT\",caption:\"City\",mandatory:false,defaultValue:\"\",\"maxValue\":0,\"textLength\":50,\"decimalLength\":0,\"visible\":false,\"readOnly\":true,\"chkTag\":false,nf:\"pincode\"},\r\n");
      out.write("  {colno:0,name:\"pincode\",inputType:0,type:\"TEXT\",caption:\"PinCode\",mandatory:false,defaultValue:\"0\",\"maxValue\":0,\"textLength\":10,\"decimalLength\":0,\"visible\":false,\"readOnly\":true,\"chkTag\":false,nf:\"creditdays\"},\r\n");
      out.write("  {colno:1,name:\"creditdays\",inputType:0,type:\"INT\",caption:\"Credit Days\",mandatory:false,defaultValue:\"0\",\"maxValue\":0,\"textLength\":10,\"decimalLength\":0,\"visible\":false,\"readOnly\":false,\"chkTag\":false,nf:\"go\"},\r\n");
      out.write("  {colno:1,name:\"showcreditdays\",inputType:4,type:\"INT\",caption:\"Credit Days\",mandatory:false,defaultValue:\"0\",\"maxValue\":0,\"textLength\":10,\"decimalLength\":0,\"visible\":false,\"readOnly\":false,\"chkTag\":false,nf:\"go\"},\r\n");
      out.write("  \r\n");
      out.write("  ]},\r\n");
      out.write("    {name:\"dummyDiv\",title:\"\",pcolumns:0,height:30,width:98,minWidth:500,minHeight:200,colWidth:33,float:\"left\",backColor:\"biege\",contentType:\"Fields\",\r\n");
      out.write("  fields:[\r\n");
      out.write("  {name:\"dummy1\",inputType:4,type:\"TEXT\",caption:\"\",keys:\"Cash~Cheque\",values:\"C~Q\",defaultValue:\"C\",\"readOnly\":false,\"chkTag\":false,nf:\"documents\",visible:false},\r\n");
      out.write("  {name:\"dummy2\",inputType:4,type:\"TEXT\",caption:\"\",keys:\"Cash~Cheque\",values:\"C~Q\",defaultValue:\"C\",\"readOnly\":false,\"chkTag\":false,nf:\"documents\",visible:false},\r\n");
      out.write("  {name:\"dummy3\",inputType:4,type:\"TEXT\",caption:\"\",keys:\"Cash~Cheque\",values:\"C~Q\",defaultValue:\"C\",\"readOnly\":false,\"chkTag\":false,nf:\"documents\",visible:false},\r\n");
      out.write("  {name:\"go\",inputType:3,caption:\"Go\",onclick:\"loadSupplierOutstanding\",visible:true}\r\n");
      out.write("  ]},\r\n");
      out.write("  {name:\"branch\",title:\"\",height:30,width:98,minWidth:500,minHeight:200,colWidth:45,float:\"left\",backColor:\"biege\",contentType:\"Fields\",\r\n");
      out.write("  fields:[{colno:0,name:\"branch\",inputType:0,type:\"LOV\",caption:\"\",mandatory:true,defaultValue:\"0\",\"maxValue\":0,\"textLength\":10,\"decimalLength\":0,\"visible\":true,\"readOnly\":false,\"chkTag\":true,nf:\"refno\",lovOptions:{url:\"/inventory/service/ajax\",ajax:\"userbranch\",scrollEnabled:true,searchFromList:false,dsi:0,params:[],results:[]}}\r\n");
      out.write("  ]},\r\n");
      out.write("  {name:\"paymentdetail\",title:\"\",height:30,width:98,minWidth:500,minHeight:200,colWidth:45,float:\"left\",backColor:\"biege\",contentType:\"Fields\",\r\n");
      out.write("  fields:[\r\n");
      out.write("  {name:\"trandate\",inputType:0,type:\"DATE\",caption:\"Payment Date\",format:\"dd/mm/yyyy\",defaultValue:\"\",\"chkTag\":false,visible:true,nf:\"refno\"},\r\n");
      out.write("  {name:\"refno\",inputType:0,type:\"TEXT\",caption:\"Reference No\",mandatory:false,defaultValue:\"0\",\"maxValue\":0,\"textLength\":20,\"decimalLength\":0,\"visible\":true,\"readOnly\":true,\"chkTag\":false,nf:\"mode\"},\r\n");
      out.write("  {name:\"acrefno\",inputType:0,type:\"INT\",caption:\"VNo\",mandatory:false,defaultValue:\"0\",\"maxValue\":0,\"textLength\":20,\"decimalLength\":0,\"visible\":false,\"readOnly\":true,\"chkTag\":false,nf:\"mode\"},\r\n");
      out.write("  {name:\"acno\",inputType:0,type:\"INT\",caption:\"VNo\",mandatory:false,defaultValue:\"0\",\"maxValue\":0,\"textLength\":20,\"decimalLength\":0,\"visible\":false,\"readOnly\":true,\"chkTag\":false,nf:\"mode\"},\r\n");
      out.write("  {name:\"duebills\",inputType:1,type:\"TEXT\",caption:\"Filter \",keys:\"Due Bills~All Bills\",values:\"D~A\",defaultValue:\"D\",\"readOnly\":false,\"chkTag\":false,nf:\"account\",visible:false},\r\n");
      out.write("  {name:\"mode\",inputType:1,type:\"TEXT\",caption:\"Payment Mode\",keys:\"Cash~Cheque~Credit Card\",values:\"CA~CQ~CC\",defaultValue:\"CA\",\"readOnly\":false,\"chkTag\":false,nf:\"account\",visible:true,onchange:\"onModeChange\"}\r\n");
      out.write("  ]\r\n");
      out.write("  },\r\n");
      out.write("  {name:\"chequedetails\",title:\"\",pcolumns:2,height:30,width:98,minWidth:500,minHeight:200,colWidth:45,float:\"left\",backColor:\"biege\",contentType:\"Fields\",\r\n");
      out.write("  fields:[\r\n");
      out.write("  {colno:0,name:\"chequeno\",inputType:0,type:\"TEXT\",caption:\"Cheque No\",mandatory:false,defaultValue:\"\",\"maxValue\":0,\"textLength\":20,\"decimalLength\":0,\"visible\":true,\"readOnly\":false,\"chkTag\":false,nf:\"chequedate\"},\r\n");
      out.write("  {colno:0,name:\"chequedate\",inputType:0,type:\"DATE\",caption:\"Cheque Date\",format:\"dd/mm/yyyy\",defaultValue:\"\",\"chkTag\":false,visible:true,nf:\"bankname\"},  \r\n");
      out.write("  {colno:1,name:\"bankname\",inputType:0,type:\"TEXT\",caption:\"Bank Name\",mandatory:false,defaultValue:\"\",\"maxValue\":0,\"textLength\":50,\"decimalLength\":0,\"visible\":true,\"readOnly\":false,\"chkTag\":false,nf:\"bankbranch\"},\r\n");
      out.write("  {colno:1,name:\"bankbranch\",inputType:0,type:\"TEXT\",caption:\"Branch Name\",mandatory:false,defaultValue:\"\",\"maxValue\":0,\"textLength\":50,\"decimalLength\":0,\"visible\":true,\"readOnly\":false,\"chkTag\":false,nf:\"outstanding_data\"}\r\n");
      out.write("  ]\r\n");
      out.write("  },\r\n");
      out.write("  {name:\"carddetails\",title:\"\",height:30,width:98,minWidth:500,minHeight:200,colWidth:45,float:\"left\",backColor:\"biege\",contentType:\"Fields\",\r\n");
      out.write("  fields:[\r\n");
      out.write("  {colno:0,name:\"cardbank\",inputType:0,type:\"TEXT\",caption:\"Bank Name\",mandatory:false,defaultValue:\"\",\"maxValue\":0,\"textLength\":100,\"decimalLength\":0,\"visible\":true,\"readOnly\":false,\"chkTag\":false,nf:\"cardtype\"},\r\n");
      out.write("  {colno:0,name:\"cardtype\",inputType:0,type:\"TEXT\",caption:\"Card Type\",mandatory:false,defaultValue:\"\",\"maxValue\":0,\"textLength\":20,\"decimalLength\":0,\"visible\":true,\"readOnly\":false,\"chkTag\":false,nf:\"cardtranno\"},\r\n");
      out.write("  {colno:1,name:\"cardtranno\",inputType:0,type:\"TEXT\",caption:\"Transaction No\",mandatory:false,defaultValue:\"\",\"maxValue\":0,\"textLength\":20,\"decimalLength\":0,\"visible\":true,\"readOnly\":false,\"chkTag\":false,nf:\"outstanding_data\"}\r\n");
      out.write("  ]\r\n");
      out.write("  },\r\n");
      out.write("  {name:\"bankdetails\",title:\"\",height:30,width:98,minWidth:500,minHeight:200,colWidth:45,float:\"left\",backColor:\"biege\",contentType:\"Fields\",\r\n");
      out.write("  fields:[\r\n");
      out.write("  {colno:0,name:\"bankledger\",inputType:0,type:\"LOV\",caption:\"Bank Ledger\",mandatory:false,defaultValue:\"0\",\"maxValue\":0,\"textLength\":100,\"decimalLength\":0,\"visible\":true,\"readOnly\":false,\"chkTag\":true,nf:\"remarks\",lovOptions:{url:\"/inventory/service/ajax\",ajax:\"banks\",scrollEnabled:true,searchFromList:false,dsi:0,params:[],results:[{tgt:\"bankledger\",tt:true,id:\"1\"},{tgt:\"bankledger\",tt:false,id:\"0\"}]}},\r\n");
      out.write("  ]\r\n");
      out.write("  },\r\n");
      out.write("  {name:\"outstanding\",title:\"\",height:30,width:98,minWidth:500,minHeight:250,colWidth:50,float:\"left\",backColor:\"biege\",contentType:\"Table\",tableProperties:{rowEmptyCheckColumn:1,enableAddRow:false,enableDeleteRow:false,columns:[\r\n");
      out.write("    {order:\"0\",id: \"sno\", name: \"SNo\", field: \"sno\",defaultValue:\"0\",\"inputType\":0,\"type\":\"INT\",\"maxValue\":0,\"textLength\":10,\"decimalLength\":0,\"visible\":true,\"readOnly\":true,\"mandatory\":true,\"chkTag\":false,width:50,sno:true},\r\n");
      out.write("    {order:\"1\",id: \"billno\", name: \"BillNo\", field: \"billno\",defaultValue:\"0\",\"inputType\":0,\"type\":\"TEXT\",\"maxValue\":0,\"textLength\":10,\"decimalLength\":0,\"visible\":true,\"readOnly\":true,\"mandatory\":false,width:100,chkTag:false},\r\n");
      out.write("    {order:\"2\",id: \"billdate\", name: \"BillDate\", field: \"billdate\",defaultValue:\"0\",\"inputType\":0,\"type\":\"TEXT\",\"maxValue\":0,\"textLength\":10,\"decimalLength\":0,\"visible\":true,\"readOnly\":true,\"mandatory\":false,width:50,chkTag:false},\r\n");
      out.write("    {order:\"3\",id: \"amount\", name: \"Amount\", field: \"amount\",defaultValue:\"0\",\"inputType\":0,\"type\":\"TEXT\",\"maxValue\":0,\"textLength\":10,\"decimalLength\":0,\"visible\":true,\"readOnly\":true,\"mandatory\":false,width:100,chkTag:false},\r\n");
      out.write("    {order:\"4\",id: \"ppaid\", name: \"Adjusted\", field: \"ppaid\",defaultValue:\"0\",\"inputType\":0,\"type\":\"TEXT\",\"maxValue\":0,\"textLength\":10,\"decimalLength\":0,\"visible\":true,\"readOnly\":true,\"mandatory\":false,width:100,chkTag:false},\r\n");
      out.write("    {order:\"5\",id: \"balance\", name: \"Balance\", field: \"balance\",defaultValue:\"0\",\"inputType\":0,\"type\":\"TEXT\",\"maxValue\":0,\"textLength\":10,\"decimalLength\":0,\"visible\":true,\"readOnly\":true,\"mandatory\":false,width:100,chkTag:false},\r\n");
      out.write("    {order:\"6\",id: \"sbalance\", name: \"sbalance\", field: \"sbalance\",defaultValue:\"\",\"inputType\":0,\"type\":\"TEXT\",\"maxValue\":0,\"textLength\":10,\"decimalLength\":0,\"visible\":false,\"readOnly\":true,\"mandatory\":false,width:0,chkTag:false},\r\n");
      out.write("    {order:\"7\",id: \"selected\", name: \"Pay\", field: \"selected\",defaultValue:\"0\",\"inputType\":2,\"type\":\"TEXT\",\"maxValue\":0,\"textLength\":10,\"decimalLength\":0,\"visible\":true,\"readOnly\":false,\"mandatory\":false,width:20,chkTag:false,validation:\"validateSelected\"},    \r\n");
      out.write("    {order:\"8\",id: \"paid\", name: \"Paid\", field: \"paid\",defaultValue:\"0\",\"inputType\":0,\"type\":\"DECIMAL\",\"maxValue\":9999999.99,\"textLength\":10,\"decimalLength\":2,\"visible\":true,\"readOnly\":false,\"mandatory\":false,width:100,chkTag:false,onchange:\"onPaidChange\"},\r\n");
      out.write("    {order:\"9\",id: \"osdno\", name: \"osdno\", field: \"osdno\",defaultValue:\"0\",\"inputType\":0,\"type\":\"INT\",\"maxValue\":0,\"textLength\":10,\"decimalLength\":0,\"visible\":false,\"readOnly\":true,\"mandatory\":true,width:0,chkTag:false},\r\n");
      out.write("    {order:\"10\",id: \"osdtype\", name: \"osdtype\", field: \"osdtype\",defaultValue:\"\",\"inputType\":0,\"type\":\"TEXT\",\"maxValue\":0,\"textLength\":10,\"decimalLength\":0,\"visible\":false,\"readOnly\":true,\"mandatory\":true,width:0,chkTag:false}\r\n");
      out.write("    ]}},\r\n");
      out.write("      {name:\"group2\",title:\"\",pcolumns:3,colcss:\"col-sm-4 col-md-4 col-lg-4\",height:15,width:45,minWidth:250,minHeight:50,colWidth:45,float:\"left\",backColor:\"biege\",contentType:\"Fields\",\r\n");
      out.write("  fields:[\r\n");
      out.write("  {colno:0,name:\"discount\",inputType:0,type:\"DECIMAL\",caption:\"Discount\",mandatory:false,defaultValue:\"0\",\"maxValue\":0,\"textLength\":10,\"decimalLength\":2,\"visible\":true,\"readOnly\":false,\"chkTag\":false,nf:\"charges\",colspan:2,onchange:\"onPaidChange\"},\r\n");
      out.write("  {colno:1,name:\"charges\",inputType:0,type:\"NEGDEC\",caption:\"Charges\",mandatory:false,defaultValue:\"0\",\"maxValue\":0,\"textLength\":10,\"decimalLength\":2,\"visible\":true,\"readOnly\":false,\"chkTag\":false,nf:\"charges\",colspan:2,onchange:\"onPaidChange\"},\r\n");
      out.write("  {colno:2,name:\"remarks\",inputType:0,type:\"TEXTAREA\",caption:\"Note \",mandatory:false,defaultValue:\"\",\"maxValue\":0,\"textLength\":500,\"decimalLength\":0,\"visible\":true,\"readOnly\":false,\"chkTag\":false,nf:\"\"}\r\n");
      out.write("  ]\r\n");
      out.write("  },\r\n");
      out.write("  {name:\"group6\",title:\"\",height:20,width:45,minWidth:250,minHeight:50,colWidth:98,float:\"right\",backColor:\"biege\",contentType:\"Fields\",\r\n");
      out.write("  fields:[  \r\n");
      out.write("  {name:\"total\",inputType:0,type:\"DECIMAL\",caption:\"Total:\",mandatory:true,defaultValue:\"0\",\"maxValue\":0,\"textLength\":10,\"decimalLength\":2,\"visible\":true,\"readOnly\":true,\"chkTag\":false,nf:\"totalamt\"},    \r\n");
      out.write("  {name:\"totalamt\",inputType:0,type:\"DECIMAL\",caption:\"Net Amount\",mandatory:true,defaultValue:\"0\",\"maxValue\":0,\"textLength\":10,\"decimalLength\":2,\"visible\":true,\"readOnly\":true,\"chkTag\":false}\r\n");
      out.write("  ]}]};\r\n");
      out.write("  /*\r\n");
      out.write("  ,\r\n");
      out.write("    {name:\"group4\",height:15,width:80,minWidth:500,minHeight:50,colWidth:15,float:\"left\",backColor:\"beige\",contentType:\"Fields\",fields:[\r\n");
      out.write("    {name:\"add\",inputType:3,caption:\"Add\",onclick:\"add\",visible:true},\r\n");
      out.write("    {name:\"save\",inputType:3,caption:\"Save\",onclick:\"save\",visible:true},\r\n");
      out.write("    {name:\"edit\",inputType:3,caption:\"Edit\",onclick:\"edit\",visible:true},\r\n");
      out.write("    {name:\"Delete\",inputType:3,caption:\"Delete\",onclick:\"delete1\",visible:true}\r\n");
      out.write("    ]}\r\n");
      out.write("    */\r\n");
      out.write("  var screenProps=changeScreenAttributes(610002,sProps);\r\n");
      out.write("  var payments=new FlexUI.Screen(\"xyz\",screenProps);\r\n");
      out.write("  setDefaultBranch();\r\n");
      out.write("  function loadSupplierOutstanding(rcode,rbranch){\r\n");
      out.write("  	var code=rcode;\r\n");
      out.write("  	var branch=rbranch;\r\n");
      out.write("  	if(code==\"go\"){\r\n");
      out.write("    	code=screenObjects.getScreenObject(\"account\").getTag();\r\n");
      out.write("    	branch=screenObjects.getScreenObject(\"branch\").getTag();\r\n");
      out.write("    }\r\n");
      out.write("    if(code!='0' && code!=\"\" && payments.getOperation()!=\"EDIT\"){\r\n");
      out.write("    	showLoader();\r\n");
      out.write("	  	var	url=\"/inventory/service/supplier/outstanding\";\r\n");
      out.write("	  	var	data=\"code=\"+code+\"&branch=\"+branch;\r\n");
      out.write("		var v=l.callAjax(\"GET\",url,data);\r\n");
      out.write("		payments.loadData(v);\r\n");
      out.write("		hideLoader();\r\n");
      out.write("	 }\r\n");
      out.write("	 return true;\r\n");
      out.write("  }    \r\n");
      out.write("  function goBack(){\r\n");
      out.write("        $(\"#bodyContainer\").html(\"\");\r\n");
      out.write("        $(\"#bodyContainer\").load(\"/inventory/supplierOutstanding.do\",onSuccess);\r\n");
      out.write("        $(\"#currentMenuId\").val(610004);\r\n");
      out.write("  }\r\n");
      out.write("  ");
if(code!=null){
      out.write("\r\n");
      out.write("  	loadSupplierOutstanding('");
      out.print(code);
      out.write('\'');
      out.write(',');
      out.write('\'');
      out.print(branch);
      out.write("');\r\n");
      out.write("  ");
}
      out.write("\r\n");
      out.write(" </script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
