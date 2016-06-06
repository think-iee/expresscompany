<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'wayBill.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
    <link href="../../css/style.css" rel="stylesheet" type="text/css" />
  </head>
  
  <body>
  <br>
    <center><font size="7">欢迎来到运单界面</font></center><br>
     <hr size="6"  color="#ff0000"><br><br>
     <form> 
     <center> 按时间查询:<input type="text" name="time1" maxlength="20" size="20"/>
               到：<input type="text" name="time2" maxlength="40" size="20"/>&nbsp;&nbsp;&nbsp;&nbsp;
     <input type="submit" name="submit" value="确定"/>&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" name="reset" value="取消"/></center><br/>  
     </form>
       <br/>  <br/>
      <form> 
           运单总数：
       <br/>  <br/>
     <center> 按网点查询:<input type="text" name="adress1" maxlength="20" size="20"/>&nbsp;&nbsp;&nbsp;&nbsp;
     <input type="submit" name="submit" value="确定"/>&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" name="reset" value="取消"/></center><br/>  
     </form>
        运单总数：
       <br/>  <br/>
       <hr size="3"  color="#ff0000"><br><br>
        <center><font class="word1">全部运单信息</font></center> <br/><br/>
  </body>
</html>
