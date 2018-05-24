<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
        "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>PublishMessage</title>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
<script src="static/jquery-3.2.1.min.js"
	type="text/javascript"></script>
<!--自定义的jquery-->
<script type="text/javascript">
	$(document).ready(function() {
		var publishTime =new Date();
	    function formatTime(date) {
			var y = date.getFullYear();
			var m = date.getMonth() + 1;
			m = m < 10 ? ('0' + m) : m;
			var d = date.getDate();
			d = d < 10 ? ('0' + d) : d;
			return y + '-' + m + '-' + d;
			};
		var formatDateTime=formatTime(publishTime);
		$("#publishTime").val(formatDateTime);
		$("#btn2").click(function(){
			$(location).attr('href','publishReply.jsp');
		});
	});
</script>
<script type="text/javascript" charset="utf-8"
	src="utf8-jsp/ueditor.config.js"></script>
<script type="text/javascript" charset="utf-8"
	src="utf8-jsp/ueditor.all.min.js">
	
</script>
<!--建议手动加在语言，避免在ie下有时因为加载语言失败导致编辑器加载失败-->
<!--这里加载的语言文件会覆盖你在配置项目里添加的语言类型，比如你在配置项目里配置的是英文，这里加载的中文，那最后就是中文-->
<script type="text/javascript" charset="utf-8" src="lang/zh-cn/zh-cn.js"></script>
<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet"
	href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script
	src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"
	integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
	crossorigin="anonymous"></script>
<style type="text/css">
div {
	width: 100%;
}

h1 {
	margin-left: 200px;
}
</style>
</head>
<body>
	<h1>PublishMessage</h1>
	<div>
		<form method="post" action="PublishMessageServlet">
			<h2>标题:</h2>
			<input type="text" name="title"><br />
			<h2>内容:</h2>
			<script id="editor" type="text/plain"
				style="width:1024px;height:500px;"></script>
			<input id="publishTime" type="hidden" type="date" name="publishTime">
			<button type="submit" class="btn btn-primary">提交</button>
		</form>
	</div>
	<script type="text/javascript">
		//实例化编辑器
		//建议使用工厂方法getEditor创建和引用编辑器实例，如果在某个闭包下引用该编辑器，直接调用UE.getEditor('editor')就能拿到相关的实例
		var ue = UE.getEditor('editor');
	</script>
</body>
</html>