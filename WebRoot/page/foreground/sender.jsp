<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>自助寄件</title>
    <script src="/expresscompany/js/jquery-1.90.js" type="text/javascript"></script>
    <script type="text/javascript">
	/*var xmlhttp;
	function createXMLHTTP() {
		if (window.XMLHttpRequest) {
			xmlhttp = new XMLHttpRequest();
		} else {
			xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
		}
	}
	
	function showCity(pid) {
		createXMLHTTP();
		xmlhttp.open("post", "CityAction.java?pid=" + pid);
		xmlhttp.onreadystatechange = showCityCallback;
		xmlhttp.send();
	}
	
	function showCityCallback() {
		if (xmlhttp.readyState == 4) {
			if (xmlhttp.status == 200) {
				var text = xmlhttp.responseText;
				$("#cityid option:gt(0)").remove();
				var citytexts = text.split("|");
				$.each(citytexts, function(i, n) {
					var citys = n.split(":");
					var cid = citys[0];
					var cname = citys[1];
					$("#cityid").append("<option value='"+cid+"'>" + cname + "</option>");
				});
			}
		}
	}
	$(function (){
		$("#province").bind("change",function(){
		alert($("#province :selected").val());
		});
	}); 
	*/

	</script>
	<style type ="text/css">
		#body1{
			width:100%;
			height:580px;
			background: rgb(245,245,245);
		}
		#body2{
			width:27%;
			float:left;
			border: 1px solid rgb(255,0,0);
			margin:3%;
		}
		#body3{
			width:27%;
			float:left;
			border: 1px solid rgb(0,0,255);
			margin:3%;
		}
		#body4{
			width:27%;
			float:left;
			border: 1px solid rgb(0,0,0);
			margin:3%;
		}
		#body5{
			width:100%;
			margin:0 auto;
		}
		#p1{
				font-size:30px;
				font-weight:550;
				color: red;
			}
		#p2{
				font-size:30px;
				font-weight:550;
				color: blue;
			}
		#p3{
				font-size:20px;
				font-weight:400;
			}
		#p4{
				font-size:30px;
				font-weight:550;
			}
			.doubles br{
			display: none;
			}
	</style>
  </head>
  
  <body>
    <!-- 寄件代码开始 -->
    <s:form method="post" namespace="/orders" action="addorders"  theme="simple">
		<div id="body1">
			<div id="body2" >
			<center>
				<p id="p1">寄件人信息</p>
			</center>
				<p id="p3">&nbsp;&nbsp;&nbsp;&nbsp;真实姓名：</p>
					&nbsp;&nbsp;&nbsp;&nbsp;<s:textfield name="orders.usname" maxlength="10" style='font-size:18px' />
				<br>
				<p id="p3">&nbsp;&nbsp;&nbsp;&nbsp;请选择省/市：</p>
				<!--<select id="province" name="provinces" >
	    			<option value="0">---省份---</option>
		    		<s:iterator value="allprovince">
		    			<option value="${pid}">${pname }</option>
		    		</s:iterator>
    			</select> 
				<select id="cityid" name="cityid">
	    			<option value="0">---城市---</option>
	    			<option></option>
    		 	</select>--> 

 	  			<!--<s:doubleselect list="allprovince" listKey="pid" listValue="pname"
			       doubleName="citid" doubleList="cityMap.get(top.pid)"
			       doubleListKey="cid" doubleListValue="cname" >
 	  			</s:doubleselect>-->
 	  			<div class="doubles">&nbsp;&nbsp;&nbsp;&nbsp;
 	  			<s:doubleselect name="spid" list="allprovince" listKey="pid" listValue="pname" labelposition="top"
			       doubleName="scid" doubleList="cityMap.get(top.pid)"
			       doubleListKey="cid" doubleListValue="cname" >
 	  			</s:doubleselect>
 	  			</div>
    		 	
				<p id="p3">&nbsp;&nbsp;&nbsp;&nbsp;详细地址：</p>
					&nbsp;&nbsp;&nbsp;&nbsp;<s:textfield name="orders.usaddress" maxlength="16" style='font-size:18px' />
				<br>
				<p id="p3">&nbsp;&nbsp;&nbsp;&nbsp;手机号码：</p>
					&nbsp;&nbsp;&nbsp;&nbsp;<s:textfield name="orders.usphone" maxlength="11" style='font-size:18px' />
				<br><br>
			</div>
			<div id="body3" >
			<center>
				<p id="p2">收件人信息</p>
			</center>
				<p id="p3">&nbsp;&nbsp;&nbsp;&nbsp;真实姓名：</p>
				&nbsp;&nbsp;&nbsp;&nbsp;<s:textfield name="orders.urname" maxlength="10" style='font-size:18px' />
				<br>
				<p id="p3">&nbsp;&nbsp;&nbsp;&nbsp;请选择省/市：</p>
				
				<div class="doubles">&nbsp;&nbsp;&nbsp;&nbsp;
 	  			<s:doubleselect name="rpid" list="allprovince" listKey="pid" listValue="pname" labelposition="left"
			       doubleName="rcid" doubleList="cityMap.get(top.pid)"
			       doubleListKey="cid" doubleListValue="cname" >
 	  			</s:doubleselect>
 	  			</div>
				
				<p id="p3">&nbsp;&nbsp;&nbsp;&nbsp;详细地址：</p>
					&nbsp;&nbsp;&nbsp;&nbsp;<s:textfield name="orders.uraddress" maxlength="16" style='font-size:18px' />
				<br>
				<p id="p3">&nbsp;&nbsp;&nbsp;&nbsp;手机号码：</p>
					&nbsp;&nbsp;&nbsp;&nbsp;<s:textfield name="orders.urphone" maxlength="11" style='font-size:18px' />
				<br><br>
			</div>
			<div id="body4" >
			<center>
				<p id="p4">快件信息</p>
			</center>
				<p id="p3">&nbsp;&nbsp;&nbsp;&nbsp;备注：（100字以内）</p>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<s:textarea name="orders.oremark" rows="4" cols="25" style='font-size:18px'/>
				<br>
				<p id="p3">&nbsp;&nbsp;&nbsp;&nbsp;物品名称：</p>
					&nbsp;&nbsp;&nbsp;&nbsp;<s:textfield name="orders.owname" maxlength="10" style='font-size:18px' />
				<br>
				<p id="p3">&nbsp;&nbsp;&nbsp;&nbsp;快件重量：</p>
				&nbsp;&nbsp;&nbsp;&nbsp;<s:textfield name="orders.oweight" maxlength="2" size="2" style='font-size:18px' />Kg&nbsp;&nbsp;(注：不能超过40Kg) 
				<br><br>
			</div>
			
		</div>
		<div id="body5" >
		<br>
			<center>
			<s:submit style="background:brown; color:white; font-size:30px" value="提交订单" />
			</center>
		<br><br>
		</div>
		</s:form>
		<!-- 寄件代码结束 -->
  </body>
</html>
