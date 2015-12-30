<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>result</title>
</head>
<body>
<table width="100%" border=1>
<tr>
<td>节点id：${nodeid}</td>
<td>节点ip：${nodeip}</td>
<td>任务id：${taskid}</td>
<td>cpu占用率：${cpurate}</td>
<td>内存占用率：${memoryrate}</td>
</tr>
</table>
<%
response.sendRedirect("nodeList");
%>
</body>
</html>