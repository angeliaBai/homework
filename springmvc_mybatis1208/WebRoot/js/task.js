var expandedRows = []; 
$(function () {
    $('#dg').datagrid({
        url: '/springmvc_mybatis1208/task/pageList.action',
        columns: [[
            { 
            	field: 'ck', 
            	checkbox: true, 
            	width:10 },  //复选框 
            {
                field: 'taskid',
                title: '任务id',
                width:10
             },
               
            {
                field: 'taskname',
                title: '任务名',
                width:30
            },
            {
                field: 'taskid',
                title: '用户id',
                width:30
            },
            {
                field: 'starttime',
                title: '任务开始时间',
                width: 30,
            }, 
            {
                field: 'runtime',
                title: '任务运行时间',
                width: 30,
            },
            {
                field: 'endtime',
                title: '任务结束时间',
                width: 30,
            },
            {
                field: 'status',
                title: '任务状态',
                width: 30,
            }, 
            {
                field: 'interval',
                title: '任务运行时间间隔',
                width: 30,
            },
            {
                field: 'jarurl',
                title: 'jar包所在路径',
                width: 30,
            },
            {
                field: 'finishrate',
                title: '任务结束时间',
                width: 30,
            },
            {
                field: 'logurl',
                title: '日志所在路径',
                width: 30,
            },
            {field:'opt',title:'操作',width:60,align:'center',  
                formatter:function(value,rec,index){    
                    var e = '<a href="#" mce_href="#" onclick="edit(\''+ rec.taskid + '\')"">编辑</a> ';  
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
        title: "任务列表",
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
      window.location.href='editTask.jsp?taskid='+bh;  
}  
  
function del(index){  //删除操作  
  $.messager.confirm('确认','确认删除?',function(row){  
      if(row){  
          var selectedRow = $('#dg').datagrid('getSelected');  //获取选中行  
          $.ajax({  
              url:'deleteTask.action?taskid='+selectedRow.taskid,    
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
function deleteBatchTasks() {
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
                ids = selRow[i].taskid;
            } else {
                ids = selRow[i].taskid + "," + ids;
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
                url: "deleteBatchTasks.action?ids=" + ids,
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
function addTask(){
	window.location.href='addTask1.jsp';  
}
//添加task对话框
//设置弹出框的属性
function setDialog_add(){
	$('#addTaskDlg').dialog("open").dialog(
		'setTitle','添加用户');
	$('#addTaskDlg_taskname').val('');
	$('#addTaskDlg_taskid').val('');
}
function addTaskDlg_submit(){
	var taskname=$('#addTaskDlg_taskname').val();
	var password=$('#addTaskDlg_taskid').val();

    $.ajax({
        type: "POST",
        url: "addTask.action",
        data: {  
            taskname: taskname,
            taskid: taskid
        },
        success: function (result) {
                $.messager.alert("提示", "恭喜您，添加用户成功！", "info");
                $('#dg').datagrid('reload');
        }
    });
    closeaddTaskDialog();
}
//关闭对话框
function closeaddTaskDialog(){
	$('#addTaskDlg').dialog('close');
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
       taskname: $('#taskname').val(),
       taskid: $('#taskid').val()
    });
}