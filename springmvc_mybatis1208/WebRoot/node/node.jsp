<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>  
<!doctype html>
<html>
<head>
 <%String path = request.getContextPath(); %>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta name="keywords" content="jquery,ui,easy,easyui,web">
    <meta name="description" content="easyui help you build your web page easily!">
    <title>节点信息列表</title>
    <link rel="stylesheet" type="text/css" href="<%=path%>/easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="<%=path%>/easyui/themes/icon.css">
    <script src="<%=path%>/easyui/jquery.min.js"></script>
    <script src="<%=path%>/easyui/jquery.easyui.min.js"></script>
    <script src="<%=path%>/easyui/locale/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript" src="<%=path%>/js/datagrid-detailview.js"></script>
    <script src="<%=path%>/js/node.js"></script>
</head>
<body>
<h2 style="text-align: center;">节点信息列表</h2>
<table id="dg"></table>
<div id="tb" style="padding:3px">
    <span>节点IP</span>
    <input id="nodeIp" style="line-height:22px;border:1px solid #ccc">
    <span>任务id</span>
    <input id="taskId" style="line-height:22px;border:1px solid #ccc">
    <a href="#" class="easyui-linkbutton" plain="true" iconCls="icon-search" onclick="loadData()">搜索</a>
    &nbsp; &nbsp; &nbsp;
    <input id="timeSeconds" placeholder="单位：秒" style="line-height:22px;border:1px solid #ccc;width: 55px"/>
    <a href="#" class="easyui-linkbutton" plain="true" iconCls="icon-reload" onclick="refresh()">刷新</a>
    <span id="msg"></span>
 <!-- <a href="#" id="addNodeBtn" class="easyui-linkbutton"  onclick="addNode()" iconCls="icon-add" plain="true">添加</a> -->   
    <a href="#" id="addNodeBtn" class="easyui-linkbutton"  onclick="setDialog_add()" iconCls="icon-add" plain="true">添加</a>     
     <a href="#" id="delBatchNodesBtn" class="easyui-linkbutton"  onclick="deleteBatchNodes()" iconCls="icon-remove" plain="true">批量删除</a>
</div>
<!-- 新建节点 -->
<div id="addNodeDlg" icon="icon-save" class="easyui-dialog" closed="true"
	style="padding: 5px; width: 500px; height: 300px;">
	<h5 id="loginInfoEdit_message" style="color: red;"></h5>
		<input type="hidden" id="addNodeDlg_nodeid"></input>
        <ul>
			<li>
				<label>节点IP：</label>
				<input type="text" class="easyui-validatebox" id="addNodeDlg_NodeIp" maxlength="20" required="true"></input>			
			</li><br>
			<li>
				<a href="#" class="easyui-linkbutton" icon="icon-ok" onclick="addNodeDlg_submit()">提交</a>
			</li>
		</ul>
	</div>
<!-- 编辑节点信息 -->	
<div id="editNodeDlg" icon="icon-save" class="easyui-dialog" closed="true"
	style="padding: 5px; width: 500px; height: 300px;">
	<h5 id="loginInfoEdit_message" style="color: red;"></h5>
		<input type="hidden" id="editNodeDlg_nodeId"></input>
        <ul>
        	<li>
				<label>节点id：</label>
				<lable id="editNodeDlg_nodeId"></lable>
			</li><br>
			<li>
				<label>节点ip：</label>
				<lable id="editNodeDlg_nodeIp"></lable>
			</li><br>
			<li>
				<a href="#" class="easyui-linkbutton" icon="icon-ok" onclick="editNodeDlg_submit()">提交</a>
			</li>
		</ul>
	</div>
</body>
</html>