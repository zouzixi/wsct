<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8" />
<title>商家管理中心</title>
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
<!-- 弹窗 -->
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" />
<script src="${pageContext.request.contextPath}/js/ui.js"></script>

<!-- 弹出表单 -->
<link href="${pageContext.request.contextPath}/css/dialog.css" rel="stylesheet"></head>
<script src="${pageContext.request.contextPath}/js/mDialogMin.js"></script>
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
	
	//修改菜品
	function updateMenuInfo(smId) {
		$.post("${pageContext.request.contextPath}/businessBackstageController/selectMenuBySmId?smId="+smId,function(data){
			var smDishname = data.list[0].smDishname;
			var smPrice = data.list[0].smPrice;
			var smStock = data.list[0].smStock;
			var smDetails = data.list[0].smDetails;
		    Dialog.init('<form id="updateMenu_form" enctype="multipart/form-data">商品名称：<input type="text" name="smDishname" value="'+smDishname+'"  style="margin:8px 0;width:100%;padding:11px 8px;font-size:15px; border:1px solid #999;"/>商品价格：<input type="text" name="smPrice" value="'+smPrice+'" style="margin:8px 0;width:100%;padding:11px 8px;font-size:15px; border:1px solid #999;"/>商品库存：<input type="text" name="smStock" value="'+smStock+'" style="margin:8px 0;width:100%;padding:11px 8px;font-size:15px; border:1px solid #999;"/>商品详情：<input type="text" name="smDetails" value="'+smDetails+'" style="margin:8px 0;width:100%;padding:11px 8px;font-size:15px; border:1px solid #999;"/>商品图片：<input type="file" name="smImage"  style="margin:8px 0;width:100%;padding:11px 8px;font-size:15px; border:1px solid #999;"/></form>',{
		        title : '商品管理',
		        button : {
		            确定 : function(){
		        		var formData = new FormData($("#updateMenu_form")[0]);  
		        	    $.ajax({  
		        	         url: '${pageContext.request.contextPath}/businessBackstageController/updateMenuInfo?smId='+smId ,  
		        	         type: 'POST',  
		        	         data: formData,  
		        	         dataType:"json",
		        	         async: false,  
		        	         cache: false,  
		        	         contentType: false,  
		        	         processData: false,  
		        	         success: function (data) { 
		        	        	 if(data.msg == "1"){
		        	        		 Dialog.init('修改成功！',1000);
		        	        		 var st1 = setTimeout("window.location.reload()", 2000);
		        	        	 }else{
		        	        		 Dialog.init('修改失败！',1000);
		        	        		 var st2 = setTimeout("window.location.reload()", 2000);
		        	        	 }
		        	        
		        	         },  
		        	         error: function (returndata) {  
		        	        	 console.log(returndata);
		        	         }  
		        	    });
		            },
		            取消 : function(){
		                Dialog.init('您取消了修改！',1000);
		                Dialog.close(this);
		            }
		        }
		    });	
		},"json");
	}
	
	//查询新订单
	function selectNewOrders(){
		var html = "";
		$.post("${pageContext.request.contextPath}/businessBackstageController/selectNewOrders",function(data){
			$.each(data,function(i,v){
				$.each(v,function(a,b){
					html += "<tr>"+
								"<th>"+b.o_id+"</th>"+
								"<th>"+b.sm_dishName+"</th>"+
								"<th>"+b.o_number+"</th>"+
								"<th>"+b.o_telephone+"</th>"+
								"<th>"+b.o_orderTime+"</th>"+
								"<th>"+b.o_username+"</th>"+
								"<th>"+b.o_money+"</th>"+
								"<th><a href='javascript:void(0)' onclick='deliverGoods("+b.o_id+")' style='font-weight: bolder;color: red;'>发货</a></th>"+
							"</tr>";
				});
			})
			$("#OrderList").html(html);
		},"json");
		
	}
	
	//商家发货
	function deliverGoods(oId){
		$.post("${pageContext.request.contextPath}/businessBackstageController/deliverGoods?oId="+oId,function(data){
			if(data.msg == "1"){
				Dialog.init('发货成功！',1000);
				var st = setTimeout("selectNewOrders()", 2000);
			}else{
				Dialog.init('发货失败！',1000);
				var st = setTimeout("selectNewOrders()", 2000);
			}
		},"json");
		
	}
	
	//下架商品
	function OffShelfMerchandise(smId){
		$.post("${pageContext.request.contextPath}/businessBackstageController/operatingCommodities?smId="+smId+"&smStock=0",function(data){
			if(data.msg == "1"){
				Dialog.init('下架成功！',1000);
				var st1 = setTimeout("window.location.reload()", 2000);
			}else{
				Dialog.init('下架失败！',1000);
				var st2 = setTimeout("window.location.reload()", 2000);
			}
			
		},"json");
		
	}
	
	//上架商品
	function upperShelfMerchandise(smId){
		$.post("${pageContext.request.contextPath}/businessBackstageController/operatingCommodities?smId="+smId+"&smStock=99",function(data){
			if(data.msg == "1"){
				Dialog.init('上架成功！',1000);
				var st1 = setTimeout("window.location.reload()", 2000);
			}else{
				Dialog.init('上架失败！',1000);
				var st2 = setTimeout("window.location.reload()", 2000);
			}
			
		},"json");
		
	}

	//查询菜品
	function selectShopMenu(page){
	    $.post("${pageContext.request.contextPath}/businessBackstageController/selectShopMenu",page,function(data){
			var html = "";
			$.each(data,function(i,v){
				$.each(v,function(a,b){
					html += "<tr>"+
							"<th width='100px'><img width='100px' height='75px' src='${pageContext.request.contextPath}/"+b.sm_image+"'></th>"+
							"<th>"+b.sm_dishName+"</th>"+
							"<th>"+b.sm_price+"</th>"+
							"<th>"+b.sm_stock+"</th>"+
							"<th>"+b.sm_details+"</th>"+
							"<th><a href='javascript:void(0)' onclick='updateMenuInfo("+b.sm_id+")' style='color:red;font-weight:bolder;'>修改</a>&nbsp;&nbsp;<a href='javascript:void(0)' onclick='OffShelfMerchandise("+b.sm_id+")' style='color:green;font-weight:bolder;'>下架</a>&nbsp;&nbsp;<a href='javascript:void(0)' onclick='upperShelfMerchandise("+b.sm_id+")' style='color:green;font-weight:bolder;'>上架</a></th>"+
							"</tr>";
				});
				
			});
			$("#menusList").html(html);
	    },"json");
	}
	
	//修改商品信息
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
		$("#newOrders_div").hide();
	}
	
	function changePassword(){
		$("#accountManager_div").hide();
		$("#shopMenu_div").hide();
		$("#newOrders_div").hide();
		$("#password_div").fadeIn(1000);
	}
	function changeMenu(){
		$("#shopMenu_div").fadeIn(1000);
		$("#password_div").hide();
		$("#newOrders_div").hide();
		$("#accountManager_div").hide();
	}
	function newOrderManager(){
		selectNewOrders();
		$("#shopMenu_div").hide();
		$("#password_div").hide();
		$("#newOrders_div").fadeIn(1000);
		$("#accountManager_div").hide();
	}
	
	
	//修改密码
	function updatePassword(){
		//alert($("#oldPassword").val().length);
		var oldPassword = $("#oldPassword").val();
		var newPassword = $("#newPassword").val();
		var reNewTelephone = $("#reNewTelephone").val();
		if(oldPassword != "" && oldPassword){
			if(newPassword != "" && reNewTelephone != ""){
				if(newPassword.length > 6){
					if(newPassword == reNewTelephone){
						//修改密码操作
						$.post("${pageContext.request.contextPath}/businessBackstageController/updatePassword",$("#changePassword").serialize(),function(data){
							if(data == "1"){
								mizhu.toast('修改成功！');
							}else{
								mizhu.toast('修改失败！');
							}
						},"json");
					}else{
						mizhu.toast('两次密码输入不一致！');
					}
				}else{
					mizhu.toast('密码需要大于6位数哦！');
				}
			}else{
				mizhu.toast('新密码不可以为空！');
			}
		}else{
			mizhu.toast('原密码不可以为空！');
		}
	}
	
	
</script>
<!-- 菜品管理样式 -->
<style type="text/css">
#shopMenuList th, #newOrdersList th{
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
   <li><i></i><a href="javascript:void(0)" onclick="newOrderManager()">新订单管理</a></li>
   <li><i></i><a href="javascript:void(0)" onclick="changePassword()">修改密码</a></li>
  </ul>
 </nav>
 <article class="U-article Overflow">
  <!--user Account-->
  <section class="AccManage Overflow">
<div id="accountManager_div" style="width: 910px;height: 344px;display: none;">
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
    <td><input type="text" name="oldPassword" id="oldPassword" placeholder="请输入原密码" value=""></td>
    </tr>
    <tr>
    <td width="30%" align="right">*新密码：</td>
    <td><input type="text" name="newPassword" id="newPassword" placeholder="请输入新密码" value=""></td>
    </tr>
    <tr>
    <td width="30%" align="right">*再次输入新密码：</td>
    <td><input type="text" name="reNewTelephone" id="reNewTelephone" placeholder="请再次输入新密码" value=""></td>
    </tr>
    <tr>
    <td></td>
    <td><input onclick="updatePassword()" type="button" value="保 存"></td>
    </tr>
    </table>
</div>  
<!-- 菜品管理 -->
<div  id="shopMenu_div" style="width: 910px;height: 600px;">
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
<!-- 新订单 -->
<div  id="newOrders_div" style="display: none; width: 910px;height: 600px;">
	<span class="AMTitle Block Font14 FontW Lineheight35">新订单管理</span>
	<table id="newOrdersList" border="1px">
		<thead>
		<tr>
			<th>订单编号</th>
			<th>商品名称</th>
			<th>订餐数量</th>
			<th>电话号码</th>
			<th>下单时间</th>
			<th>收货人</th>
			<th>订单金额</th>
			<th>操作</th>
		</tr>
		</thead>
		<tbody id="OrderList">
			
		</tbody>
	</table>
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