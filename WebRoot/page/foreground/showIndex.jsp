<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>展示</title>
	<script src="/expresscompany/js/jquery-1.7.2.js"></script>
    <script src="/expresscompany/js/slider.js"></script>
    <link rel="stylesheet" type="text/css" href="/expresscompany/css/slider.css">    
    <script>window.onload=s;</script>
	<style type ="text/css">
	</style>
  </head>
  
  <body>
    <div id="show" rel="autoPlay">
      <div class="img">
          <span>
              <s:a action="getall" namespace="/address" target="showiframe"><img src="/expresscompany/images/slider1.jpg" /></s:a>
              <s:a action="tobranchProvinceCity"  namespace="/provincecitymanage" ><img src="/expresscompany/images/slider2.jpg" /></s:a>
              <s:a action="tophoneProvinceCity"  namespace="/provincecitymanage" ><img src="/expresscompany/images/slider3.jpg" /></s:a>
          </span>
        <div class="masks mk1"></div>
        <div class="masks mk2"></div>
      </div>
    </div>
  </body>
</html>
