<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>商家管理</title>

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/normalize.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/demo.css">
<!--必要样式-->
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/component.css">
<!--[if IE]><script src="souye/js/html5.js"></script><![endif]-->

<style type="text/css">
#Layer1 {position:absolute;	width:100%;	z-index:2;	top: 60%;}
.STYLE3 {font-size: medium}
</style>

</head>
<body>

<div class="container demo-1">
	<div class="content">
		<div id="large-header" class="large-header" style="height: 917px;">
			<canvas id="demo-canvas" width="1920" height="917"></canvas>
			<h1 class="main-title">SORRY!<br><span class="STYLE3">您还没有商家入住哦~</span><br>
			<span class="STYLE3">赶紧加入我们吧!</span></h1>
		</div>
		<div id="Layer1">
			<nav class="codrops-demos">
				<a href="${pageContext.request.contextPath}/page/index">网站首页</a>
				<a href="#">联系我们</a>
			</nav>
		</div>
	</div>
</div>
<script src="${pageContext.request.contextPath}/js/TweenLite.min.js"></script>
<script src="${pageContext.request.contextPath}/js/EasePack.min.js"></script>
<script src="${pageContext.request.contextPath}/js/rAF.js"></script>
<script src="${pageContext.request.contextPath}/js/demo-1.js"></script>
</body>
</html>