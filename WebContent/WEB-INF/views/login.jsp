<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
	<title>LOGIN</title>
	
	
</head>
<body>


<header>ログイン画面でーす</header>

<div>
	<form method="post" action="loginCheck">
		<table border="1">
				<tr><th>nameppp</th><td><input type="text" name="user_name"  /></td></tr>
			 	<tr><th>pass</th> <td><input type="text" name="user_password" id="name" /></td></tr>    
				<tr><td><input type="submit" value="ログイン"/></td></tr>
		</table>
	</form>
</div>

<div>
	<form method="get" action="signin">
		<input type="submit" value="新規登録はこちら"/>
	</form>
</div>

<div>
	<c:out value="${loginMessage}"/>
	<c:out value="${validationError}"/>
</div>




<br></br>

<form method="get" action="top">
	<input type="submit" value="戻る"/>
</form>





</body>
</html>