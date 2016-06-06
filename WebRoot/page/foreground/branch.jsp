<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>




<html>
<head>
<!-- 新 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="<s:url value='/css/bootstrap.min.css'/> ">

<!-- 可选的Bootstrap主题文件（一般不用引入） -->
<link rel="stylesheet" href="<s:url value='/css/bootstrap-theme.min.css'/> ">

<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="../../js/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="../../js/bootstrap.min.js"></script>
</head>
<body>
        	<table class="table" contenteditable="true">
                  <thead>
                    <tr>
                      <th>网点名</th>
                      <th>网点地址</th>
        
                    </tr>
                  </thead>
                  <tbody>
        		<s:iterator value="bancheslist" >
                    <tr class="info">
                      <td> <s:property value="bname"/></td>
                      <td><s:property value="baddress"/></td>

                    </tr>
                 </s:iterator>
                  </tbody>
                </table>
              

</body>
 </html> 

