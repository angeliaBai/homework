var expandedRows = []; 
$(function () {
    $('#dg').datagrid({
        url: '/springmvc_mybatis1208/user/pageList.action',
        columns: [[
            { 
            	field: 'ck', 
            	checkbox: true, 
            	width:10 },  //复选框 
            {
                field: 'userid',
                title: 'userid',
                width:10
             },
               
            {
                field: 'username',
                title: '用户名',
                width:30
            },
            {
                field: 'password',
                title: '密码',
                width:30
            },
            {
                field: 'role',
                title: '角色',
                width: 30,
            }, 
            {field:'opt',title:'操作',width:60,align:'center',  
                formatter:function(value,rec,index){    
                    var e = '<a href="#" mce_href="#" onclick="edit(\''+ rec.userid + '\')"">编辑</a> ';  
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
        title: "用户列表",
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
      window.location.href='editUser.jsp?userid='+bh;  
}  
  
function del(index){  //删除操作  
  $.messager.confirm('确认','确认删除?',function(row){  
      if(row){  
          var selectedRow = $('#dg').datagrid('getSelected');  //获取选中行  
          $.ajax({  
              url:'deleteUser.action?userid='+selectedRow.userid,    
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
function deleteBatchUsers() {
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
                ids = selRow[i].userid;
            } else {
                ids = selRow[i].userid + "," + ids;
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
                url: "deleteBatchUsers.action?ids=" + ids,
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
function addUser(){
	window.location.href='addUser1.jsp';  
}
//添加user对话框
//设置弹出框的属性
function setDialog_add(){
	$('#addUserDlg').dialog("open").dialog(
		'setTitle','添加用户');
	$('#addUserDlg_username').val('');
	$('#addUserDlg_password').val('');
	$('#addUserDlg_role').val('');
}
function addUserDlg_submit(){
	var username=$('#addUserDlg_username').val();
	var password=$('#addUserDlg_password').val();
	var role=$('#addUserDlg_role').val();
    $.ajax({
        type: "POST",
        url: "addUser.action",
        data: {  
            username: username,
            password: password,
            role:role
        },
        success: function (result) {
                $.messager.alert("提示", "恭喜您，添加用户成功！", "info");
                $('#dg').datagrid('reload');
        }
    });
    closeaddUserDialog();
}
//关闭对话框
function closeaddUserDialog(){
	$('#addUserDlg').dialog('close');
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
       username: $('#username').val(),
       role: $('#role').val()
    });
}

