<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>登陆</title>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/login/css/jigsaw.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/login/bootstrap.min.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/login/css/camera.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/login/bootstrap-responsive.min.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/login/matrix-login.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/login/font-awesome.css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/login/js/jquery-1.5.1.min.js"></script>
<!-- 软键盘控件start -->
<link href="${pageContext.request.contextPath}/login/keypad/css/framework/form.css" rel="stylesheet" type="text/css"/>
<!-- 软键盘控件end -->
 <style type="text/css">
	
      .cavs{
    	z-index:1;
    	position: fixed;
    	width:95%;
    	margin-left: 20px;
    	margin-right: 20px;
    }
		
  </style>
  <script>
  		//window.setTimeout(showfh,3000); 
  		var timer;
		function showfh(){
			fhi = 1;
			//关闭提示晃动屏幕，注释掉这句话即可
			timer = setInterval(xzfh2, 10); 
		};
		var current = 0;
		function xzfh(){
			current = (current)%360;
			document.body.style.transform = 'rotate('+current+'deg)';
			current ++;
			if(current>360){current = 0;}
		};
		var fhi = 1;
		var current2 = 1;
		function xzfh2(){
			if(fhi>50){
				document.body.style.transform = 'rotate(0deg)';
				clearInterval(timer);
				return;
			}
			current = (current2)%360;
			document.body.style.transform = 'rotate('+current+'deg)';
			current ++;
			if(current2 == 1){current2 = -1;}else{current2 = 1;}
			fhi++;
		};
		
		function regist(){
			$("#windows1").hide();
			$("#windows2").show();
		}
		
		//注册
		function rcheck(){
			if($("#USERNAME").val()==""){
				$("#USERNAME").tips({
					side:3,
		            msg:'输入用户名',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#USERNAME").focus();
				$("#USERNAME").val('');
				return false;
			}else{
				$("#USERNAME").val(jQuery.trim($('#USERNAME').val()));
			}
			if($("#PASSWORD").val()==""){
				$("#PASSWORD").tips({
					side:3,
		            msg:'输入密码',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#PASSWORD").focus();
				return false;
			}
			if($("#PASSWORD").val()!=$("#chkpwd").val()){
				$("#chkpwd").tips({
					side:3,
		            msg:'两次密码不相同',
		            bg:'#AE81FF',
		            time:3
		        });
				$("#chkpwd").focus();
				return false;
			}
			if($("#name").val()==""){
				$("#name").tips({
					side:3,
		            msg:'输入姓名',
		            bg:'#AE81FF',
		            time:3
		        });
				$("#name").focus();
				return false;
			}
			if ($("#rcode").val() == "") {
				$("#rcode").tips({
					side : 1,
					msg : '验证码不得为空',
					bg : '#AE81FF',
					time : 3
				});
				$("#rcode").focus();
				return false;
			}
			return true;
		}
		//提交注册
		function register(){
			if(rcheck()){
				$.post("${pageContext.request.contextPath}/user/regist",$("#registForm").serialize(),function(data){
					if(data.result == "1"){
						alert("恭喜注册成功！快去登陆吧！");
						window.location.href='login';
					}else{
						alert("验证码不正确!");
					}
				
				},"json");
			}
			
		}
		
		var isPhone = 1;
		//验证手机号码
		function checkPhone(){
			var phone = $('#USERNAME').val();
			var pattern = /^1[0-9]{10}$/;
			isPhone = 1;
			if(!pattern.test(phone)){
				alert('请输入正确的手机号码');
				isPhone = 0;
				return;
			}
		}
		
		/*获取验证码*/
		function sendMessage(){
			checkPhone(); //验证手机号码
			if(isPhone){
				$.post("${pageContext.request.contextPath}/user/sendMessage",$("#registForm").serialize(),function(data){
					if(data == "1"){
						alert("用户已经存在！返回直接登陆哦！");
						window.location.href='login';
					}else{
						resetCode(); //倒计时
					}
				},"json");
				
			}else{
				$('#USERNAME').focus();
			}
			
		}
		//倒计时
		function resetCode(){
			$('#J_getCode').hide();
			$('#J_second').html('60');
			$('#J_resetCode').show();
			var second = 60;
			var timer = null;
			timer = setInterval(function(){
				second -= 1;
				if(second >0 ){
					$('#J_second').html(second);
				}else{
					clearInterval(timer);
					$('#J_getCode').show();
					$('#J_resetCode').hide();
				}
			},1000);
		}
	</script>

</head>
<body>
	
	<!--小键盘承载器-->
	<canvas class="cavs"></canvas>
	<div style="width:100%;height:300px;text-align: center;margin: 0 auto;position: absolute;">
		<!-- 登录 -->
		<div id="windows1">
		<div id="loginbox" >
			<form action="" method="post" name="loginForm" id="loginForm">
				<div class="control-group normal_text">
					<h3>
						<!--<img src="static/login/logo.png" alt="Logo" />-->
						网上订餐
					</h3>
				</div>
				<div class="control-group">
					<div class="controls">
						<div class="main_input_box">
							<span class="add-on bg_lg">
							<i><img height="37px" src="${pageContext.request.contextPath}/login/user.png" /></i>
							</span><input type="text" name="telephone" id="loginname" value="" placeholder="请输入手机号" />
						</div>
					</div>
				</div>
				<div class="control-group">
					<div class="controls">
						<div class="main_input_box">
							<span class="add-on bg_ly">
							<i><img height="37px" src="${pageContext.request.contextPath}/login/suo.png" /></i>
							</span><input type="password" name="password" id="password" placeholder="请输入密码" class="keypad" keypadMode="full" allowKeyboard="true" value=""/>
						</div>
					</div>
				</div>
<!-- 				验证 -->
				<p class="container">
				
				
				  <div id="captcha" style="position: relative;display: inline-block;"></div><br />
				  <span id="msg"></span>
				</p>	
							
				<div style="float:right;padding-right:10%;">
					<div style="float: left;margin-top:3px;margin-right:2px;">
						<font color="white">记住密码</font>
					</div>
					<div style="float: left;">
						<input name="form-field-checkbox" id="saveid" type="checkbox"
							onclick="savePaw();" style="padding-top:0px;" />
					</div>
				</div>
				<div class="form-actions">
					<div style="width:86%;padding-left:8%;">

					
						<c:if test="${pd.isZhuce == 'yes' }">
						<span class="pull-right" style="padding-right:3%;"><a href="javascript:changepage(1);" class="btn btn-success" onclick="regist()">注册</a></span>
						</c:if>
<!-- 						<span class="pull-right"><a onclick="severCheck();" class="flip-link btn btn-info" id="to-recover">登录</a></span> -->
					</div>
				</div>
			</form>
			<div class="controls">
				<div class="main_input_box">
					<font color="white"><span id="nameerr">Copyright © 吃了没科技有限公司 2019</span></font>
				</div>
			</div>
		</div>
		</div>
		<!-- 注册 -->
		<div id="windows2" style="display: none;">
		<div id="loginbox">
			<form action="" method="post" name="registForm" id="registForm">
				<div class="control-group normal_text">
					<h3>
						<!--<img src="static/login/logo.png" alt="Logo" />-->
						网上订餐
					</h3>
				</div>
				<div class="control-group">
					<div class="controls">
						<div class="main_input_box">
							<span class="add-on bg_lg">
							<i>用户</i>
							</span><input type="text" name="telephone" id="USERNAME" value="" placeholder="请输入手机号" />
						</div>
					</div>
				</div>
				<div class="control-group">
					<div class="controls">
						<div class="main_input_box">
							<span class="add-on bg_ly">
							<i>密码</i>
							</span><input type="password" name="password" id="PASSWORD" placeholder="请输入密码" class="keypad" keypadMode="full" allowKeyboard="true" value=""/>
						</div>
					</div>
				</div>
				<div class="control-group">
					<div class="controls">
						<div class="main_input_box">
							<span class="add-on bg_ly">
							<i>重输</i>
							</span><input type="password" name="chkpwd" id="chkpwd" placeholder="请重新输入密码" class="keypad" keypadMode="full" allowKeyboard="true" value=""/>
						</div>
					</div>
				</div>
				<div class="form-actions">
					<div style="width:86%;padding-left:8%;">

						<div style="float: left;padding-top:2px;">
							<i><img src="${pageContext.request.contextPath}/login/yan.png" /></i>
						</div>
						<div style="float: left;" class="codediv">
							<input type="text" name="rcode" id="rcode" class="login_code"
								style="height:16px; padding-top:4px;" />
						</div>
						
						<div style="float: left;">
							<a class="btn btn-small get-code" onclick="sendMessage()" id="J_getCode">获取验证码</a>
							<a class="btn btn-small reset-code" id="J_resetCode" style="display:none;"><span id="J_second">60</span>秒后重发</a>
<!-- 							<a href="#" style="height:30px;" id="codeImg" onclick="sendMessage(this)" >发送验证码</a> -->
						</div>
						<span class="pull-right" style="padding-right:3%;"><a href="${pageContext.request.contextPath}/page/login" class="btn btn-success">取消</a></span>
						<span class="pull-right"><a onclick="register()" class="flip-link btn btn-info" id="to-recover">提交</a></span>
					</div>
				</div>
			</form>
			<div class="controls">
				<div class="main_input_box">
					<font color="white"><span id="nameerr">Copyright © 吃了没科技有限公司 2019</span></font>
				</div>
			</div>
		</div>
		</div>
		
	</div>
	<div id="templatemo_banner_slide" class="container_wapper">
		<div class="camera_wrap camera_emboss" id="camera_slide">
			<!-- 背景图片 -->
			<div data-src="${pageContext.request.contextPath}/login/images/banner_slide_01.jpg"></div>
			<div data-src="${pageContext.request.contextPath}/login/images/banner_slide_02.jpg"></div>
			<div data-src="${pageContext.request.contextPath}/login/images/banner_slide_03.jpg"></div>
			<div data-src="${pageContext.request.contextPath}/login/images/banner_slide_04.jpg"></div>
			<div data-src="${pageContext.request.contextPath}/login/images/banner_slide_05.jpg"></div>
		</div>
		<!-- #camera_wrap_3 -->
	</div>
	<script src="${pageContext.request.contextPath}/login/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/jquery-1.7.2.js"></script>
	<script src="${pageContext.request.contextPath}/login/js/jquery.easing.1.3.js"></script>
	<script src="${pageContext.request.contextPath}/login/js/jquery.mobile.customized.min.js"></script>
	<script src="${pageContext.request.contextPath}/login/js/camera.min.js"></script>
	<script src="${pageContext.request.contextPath}/login/js/templatemo_script.js"></script>
	<script src="${pageContext.request.contextPath}/login/js/ban.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jQuery.md5.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.tips.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.cookie.js"></script>
	
	<!-- 软键盘控件start -->
	<script type="text/javascript" src="${pageContext.request.contextPath}/login/keypad/js/form/keypad.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/login/keypad/js/framework.js"></script>
	<!-- 软键盘控件end -->
	<script src="${pageContext.request.contextPath}/login/js/jigsaw.js"></script>
	<script>
	  jigsaw.init(document.getElementById('captcha'), function () {
			if ($("#loginname").val() == "") {
				$("#loginname").tips({
					side : 2,
					msg : '用户名不得为空',
					bg : '#AE81FF',
					time : 3
				});
				showfh();
				$("#loginname").focus();
				return false;
			} else {
				$("#loginname").val(jQuery.trim($('#loginname').val()));
			}
			if ($("#password").val() == "") {
				$("#password").tips({
					side : 2,
					msg : '密码不得为空',
					bg : '#AE81FF',
					time : 3
				});
				showfh();
				$("#password").focus();
				return false;
			}
// 	    document.getElementById('msg').innerHTML = '登录成功！'
	    $.post("${pageContext.request.contextPath}/user/login",$("#loginForm").serialize(),function(data){
	    	if(data.login == "1"){
	    		//验证通过
	    		$("#msg").css("color","green").html("登陆成功！");
	    		window.location.href='index';
	    	}else{
	    		//账号密码错误
	    		$("#msg").css("color","red").html("账号或密码错误,请重新填写！");
	    		var t=setTimeout("location.reload()",2000);
	    	}
	    },"json");
	  })
	</script>
</body>
</html>