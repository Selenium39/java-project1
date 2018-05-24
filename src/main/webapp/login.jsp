<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored ="false"%><!--注意要老版的jsp要加上isELIgnored ="false"  -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
<script src="static/jquery-3.2.1.min.js"
	type="text/javascript"></script>
<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet"
	href="static/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script
	src="static/bootstrap.min.js"
	integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
	crossorigin="anonymous"></script>
<style type="text/css">
#error{
 color:red;
 align:center;
}
</style>
</head>
<body>
	<div id="login">
		<form class="form-horizontal" method="post" action="LoginServlet">
			<div class="form-group">
				<label for="employeeName" class="col-sm-2 control-label">员工姓名：</label>
				<div class="col-sm-4">
					<input type="input" class="form-control" id="employeeName" name="employeeName"
						placeholder="username">
				</div>
				<span id="error">${requestScope.error}</span><!--提示error  -->
			</div>
			<div class="form-group">
				<label for="password" class="col-sm-2 control-label">员工密码：</label>
				<div class="col-sm-4">
					<input type="password" class="form-control" id="password" name="employeePassword"
						placeholder="Password">
				</div>
			</div>
			<div class="form-group">
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<button type="submit" class="btn btn-success">登录</button>
						<button type="reset" class="btn btn-warning">重置</button>
					</div>
				</div>
			</div>
		</form>

	</div>
</body>
</html>