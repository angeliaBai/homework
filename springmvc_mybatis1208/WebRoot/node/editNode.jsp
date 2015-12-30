<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改节点信息</title>

</head>
<body> 
<%
String nodeid = request.getParameter("nodeid");//用request得到
%>
<form id="itemForm" action="${pageContext.request.contextPath }/node/editNodeSubmit.action" method="post" >
<input type="hidden" name="nodeid" value="<%=nodeid%>"/>
修改节点信息：
<table width="100%" border=1>
<tr>
	<td>节点id</td>
	<td><lable><%=nodeid%></lable></td>
</tr>
<tr>
	<td>节点ip</td>
	<td><input type="text" name="nodeip" value="${nodeExtend.nodeip}"/></td>
</tr>
<tr>
<td colspan="2" align="center"><input type="submit" value="提交"/>
</td>
</tr>
</table>

</form>
</body>

</html>