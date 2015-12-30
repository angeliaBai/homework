function login(){
	var path = request.getContextPath();
	var username=$('#Inputuser_name').val();
	var password=$('Input_pwd').val();
	$.ajax({
		  type: 'POST',
		  url: '/springmvc_mybatis1208/user/checkLogin.action',
		  data: {username:username,
			  password:password
		  },
		  success: function(msg){
              if(msg==1){
            	  window.location.href=path+'/Manager_main.jsp';
              }else{
                  alert("用户名或密码错误！");
              }},
		  dataType: dataType
		});
}