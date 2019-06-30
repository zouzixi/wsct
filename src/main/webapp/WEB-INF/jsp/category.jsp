<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8" />
<title>产品分类列表</title>
<meta name="keywords" content="DeathGhost,DeathGhost.cn,web前端设,移动WebApp开发" />
<meta name="description" content="DeathGhost.cn::H5 WEB前端设计开发!" />
<meta name="author" content="DeathGhost"/>
<link href="${pageContext.request.contextPath}/style/style.css" rel="stylesheet" type="text/css" />
<%-- <script type="${pageContext.request.contextPath}/text/javascript" src="js/public.js"></script> --%>
<%-- <script type="${pageContext.request.contextPath}/text/javascript" src="js/jquery.js"></script> --%>
<%-- <script type="${pageContext.request.contextPath}/text/javascript" src="js/jqpublic.js"></script> --%>
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
   <div class="RightNav">
    <a href="user_center.html">用户中心</a> <a href="user_orderlist.html" target="_blank" title="我的订单">我的订单</a> <a href="cart.html">购物车（0）</a> <a href="user_favorites.html" target="_blank" title="我的收藏">我的收藏</a> <a href="#">商家入驻</a>
   </div>
  </div>
 </section>
 <div class="Logo_search">
  <div class="Logo">
   <img src="${pageContext.request.contextPath}/images/logo.jpg" title="DeathGhost" alt="模板">
   <i></i>
   	<div data-toggle="distpicker" style="display: inline">
	    <select id="eprovinceName" data-province="湖北省" name="provinceName" style="width: 80px;"></select>
	    <select id="ecityName" data-city="武汉市" name="cityName" style="width: 80px;"></select>
	    <select id="edistrictName" data-district="江汉区" name="districtName" style="width: 80px;"></select>
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
<section class="Psection">
 <section class="fslist_navtree">
  <ul class="select">
		<li class="select-list">
			<dl id="select1">
				<dt>分类：</dt>
				<dd class="select-all selected"><a href="javascript:">全部</a></dd>
				<dd><a href="javascript:">火锅/干锅</a></dd>
                <dd><a href="javascript:">火锅/干锅</a></dd>
                <dd><a href="javascript:">火锅/干锅</a></dd>
                <dd><a href="javascript:">火锅/干锅</a></dd>
                <dd><a href="javascript:">火锅/干锅</a></dd>
                <dd><a href="javascript:">火锅/干锅</a></dd>
                <dd><a href="javascript:">火锅/干锅</a></dd>
                <dd><a href="javascript:">火锅/干锅</a></dd>
                <dd><a href="javascript:">火锅/干锅</a></dd>
                <dd><a href="javascript:">火锅/干锅</a></dd>
                <dd><a href="javascript:">火锅/干锅</a></dd>
			</dl>
		</li>
		<li class="select-list">
			<dl id="select2">
				<dt>位置：</dt>
				<dd class="select-all selected"><a href="javascript:">全部</a></dd>
				<dd><a href="javascript:">高新区</a></dd>
                <dd><a href="javascript:">未央区</a></dd>
                <dd><a href="javascript:">碑林区</a></dd>
                <dd><a href="javascript:">阎良区</a></dd>
                <dd><a href="javascript:">新城区</a></dd>
                <dd><a href="javascript:">雁塔区</a></dd>
                <dd><a href="javascript:">莲湖区</a></dd>
                <dd><a href="javascript:">灞桥区</a></dd>
                <dd><a href="javascript:">高陵区</a></dd>
                <dd><a href="javascript:">周至县</a></dd>
			</dl>
		</li>
		<li class="select-list">
			<dl id="select3">
				<dt>餐点：</dt>
				<dd class="select-all selected"><a href="javascript:">全部</a></dd>
				<dd><a href="javascript:">早餐</a></dd>
			</dl>
		</li>
        <li class="select-list">
			<dl id="select4">
				<dt>价位区间：</dt>
				<dd class="select-all selected"><a href="javascript:">全部</a></dd>
				<dd><a href="javascript:">20元以下</a></dd>
                <dd><a href="javascript:">20-40元</a></dd>
                <dd><a href="javascript:">40-60元</a></dd>
                <dd><a href="javascript:">60-80元</a></dd>
                <dd><a href="javascript:">80-100元</a></dd>
			</dl>
		</li>
		<li class="select-result">
			<dl>
			 <dd class="select-no">已选择：</dd>
			</dl>
		</li>
	</ul>
 </section>
 <section class="CateL Overflow">
  <ul>
   <li> 
   <a href="detailsp.html" target="_blank" title="酸辣土豆丝">
   <img src="${pageContext.request.contextPath}/upload/05.jpg">
   <p class="Overflow">酸辣土豆丝</p>
   <p class="Overflow">赠送：<span class="CorRed Font16">2</span>积分<i></i></p>
   <p class="Overflow">好味来快餐连锁店</p>
   <p class="Overflow">地址：莲湖区土门十字往西100米</p>
   </a>
   </li>
   <li> 
   <a href="detailsp.html" target="_blank" title="酸辣土豆丝">
   <img src="${pageContext.request.contextPath}/upload/06.jpg">
   <p class="Overflow">酸辣土豆丝</p>
   <p class="Overflow">赠送：<span class="CorRed Font16">2</span>积分<i></i></p>
   <p class="Overflow">好味来快餐连锁店</p>
   <p class="Overflow">地址：莲湖区土门十字往西100米</p>
   </a>
   </li>
   <li> 
   <a href="detailsp.html" target="_blank" title="酸辣土豆丝">
   <img src="${pageContext.request.contextPath}/upload/04.jpg">
   <p class="Overflow">酸辣土豆丝</p>
   <p class="Overflow">赠送：<span class="CorRed Font16">2</span>积分<i></i></p>
   <p class="Overflow">好味来快餐连锁店</p>
   <p class="Overflow">地址：莲湖区土门十字往西100米</p>
   </a>
   </li>
   <li> 
   <a href="detailsp.html" target="_blank" title="酸辣土豆丝">
   <img src="${pageContext.request.contextPath}/upload/02.jpg">
   <p class="Overflow">酸辣土豆丝</p>
   <p class="Overflow">赠送：<span class="CorRed Font16">2</span>积分<i></i></p>
   <p class="Overflow">好味来快餐连锁店</p>
   <p class="Overflow">地址：莲湖区土门十字往西100米</p>
   </a>
   </li>
   <li> 
   <a href="detailsp.html" target="_blank" title="酸辣土豆丝">
   <img src="${pageContext.request.contextPath}/upload/02.jpg">
   <p class="Overflow">酸辣土豆丝</p>
   <p class="Overflow">赠送：<span class="CorRed Font16">2</span>积分<i></i></p>
   <p class="Overflow">好味来快餐连锁店</p>
   <p class="Overflow">地址：莲湖区土门十字往西100米</p>
   </a>
   </li>
   <li> 
   <a href="detailsp.html" target="_blank" title="酸辣土豆丝">
   <img src="${pageContext.request.contextPath}/upload/01.jpg">
   <p class="Overflow">酸辣土豆丝</p>
   <p class="Overflow">赠送：<span class="CorRed Font16">2</span>积分<i></i></p>
   <p class="Overflow">好味来快餐连锁店</p>
   <p class="Overflow">地址：莲湖区土门十字往西100米</p>
   </a>
   </li>
   <li> 
   <a href="detailsp.html" target="_blank" title="酸辣土豆丝">
   <img src="${pageContext.request.contextPath}/upload/03.jpg">
   <p class="Overflow">酸辣土豆丝</p>
   <p class="Overflow">赠送：<span class="CorRed Font16">2</span>积分<i></i></p>
   <p class="Overflow">好味来快餐连锁店</p>
   <p class="Overflow">地址：莲湖区土门十字往西100米</p>
   </a>
   </li>
   <li> 
   <a href="detailsp.html" target="_blank" title="酸辣土豆丝">
   <img src="${pageContext.request.contextPath}/upload/02.jpg">
   <p class="Overflow">酸辣土豆丝</p>
   <p class="Overflow">赠送：<span class="CorRed Font16">2</span>积分<i></i></p>
   <p class="Overflow">好味来快餐连锁店</p>
   <p class="Overflow">地址：莲湖区土门十字往西100米</p>
   </a>
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
 </section>
 <aside class="CateR">
 <!--广告位或推荐位-->
  <div>
   <a href="#" target="_blank"><img src="${pageContext.request.contextPath}/upload/ad.jpg"></a>
  </div>
  <div class="Hot_shop">
   <span class="Hshoptile Font14 FontW Block">热门商家</span>
   <ul>
    <li>
     <a href="shop.html" target="_blank" title="好味来快餐连锁店"><img src="${pageContext.request.contextPath}/upload/cc.jpg"></a>
     <p class="Font14 FontW Overflow Lineheight35"><a href="shop.html" target="_blank" title="好味来快餐连锁店">好味来快餐连锁店</a></p>
     <p class="Lineheight35 Overflow"><span title="通过动态控制地址的字符数量...">地址：西安市莲湖区土门新市场斜对面...</span></p>
    </li>
    <li>
     <a href="shop.html" target="_blank" title="好味来快餐连锁店"><img src="${pageContext.request.contextPath}/upload/dd.jpg"></a>
     <p class="Font14 FontW Overflow Lineheight35"><a href="shop.html" target="_blank" title="好味来快餐连锁店">好味来快餐连锁店</a></p>
     <p class="Lineheight35 Overflow"><span title="通过动态控制地址的字符数量...">地址：西安市莲湖区土门新市场斜对面...</span></p>
    </li>
    <li>
     <a href="shop.html" target="_blank" title="好味来快餐连锁店"><img src="${pageContext.request.contextPath}/upload/ee.jpg"></a>
     <p class="Font14 FontW Overflow Lineheight35"><a href="shop.html" target="_blank" title="好味来快餐连锁店">好味来快餐连锁店</a></p>
     <p class="Lineheight35 Overflow"><span title="通过动态控制地址的字符数量...">地址：西安市莲湖区土门新市场斜对面...</span></p>
    </li>
    <li>
     <a href="shop.html" target="_blank" title="好味来快餐连锁店"><img src="${pageContext.request.contextPath}/upload/cc.jpg"></a>
     <p class="Font14 FontW Overflow Lineheight35"><a href="shop.html" target="_blank" title="好味来快餐连锁店">好味来快餐连锁店</a></p>
     <p class="Lineheight35 Overflow"><span title="通过动态控制地址的字符数量...">地址：西安市莲湖区土门新市场斜对面...</span></p>
    </li>
   </ul>
  </div>
 </aside>
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