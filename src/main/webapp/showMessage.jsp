<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>show Message</title>
<script src="static/jquery-3.2.1.min.js" type="text/javascript"></script>
<!-- 自定义jquery -->
<script type="text/javascript">
$(document).ready(function(){
	$("#btn1").click(function(){
		$(location).attr('href','ShowReplyServlet');
	});
	$("#btn2").click(function(){
		$(location).attr('href','publishReply.jsp');
	});
});

</script>
<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="static/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="static/bootstrap.min.js"
	integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
	crossorigin="anonymous"></script>
<style type="text/css">
body {
	background-image: url("./images/004.jpg");
}

.showMessage {
	margin: 0 auto;
	width: 500px;
	height: 600px;
	border: 2px solid;
	width: 500px;
	background-image: url("./images/60.jpg");
}

h5 {
	font-size: 15px;
}

.showReply {
	height: 100px;
	width: 500px;
	padding-top: 300px;
}

#btn1 {
	background-color: pink;
}

#btn2 {
	background-color: pink;
}
</style>
</head>
<body>
	<h1 align="center">Show All Messages</h1>
	<c:forEach items="${sessionScope.messages}" var="message">
		<div class="showMessage" align="center">
			<h2>${ message.title}</h2>
			</br>
			<hr style="height: 3px; border: none; border-top: 3px double red;" />
			<h5>${message.content}</h5>
			<div class="showReply">
				<button class="btn btn-success" id="btn1">查看回复</button>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<button class="btn btn-primary" id="btn2">回复</button>
			</div>
			<br />
		</div>
	</c:forEach>
</body>
</html>