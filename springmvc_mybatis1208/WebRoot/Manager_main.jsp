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
<body style="margin: 50px; font-family:Arial;font-size: 16px;line-height: 18px;background-color: #28A4C9;" >
		<nav class="nav navbar-primary navbar-fixed-top" role="navigation"style="background-color: #265A88;">
   		<div class="collapse navbar-collapse "style="padding:0 200px;font-family: 'arial black';20px;#fff">
	   		<ul class="nav navbar-nav"> 
	   			<li><a href="#" class="navber-link">欢迎使用云管理系统</a></li>
               
	   		</ul>
	   		<div class="navbar-form  navbar-right" id="mytab">
	   			<ul class="nav navbar-nav" >
	   			 <li><a href="#" class="navber-link">返回首页</a></li>
                 <li><a href="#" class="navber-link">安全退出</a></li>
	   		</ul>
	   		</div>
   		</div>
   	</div>
   </nav>
<div style="height: 20px;"></div>
   <div class="container " style="background-image: url(image/bg.jpg)"></div>
   	<div class="row">
   		<div class="col-md-2"></div>
   		<div class="col-md-8"  style="background-image: url(image/bg2.jpg); padding:30px 50px;margin:80px 50px">
   		

	<%
  String username = request.getParameter("username");
  %>
			<h3>亲爱的<%=username %>，欢迎您！</h3>
			<br/><br/>
        <div class="col-md-6">
             <button type="submit" class="btn btn-primary btn-lg pull-right">查看/修改个人信息</button>    
        </div>
        <div class="col-md-6 "> 
        	<button type="button" class="btn btn-primary btn-lg pull-right" onclick="window.location.href='${pageContext.request.contextPath}/Support.jsp?'">查看所有用户信息</button>
        
        </div>
       	<div class="col-md-6"> 
  			<button id="btn2" class="btn btn-primary btn-lg  pull-left"  type="button"">
   				&nbsp; &nbsp; &nbsp;&nbsp;查看所有任务信息 &nbsp; &nbsp; &nbsp; &nbsp;
  			</button>
 		</div>
 		<div class="col-md-10"> 
  			<button id="btn3"class="btn btn-primary btn-lg  pull-right" type="button">
   			&nbsp; &nbsp; &nbsp;&nbsp;查看所有节点信息 &nbsp; &nbsp; &nbsp; &nbsp;
  			</button>
 		</div>
 		</div>
   	</div>
</body>
</html>
