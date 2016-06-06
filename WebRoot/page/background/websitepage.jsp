<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>新增网点</title>
 <link href="../../css/style.css" rel="stylesheet" type="text/css" />
</head>
<body>
<br>
    <center><font size="7">欢迎来到网点界面</font></center> <br>
	 <hr size="6"  color="#ff0000"><br><br>
	  <center><font size="6">添加网点</font></center> <br>
	<s:form action="addBanches" namespace="/banchesmanage" method="post">
		 <center> 网点名称：<s:textfield name="banches.bname" size="35"/><br/><br/>
		 <center> 网点省份：<s:select  name = "banches.pid" list="allprovince"  listKey="pid" listValue="pname" /><br/><br/>          
		<center> 网店城市：<s:select  name = "banches.cid" list="allcity"  listKey="cid" listValue="cname" /><br/><br/>
		 <center> 详细地址：<s:textfield  name="banches.baddress" size="35"/><br/><br/>
		 <center> 网点电话：<s:textfield name="banches.bphone" size="35"/><br/><br/>
		 <center> <s:submit value="保存"/>&nbsp;&nbsp;<s:reset value="重置" />
	</s:form>
	      <br/>  <br/>   <br/>
	      
     <hr size="3"  color="#ff0000"><br><br>
      <center><font size="7">全部网点信息</font></center> <br><br>
     <table width="600" border="3">
     <tr>
     <td>网点名称</td>
     <td>网点省份</td>
     <td>网店城市</td>
     <td>详细地址</td>
     <td>网点电话</td>
     <td>修       改 </td>
     <td>删      除 </td>
     </tr>
     <s:iterator value="allwebsite">
  <tr>
    <td>
	<s:property value="bname" />
    </td>
    <td>
	<s:property value="pname" />
    </td>
     <td>
	<s:property value="cname" />
    </td>
    <td>
	<s:property value="baddress" />
    </td>
    <td>
	<s:property value="bphone" />
    </td>
    
    <td>
    <s:a action = "updateBanches" namespace = "/banchesmanage" target="showNotice">
    <s:param name = "bid"><s:property value = "bid" /></s:param>
            修改
    </s:a>
    </td>
 
    <td>
    <s:a action = "delectBanches" namespace = "/banchesmanage" target="showNotice">
    <s:param name = "bid"><s:property value = "bid" /></s:param>
            删除
    </s:a>
    </td>
   
  </tr>
  </s:iterator>
  </table>   
     <br><br><br>
</body>
<script>
function bname(name){
		if(name==""){
			$("#addBanches_banches_bname").next("span").remove();
			$("#addBanches_banches_bname").after("<span style='color:red;'>网点名称不能为空</span>")
		}
		else{
			$("#addBanches_banches_bname").next("span").remove();
		}
}
function baddress(name){
		if(name==""){
			$("#addBanches_banches_baddress").next("span").remove();
			$("#addBanches_banches_baddress").after("<span style='color:red;'>详细地址不能为空</span>")
		}
		else{
			$("#addBanches_banches_baddress").next("span").remove();
		}
}
function bphone(mobile){
		if(!/^(13[0-9]|14[0-9]|15[0-9]|17[0-9]|18[0-9])\d{8}$/i.test(mobile)){
			$("#addBanches_banches_bphone").next("span").remove();
			$("#addBanches_banches_bphone").after("<span style='color:red;'>手机号无效</span>")
		}
		else{
			$("#addBanches_banches_bphone").next("span").remove();
		}}
$(function(){
	$("#addBanches_banches_bname").blur(function(){
		var name1=$("#addBanches_banches_bname").val().trim();
		bname(name1);
	});
	$("#addBanches_banches_baddress").blur(function(){
		var name2=$("#addBanches_banches_baddress").val().trim();
		baddress(name2);
	});

	$("#addBanches_banches_bphone").blur(function(){
		var mobile=$("#addBanches_banches_bphone").val().trim();
		bphone(mobile);
	});
	$("input:reset").bind("click",function(){
		$("#addBanches_banches_bname").next("span").remove();
		$("#addBanches_banches_baddress").next("span").remove();
		$("#addBanches_banches_bphone").next("span").remove();
	});
});
</script>
</html>