<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>北理速运经理界面</title>
<link href="/expresscompany/css/style.css" rel="stylesheet" type="text/css" />
	    <style type ="text/css">
	    *{margin:0;padding:0;}
	    </style>
</head>
<body>   
<!-- 网页头部开始 -->
	<div id="header">
		<div id="header1">
			<center>
					<img width=250px height=120px  src="/expresscompany/images/Logo.jpg">
			</center>
		</div>
		<div id="header2">
		<br/>
		<br/>
		<center>
		<a href="xxx.html"><font id="p4">登录</font></a>
		<a href="xxx.html"><font id="p4">注册</font></a>
		</center>
		</div>
	</div>
	<!-- 网页头部结束 -->
	<!-- 导航条开始 -->
	
	<table align="center" bgcolor="#444444" width="100%" height="35px">
			<tr>
				<th><a href="/expresscompany/page/foreground/index.jsp"><font color="white">首页</font></a></th>
				<th><a href="check.html"><font color="white">运单追踪</font></a></th>
				<th><a href="sender.html"><font color="white">自助寄件</font></a></th>
				<th><a href="xxx.html"><font color="white">运费查询</font></a></th>
				<th><a href="xxx.html"><font color="white">关于我们</font></a></th>
			</tr>
		</table>
		
	<!-- 导航条结束 --> 
<div id="bigdiv">
  <div id="leftdiv">
  <table id="left-table" align="center" border="3" >
  <tr>
  <th>功能    列表</th>
  </tr>
  <tr>
  <td><s:a action="enterWebsiteStaff"  namespace="/staffmanage" target="showNotice">&nbsp;&nbsp;员工管理&nbsp;&nbsp;</s:a></td>
  </tr>
   <tr>
  <td><s:a action="getProvince"  namespace="/banchesmanage" target="showNotice">&nbsp;&nbsp;网点管理&nbsp;&nbsp;</s:a></td>
  </tr>
  <tr>
  <td><a href="/expresscompany/page/background/wayBill.jsp" target="showNotice">查看运单信息</a></td>
  </tr>
  </table>
    </div>
<div id="rightdiv"> 
<!-- <iframe name="showNotice" src="staff.jsp" height="800px" width="100%" frameborder="0" marginheight="0" marginwidth="0"  scrolling="yes"/> 
 -->
 <iframe name="showNotice" src="/expresscompany/page/background/firstmanagerpage.html" height="800px" width="100%" frameborder="0" marginheight="0" marginwidth="0" scrolling="yes"></iframe> 
  </div> 
 
</div>


<div id="bottom">
	<table align="center" bgcolor="#444444" width="100%">
			<tr>
				<th><font color="white">网站上所有信息为北理速运公司所有，翻版必究！！！</font></th>
			</tr>
		</table>
</div>


</body>
</html>
