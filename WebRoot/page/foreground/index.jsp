<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>北理速运</title>
	    <style type ="text/css">
	    *{margin:0;padding:0;}
			.inline_div{
				display:inline;
			}
			#header{
				width:100%;
				height:120px;
				float:left;
				
			}
			#header1,#header2{
				width:50%;
				
				float:left;
			}
			#p4{
				font-size:20px;
				font-weight:600;
				color:#444444;
			}
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
		<br>
		<br>
		<center>
		<a href="/expresscompany/page/foreground/login.jsp"><font id="p4">登录</font></a>
		<a href="/expresscompany/page/foreground/register.jsp"><font id="p4">注册</font></a>
		</center>
		</div>
	</div>
	<!-- 网页头部结束 -->
	<!-- 导航条开始 -->
	<table align="center" bgcolor="#444444" width="100%" height="35px">
			<tr>
				<th><a href="/expresscompany/page/foreground/index.jsp"><font color="white">首页</font></a></th>
				<th><a href="/expresscompany/page/foreground/queryExpress.jsp" target="showiframe"><font color="white">运单追踪</font></a></th>
				<th><s:a action="getall" namespace="/address" target="showiframe"><font color="white">自助寄件</font></s:a></th>
				<th><a href="/expresscompany/page/foreground/queryFreight.jsp" target="showiframe"><font color="white">运费查询</font></a></th>
				<th><a href="/expresscompany/page/foreground/aboutUs.jsp" target="showiframe"><font color="white">关于我们</font></a></th>
			</tr>
		</table>
	<!-- 导航条结束 -->
    <script type="text/javascript">
function SetWinHeight(obj)

{

var win=obj;

if (document.getElementById)
{

if (win && !window.opera)

{

if (win.contentDocument && win.contentDocument.body.offsetHeight) 
   
win.height = win.contentDocument.body.offsetHeight; 
    
else if(win.Document && win.Document.body.scrollHeight)
   
win.height = win.Document.body.scrollHeight;

}

}

}
</script>


  <iframe  name="showiframe"  width="100%" height="100%" frameborder="0"  id="win" onload="Javascript:SetWinHeight(this)"  scrolling="no" marginheight="0" marginwidth="0"src="/expresscompany/page/foreground/showIndex.jsp" ></iframe>
    
	<!-- 尾部开始 -->
	<table align="center" bgcolor="#444444" width="100%" height="35px">
			<tr>
				<th><font color="white">网站上所有信息为北理速运公司所有，翻版必究！！！</font></th>
			</tr>
		</table>
	<!-- 尾部结束 -->
  </body>
</html>
