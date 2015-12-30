<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改用户信息</title>

</head>
<body> 
<%
String userid = request.getParameter("userid");//用request得到
%>
<form id="itemForm" action="${pageContext.request.contextPath }/user/editUserSubmit.action" method="post" >
<input type="hidden" name="userid" value="<%=userid%>"/>
修改用户信息：
<table width="100%" border=1>
<tr>
	<td>用户id</td>
	<td><lable><%=userid%></lable></td>
</tr>
<tr>
	<td>用户名</td>
	<td><input type="text" name="username" value="${userExtend.username}"/></td>
</tr>
<tr>
	<td>密码</td>
	<td><input type="text" type="password" name="password" value="${userExtend.password}"/></td>
</tr>
<tr>
	<td>角色</td>
	<td><input type="text" name="role" value="${userExtend.role}"/></td>
</tr>
<tr>
<td colspan="2" align="center"><input type="submit" value="提交"/>
</td>
</tr>
</table>

</form>
</body>

</html>