<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登录</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" type="text/css" href="css/login.css">

  </head>
  
  <body>
    <div class="container">
    	<div class="log_panel">
    		<header>
    			<p style="vertical-align: middle;text-align: center;">
    				<strong >欢迎来到心飞扬管理系统.</strong>
    			</p>
    			<p style="vertical-align: middle;text-align: center;">
    				<strong >这里是你的私人代购管理中心.</strong>
    			</p>
    		</header>
    		
    		<div class="log_main">
    			<form method="post" action="login.do">
    				<fieldset>
    					<label for="username">USERNAME</label>
    					<input type="text" id="username" name="username" required autofocus="autofocus">
    					
    					<label for="password">PASSWORD</label>
    					<input type="password" id="password" name="password" required autofocus="autofocus">
    				</fieldset>
    				
    				<fieldset>
    					<span class="psw_forget"><a href="#">FORGOT PASSWORD</a></span>
    					<button type="submit">>> &nbsp;&nbsp;&nbsp;GO</button>
    				
    				</fieldset>
    			</form>
    		</div>
    	</div>
    </div>
  </body>
</html>
