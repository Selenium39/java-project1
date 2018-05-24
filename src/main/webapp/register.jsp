<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register</title>
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
</head>
<body>
	<form class="form-horizontal" method="post" action="RegisterServlet">
		<div class="form-group">
			<label for="employeeName" class="col-sm-2 control-label">员工姓名:</label>
			<div class="col-sm-4">
				<input type="input" class="form-control" id="employeeName"
					placeholder="username" name="employeeName">
			</div>
		</div>
		<div class="form-group">
			<label for="employeePassword" class="col-sm-2 control-label">员工密码:</label>
			<div class="col-sm-4">
				<input type="input" class="form-control" id="employeePassword"
					placeholder="password" name="employeePassword">
			</div>
		</div>
		<div class="form-group">
			<label for="employeeSex" class="col-sm-2 control-label">员工性别:</label>
			<div class="col-sm-1">
				<select class="form-control" name="employeeSex">
					<option value="male">男</option>
					<option value="female">女</option>
				</select>
			</div>
		</div>
		<div class="form-group">
			<label for="employeeBirth" class="col-sm-2 control-label">员工出生日期:</label>
			<div class="col-sm-4">
				<input type="date" class="form-control" id="employeeBirth" name="employeeBirth">
			</div>
		</div>
		<div class="form-group">
			<label for="employeePhone" class="col-sm-2 control-label">员工电话号码:</label>
			<div class="col-sm-4">
				<input type="input" class="form-control" id="employeePhone" name="employeePhone">
			</div>
		</div>
		<div class="form-group">
			<label for="employeePlace" class="col-sm-2 control-label">员工住址:</label>
			<div class="col-sm-4">
				<input type="input" class="form-control" id="employeePlace" name="employeePlace">
			</div>
		</div>
		<div class="form-group">
			<label for="joinTime" class="col-sm-2 control-label">员工录入时间:</label>
			<div class="col-sm-4">
				<input type="date" class="form-control" id="joinTime" name="joinTime">
			</div>
		</div>

		<div class="form-group">
			<div class="col-sm-4">
				<input type="hidden" class="form-control" id="isLead" value="false" name="isLead">
			</div>
		</div>
		<div class="form-group">
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-success">注册</button>
					<button type="reset" class="btn btn-warning">重置</button>
				</div>
			</div>
		</div>
	</form>

</body>
</html>