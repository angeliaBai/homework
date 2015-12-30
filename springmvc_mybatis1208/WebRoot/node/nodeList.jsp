<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询节点列表</title>
</head>
<body> 
<form action="${pageContext.request.contextPath }/node/queryNode.action" method="post">
<table border=1>
<tr>
<!--  <td><input type="submit" value="查询"/></td>-->
<td><a href="${pageContext.request.contextPath }/node/addNode.action">新增</a></td>
</tr>
</table>
</form>
</body>

</html>