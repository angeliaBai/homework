<!doctype html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="keywords" content="jquery,ui,easy,easyui,web">
    <meta name="description" content="easyui help you build your web page easily!">
    <title>日志</title>
    <link rel="stylesheet" type="text/css" href="/easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="/easyui/themes/icon.css">
    <script src="/easyui/jquery.min.js"></script>
    <script src="/easyui/jquery.easyui.min.js"></script>
    <script src="/easyui/locale/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript" src="/js/datagrid-detailview.js"></script>
    <script src="/js/log.js"></script>
</head>
<body>
<h2 style="text-align: center;">日志</h2>
<table id="dg"></table>
<div id="tb" style="padding:3px">
    <span>开始时间</span>
    <input id="startTime" class="easyui-datetimebox" style="line-height:22px;border:1px solid #ccc"
           validType="lessThan['#endTime']">
    <span>结束时间</span>
    <input id="endTime" class="easyui-datetimebox" style="line-height:22px;border:1px solid #ccc"
           validType="greaterThan['#startTime']">
    <span>Header</span>
    <input id="header" style="line-height:22px;border:1px solid #ccc">
    <span>设备ID</span>
    <input id="deviceId" style="line-height:22px;border:1px solid #ccc;width: 300px">
    <a href="#" class="easyui-linkbutton" plain="true" iconCls="icon-search" onclick="loadData()">搜索</a>
    &nbsp; &nbsp; &nbsp;
    <input id="timeSeconds" placeholder="单位：秒" style="line-height:22px;border:1px solid #ccc;width: 55px"/>
    <a href="#" class="easyui-linkbutton" plain="true" iconCls="icon-reload" onclick="refresh()">自动刷新</a>
    <span id="msg"></span>
</div>
</body>
</html>