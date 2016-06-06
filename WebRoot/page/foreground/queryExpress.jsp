<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
	<head>
		<title>北理速运</title>
	    <style type ="text/css">
html,body{height:90%;overflow:hidden;}
			#p1{
				font-size:32px;
				font-weight:700;
				color:brown;
			}
			
			#p3{
				font-size:20px;
				font-weight:600;
			}
			
			#p4{
				font-size:20px;
				font-weight:600;
				color:#444444;
			}
			
			#mid {background-color:#EEEEEE;height:350px;width:150px;float:left;}
			#left {background-color:white;height:350px;width:350px;float:left;}
			#right {background-color:white;height:350px;width:400px;float:left;}
	    </style>
    </head>
    <body>
	<br><br>
	
	<!-- 查询快件页面 -->

	<div >
		<div id=left>
		
		</div>
		<div id="mid">
			<h1 id="p1">查询</h1>
			<ul>
			<li id="p3"><a href="queryExpress.jsp" style="text-decoration:none">查询快件</a></li>
			<li id="p3"><a href="queryFreight.jsp" style="text-decoration:none">查询运费</a></li>
			<li id="p3"><s:a action="tobranchProvinceCity"  namespace="/provincecitymanage" >查询网点</s:a></li>
			<li id="p3"><s:a action="tophoneProvinceCity"  namespace="/provincecitymanage" >查询客服电话</s:a></li>

			</ul>
  
			
		</div>
		<div id=right> 
			<ul>
			<s:form action="getLogisitcs" namespace="/logisitcsmanage" method="post" target="showLogistics" >
			<b id="p3">运单号&nbsp;&nbsp;</b>
			<s:textfield name="oid"/>
			<br>
			<br>
			<s:submit style="font-size:20" value="查询"/>
			</s:form>
			</ul>
		</div>	
	</div>
	
	<div >
		<center>
		<h1>物流信息</h1>
		<iframe name="showLogistics" frameborder=0 width=500 height=250 marginheight=0 marginwidth=0 scrolling=no src="logistics.html"  ></iframe>
		</center>
	</div>

    </body>
</html>
