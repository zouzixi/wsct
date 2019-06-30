<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8" />
<title>我的购物车</title>
<meta name="keywords" content="DeathGhost,DeathGhost.cn,web前端设,移动WebApp开发" />
<meta name="description" content="DeathGhost.cn::H5 WEB前端设计开发!" />
<meta name="author" content="DeathGhost"/>
<link href="${pageContext.request.contextPath}/style/style.css" rel="stylesheet" type="text/css" />
<!-- 省市区联动插件，勿动 -->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/Jquery-V3.2.1.js"></script>
<script src="${pageContext.request.contextPath}/js/distpicker.data.js"></script>
<script src="${pageContext.request.contextPath}/js/distpicker.js"></script>
<script src="${pageContext.request.contextPath}/js/main.js"></script>
<!-- 省市区联动插件，勿动 -->
<%-- <script type="text/javascript" src="${pageContext.request.contextPath}/js/public.js"></script> --%>
<%-- <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script> --%>
<%-- <script type="text/javascript" src="${pageContext.request.contextPath}/js/jqpublic.js"></script> --%>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/cart.js"></script>

</head>
<body>
<header>
 <section class="Topmenubg">
  <div class="Topnav">
   <div class="LeftNav">
    <a href="register.html">注册</a>/<a href="login.html">登录</a><a href="#">QQ客服</a><a href="#">微信客服</a><a href="#">手机客户端</a>
   </div>
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
<form action="#">
 <div class="gwc" style=" margin:auto;">
  <table cellpadding="0" cellspacing="0" class="gwc_tb1">
    <tr>
      <td class="tb1_td1"><input id="Checkbox1" type="checkbox"  class="allselect"/></td>
      <td class="tb1_td1">全选</td>
      <td class="tb1_td3">商品</td>
      <td class="tb1_td4">原价</td>
      <td class="tb1_td5">数量</td>  
      <td class="tb1_td6">单价</td>
      <td class="tb1_td7">操作</td>
    </tr>
  </table>
  <table cellpadding="0" cellspacing="0" class="gwc_tb2" id="table1">
    <tr>
     <td colspan="7" class="shopname Font14 FontW">店铺：好味来快餐店</td>
    </tr>
    <tr>
      <td class="tb2_td1"><input type="checkbox" value="1" name="newslist" id="newslist-1" /></td>
      <td class="tb2_td2"><a href="detailsp.html" target="_blank"><img src="${pageContext.request.contextPath}/upload/01.jpg"/></a></td>
      <td class="tb2_td3"><a href="detailsp.html" target="_blank">酸辣土豆丝</a></td>
      <td class="tb1_td4"><s>￥59.00</s></td>
      <td class="tb1_td5"><input id="min1" name=""  style="width:30px; height:30px;border:1px solid #ccc;" type="button" value="-" />
        <input id="text_box1" name="" type="text" value="1" style=" width:40px;height:28px; text-align:center; border:1px solid #ccc;" />
        <input id="add1" name="" style="width:30px; height:30px;border:1px solid #ccc;" type="button" value="+" />
      </td>
      <td class="tb1_td6"><label id="total1" class="tot" style="color:#ff5500;font-size:14px; font-weight:bold;"></label></td>
      <td class="tb1_td7"><a href="#" id="delcart1">删除</a></td>
    </tr>
  </table>
  <table cellpadding="0" cellspacing="0" class="gwc_tb2" id="table2">
    <tr>
     <td colspan="7" class="shopname Font14 FontW">店铺：肯德基</td>
    </tr>
    <tr>
      <td class="tb2_td1"><input type="checkbox" value="1" name="newslist" id="newslist-2" /></td>
      <td class="tb2_td2"><a href="detailsp.html" target="_blank"><img src="${pageContext.request.contextPath}/upload/02.jpg"/></a></td>
      <td class="tb2_td3"><a href="detailsp.html" target="_blank">酸辣土豆丝</a></td>
      <td class="tb1_td4"><s>￥59.00</s></td>
      <td class="tb1_td5"><input id="min2" name=""  style=" width:30px; height:30px;border:1px solid #ccc;" type="button" value="-" />
        <input id="text_box2" name="" type="text" value="1" style=" width:40px;height:28px; text-align:center; border:1px solid #ccc;" />
        <input id="add2" name="" style=" width:30px; height:30px;border:1px solid #ccc;" type="button" value="+" />
      </td>
      <td class="tb1_td6"><label id="total2" class="tot" style="color:#ff5500;font-size:14px; font-weight:bold;"></label></td>
      <td class="tb1_td7"><a href="#" id="delcart2">删除</a></td>
    </tr>
  </table>
  <table cellpadding="0" cellspacing="0" class="gwc_tb3">
    <tr>
      <td class="tb1_td1"><input id="checkAll" class="allselect" type="checkbox" /></td>
      <td class="tb1_td1">全选</td>
      <td class="tb3_td1"><input id="invert" type="checkbox" />
        反选
        <input id="cancel" type="checkbox" />
        取消 </td>
      <td class="tb3_td2 GoBack_Buy Font14"><a href="#" target="_blank">继续购物</a></td>
      <td class="tb3_td2">已选商品
        <label id="shuliang" style="color:#ff5500;font-size:14px; font-weight:bold;">0</label>
        件</td>
      <td class="tb3_td3">合计(不含运费):<span>￥</span><span style=" color:#ff5500;">
        <label id="zong1" style="color:#ff5500;font-size:14px; font-weight:bold;">0.00</label>
        </span></td>
      <td class="tb3_td4"><span id="jz1">结算</span><a href="confirm_order.html" style=" display:none;"  class="jz2" id="jz2">结算</a></td>
    </tr>
  </table>
</div>
</form>
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