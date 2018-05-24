<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored ="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Reply</title>
<style type="text/css">
body {
	background-image: url("./images/004.jpg");
}
div{
	margin: 0 auto;
	width: 500px;
	height: 600px;
	border: 2px solid;
	width: 500px;
	background-image: url("./images/60.jpg");
}
h2{
 padding:100px;

}
</style>
</head>
<body>
<div>
<h2>${sessionScope.employee.employeeName}:${sessionScope.reply.content}</h2>
</div>
</body>
</html>