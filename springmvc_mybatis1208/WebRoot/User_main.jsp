<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>云管理系统</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap3/css/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap3/css/bootstrap-theme.min.css">
<script src="${pageContext.request.contextPath}/bootstrap3/js/jquery-1.11.2.min.js"></script>
<script src="${pageContext.request.contextPath}/bootstrap3/js/bootstrap.min.js"></script>
<meta name="viewpoint" content="width=divice-width,intial-scale=1.0">
<!--[if lt IE 9]>
<script type="text/javascript">FileManager.get('http://core.pc.lietou-static.com/revs/js/common/html5shiv_62ac5721.js');</script>
<![endif]-->
<!--[if IE 6]>
<script type="text/javascript">FileManager.get('http://core.pc.lietou-static.com/revs/js/common/DD_belatedPNG_849d7004.js');</script>
<script>DD_belatedPNG.fix('.pngfix');</script>
<![endif]--><!--[if lt IE 9]>
<script type="text/javascript">FileManager.get('http://core.pc.lietou-static.com/revs/js/common/html5shiv_62ac5721.js');</script>
<![endif]-->
<!--[if IE 6]>
<script type="text/javascript">FileManager.get('http://core.pc.lietou-static.com/revs/js/common/DD_belatedPNG_849d7004.js');</script>
<script>DD_belatedPNG.fix('.pngfix');</script>
<![endif]-->
</head>
<body style="margin: 50px; font-family:Arial;font-size: 16px;line-height: 18px;background-color: #28A4C9;" >
		<nav class="nav navbar-primary navbar-fixed-top" role="navigation"style="background-color: #265A88;">
   		<div class="collapse navbar-collapse "style="padding:0 200px;font-family: 'arial black';20px;#fff">
	   		<ul class="nav navbar-nav"> 
	   			<li><a href="#" class="navber-link">欢迎使用云管理系统</a></li>
               
	   		</ul>
	   		<div class="navbar-form  navbar-right" id="mytab">
	   			<ul class="nav navbar-nav" >
	   			 <li><a href="#" class="navber-link">返回首页</a></li>
                 <li><a href="#" class="navber-link">安全退出</a></li>
	   		</ul>
	   		</div>
   		</div>
   	</div>
   </nav>
<div style="height: 20px;"></div>
   <div class="container " style="background-image:  url(image/bg.jpg)">
   	<div class="row">
   		<div class="col-md-2"></div>
   		<div class="col-md-8"  style="background-image: url(image/bg2.jpg); padding:30px 50px;margin:80px 50px">
   		  
   		  <div class="col-md-12"><br/><br/> <br/></div>
	<%
  String username = request.getParameter("username");
  %>
			<h3>亲爱的<%=username %>，欢迎您！</h3>
			<br/><br/>
            <div class="col-md-6">
              <button type="submit " class="btn btn-primary btn-lg " pull-right>查看/修改个人信息</button>    
             </div>
            <div class="col-md-6 "> 
        <button id="btn1"class="btn btn-primary btn-lg  pull-right" type="button">查看已发布的任务</button>
<div class="modal fade" id="mymodal1">
    <div class="modal-dialog">
        <div class="modal-content">
        	<div class="modal-header">
				<button type="button" class="close " data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
				<h3 class="modal-title">亲爱的用户，您近一个月发布的任务如下:</h3>
			</div>
			<div class="modal-body">
				<div class="table-responsive">
                <table class="table table-bordered table-responsive ">
			<thead>
				<tr class="info">
					<th>任务名称</th>
					<th>发布时间</th>
					<th>执行时间</th>
                    <th>结束时间</th>
                    <th>优先级</th>
                    <th>是否公开</th>
                    <th>执行结果</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>《图解CSS3》</td>
					<td>2015-11-19</td>
                    <td>2015-11-19</td>
                    <td>2015-11-19</td>
                    <td>2015-11-19</td>
                    <td>1</td>
                    <td>1</td>                 
				</tr>
                <tr>
					<td>《图解CSS3》</td>
					<td>2015-11-19</td>
                    <td>2015-11-19</td>
                    <td>2015-11-19</td>
                    <td>2015-11-19</td>
                    <td>1</td>
                    <td>1</td>                 
				</tr>
                 <tr>
					<td>《图解CSS3》</td>
					<td>2015-11-19</td>
                    <td>2015-11-19</td>
                    <td>2015-11-19</td>
                    <td>2015-11-19</td>
                    <td>1</td>
                    <td>1</td>                 
				</tr>
			</tbody>
		</table></div>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
				<button type="button" class="btn btn-primary">保存</button>
			</div>
		</div><!-- /.modal-content -->
	</div><!-- /.modal-dialog -->
</div><!-- /.modal -->
            </div>
           <div class="col-md-12"><br/><br/> <br/></div>
       <div class="col-md-6"> 
        <div class="dropdown">
  <button class="btn btn-primary btn-lg dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown">
   &nbsp; &nbsp; &nbsp;&nbsp;发布任务 &nbsp; &nbsp; &nbsp; &nbsp;
    <span class="caret"></span>
  </button>
  <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
   
     <li role="presentation"><a role="menuitem" tabindex="-1" href="#">快捷发布任务</a></li>
    <li role="presentation" class="divider"></li>
    <li role="presentation"><a role="menuitem" tabindex="-1" href="#">普通发布任务</a></li>
  </ul>
</div>     
        </div>
            <div class="col-md-6 ">
         <button  id="btn2" class="btn btn-primary btn-lg  pull-right" type="button">查看当前发布的任务</button>
<div class="modal fade" id="mymodal2">
    <div class="modal-dialog">
        <div class="modal-content">
        	<div class="modal-header">
				<button type="button" class="close " data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
				<h3 class="modal-title">亲爱的用户，您当前发布的任务如下:</h3>
			</div>
			<div class="modal-body">
				<div class="table-responsive">
                <table class="table table-bordered table-responsive ">
			<thead>
				<tr class="info">
					<th>任务名称</th>
					<th>发布时间</th>
					<th>执行时间</th>
                    <th>结束时间</th>
                    <th>优先级</th>
                    <th>是否公开</th>
                    <th>执行结果</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>《图解CSS3》</td>
					<td>2015-11-19</td>
                    <td>2015-11-19</td>
                    <td>2015-11-19</td>
                    <td>2015-11-19</td>
                    <td>1</td>
                    <td>1</td>                 
				</tr>
                <tr>
					<td>《图解CSS3》</td>
					<td>2015-11-19</td>
                    <td>2015-11-19</td>
                    <td>2015-11-19</td>
                    <td>2015-11-19</td>
                    <td>1</td>
                    <td>1</td>                 
				</tr> 
			</tbody>
		</table></div>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
				<button type="button" class="btn btn-primary">保存</button>
			</div>
		</div><!-- /.modal-content -->
	</div><!-- /.modal-dialog -->
</div><!-- /.modal -->
      </div>
    </div>
</div>
<div class="col-md-2"></div>
<script type="text/javascript" src="jquery-2.1.1/jquery.min.js"></script>
<script type="text/javascript" src="bootstrap-3.3.5-dist/js/bootstrap.min.js"></script>
<script>
  $(function(){
    $("#btn1").click(function(){
      $("#mymodal1").modal("toggle");
    });
  });
   $(function(){
    $("#btn2").click(function(){
      $("#mymodal2").modal("toggle");
    });
  });
</script>
</body>
</html>
