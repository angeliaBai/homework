var expandedRows = []; 
$(function () {
    $('#dg').datagrid({
        url: '/springmvc_mybatis1208/node/pageList.action',
        columns: [[
            { 
            	field: 'ck', 
            	checkbox: true, 
            	width:10 },  //复选框 
            {
                field: 'nodeid',
                title: '节点ID',
                width:10
             },
               
            {
                field: 'nodeip',
                title: '节点IP',
                width:30
            },
            {
                field: 'taskid',
                title: '任务Id',
                width:30
            },
            {
                field: 'cpurate',
                title: 'cpu使用率',
                width: 30,
            }, 
            {
                field: 'memoryrate',
                title: '内存占用率',
                width: 30,
            },
            {field:'opt',title:'操作',width:60,align:'center',  
                formatter:function(value,rec,index){    
                    var e = '<a href="#" mce_href="#" onclick="edit(\''+ rec.nodeid + '\')"">编辑</a> ';  
                    var d = '<a href="#" mce_href="#" onclick="del(\''+ index + '\')"">删除</a> ';  
                    return e+d;  
                    return e;
                }  
            } 
        ]],
        singleSelect: false, //允许选择多行  
        selectOnCheck: true,//true勾选会选择行，false勾选不选择行, 1.3以后有此选项。重点在这里  
        checkOnSelect: true, //true选择行勾选，false选择行不勾选, 1.3以后有此选项            
        fitColumns: true,
        title: "节点信息列表",
        toolbar: "#tb",
        rownumbers: "true",
        pagination: "true",
        pageSize: 10,
        pageList: [10, 20, 30, 40, 50],
        view: detailview,
        detailFormatter: function (index, row) {
            return '<div id="ddv-' + index + '" style="padding:5px 0"><pre>' + row.json + '</pre></div>';
        },
        onDblClickRow: function (index, row) {
            if (expandedRows.indexOf(index) != -1) {
                $('#dg').datagrid('collapseRow', index);
                $('#dg').datagrid('refreshRow', index).datagrid('expandRow', index).datagrid('collapseRow', index);
                expandedRows = $.grep(expandedRows, function (value) {
                    return value != index;
                });
            } else {
                $('#dg').datagrid('expandRow', index);
                $('#dg').datagrid('refreshRow', index).datagrid('collapseRow', index).datagrid('expandRow', index);
                expandedRows.push(index);
            }
        },
        onExpandRow: function (index, row) {
            $('#ddv-' + index).panel({
                border: false,
                cache: false,
                onLoad: function () {
                    $('#dg').datagrid('fixDetailRowHeight', index);
                }
            });
            $('#dg').datagrid('fixDetailRowHeight', index);
        }
    });
    loadData();
});
function edit(bh)  //转到编辑页面  
{  
      window.location.href='editNode.jsp?nodeid='+bh;  
}  
  
function del(index){  //删除操作  
  $.messager.confirm('确认','确认删除?',function(row){  
      if(row){  
          var selectedRow = $('#dg').datagrid('getSelected');  //获取选中行  
          $.ajax({  
              url:'deleteNode.action?nodeid='+selectedRow.nodeid,    
//加了个type，作用是以后不管什么删除，都可以转到这个ashx中处理  
              success:function(){alert('删除成功');}  
          });  
          $('#dg').datagrid('deleteRow',index);  
      }  
  })  
}  
(function () {
    $.extend($.fn.validatebox.defaults.rules, {
        greaterThan: {
            validator: function (value, param) {
                var v1 = $(param[0]).datetimebox('getValue');
                if (!v1 || !value) {
                    return true;
                }
                return value > v1;
            },
            message: '结束时间应大于开始时间'
        },
        lessThan: {
            validator: function (value, param) {
                var v1 = $(param[0]).datetimebox('getValue');
                if (!v1 || !value) {
                    return true;
                }
                return value < v1;
            },
            message: '开始时间应小于结束时间'
        }
    });
})();
function deleteBatchNodes() {
    //返回选中多行
    var selRow = $('#dg').datagrid('getSelections');
    //判断是否选中行
    if (selRow.length==0) {
        $.messager.alert("提示", "请选择要删除的行！", "info");
        return;
    }else{    
        var ids="";
        //批量获取选中行的评估模板ID
        for (var i = 0; i < selRow.length;i++) {
            if (ids =="") {
                ids = selRow[i].nodeid;
            } else {
                ids = selRow[i].nodeid + "," + ids;
            }               
        }
                  
        $.messager.confirm('提示', '是否删除选中数据?', function (r) {

            if (!r) {
                return;
            }
            //提交
            $.ajax({
                type: "POST",
                async: false,
                url: "deleteBatchNodes.action?ids=" + ids,
                data: ids,
                success: function (result) {
                        $('#dg').datagrid('clearSelections');
                        $.messager.alert("提示", "恭喜您，信息删除成功！", "info");
                        $('#dg').datagrid('reload');
                }
            });
        });

    }
};
function addNode(){
	window.location.href='addNode1.jsp';  
}
//添加node对话框
//设置弹出框的属性
function setDialog_add(){
	$('#addNodeDlg').dialog("open").dialog(
		'setTitle','添加节点');
	$('#addNodeDlg_NodeIp').val('');
}
function addNodeDlg_submit(){
	var nodeIp=$('#addNodeDlg_NodeIp').val();
    $.ajax({
        type: "POST",
        url: "addNode.action",
        data: {  
        	nodeIp:nodeIp
        },
        success: function (result) {
                $.messager.alert("提示", "恭喜您，添加用户成功！", "info");
                $('#dg').datagrid('reload');
        }
    });
    closeaddNodeDialog();
}
//关闭对话框
function closeaddNodeDialog(){
	$('#addNodeDlg').dialog('close');
}
var interval;
function refresh() {
    var delay = $('#timeSeconds').val();
    if ($.isNumeric(delay)) {
        if (interval) {
            clearInterval(interval);
        }
        $('#msg').hide();
        interval = setInterval(loadData, delay * 1000);
    } else {
        $('#msg').text('时间请输入数字').show();
    }
}

function loadData() {
    $('#dg').datagrid('load', {
    	nodeIp: $('#nodeIp').val(),
    	taskId: $('#taskId').val()
    });
}