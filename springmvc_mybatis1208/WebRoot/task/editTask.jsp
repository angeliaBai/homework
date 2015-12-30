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
String taskid = request.getParameter("taskid");//用request得到
%>
<form id="itemForm" action="${pageContext.request.contextPath }/task/editTaskSubmit.action" method="post" >
<input type="hidden" name="taskid" value="<%=taskid%>"/>
修改用户信息：
<table width="100%" border=1>
<tr>
	<td>用户id</td>
	<td><lable><%=taskid%></lable></td>
</tr>
<tr>
	<td>用户名</td>
	<td><input type="text" name="taskname" value="${taskExtend.taskname}"/></td>
</tr>
<tr>
	<td>密码</td>
	<td><input type="text" type="password" name="password" value="${taskExtend.password}"/></td>
</tr>
<tr>
	<td>角色</td>
	<td><input type="text" name="role" value="${taskExtend.role}"/></td>
</tr>
<tr>
<td colspan="2" align="center"><input type="submit" value="提交"/>
</td>
</tr>
</table>

</form>
</body>

</html>