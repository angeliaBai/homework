<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">
<head>
 <%String path = request.getContextPath(); %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>云管理系统</title>
<!--  <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap3/css/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap3/css/bootstrap-theme.min.css">
<script src="${pageContext.request.contextPath}/bootstrap3/js/jquery-1.11.2.min.js"></script>
<script src="${pageContext.request.contextPath}/bootstrap3/js/bootstrap.min.js"></script>-->

<link rel="stylesheet" href="<%=path%>/bootstrap3/css/bootstrap.min.css">
<link rel="stylesheet" href="<%=path%>/bootstrap3/css/bootstrap-theme.min.css">
<script src="<%=path%>/bootstrap3/js/jquery-1.11.2.min.js"></script>
<script src="<%=path%>/bootstrap3/js/bootstrap.min.js"></script>
<script src="<%=path%>/js/login.js"></script>
<meta name="viewpoint" content="width=divice-width,intial-scale=1.0">
<!--[if lt IE 9]>
<script type="text/javascript">FileManager.get('http://core.pc.lietou-static.com/revs/js/common/html5shiv_62ac5721.js');</script>
<![endif]-->
<!--[if IE 6]>
<script type="text/javascript">FileManager.get('http://core.pc.lietou-static.com/revs/js/common/DD_belatedPNG_849d7004.js');</script>
<script>DD_belatedPNG.fix('.pngfix');</script>
<![endif]--><!--[if lt IE 9]>
<script type="text/javascript">FileManager.get('http://core.pc.lietou-static.com/revs/js/common/html5shiv_62ac5721.js');</script>
<![endif]-->
<!--[if IE 6]>
<script type="text/javascript">FileManager.get('http://core.pc.lietou-static.com/revs/js/common/DD_belatedPNG_849d7004.js');</script>
<script>DD_belatedPNG.fix('.pngfix');</script>
<![endif]-->
</head>
<body style="margin: 50px; font-family:Arial;font-size: 18px;line-height: 18px;background-color: #28A4C9;" >
		<nav class="nav navbar-primary navbar-fixed-top" role="navigation"style="background-color: #265A88;">
   		<div class="collapse navbar-collapse "style="padding:0 200px;font-family: 'arial black';20px;#fff">
	   		<ul class="nav navbar-nav"> 
	   			<li><a href="#" class="navber-link">欢迎使用云管理系统</a></li>
               
	   		</ul>
	   		<div class="navbar-form  navbar-right" id="mytab">
	   			<ul class="nav navbar-nav" > 
	   			 <li><a href="#" class="navber-link">返回首页</a></li>
	   		</ul>
	   		</div>
   		</div>
   	</div>
   </nav>
<div style="height: 20px;"></div>
   <div class="container "style="background-image:  url(image/bg.jpg)">
   	<div class="row">
   		<div class="col-md-2"></div>
   		<div class="col-md-8">
   		  
   		  <div class="tab-content" >
   		  	<div class="tab-pane fade in active" id="user_login">
	<form class="form" style="background-image: url(image/bg2.jpg); padding:30px 120px;margin:80px 80px">
		<div class="form-group ">
			<h3>用户注册</h3>
			<br/>
			<label  for="Inputuser_name">用户名</label>
			<input type="text" class="form-control" id="Inputuser_name" placeholder="请输入您的用户名" required>
		</div>
		<div class="form-group">
			<label for="Input_pwd">密 &nbsp;码</label>
			<input type="password" class="form-control" id="Input_pwd" placeholder="请输入您的密码"required>
		</div>
		<div class="form-group">
			<label for="Input_pwd">确认密码</label>
			<input type="password" class="form-control" id="Input_repwd" placeholder="请再次输入您的密码"required>
		</div>
        <div class="form-group ">
        <button type="button" class="btn btn-primary btn-lg" onclick="register()">确&nbsp;认</button>
        <button type="reset" class="btn btn-primary  btn-lg  pull-right">重&nbsp;置</button>
        </div>
    </form>
</div>
</div>
</div>
</div>
<div class="col-md-2"></div>
</body>
</html>
