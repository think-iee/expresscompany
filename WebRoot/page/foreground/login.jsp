<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
  <head>
    <title>登录页面</title>
    <script src="/expresscompany/js/jquery-1.90.js" type="text/javascript"></script>
 <script>
    function change(){/*div和图片充满屏幕*/
  	    var sh=$(window).height();
  	    $("#leftbody").height(sh);
        $("#rightbody").height(sh);
    }
  	$(function(){
  		change();
  	})
  	$(window).resize(function(){
  		change();
  	})
    function showuserbo(){
      var staffbo=document.getElementById("staffbody");
      var userbo=document.getElementById("userbody");
      var selectus=document.getElementById("selectuser");
      var selectsta=document.getElementById("selectstaff");
      var forgetpd=document.getElementById("forgetpd");
      staffbo.style.display="none";
      userbo.style.display="block";
      selectus.className="p1";
      selectsta.className="p2";
      forgetpd.className="p3";
    }
    function showstaffbo(){
      var staffbo=document.getElementById("staffbody");
      var userbo=document.getElementById("userbody");
      var selectus=document.getElementById("selectuser");
      var selectsta=document.getElementById("selectstaff");
      staffbo.style.display="block";
      userbo.style.display="none";
      selectus.className="p2";
      selectsta.className="p1";
    }
    function forget(){
      var forgetpd=document.getElementById("forgetpd");
      alert("请联系在线客服修改密码！");
    }
    function register(){
    	window.open("register.jsp","_blank");
    }
  </script>
<style type ="text/css">
*{margin:0;padding:0;}
#leftbody{
	width:71%;
	float:left;
}
#rightbody{
	width:29%;
	float:left;
}
#img{/*图片设置*/
	height: 100%;
	width: 100%;
}
#body0{
  border: 1px solid rgb(0,0,255);
  margin:0 10%;
}
#userbody{
  margin:0 15%;
  border: 1px solid rgb(0,0,0);
}
#staffbody{
  margin:0 15%;
  border: 1px solid rgb(0,0,0);
}
.p1{
  font-size: 38px;
  font-weight:500;
  width: 8%;
  height: 50px;
  background:#9CF;
}
.p2{
  font-size: 30px;
  font-weight:400;
  width: 8%;
  height: 50px;
  background:#ccc;
}
.p3{
  font-size: 15px;
  font-weight:400;
  text-align: right;
  color:#9CF
}
#getUser_0{
  font-size: 18px;
  color:white;
  background: #9CF;
}
.button{
  font-size: 18px;
  color:white;
  background: #9CF;
}
</style>

  </head>
  <body onload=showuserbo();>
<div id="leftbody">
<image src="/expresscompany/images/login.jpg" id="img"></image>
</div>
<div id="rightbody">
<br><br><br><br><br><br><br>
<div id="body0">
<br>
<center>
<b id="selectuser" onClick="showuserbo()">用户登录</b>
<b id="selectstaff" onClick="showstaffbo()">职工登录</b>
</center>
<br><br>
<div id="userbody">
<br><br>
  <center><s:form action="getUser" namespace="/usermanage" method="post">
    	用户名：<s:textfield name="user.uid"/><br/><br/>
    	密码：<s:password name="user.upd"/><br/><br/>
    	<s:submit value="登录" class="button"/>&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="button"  value="注册" class="button" onClick="register()"/>
    </s:form>
     </center>
    <br>&nbsp;&nbsp;&nbsp;&nbsp;<b id="forgetpd" onClick="forget()">忘记密码？</b><br>
    <br> 
    </div>
    <div id="staffbody">
    <br><br>
    
    
  <center><s:form action="getStaff" namespace="/staffmanage" method="post">
        	职工号：<s:textfield name="staff.sid"/><br/><br/>
    	密码：<s:password name="staff.spd"/><br/><br/>
    	<s:submit value="登录" />&nbsp;&nbsp;<s:reset value="重置"/>
    </s:form>
    <br>
    </center> 
    </div>
    <br>
    <br>
    </div>
    </div>
  </body>
</html>
