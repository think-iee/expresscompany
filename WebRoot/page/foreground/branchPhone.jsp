<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
  
<s:iterator value="bancheslist" >		
	 <s:property value="bname"/> <s:property value="bphone"/><br/>	 
</s:iterator>

