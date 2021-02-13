<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
	<title>SIGNIN</title>
</head>
<body>

<div>
サインイン画面でーす
	<form method="post" action="regist_signin">
		<table border="1">		
			<tr><th>name</th><td><input type="text" name="user_name"  /></td></tr>
			<tr><th>pass</th> <td><input type="text" name="user_password" id="name" /></td></tr>    
			<tr><td><input type="submit" value="ユーザ登録する"/></td></tr>
		</table>
	</form>
</div>

<div>
	<form method="get" action="login">
		<input type="submit" value="戻る"/>
	</form>
</div>


<div>
	<c:out value="${signinMessage}"/>
	<c:out value="${validationError}"/>
</div>



</body>
</html>