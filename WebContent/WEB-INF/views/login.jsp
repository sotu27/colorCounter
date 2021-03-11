<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html xmlns:th="http://www.thymeleaf.org">
	
<!DOCTYPE html>

<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="https://cdn.datatables.net/t/bs-3.3.6/jqc-1.12.0,dt-1.10.11/datatables.min.css"/> 
	<script src="<c:url value="/js/jquery.dataTables.min.js" />" type="text/javascript"></script>
	<script>jQuery(function($){});</script>
	<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.19/css/dataTables.bootstrap4.min.css"/>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	<link href="http://fonts.googleapis.com/earlyaccess/notosansjp.css">
    

</head>
	<title>SOサンプル</title>
		<link rel="stylesheet" type="text/css" href="<c:url value="/css/reset.css"/>"/>
	<link rel="stylesheet" type="text/css" href="<c:url value="/css/style.css"/>"/>
	<link rel="stylesheet" type="text/css" href="<c:url value="/css/mod_menu.css"/>"/>
	<link rel="stylesheet" type="text/css" href="<c:url value="/css/header.css"/>"/>
	<link rel="stylesheet" type="text/css" href="<c:url value="/css/table1.css"/>"/>
	<link rel="stylesheet" type="text/css" href="<c:url value="/css/bottun.css"/>"/>
	<link rel="stylesheet" type="text/css" href="<c:url value="/css/footer.css"/>"/>
	<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Noto+Sans+JP:wght@300&display=swap" rel="stylesheet">
<link href="http://fonts.googleapis.com/earlyaccess/notosansjp.css">	
	
	<style>
	.mode{margin-right:200;
		  margin-left:200}
	.tc001page{margin-right:200;
		       margin-left:200;
		       position: relative;
     			z-index: 0;}
	a{
	color:black;
	text-decoration:none}
	
	.clear-decoration {
	border: none; 
	outline: none;
	background: transparent;

	}
	.btn-flat-border {
  display: inline-block;
  padding: 0.3em 1em;
  text-decoration: none;
  color: #67c5ff;
  border: solid 2px #67c5ff;
  border-radius: 3px;
  transition: .4s;
  background: transparent;
}

.btn-flat-border:hover {
  background: #67c5ff;
  color: white;
}

.loginMessage {
	color: black;
	max-width: 1200px;
	padding:0 40px;
	margin:0 auto;
	  font-family: 'Noto Sans JP', sans-serif;  
}

.errorMessage {
	color: red;
	max-width: 1200px;
	padding:0 40px;
	margin:0 auto;
	  font-family: 'Noto Sans JP', sans-serif;  
}

	</style>
</head>

<body>

<header class="header_a">
	<div class="container">
		<div class="area_logo_header">
			<a class="logo" href="#">
				<img src="<c:url value="/img/colorcounter_logo.png"/>">
			</a>
		</div>
			<nav class="area_nav_header">
				<ul class="list_nav_header">
				
			<!-- ABOUTを表示 -->				
				 	<li><div class="panel_header">
        				<a class="js-open-modal" href="#">ABOUT</a>
        					<div class="modal-panel-back disable">
           						<div class="modal-panel">
	               				 	<div class="modal-panel-ttl">ABOUT colorcounter</div>
	               				 	<br>
	               				 	<p>
	               						colorcounterではあなたの手持ちの塗料のストックを記録することができるサイトです。<br><br>
	               						
	               						模型店に立ち寄った際に、こんな経験をしたことはありませんか？<br>
	               						「あれ、、、この塗料って家にまだ残っていたかな？？」<br>
	               						「つや消しクリアーと光沢クリアーの手持ちの数って・・・何個だったっけ((+_+)))」<br>
	               						「ニュートラルグレーのⅡが足りないと思っていたけど、実際に家にないのはⅢだった」<br>
	               						などなど・・・<br><br>
	               						
	               						そんな時！！colorcounterで記録をしておくと便利ですよ！！<br><br>
	               						
	               						現在はラッカー塗料のみしか対応していませんが、<br>
	               						水性やアクリル塗料も含め対応いていきたいと思っています。<br>
	               						（管理人はラッカー塗料のヘビーユーザなのです・・・）<br><br>
	               						
	               						当サイトが皆さんの模活に少しでもお役に立つことができれば幸いです！<br><br>
	               						
	               						それでは、本日も楽しい模活を！！！<br><br>
	               						
	               						<br>
	                 				</p>
	                 				<p>管理人より</p><br><br>
	                 					
	                    			<div class="btn-area">
	                        			<a class="js-close-modal" href="#">閉じる</a>
	                   				</div>
	                			</div>
           			 		</div>
        				</div>
					</li>

			<!-- 問い合わせ画面へ遷移 -->
					<li><div class="panel_header">
        				<a class="js-open-modal" href="#">お問い合わせへ</a>
        					<div class="modal-panel-back disable">
           						<div class="modal-panel">
	               				 	<div class="modal-panel-ttl">お問い合わせについて</div>
	               				 	<br>
	               				 	<p>
	               						ご意見やご感想、ご要望事項がありましたら<br>
	               						こちらの入力フォームから送信をお願いします(^^)<br><br>
	               						
	               						サイト作成のご参考にさせていただきたいと思っております！<br><br>
	                 				</p>
	                 				
	                 				<form method="post" action="qa_menu">
	                 				<textarea name="rqst_message" rows="10" cols="60">120文字以内で入力ください。</textarea><br>
<!-- 	                 				<input class="request_input_form" type="text" name="request"  /><br> -->
 										<input class="reset button-arrow-inner" type="submit" value="送信する！" />
									</form>
									<br><br>
	                    			<div class="btn-area">
	                        			<a class="js-close-modal" href="#">閉じる</a>
	                   				</div>
	                			</div>
           			 		</div>
        				</div>
					</li>
	
			<!-- メンテナンスメニューへ遷移 -->
					<li>
						<form method="post" action="maintenance_menu">
							<input type="submit" class="clear-decoration" value="メンテナンスメニューへ"/>
						</form>
					</li>

			<!-- ログアウトボタンの表示 -->
					<li>
						<form method="post" action="logout">
							<input type="submit" class="clear-decoration" value="ログアウト"/>
							<br>
<%-- 							<c:out value="${loginMessage}"/> --%>
						</form>
					</li>
				</ul>					
			</nav>
	</div>
</header>

<br>



<div class="mode">

	
		<table border="1">
			<form method="post" action="loginCheck">
				<tr><th>ユーザーネーム</th><td><input type="text" name="user_name"  /></td></tr>
			 	<tr><th>パスワード</th> <td><input type="text" name="user_password" id="name" /></td></tr>    
				<tr><td colspan="2"><input type="submit" value="ログイン"/>
					<br>
					<c:out value="${validationError}"/>
					</td></tr>
			</form>
			<form method="get" action="signin">
				<tr><td colspan="2"><input type="submit" value="新規登録はこちら"/></td></tr>
			</form>
		</table>
	
</div>

<br></br>

<form method="get" action="top">
	<input type="submit" value="戻る"/>
</form>


<footer>
	<p>© All rights reserved by colorcounter.</p>
</footer>

<!-- ↓↓↓javascpipt参照先↓↓↓ -->


<!-- dataTableを使用してtableの<tbody>タブに相当するページング機能付きリストを作成する -->
<script  src="https://code.jquery.com/jquery-3.3.1.min.js"
         integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
         crossorigin="anonymous"></script>
<script  src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" 
         integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" 
         crossorigin="anonymous"></script>
<script  src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" 
         integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" 
         crossorigin="anonymous"></script>

<script  type="text/javascript" 
         src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
<script  type="text/javascript" 
         src="https://cdn.datatables.net/1.10.19/js/dataTables.bootstrap4.min.js"></script>






<script>
   $(function(){
       $('.js-open-modal').on('click', function(){
           $(this).next().removeClass('disable');
       });
       $('.js-close-modal').on('click', function(e){
           e.preventDefault();
           $(this).parents('.modal-panel-back').addClass('disable');
       })
//        $('.modal-panel-back').on('click', function(){
//             $(this).addClass('disable');
//         })
   })
</script>



<%-- <%= new java.util.Date() %> --%>
</body>
</html>