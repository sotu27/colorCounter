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
	<title>SIGNIN</title>
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
		       margin-left:200}
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
	  margin: 10px 40px;
	  font-family: 'Noto Sans JP', sans-serif;  
}

.tc001page {

}

	</style>
</head>





<body>



<header class="header_a">
	<div class="container">
		<div class="area_logo_header">
			<a class="logo" href="">
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
	               				 	<div class="modal-panel-ttl">ABOUTの内容です。
	               				 	</div>
	               						こんちは！！！
	                 					year!!
	                    			<div class="btn-area">
	                        			<a class="c-btn js-close-modal" href="#">設定</a>
	                   				</div>
	                			</div>
           			 		</div>
        				</div>
					</li>
					
			<!-- お知らせ内容を表示 -->
					<li><form method="post" action="notice">
						<input type="submit" class="clear-decoration" value="お知らせ"/>
						</form>
					</li>

			<!-- 問い合わせ画面へ遷移 -->
					<li>
						<form method="post" action="qa_menu">
 							<input type="submit" class="clear-decoration" value="お問い合わせ画面へ"/>
						</form>
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
							<c:out value="${loginMessage}"/>
						</form>
					</li>
				</ul>					
			</nav>
	</div>
</header>

<br>



<div class="mode">
	
		<table border="1">	
		<form method="post" action="regist_signin">	
				<tr><th>ユーザーネーム</th><td><input type="text" name="user_name"  /></td></tr>
			 	<tr><th>パスワード</th> <td><input type="text" name="user_password" id="name" /></td></tr>    
				<tr><td colspan="2"><input type="submit" value="ユーザ登録する"/>
									<br>
					<c:out value="${validationError}"/><c:out value="${signinMessage}"/>
					</td></tr>
		</form>
		</table>
	
</div>

<div>
	<form method="get" action="login">
		<input type="submit" value="戻る"/>
	</form>
</div>







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
       $('.modal-panel-back').on('click', function(){
            $(this).addClass('disable');
        })
   })
</script>



<%-- <%= new java.util.Date() %> --%>
</body>
</html>