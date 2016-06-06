<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>    
    <title>注册</title>
<script src="../../js/jquery-1.90.js" type="text/javascript"></script>
  <script>/*div和图片充满屏幕*/
    function change(){
  	    var sh=$(window).height();
  	    $("#body1").height(sh);
        $("#body2").height(sh);
    }
  	$(function(){
  		change();
  	})
  	$(window).resize(function(){
  		change();
  	})
  </script>
<style type ="text/css">
*{margin:0;padding:0;}
	#body1{
			width:71%;
			float:left;
			background-color: red;
		}
	#body2{
			width:29%;
			float:left;

		}
		#img{/*图片设置*/
			height: 100%;
			width: 100%;
		}
		#rebody{
		border: 1px solid rgb(0,0,255);
  		margin:0 10%;
		}
</style>

  </head>
  
  <body>
    <div id="body1">
  	<image src="/expresscompany/images/register.jpg" id="img"></image>
  </div>
  <div id="body2">
  <br/>
  <br/>
  <br/>
  <br/>
  <br/>
  <div id="rebody">
  <br><br>
  <center><s:form action="Register" namespace="/usermanage" method="post" >
    	用户名：<s:textfield name="user.uid"  /><br/><br/><br/>
              
                       密&nbsp;&nbsp;码：<s:password name="user.upd"  /> <br/><br/><br/>
        
                       确认密码：<s:password name="password"  /> <br/><br/><br/>
        <s:submit  value="注册" />
        <s:reset value="重置" />
    </s:form>
    </center> 
    <br><br> 
    </div>
    </div>
  </body>
</html>
