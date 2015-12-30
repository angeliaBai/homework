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

</head>
<body style="margin: 50px; font-family:Arial;font-size: 16px;line-height: 18px;background-color: #28A4C9;" >
		<div class="col-md-6 "> 
        	<button type="button" class="btn btn-primary btn-lg pull-right" onclick='<jsp:forward page="/WEB-INF/jsp/user/user.jsp"></jsp:forward>'>查看所有用户信息</button>
        
        </div>
</body>
</html>
