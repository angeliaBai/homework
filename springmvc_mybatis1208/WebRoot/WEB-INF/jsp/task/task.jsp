<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>  
<!doctype html>
<html>
<head>
 <%String path = request.getContextPath(); %>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta name="keywords" content="jquery,ui,easy,easyui,web">
    <meta name="description" content="easyui help you build your web page easily!">
    <title>任务列表</title>
    <link rel="stylesheet" type="text/css" href="<%=path%>/easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="<%=path%>/easyui/themes/icon.css">
    <script src="<%=path%>/easyui/jquery.min.js"></script>
    <script src="<%=path%>/easyui/jquery.easyui.min.js"></script>
    <script src="<%=path%>/easyui/locale/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript" src="<%=path%>/js/datagrid-detailview.js"></script>
    <script src="<%=path%>/js/task.js"></script>
</head>
<body>
<h2 style="text-align: center;">任务列表</h2>
<table id="dg"></table>
<div id="tb" style="padding:3px">
    <span>任务名</span>
    <input id="taskname" style="line-height:22px;border:1px solid #ccc">
    <span>任务id</span>
    <input id="taskid" style="line-height:22px;border:1px solid #ccc">
    <a href="#" class="easyui-linkbutton" plain="true" iconCls="icon-search" onclick="loadData()">搜索</a>
    &nbsp; &nbsp; &nbsp;
    <input id="timeSeconds" placeholder="单位：秒" style="line-height:22px;border:1px solid #ccc;width: 55px"/>
    <a href="#" class="easyui-linkbutton" plain="true" iconCls="icon-reload" onclick="refresh()">刷新</a>
    <span id="msg"></span>
 <!-- <a href="#" id="addTaskBtn" class="easyui-linkbutton"  onclick="addTask()" iconCls="icon-add" plain="true">添加</a> -->   
    <a href="#" id="addTaskBtn" class="easyui-linkbutton"  onclick="setDialog_add()" iconCls="icon-add" plain="true">添加</a>     
     <a href="#" id="delBatchTasksBtn" class="easyui-linkbutton"  onclick="deleteBatchTasks()" iconCls="icon-remove" plain="true">批量删除</a>
</div>
<!-- 新建任务 -->
<div id="addTaskDlg" icon="icon-save" class="easyui-dialog" closed="true"
	style="padding: 5px; width: 500px; height: 300px;">
	<h5 id="loginInfoEdit_message" style="color: red;"></h5>
		<input type="hidden" id="addTaskDlg_taskid"></input>
        <ul>
			<li>
				<label>任务id：</label>
				<input type="text" class="easyui-validatebox" id="addTaskDlg_taskname" maxlength="20" required="true"></input>			
			</li><br>
			<li>
				<label>任务名：</label>
				<input type="password" class="easyui-validatebox" id="addTaskDlg_password" maxlength="20" required="true"></input>
			</li><br>
			<li>
				<label>用户&nbsp; id：</label>
				<input type="text" class="easyui-validatebox" id="addTaskDlg_role" maxlength="20" required="true"></input>
			</li><br>
			<li>
				<a href="#" class="easyui-linkbutton" icon="icon-ok" onclick="addTaskDlg_submit()">提交</a>
			</li>
		</ul>
	</div>
<!-- 编辑用户 -->	
<div id="editTaskDlg" icon="icon-save" class="easyui-dialog" closed="true"
	style="padding: 5px; width: 500px; height: 300px;">
	<h5 id="loginInfoEdit_message" style="color: red;"></h5>
		<input type="hidden" id="editTaskDlg_taskid"></input>
        <ul>
        	<li>
				<label>任务id：</label>
				<lable id="editTaskDlg_taskId"></lable>
			</li><br>
			<li>
				<label>任务名：</label>
				<input type="text" class="easyui-validatebox" id="editTaskDlg_taskname" maxlength="20" required="true"></input>			
			</li><br>
			<li>
				<a href="#" class="easyui-linkbutton" icon="icon-ok" onclick="editTaskDlg_submit()">提交</a>
			</li>
		</ul>
	</div>
</body>
</html>