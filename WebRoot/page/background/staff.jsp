<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'staff.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  <link href="../../css/style.css" />
  </head>
  
  <body>
  <br>
    <center><font size="7">欢迎来到员工界面</font></center><br>
     <hr size="6"  color="#ff0000"><br><br>
     <center><font size="6">添加员工</font></center> <br>
     <form> 
     <center size="7"> 用户&nbsp;&nbsp;名:<input type="text" name="username" maxlength="20" size="20"/></center><br/>
     <center size="5"> 工&nbsp;&nbsp;&nbsp;&nbsp;号：<input type="text" name="numberId" maxlength="40" size="20"/></center><br/>
     <center size="5">密&nbsp;&nbsp;&nbsp;&nbsp;码:<input type="text" name="password" maxlength="60" size="20"/></center><br/>
     <center size="5">电&nbsp;&nbsp;&nbsp;&nbsp;话：<input type="text" name="phone" maxlength="40" size="20"/></center><br/>
      <center size="5">工&nbsp;&nbsp;&nbsp;&nbsp;资：<input type="text" name="salary" maxlength="40" size="20"/></center><br/>
     <center size="5">所属网点：<input type="text" name="adress" maxlength="60" size="20"/></center><br/>  
     <center size="5"><input type="submit" name="submit" value="提交"/>&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" name="reset" value="重置"/></center><br/>  
     </form>
      <br/>  <br/> <br/>
     <hr size="3"  color="#ff0000"><br><br>
     <center><font class="word1">修改员工信息</font></center> <br>
     <form> 
     <center> 用户&nbsp;&nbsp;名:<input type="text" name="username" maxlength="20" size="20"/></center><br/>
     <center> 工&nbsp;&nbsp;&nbsp;&nbsp;号：<input type="text" name="numberId" maxlength="40" size="20"/></center><br/>
     <center>密&nbsp;&nbsp;&nbsp;&nbsp;码:<input type="text" name="password" maxlength="60" size="20"/></center><br/>
     <center>电&nbsp;&nbsp;&nbsp;&nbsp;话：<input type="text" name="phone" maxlength="40" size="20"/></center><br/>
      <center>工&nbsp;&nbsp;&nbsp;&nbsp;资：<input type="text" name="salary" maxlength="40" size="20"/></center><br/>
     <center>所属网点：<input type="text" name="adress" maxlength="60" size="20"/></center><br/>  
     <center><input type="submit" name="submit" value="提交"/>&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" name="reset" value="重置"/></center><br/>  
     </form>
      <br/>  <br/>
     <hr size="3"  color="#ff0000"><br><br>
     <center><font class="word1">删除员工</font></center> <br>
     <form> 
     <center> 用户&nbsp;&nbsp;名:<input type="text" name="username" maxlength="20" size="20"/></center><br/>
     <center> 工&nbsp;&nbsp;&nbsp;&nbsp;号：<input type="text" name="numberId" maxlength="40" size="20"/></center><br/>
     <center>所属网点：<input type="text" name="adress" maxlength="60" size="20"/></center><br/>
     <center><input type="submit" name="submit" value="确定"/>&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" name="reset" value="取消"/></center><br/>  
     </form>
     <br/>  <br/>
     <hr size="3"  color="#ff0000"><br><br>
     <center><font class="word1">查询员工</font></center> <br>
     <form> 
     <center> 用户&nbsp;&nbsp;名:<input type="text" name="username" maxlength="20" size="20"/></center><br/>
     <center> 工&nbsp;&nbsp;&nbsp;&nbsp;号：<input type="text" name="numberId" maxlength="40" size="20"/></center><br/>
     <center>所属网点：<input type="text" name="adress" maxlength="60" size="20"/></center><br/>
     <center><input type="submit" name="submit" value="确定"/>&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" name="reset" value="取消"/></center><br/>  
     </form><br/><br/>
     员工信息如下：<br/><br/>
       <br/>  <br/>
        <center> 用户&nbsp;&nbsp;名:</center><br/>
     <center> 工&nbsp;&nbsp;&nbsp;&nbsp;号：</center><br/>
     <center>密&nbsp;&nbsp;&nbsp;&nbsp;码:</center><br/>
     <center>电&nbsp;&nbsp;&nbsp;&nbsp;话：</center><br/>
      <center>工&nbsp;&nbsp;&nbsp;&nbsp;资：</center><br/>
     <center>所属网点：</center><br/> <br/> 
     <hr size="3"  color="#ff0000"><br><br>  
     <center><font class="word1">全部员工信息</font></center> <br>
  </body>
</html>
