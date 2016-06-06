<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
<title>北理速运</title>
	    <style type ="text/css">
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
    <!-- 查询快件页面 -->

	<div id=big>
		<div id=left>
		
		</div>
		<div id="mid">
			<h1 id="p1">查询</h1>
			<ul>
			<li id="p3"><a href="queryExpress.html" style="text-decoration:none">查询快件</a></li>
			<li id="p3"><a href="queryFreight.html" style="text-decoration:none">查询运费</a></li>
			<li id="p3"><a href="queryBranch.html" style="text-decoration:none">查询网点</a></li>
			<li id="p3"><a href="queryBranchPhone.html" style="text-decoration:none">查询客服电话</a></li>
			</ul>
  
			
		</div>
		<div id=right> 
			<ul>
			<li>
			<b id="p3">寄件地址：</b>
			
			<select>
   			<option style="width:200px">1</option>
   			<option style="width:200px">2</option>
   			<option style="width:200px">3</option>
   			<option style="width:200px">4</option>
   			<option style="width:200px">5</option>
  			</select>
  			<b id="p3">省&nbsp;&nbsp;</b>
  			
  			<select>
   			<option style="width:200px">1</option>
   			<option style="width:200px">2</option>
   			<option style="width:200px">3</option>
   			<option style="width:200px">4</option>
   			<option style="width:200px">5</option>
  			</select>
  			<b id="p3">市&nbsp;&nbsp;</b>
  			
			<br>
			<br>
			</li>
			
				<li>
			<b id="p3">目的地址：</b>
			
			<select>
   			<option style="width:200px">1</option>
   			<option style="width:200px">2</option>
   			<option style="width:200px">3</option>
   			<option style="width:200px">4</option>
   			<option style="width:200px">5</option>
  			</select>
  			<b id="p3">省&nbsp;&nbsp;</b>
  			
  			<select>
   			<option style="width:200px">1</option>
   			<option style="width:200px">2</option>
   			<option style="width:200px">3</option>
   			<option style="width:200px">4</option>
   			<option style="width:200px">5</option>
  			</select>
  			<b id="p3">市&nbsp;&nbsp;</b>
  			
			<br>
			<br>
			</li>
			<li><b id="p3">输入重量</b><input type="text" size=35></li>
			<input type="submit"style="font-size:20" value="查询">
			</ul>
		</div>	
	</div>
	
	

	

	
	
	<div id=big>
		<center>
		<h1>运费</h1>
		<iframe name="showBranch" frameborder=0 width=500 height=250 marginheight=0 marginwidth=0 scrolling=no src="freight.html"  ></iframe>
		</center>
	</div>
  </body>
</html>
