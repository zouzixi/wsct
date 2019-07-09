<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8" />
<title>网上餐厅,开始用膳！</title>
<link href="${pageContext.request.contextPath}/style/style.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/css/lunbo.css" rel="stylesheet" type="text/css" />
<%-- <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script> --%>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/public.js"></script>
<%-- <script type="text/javascript" src="${pageContext.request.contextPath}/js/jqpublic.js"></script> --%>

<!-- 省市区联动插件，勿动 -->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/Jquery-V3.2.1.js"></script>
<script src="${pageContext.request.contextPath}/js/distpicker.data.js"></script>
<script src="${pageContext.request.contextPath}/js/distpicker.js"></script>
<script src="${pageContext.request.contextPath}/js/main.js"></script>
<!-- 省市区联动插件，勿动 -->
<script src="${pageContext.request.contextPath}/js/scroll.js"></script>
<!-- 轮播 -->
<!-- 获取省份 -->
<!-- <script src="http://pv.sohu.com/cityjson?ie=utf-8"></script>  -->
<!-- <script type="text/javascript">   -->
<!--  var cname = returnCitySN["cname"];	//定义城市 -->
<!-- </script> -->
<script>
	$(function(){
		//公告栏
		$.post("${pageContext.request.contextPath}/index/selectList",function(data){
			var html = "";
			var html_status = "";
			var html_oUsername = "";
			$.each(data.list,function(i,v){
 				if(this.oStatus == "1"){
 					//订单已发货
					html_status = "<i class='State01'>"+"已发货"+"</i>";
 				}else if(this.oStatus == "2"){
 					//已完成
					html_status = "<i class='State02'>"+"已签收"+"</i>"+"<i class='State03'>"+"已点评"+"</i>";
 				}
				if(this.oUsername == ""){
					html_oUsername = "匿名";
				}else{
					html_oUsername = this.oUsername;
				}
				html +="<li>"+
				   "<p>订单编号："+ this.oId + "</p>"+
				   "<p>收件人："+html_oUsername+"</p>"+
				   "<p>订单状态："+html_status+"</p>"+
				   "</li>";
			})
			$("#UpRoll").html(html);	
		},"json");
		//轮播
		$('.myscroll').myScroll({
			speed: 40, //数值越大，速度越慢
			rowHeight: 85 //li的高度
		});		
		
		//读取城市地区
		$.post("${pageContext.request.contextPath}/index/selectRegions",function(data){
			var html = "";
			$.each(data.list,function(i,v){
				html += "<a href='#'>"+this.rCity+" </a>";
			});
			$("#regions").append(html);
			$("#seekareas").append(html);
		},"json");
		
		//随机菜品展示
		$.post("${pageContext.request.contextPath}/index/selectShopMenu",function(data){
			var html = "";
			$.each(data.list,function(i,v){
				html += "<a href='#' target='_blank' title='菜品名称'>"+
			      			"<figure>"+
			       			"<img src='${pageContext.request.contextPath}/"+this.smImage+"' />"+
			       			"<figcaption>"+
			       			"<span class='title'>"+this.smDishname+"</span>"+
			       			"<span class='price'><i>￥</i>"+this.smPrice+"</span>"+
			       			"</figcaption>"+
			      			"</figure>"+
			      			"</a>";
			});
			$(".SCcontent").html(html);
		},"json");	
		
		//随机商铺展示
		$.post("${pageContext.request.contextPath}/index/selectShop",function(data){
			var html = "";
			$.each(data.list,function(i,v){
				html += "<a href='#' target='_blank' title='店铺名称'>"+
			      			"<figure>"+
			       			"<img src='${pageContext.request.contextPath}/"+this.sImage+"'>"+
			      			"</figure>"+
						"</a>";
			})
			$(".bestshop").html(html);
		},"json");
		//商铺
		$.post("${pageContext.request.contextPath}/index/selectShops",function(data){
			var shtml = "";
			var scorehtml = "";
			$.each(data.list,function(i,v){
				var sScore = this.sScore;
				if(this.sScore == "0"){
					for (var i = 0; i < 5; i++) {
						scorehtml += "<img src='${pageContext.request.contextPath}/images/star-off.png'>";
					}
				}else if(this.sScore == "1"){
					for (var i = 0; i < sScore; i++) {
						scorehtml += "<img src='${pageContext.request.contextPath}/images/star-on.png'>";
					}
					for (var j = 0; j < 5-sScore; j++) {
						scorehtml += "<img src='${pageContext.request.contextPath}/images/star-off.png'>";
					}
				}else if(this.sScore == "2"){
					for (var i = 0; i < sScore; i++) {
						scorehtml += "<img src='${pageContext.request.contextPath}/images/star-on.png'>";
					}
					for (var j = 0; j < 5-sScore; j++) {
						scorehtml += "<img src='${pageContext.request.contextPath}/images/star-off.png'>";
					}
				}else if(this.sScore == "3"){
					for (var i = 0; i < sScore; i++) {
						scorehtml += "<img src='${pageContext.request.contextPath}/images/star-on.png'>";
					}
					for (var j = 0; j < 5-sScore; j++) {
						scorehtml += "<img src='${pageContext.request.contextPath}/images/star-off.png'>";
					}					
				}else if(this.sScore == "4"){
					for (var i = 0; i < sScore; i++) {
						scorehtml += "<img src='${pageContext.request.contextPath}/images/star-on.png'>";
					}
					for (var j = 0; j < 5-sScore; j++) {
						scorehtml += "<img src='${pageContext.request.contextPath}/images/star-off.png'>";
					}					
				}else if(this.sScore == "5"){
					for (var i = 0; i < sScore; i++) {
						scorehtml += "<img src='${pageContext.request.contextPath}/images/star-on.png'>";
					}
					for (var j = 0; j < 5-sScore; j++) {
						scorehtml += "<img src='${pageContext.request.contextPath}/images/star-off.png'>";
					}
				}
				
				shtml += "<a href='#' target='_blank' title='TITLE:店名'>"+
			       		   "<figure>"+
					       "<img src='${pageContext.request.contextPath}/"+this.sImage+"'>"+
					       "<figcaption>"+
					       "<span class='title'>"+this.sShopname+"</span>"+
					       "<span class='price'>优惠活动：<i>"+this.sActivity+"</i></span>"+
					       "</figcaption>"+
					       "<p class='p1'>"+
					       "<q>"+this.sIntroduce+"</q>"+
					       "</p>"+
					       "<p class='p2'>店铺评分："+
					       scorehtml+
					       "</p>"+
					       "<p class='p3'>店铺地址："+this.sAddress+"</p>"+
					       "</figure>"+
					      "</a>";	
				scorehtml = "";
			})
			$(".DCcontent").html(shtml);
		},"json");
		//加载评论
		$.post("${pageContext.request.contextPath}/index/selecteEvaluates",function(data){
			var html = "";
			$.each(data,function(i,v){
				$.each(v,function(a,b){
					//alert(b.e_comment);
					html += "<li>"+
				     		"<img src='${pageContext.request.contextPath}/"+b.sm_image+"'>"+
				     		"用户<b style='color:red'>"+b.u_telephone+"</b>对<b style='color:red'>"+b.s_shopName+"</b>“<b style='color:dark'>"+b.sm_dishName+"</b>”评说："+b.e_comment+""+
				    		"</li>";
				});
			})
			$("#userEvaluate").html(html);
		},"json");
		
	});//jq底部
	function foodClass(food){
		$("#Shop").click();
		$.post("${pageContext.request.contextPath}/index/selectClassifiedCommodities/"+food+"",function(data){
			var shtml = "";
			var scorehtml = "";
			$.each(data.list,function(i,v){
				var sScore = this.sScore;
				if(this.sScore == "0"){
					for (var i = 0; i < 5; i++) {
						scorehtml += "<img src='${pageContext.request.contextPath}/images/star-off.png'>";
					}
				}else if(this.sScore == "1"){
					for (var i = 0; i < sScore; i++) {
						scorehtml += "<img src='${pageContext.request.contextPath}/images/star-on.png'>";
					}
					for (var j = 0; j < 5-sScore; j++) {
						scorehtml += "<img src='${pageContext.request.contextPath}/images/star-off.png'>";
					}
				}else if(this.sScore == "2"){
					for (var i = 0; i < sScore; i++) {
						scorehtml += "<img src='${pageContext.request.contextPath}/images/star-on.png'>";
					}
					for (var j = 0; j < 5-sScore; j++) {
						scorehtml += "<img src='${pageContext.request.contextPath}/images/star-off.png'>";
					}
				}else if(this.sScore == "3"){
					for (var i = 0; i < sScore; i++) {
						scorehtml += "<img src='${pageContext.request.contextPath}/images/star-on.png'>";
					}
					for (var j = 0; j < 5-sScore; j++) {
						scorehtml += "<img src='${pageContext.request.contextPath}/images/star-off.png'>";
					}					
				}else if(this.sScore == "4"){
					for (var i = 0; i < sScore; i++) {
						scorehtml += "<img src='${pageContext.request.contextPath}/images/star-on.png'>";
					}
					for (var j = 0; j < 5-sScore; j++) {
						scorehtml += "<img src='${pageContext.request.contextPath}/images/star-off.png'>";
					}					
				}else if(this.sScore == "5"){
					for (var i = 0; i < sScore; i++) {
						scorehtml += "<img src='${pageContext.request.contextPath}/images/star-on.png'>";
					}
					for (var j = 0; j < 5-sScore; j++) {
						scorehtml += "<img src='${pageContext.request.contextPath}/images/star-off.png'>";
					}
				}
				
				shtml += "<a href='#' target='_blank' title='TITLE:店名'>"+
			       		   "<figure>"+
					       "<img src='${pageContext.request.contextPath}/"+this.sImage+"'>"+
					       "<figcaption>"+
					       "<span class='title'>"+this.sShopname+"</span>"+
					       "<span class='price'>优惠活动：<i>"+this.sActivity+"</i></span>"+
					       "</figcaption>"+
					       "<p class='p1'>"+
					       "<q>"+this.sIntroduce+"</q>"+
					       "</p>"+
					       "<p class='p2'>店铺评分："+
					       scorehtml+
					       "</p>"+
					       "<p class='p3'>店铺地址："+this.sAddress+"</p>"+
					       "</figure>"+
					      "</a>";	
				scorehtml = "";
			})
			$(".DCcontent").html(shtml);
		},"json")
	}
	
	//商业管理
	function businessManagement(){
		$.post("${pageContext.request.contextPath}/index/businessManagement",function(data){
			if(data == "1"){
				window.location.href="${pageContext.request.contextPath}/page/businessBackstage";
			}else{
				window.location.href="${pageContext.request.contextPath}/page/NonMerchant";
			}
		},"json");
	}
	
</script>
<script>
	window.onblur = function(){
		document.title = "记得回来下单哦！";
	}
	window.onfocus= function(){
		document.title = "网上餐厅,开始用膳！";
	}
</script>
<!-- 轮播 -->
<script type=text/javascript src="${pageContext.request.contextPath}/js/lunbo.js"></script>
<script type="text/javascript">

$(document).ready(function(){

  $(".area").hover(function(){

	  $(this).find(".qq").show(100);}

	  ,function(){

		$(this).find(".qq").hide(100);

	});

});

</script>
</head>
<body>
<style>
* { margin: 0; padding: 0;}
.myscroll { width: 300px; height: 310px; margin: 0 auto; border: 1px solid #ccc; line-height: 26px; font-size: 12px; overflow: hidden;}
.myscroll li { height: 26px; margin-left: 25px;}
</style>

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
<!-- 天气 -->
  </c:if>
   <div class="RightNav" style="width: 400px;font-weight: bolder;">
    <a href="${pageContext.request.contextPath}/page/user_account">用户中心</a> <a href="${pageContext.request.contextPath}/page/user_orderlist" target="_blank" title="我的订单">我的订单</a> <a href="${pageContext.request.contextPath}/page/cart">购物车（0）</a> <a href="${pageContext.request.contextPath}/page/user_favorites" target="_blank" title="我的收藏">我的收藏</a> <a href="#" onclick="businessManagement()">商家管理</a>
   </div>
  </div>
 </section>
 <div class="Logo_search">
  <div class="Logo"">
   <a href="${pageContext.request.contextPath}/page/index"><img src="${pageContext.request.contextPath}/images/logo.jpg" title="DeathGhost"></a>
   <i></i>
	<div data-toggle="distpicker" style="display: inline;">
	    <select id="eprovinceName" data-province="湖北省" name="provinceName" style="width: 80px;border-radius:5px;border:1px solid #9bc0dd;height:28px;background:#fafdfe;"></select>
	    <select id="ecityName" data-city="武汉市" name="cityName" style="width: 80px;border-radius:5px;border:1px solid #9bc0dd;height:28px;background:#fafdfe;"></select>
	    <select id="edistrictName" data-district="江汉区" name="districtName" style="width: 80px;border-radius:5px;border:1px solid #9bc0dd;height:28px;background:#fafdfe;"></select>
	</div>
</div>
  <div class="Search"> 
   <form method="get" id="main_a_serach" onsubmit="return check_search(this)">
   <div class="Search_nav" id="selectsearch">
    <a href="javascript:;" onClick="selectsearch(this,'restaurant_name')" class="choose">餐厅</a>
    <a href="javascript:;" onClick="selectsearch(this,'food_name')">食物名</a>
   </div>
   <div class="Search_area"> 
   <input type="search" id="fkeyword" name="keyword" placeholder="请输入您所需查找的餐厅名称或食物名称..." class="searchbox" />
   <input type="submit" class="searchbutton" value="搜 索" />
   </div>
   </form>
   <p class="hotkeywords"><a href="#" title="鱼头火锅">鱼头火锅</a><a href="#" title="这里是产品名称">酱香牛肉</a><a href="#" title="这里是产品名称">鳝鱼拼盘</a><a href="#" title="这里是产品名称">干锅手撕鸡</a></p>
  </div>
 </div>
 <nav class="menu_bg">
  <ul class="menu">
   <li><a href="${pageContext.request.contextPath}/page/index">首页</a></li>
   <li><a href="list.html">订餐</a></li>
   <li><a href="category.html">积分商城</a></li>
   <li><a href="article_read.html">关于我们</a></li>
  </ul>
 </nav>
</header>
<!--Start content-->
<section class="Cfn">
 <aside class="C-left">
  <div class="S-time">服务时间：周一~周六<time>09:00</time>-<time>23:00</time></div>
  <div class="C-time">
   <img src="${pageContext.request.contextPath}/upload/dc.jpg"/>
  </div>
  <a href="list.html" target="_blank"><img src="${pageContext.request.contextPath}/images/by_button.png"></a>
  <a href="list.html" target="_blank"><img src="${pageContext.request.contextPath}/images/dc_button.png"></a>
 </aside>
<!--  轮播图 -->
 <div class="F-middle">
	<div class="area">
	<a id=prev class="prevBtn qq" href="javascript:void(0)"></a>
	<a id=next class="nextBtn qq" href="javascript:void(0)"></a>
	<div id=js class="js">
		<div class="box01">

			<img onClick="#"  src="${pageContext.request.contextPath}/upload/lunbo1.jpg">

			<img onClick="#"  style="DISPLAY: none" src="${pageContext.request.contextPath}/upload/lunbo3.jpg"> 

			<img onClick="#" style="DISPLAY: none"  src="${pageContext.request.contextPath}/upload/lunbo4.jpg">

			<img onClick="#" style="DISPLAY: none"  src="${pageContext.request.contextPath}/upload/lunbo5.jpg"> 

			<img onClick="#" style="DISPLAY: none" src="${pageContext.request.contextPath}/upload/lunbo6.jpg">	

		</div>
		<div class="bg"></div>
		<div id=jsNav class=jsNav>	
			<a class="trigger imgSelected" href="javascript:void(0)"></a>
			<a class="trigger" href="javascript:void(0)"></a>
			<a class="trigger" href="javascript:void(0)"></a>
			<a class="trigger" href="javascript:void(0)"></a>
			<a class="trigger" href="javascript:void(0)"></a>		
		</div>
	</div>

</div>
 </div>
 <aside class="N-right">
  <div class="N-title">最新消息 <i>NEWS</i></div>
  <ul class="Newslist">
   <li><i></i><a href="article_read.html" target="_blank" title="这里调用新闻标题...">欢迎访问网上餐厅</a></li>
<!--    <li><i></i><a href="article_read.html" target="_blank" title="这里调用新闻标题...">各大优惠应你所想。。。</a></li> -->
  </ul>
  <div class="myscroll">
  <ul class="Orderlist" id="UpRoll">
  
  </ul>
  </div>
 </aside>
</section>
<section class="Sfainfor">
 <article class="Sflist">
  <div id="Indexouter">
   <ul id="Indextab">
    <li class="current">点菜</li>
    <li id="Shop">餐馆</li>
    <p class="class_B">
    <a href="javascript:void(0)" onclick="foodClass(1)">中餐</a>
    <a href="javascript:void(0)" onclick="foodClass(2)">西餐</a>
    <a href="javascript:void(0)" onclick="foodClass(3)">甜品</a>
    <a href="javascript:void(0)" onclick="foodClass(4)">烧烤</a>
    <a href="javascript:void(0)" onclick="foodClass(5)">果蔬生鲜</a>
    <a href="javascript:void(0)" onclick="foodClass(6)">日韩料理</a>
    </p>
   </ul>
  <div id="Indexcontent">
   <ul style="display:block;">
    <li>
     <p class="seekarea" id="regions">
     </p>
     </li>
     <div class="SCcontent">
<!--      <a href="detailsp.html" target="_blank" title="菜品名称"> -->
<!--       <figure> -->
<%--        <img src="${pageContext.request.contextPath}/upload/05.jpg"> --%>
<!--        <figcaption> -->
<!--        <span class="title">老李家的糖醋鲤鱼</span> -->
<!--        <span class="price"><i>￥</i>169.00</span> -->
<!--        </figcaption> -->
<!--       </figure> -->
     </div>
     <div class="bestshop">
<!--       <a href="shop.html" target="_blank" title="店铺名称"> -->
<!--       <figure> -->
<%--        <img src="${pageContext.request.contextPath}/upload/wpjnewlogo.jpg"> --%>
<!--       </figure> -->
     </div>
    </li>
   </ul>
   <ul>
  <li>
     <p id="seekareas" class="seekarea">
<!-- 		地区查询 -->
     </p>
     <div class="DCcontent">
<!--      商铺列表 -->
     </div>
  </li>
  </ul>
 </div>
 </div>
 </article>
 <aside class="A-infor">
  <img src="${pageContext.request.contextPath}/upload/haibao.jpg">
  <div class="usercomment">
   <span>用户菜品点评</span>
   <ul id="userEvaluate">
<!-- 用户评论区 -->
   </ul>
  </div>
 </aside>
</section>
<!--End content-->
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