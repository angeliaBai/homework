<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">
<head>
 <%String path = request.getContextPath();
 out.println(path);%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>云管理系统</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap3/css/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap3/css/bootstrap-theme.min.css">
<script src="${pageContext.request.contextPath}/bootstrap3/js/jquery-1.11.2.min.js"></script>
<script src="${pageContext.request.contextPath}/bootstrap3/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/js/login.js"></script>
<meta name="viewpoint" content="width=divice-width,intial-scale=1.0">


<script>
function test(){
	var a="aa";
	alert(a);
}
</script>
</head>
<body style="margin: 50px; font-family:Arial;font-size: 16px;line-height: 18px;background-color: #28A4C9;" >
		<nav class="nav navbar-primary navbar-fixed-top" role="navigation"style="background-color: #265A88;">
   		<div class="collapse navbar-collapse "style="padding:0 200px;font-family: 'arial black';20px;#fff">
	   		<ul class="nav navbar-nav"> 
	   			<li><a href="#" class="navber-link">欢迎使用云管理系统</a></li>
	   		</ul>
	   		<div class="navbar-form  navbar-right" id="mytab">
	   			<ul class="nav navbar-nav" > 
	   			<li><a href="#user_login" data-toggle='tab' >普通用户登录</a></li>
                <li><a  href="#manager_login"  data-toggle='tab'>管理员登录</a></li>
	   		</ul>
	   		</div>
   		</div>
   	</div>
   </nav>
<div style="height: 20px;"></div>
   <div class="container" style="background-image:url(image/bg.jpg)">
   	<div class="row">
   		<div class="col-md-7"></div>
   		<div class="col-md-5">
   		  
   		  <div class="tab-content" >
   		  	<div class="tab-pane fade in active" id="user_login">
	<form role="form" method="post" style="background-image: url(image/bg2.jpg); padding:30px 50px;margin:90px 50px">
		<div class="form-group ">
			<h3>普通用户登录</h3>
			<br/>
			<label  for="Inputuser_name">用户名</label>
			<input type="text" class="form-control" id="Inputuser_name" placeholder="请输入您的用户名">
		</div>
		<div class="form-group">
			<label for="Input_pwd">密 &nbsp;码</label>
			<input type="password" class="form-control" id="Input_pwd" placeholder="请输入您的密码">
		</div>
		<div class="form-group">
			<label>
				<input type="checkbox"> 记住密码</label>
			<a class="pull-right" href="找回密码.html"> 忘记密码 </a>
        </div>
        <div class="form-group ">
        <button type="button"  class="btn btn-primary" onclick="loginUser()">登&nbsp;陆</button>
        <button type="button" class="btn btn-primary pull-right" onclick="window.location.href='${pageContext.request.contextPath}/Register.jsp'">注&nbsp;册</button>
        </div>
    </form>
</div>
   		  	<div class="tab-pane fade " id="manager_login">
	<form role="form" style="background-image: url(image/bg2.jpg); padding:30px 50px;margin:90px 50px ">
		<div class="form-group ">
			<h3>管理员登录</h3>
			<br/>
			<label style=";" for="InputManager_name">管理员名</label>
			<input type="text" class="form-control" id="InputManager_name" placeholder="请输入您的用户名">
		</div>
		<div class="form-group">
			<label for="Input_pwd">密 &nbsp;码</label>
			<input type="password" class="form-control" id="InputManager_pwd" placeholder="请输入您的密码">
		</div>
		<div class="form-group">
			<label>
				<input type="checkbox"> 记住密码</label>
			<a class="pull-right" href="找回密码.html"> 忘记密码 </a>
        </div>
        <div class="form-group ">
        <button type="button" class="btn btn-primary btn-block " onclick="loginManager()">登&nbsp;陆</button>
        </div>
    </form>
	 </div>
</div>
</div>
</div>
</body>
</html>
