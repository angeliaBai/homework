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
   		<div class="col-md-1"></div>
   		<div class="col-md-10"  style="padding:0px 80px;margin:30px 50px">
   		  <h3>亲爱的用户，欢迎您！</h3>
         </br></br></br>
  <div class="panel panel-primary ">
    <div class="panel-heading">亲爱的用户，您近一个月发布的任务如下:</div>
	<div class="panel-body">
		<p>
		</p>
		<table class="table table-bordered">
			<thead>
				<tr>
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
		</table>
	</div>
	<div class="panel-footer">上次访问时间：2015-11-19</div>
</div>
<div class="pull-right">
        <button type="submit " class="btn btn-primary btn-lg ">返回</button>
        </div>
</div>
<div class="col-md-1"></div>
</body>
</html>
