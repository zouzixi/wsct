<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8" />
<title>DeathGhost-用户中心</title>
<link href="${pageContext.request.contextPath}/style/style.css" rel="stylesheet" type="text/css" />
<%-- <script type="text/javascript" src="${pageContext.request.contextPath}/js/public.js"></script> --%>
<%-- <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script> --%>
<%-- <script type="text/javascript" src="${pageContext.request.contextPath}/js/jqpublic.js"></script> --%>
<!-- 省市区联动插件，勿动 -->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/Jquery-V3.2.1.js"></script>
<script src="${pageContext.request.contextPath}/js/distpicker.data.js"></script>
<script src="${pageContext.request.contextPath}/js/distpicker.js"></script>
<script src="${pageContext.request.contextPath}/js/main.js"></script>
<!-- 省市区联动插件，勿动 -->
<script>
	
	var page = {
			"currPage":1,
			"pageSize":5
		}	

	selectShopMenu(page);
	$(function(){
		//上一页点击事件
		$("#before").click(function(){
			page.currPage -=1;
			if(page.currPage==0){
				page.currPage = 1;
			}
			selectShopMenu(page);
		});
			
		//下一页点击事件
		$("#after").click(function(){
			page.currPage +=1;
			selectShopMenu(page);
		});
	})
	
	//查询菜品
	function selectShopMenu(page){
	    $.post("${pageContext.request.contextPath}/businessBackstageController/selectShopMenu",page,function(data){
			var html = "";
			$.each(data,function(i,v){
				$.each(v,function(a,b){
					html += "<tr>"+
							"<th><img width='100px' height='75px' src='${pageContext.request.contextPath}/"+b.sm_image+"'></th>"+
							"<th>"+b.sm_dishName+"</th>"+
							"<th>"+b.sm_price+"</th>"+
							"<th>"+b.sm_stock+"</th>"+
							"<th>"+b.sm_details+"</th>"+
							"<th><a href='#'>修改</a>&nbsp;&nbsp;<a href='#'>下架</a></th>"+
							"</tr>";
				});
				
			});
			$("#menusList").html(html);
	    },"json");
	}

	function changeShopInfo(){
		var formData = new FormData($("#changeShop")[0]);  
	    $.ajax({  
	         url: '${pageContext.request.contextPath}/businessBackstageController/updateShopInfo' ,  
	         type: 'POST',  
	         data: formData,  
	         dataType:"json",
	         async: false,  
	         cache: false,  
	         contentType: false,  
	         processData: false,  
	         success: function (data) { 
	        	 if(data == "1"){
	        		 alert('修改成功');
	        	 }else{
	        		 alert('修改失败！');
	        	 }
	        
	         },  
	         error: function (returndata) {  
	        	 console.log(returndata);
	         }  
	    });
	}
	
	function shopManagement(){
		$("#accountManager_div").fadeIn(1000);
		$("#password_div").hide();
		$("#shopMenu_div").hide();
	}
	
	function changePassword(){
		$("#accountManager_div").hide();
		$("#shopMenu_div").hide();
		$("#password_div").fadeIn(1000);
	}
	function changeMenu(){
		$("#shopMenu_div").fadeIn(1000);
		$("#password_div").hide();
		$("#accountManager_div").hide();
	}
	
	
</script>
<!-- 菜品管理样式 -->
<style type="text/css">
#shopMenuList th{
	text-align: center;
	vertical-align:middle;
}
</style>
</head>
<body>
<header>
 <section class="Topmenubg">
  <div class="Topnav">
  <c:if test="${empty user}">
   <div class="LeftNav">
    <a href="${pageContext.request.contextPath}/page/login">注册</a>/<a href="${pageContext.request.contextPath}/page/login">登录</a><a href="#">QQ客服</a><a href="#">微信客服</a><a href="#">手机客户端</a>
   </div>
  </c:if>
  <c:if test="${!empty user }">
  	<span>欢迎您，<span style="color: red;font-weight: bolder;">${user.uTelephone}</span>的用户！</span>&nbsp;&nbsp;
  	<a href="${pageContext.request.contextPath}/user/exit">注销</a>&nbsp;&nbsp;
  </c:if>
  </div>
 </section>
 <div class="Logo_search">
  <div class="Logo">
   <a href="${pageContext.request.contextPath}/page/index"><img src="${pageContext.request.contextPath}/images/logo.jpg" title="DeathGhost" /></a>
   <i></i>
  </div>
 </div>
 <nav class="menu_bg">
  <ul class="menu">
   <li><a href="index.html">首页</a></li>
   <li><a href="list.html">订餐</a></li>
   <li><a href="category.html">积分商城</a></li>
   <li><a href="article_read.html">关于我们</a></li>
  </ul>
 </nav>
</header>
<!--Start content-->
<section class="Psection MT20">
<nav class="U-nav Font14 FontW">
  <ul>
   <li><i></i><a href="javascript:void(0)" onclick="shopManagement()">商铺管理</a></li>
   <li><i></i><a href="javascript:void(0)" onclick="changeMenu()">菜品管理</a></li>
   <li><i></i><a href="javascript:void(0)" onclick="changePassword()">修改密码</a></li>
  </ul>
 </nav>
 <article class="U-article Overflow">
  <!--user Account-->
  <section class="AccManage Overflow">
<div id="accountManager_div" style="width: 910px;height: 344px;">
   <span class="AMTitle Block Font14 FontW Lineheight35">商铺管理</span>
   
   <form id="changeShop" enctype="multipart/form-data">
    <table>
    <tr>
    <td width="30%" align="right">*修改店铺图片：</td>
    <td><input name="sImage" type="file"></td>
    </tr>
    <tr>
    <td width="30%" align="right">*修改店铺名称：</td>
    <td><input type="text" name="sShopname" value=""></td>
    </tr>
    <tr>
    <td width="30%" align="right">*修改店铺地址：</td>
    <td><input type="text" name="sAddress" value=""></td>
    </tr>
    <tr>
    <td width="30%" align="right">*修改电话号码：</td>
    <td><input type="text" name="sTelephone" value="${user.uTelephone}"></td>
    </tr>
    <tr>
    <td width="30%" align="right">*修改店铺简介：</td>
    <td><input type="text" name="sIntroduce" value=""></td>
    </tr>
    <tr>
    <td></td>
    <td><input onclick="changeShopInfo()" type="button" value="保 存"></td>
    </tr>
    </table>
   </form>
</div>   
<!-- 修改密码 -->
<div id="password_div" style="display: none;width: 910px;height: 344px;">
   <span class="AMTitle Block Font14 FontW Lineheight35">密码管理</span>
   <form id="changePassword">
    <table>
    <tr>
    <td width="30%" align="right">*原密码：</td>
    <td><input type="text" name="oldPassword" placeholder="请输入原密码" value=""></td>
    </tr>
    <tr>
    <td width="30%" align="right">*新密码：</td>
    <td><input type="text" name="sAddress" placeholder="请输入新密码" value=""></td>
    </tr>
    <tr>
    <td width="30%" align="right">*再次输入新密码：</td>
    <td><input type="text" name="sTelephone" placeholder="请再次输入新密码" value=""></td>
    </tr>
    <tr>
    <td></td>
    <td><input onclick="" type="button" value="保 存"></td>
    </tr>
    </table>
</div>  
<!-- 菜品管理 -->
<div  id="shopMenu_div" style="display: none;width: 910px;height: 600px;">
	<span class="AMTitle Block Font14 FontW Lineheight35">商品管理</span>
	<table id="shopMenuList" border="1px">
		<thead>
		<tr>
			<th>商品图片</th>
			<th>商品名称</th>
			<th>商品价格</th>
			<th>库存</th>
			<th>商品详情</th>
			<th>操作</th>
		</tr>
		</thead>
		<tbody id="menusList">
			
		</tbody>
	</table>
	<div align="right">
		<a href="javascript:void(0)" style="font-size: 14px;color: blue;" id="before">上一页</a>&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="javascript:void(0)" style="font-size: 14px;color: blue;" id="after">下一页</a>
	</div>
</div> 	
  </section>
 </article>
</section>
<footer>
 <section class="Otherlink">
  <aside>
   <div class="ewm-left">
    <p>手机扫描二维码：</p>
    <img src="${pageContext.request.contextPath}/images/Android_ico_d.gif">
    <img src="${pageContext.request.contextPath}/images/iphone_ico_d.gif">
   </div>
   <div class="tips">
    <p>客服热线</p>
    <p><i>1830927**73</i></p>
    <p>配送时间</p>
    <p><time>09：00</time>~<time>22:00</time></p>
    <p>网站公告</p>
   </div>
  </aside>
  <section>
    <div>
    <span><i class="i1"></i>配送支付</span>
    <ul>
     <li><a href="article_read.html" target="_blank" title="标题">支付方式</a></li>
     <li><a href="article_read.html" target="_blank" title="标题">配送方式</a></li>
     <li><a href="article_read.html" target="_blank" title="标题">配送效率</a></li>
     <li><a href="article_read.html" target="_blank" title="标题">服务费用</a></li>
    </ul>
    </div>
    <div>
    <span><i class="i2"></i>关于我们</span>
    <ul>
     <li><a href="article_read.html" target="_blank" title="标题">招贤纳士</a></li>
     <li><a href="article_read.html" target="_blank" title="标题">网站介绍</a></li>
     <li><a href="article_read.html" target="_blank" title="标题">配送效率</a></li>
     <li><a href="article_read.html" target="_blank" title="标题">商家加盟</a></li>
    </ul>
    </div>
    <div>
    <span><i class="i3"></i>帮助中心</span>
    <ul>
     <li><a href="article_read.html" target="_blank" title="标题">服务内容</a></li>
     <li><a href="article_read.html" target="_blank" title="标题">服务介绍</a></li>
     <li><a href="article_read.html" target="_blank" title="标题">常见问题</a></li>
     <li><a href="article_read.html" target="_blank" title="标题">网站地图</a></li>
    </ul>
    </div>
  </section>
 </section>
<div class="copyright">© 版权所有 2016 DeathGhost 技术支持：<a href="http://www.deathghost.cn" title="DeathGhost">DeathGhost</a></div>
</footer>
</body>
</html>