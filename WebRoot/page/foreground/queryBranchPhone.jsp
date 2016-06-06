<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<html>
	<head>
		<title>北理速运</title>
	    <style type ="text/css">
	    
	      
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
			#big{margin:0 auto;}
			#mid {background-color:#EEEEEE;height:350px;width:150px;float:left;}
			#left {background-color:white;height:350px;width:350px;float:left;}
			#right {background-color:white;height:350px;width:400px;float:left;}
	    </style>
    </head>
    <body>

	<br><br>
	
	<!-- 查询快件页面 -->

	<div id=big>
		<div id=left>
		
		</div>
		<div id="mid">
			<h1 id="p1">查询</h1>
			<ul>
					<li id="p3"><a href="queryExpress.jsp" style="text-decoration:none">查询快件</a></li>
			<li id="p3"><a href="queryFreight.html" style="text-decoration:none">查询运费</a></li>
			<li id="p3"><s:a action="tobranchProvinceCity"  namespace="/provincecitymanage" >查询网点</s:a></li>
			<li id="p3"><s:a action="tophoneProvinceCity"  namespace="/provincecitymanage" >查询客服电话</s:a></li>
			</ul>
  
			
		</div>
		<div id=right> 
		<s:form action="getphonesQueryBranch" namespace="/querybranchmanage" method="post" target="showbranchPhone">
			<ul>
		<b id="p3">省&nbsp;&nbsp;</b>
			<s:select  name = "pid" list="allprovince"  listKey="pid" listValue="pname" />
  			<b id="p3">市&nbsp;&nbsp;</b>
  			<s:select  name = "cid" list="allcity"  listKey="cid" listValue="cname" />
			<br>
			<br>
			<input type="submit"style="font-size:20" value="查询">
			</ul>
			</s:form>
		</div>	
	</div>
	
	

	

	
	
	<div id=big>
		<center>
		<h1>客服电话</h1>
		<iframe name="showbranchPhone" frameborder=0 width=500 height=250 marginheight=0 marginwidth=0 scrolling=no  src="<s:url value='/page/foreground/branchPhone.html'/>"  ></iframe>
		</center>
	</div>
	
	

    </body>
</html>