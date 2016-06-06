<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
 <head>
 
<title>省份--城市级联菜单</title>
  <s:head />
  <meta http-equiv="pragma" content="no-cache">
  <meta http-equiv="cache-control" content="no-cache">
  <meta http-equiv="expires" content="0">
  <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
  <meta http-equiv="description" content="This is my page">
  <!--
 <link rel="stylesheet" type="text/css" href="styles.css">
 -->
</head>
<body>
  <s:form action="kkAction" namespace="/doublemanage" >
   <s:doubleselect label="请选择所在省市" name="provice" list="provinces"
    listKey="id" listValue="name" doubleList="cities" doubleListKey="id"
    doubleListValue="name" doubleName="city" headerKey="-1"
    headerValue="----请选择----" emptyOption="true" />
  </s:form>
 </body>
</html>
