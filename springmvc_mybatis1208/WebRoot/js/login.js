function loginUser() {
	var username = $('#Inputuser_name').val();
	var password = $('#Input_pwd').val();
	$.ajax({
				type : 'POST',
				url : '/springmvc_mybatis1208/user/verifyUser.action',
				data : {
					username : username,
					password : password
				},
				success : function(msg) {
					if (msg == 1) {
						window.location.href = '/springmvc_mybatis1208/User_main.jsp?username='+username;
					} else {
						alert("用户名或密码错误！");
					}
				},
			});
}
function loginManager() {
	var username = $('#InputManager_name').val();
	var password = $('#InputManager_pwd').val();
	$.ajax({
				type : 'POST',
				url : '/springmvc_mybatis1208/user/verifyUser.action',
				data : {
					username : username,
					password : password
				},
				success : function(msg) {
					if (msg == 1) {
						window.location.href = '/springmvc_mybatis1208/Manager_main.jsp?username='+username;
					} else {
						alert("用户名或密码错误！");
					}
				},
			});
}
function register() {
	var username = $('#Inputuser_name').val();
	var password = $('#Input_pwd').val();
	var repassword = $('#Input_repwd').val();
	
	$.ajax({
		type : 'POST',
		url : '/springmvc_mybatis1208/user/ifUserExist.action',
		data : {
			username : username
		},
		success : function(msg) {
			if (msg == 1) {
				alert("用户名已存在，请修改");
			}
			else if (password != repassword) {
				alert("两次输入的密码不一致！");
			} 
			else {
				$.ajax({
					type : 'POST',
					url : '/springmvc_mybatis1208/user/registerUser.action',
					data : {
						username : username,
						password : password
					},
					success : function(msg) {
						if (msg == 1) {
							window.location.href = '/springmvc_mybatis1208/Manager_main.jsp?username='+username;
						} else {
							alert("注册失败，请重新注册！");
						}
					},
				});
			}
	}
});
}
