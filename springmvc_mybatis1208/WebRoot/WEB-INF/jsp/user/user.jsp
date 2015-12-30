<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>  
<!doctype html>
<html>
<head>
 <%String path = request.getContextPath(); %>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta name="keywords" content="jquery,ui,easy,easyui,web">
    <meta name="description" content="easyui help you build your web page easily!">
    <title>用户列表</title>
    <link rel="stylesheet" type="text/css" href="<%=path%>/easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="<%=path%>/easyui/themes/icon.css">
    <script src="<%=path%>/easyui/jquery.min.js"></script>
    <script src="<%=path%>/easyui/jquery.easyui.min.js"></script>
    <script src="<%=path%>/easyui/locale/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript" src="<%=path%>/js/datagrid-detailview.js"></script>
    <script src="<%=path%>/js/user.js"></script>
</head>
<body>
<%
  String username = request.getParameter("username");
  %>
			<h3>亲爱的<%=username %>，欢迎您！</h3>
			<br/><br/>
<h2 style="text-align: center;">用户列表</h2>
<table id="dg"></table>
<div id="tb" style="padding:3px">
    <span>用户名</span>
    <input id="username" style="line-height:22px;border:1px solid #ccc">
    <span>角色</span>
    <input id="role" style="line-height:22px;border:1px solid #ccc">
    <a href="#" class="easyui-linkbutton" plain="true" iconCls="icon-search" onclick="loadData()">搜索</a>
    &nbsp; &nbsp; &nbsp;
    <input id="timeSeconds" placeholder="单位：秒" style="line-height:22px;border:1px solid #ccc;width: 55px"/>
    <a href="#" class="easyui-linkbutton" plain="true" iconCls="icon-reload" onclick="refresh()">刷新</a>
    <span id="msg"></span>
 <!-- <a href="#" id="addUserBtn" class="easyui-linkbutton"  onclick="addUser()" iconCls="icon-add" plain="true">添加</a> -->   
    <a href="#" id="addUserBtn" class="easyui-linkbutton"  onclick="setDialog_add()" iconCls="icon-add" plain="true">添加</a>     
     <a href="#" id="delBatchUsersBtn" class="easyui-linkbutton"  onclick="deleteBatchUsers()" iconCls="icon-remove" plain="true">批量删除</a>
</div>
<!-- 新建用户 -->
<div id="addUserDlg" icon="icon-save" class="easyui-dialog" closed="true"
	style="padding: 5px; width: 500px; height: 300px;">
	<h5 id="loginInfoEdit_message" style="color: red;"></h5>
		<input type="hidden" id="addUserDlg_userid"></input>
        <ul>
			<li>
				<label>用户名：</label>
				<input type="text" class="easyui-validatebox" id="addUserDlg_username" maxlength="20" required="true"></input>			
			</li><br>
			<li>
				<label>密&nbsp; 码：</label>
				<input type="password" class="easyui-validatebox" id="addUserDlg_password" maxlength="20" required="true"></input>
			</li><br>
			<li>
				<label>角&nbsp; 色：</label>
				<input type="text" class="easyui-validatebox" id="addUserDlg_role" maxlength="20" required="true"></input>
			</li><br>
			<li>
				<a href="#" class="easyui-linkbutton" icon="icon-ok" onclick="addUserDlg_submit()">提交</a>
			</li>
		</ul>
	</div>
<!-- 编辑用户 -->	
<div id="editUserDlg" icon="icon-save" class="easyui-dialog" closed="true"
	style="padding: 5px; width: 500px; height: 300px;">
	<h5 id="loginInfoEdit_message" style="color: red;"></h5>
		<input type="hidden" id="editUserDlg_userid"></input>
        <ul>
        	<li>
				<label>用户id：</label>
				<lable id="editUserDlg_userId"></lable>
			</li><br>
			<li>
				<label>用户名：</label>
				<input type="text" class="easyui-validatebox" id="editUserDlg_username" maxlength="20" required="true"></input>			
			</li><br>
			<li>
				<label>密&nbsp; 码：</label>
				<input type="password" class="easyui-validatebox" id="editUserDlg_password" maxlength="20" required="true"></input>
			</li><br>
			<li>
				<label>角&nbsp; 色：</label>
				<input type="text" class="easyui-validatebox" id="editUserDlg_role" maxlength="20" required="true"></input>
			</li><br>
			<li>
				<a href="#" class="easyui-linkbutton" icon="icon-ok" onclick="editUserDlg_submit()">提交</a>
			</li>
		</ul>
	</div>
</body>
</html>