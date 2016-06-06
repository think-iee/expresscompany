<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>网点经理管理界面</title>
<link href="../../css/style.css" rel="stylesheet" type="text/css" />

</head>
  <body>
  <br>
    <center><font size="7">欢迎来到网点经理管理界面</font></center><br>
     <hr size="6"  color="#ff0000"><br><br>
     <center><font size="6">添加网点经理</font></center> <br>
    <s:form action="addStaff" namespace="/staffmanage" method="post">
		 <center> 网点经理名称：<s:textfield name="staff.sname" size="35"/><br/><br/>
		 <center> 网点经理住址：<s:textfield  name="staff.saddress" size="35"/><br/><br/>
		 <center> 网点经理电话：<s:textfield name="staff.sphone" size="35"/><br/><br/>
		 <center> 登录        密码：<s:textfield name="staff.spd" size="35"/><br/><br/>
		 <center> 分配所属网点：<s:select  name = "staff.bid" list="allbanches"  listKey="bid" listValue="bname" /><br/><br/>          
		 <center> <s:submit value="保存"/>&nbsp;&nbsp;<s:reset value="重置" />
	</s:form>
      <br/>  <br/> <br/>
     <hr size="3"  color="#ff0000"><br><br>
     
     <center><font class="word1">全部网点经理信息</font></center> <br>
  </body>
</html>
