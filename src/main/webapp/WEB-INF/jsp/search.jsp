<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8" />
<title>搜索商品页面-DethGhost</title>
<meta name="keywords" content="DeathGhost,DeathGhost.cn,web前端设,移动WebApp开发" />
<meta name="description" content="DeathGhost.cn::H5 WEB前端设计开发!" />
<meta name="author" content="DeathGhost"/>
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
   <div class="RightNav" style="width: 400px;font-weight: bolder;">
    <a href="user_center.html">用户中心</a> <a href="user_orderlist.html" target="_blank" title="我的订单">我的订单</a> <a href="cart.html">购物车（0）</a> <a href="user_favorites.html" target="_blank" title="我的收藏">我的收藏</a>
   </div>
  </div>
 </section>
 <div class="Logo_search">
  <div class="Logo">
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
   <p class="hotkeywords"><a href="#" title="酸辣土豆丝">酸辣土豆丝</a><a href="#" title="这里是产品名称">螃蟹炒年糕</a><a href="#" title="这里是产品名称">牛奶炖蛋</a><a href="#" title="这里是产品名称">芝麻酱凉面</a><a href="#" title="这里是产品名称">滑蛋虾仁</a><a href="#" title="这里是产品名称">蒜汁茄子</a></p>
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
 <article class="Searchlist Overflow">
  <section class="Fslmenu slt" style="margin-bottom:5px">
   <a href="#" title="默认排序">
   <span>
   <span>默认排序</span>
   </span>
   </a>
   <a href="#" title="评价">
   <span>
   <span>评价</span>
   <span class="s-up"></span>
   </span>
   </a>
   <a href="#" title="销量">
   <span>
   <span>销量</span>
   <span class="s-up"></span>
   </span>
   </a>
   <a href="#" title="价格排序">
   <span>
   <span>价格</span>
   <span class="s-down"></span>
   </span>
   </a>
   <a href="#" title="发布时间排序">
   <span>
   <span>发布时间</span>
   <span class="s-up"></span>
   </span>
   </a>
  </section>
  <ul class="Overflow">
    <li>
    <a href="detailsp.html" target="_blank" target="_blank" title="酸辣土豆丝"><img src="${pageContext.request.contextPath}/upload/01.jpg"></a>
    <p class="P-price FontW Font16"><span>￥59.00</span></p>
    <p class="P-title"><a href="detailsp.html" target="_blank" target="_blank" title="酸辣土豆丝">酸辣土豆丝</a></p>
    <p class="P-shop Overflow"><span class="sa"><a href="shop.html" target="_blank" target="_blank" title="酸辣土豆丝">好味来快餐店</a></span><span class="sp">西安·莲湖区</span></p>
    </li>
  </ul>
  <div class="TurnPage">
  <a href="#">
  <span class="Prev"><i></i>首页</span>
  </a>
  <a href="#"><span class="PNumber">1</span></a>
  <a href="#"><span class="PNumber">2</span></a>
  <a href="#">
  <span class="Next">最后一页<i></i></span>
  </a>
 </div>
 </article>
 <aside class="Sraside">
  <div class="bestproduct">
  <span class="Bpt Block FontW Font14">热销商品推荐</span>
  <ul>
   <li>
    <a href="detailsp.html" title="酸辣土豆丝" target="_blank"><img src="${pageContext.request.contextPath}/upload/02.jpg"></a>
    <p>
     <span class="Block FontW Font16 CorRed">￥59.00</span>
     <span class="Block Overflow"><a href="detailsp.html" title="酸辣土豆丝" target="_blank">酸辣土豆丝</a></span>
     <span class="Block Overflow">累计销量：<i>255</i>笔</span>
    </p>
   </li>
  </ul>
  </div>
  <!--广告位或其他推荐版块-->
  <img src="${pageContext.request.contextPath}/upload/ggw.jpg">
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