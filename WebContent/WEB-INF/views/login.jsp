<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
<!DOCTYPE html>

<head>
    <meta charset="UTF-8">
	<title>LOGIN</title>
</head>
<body>

<td>ログイン画面でーす</td>
<table border="1">
<form method="post" action="loginCheck">

 <tr><th>ユーザネーム</th><td><input type="text" name="user_name"  /></td></tr>
 <tr><th>ユーザパス</th> <td><input type="text" name="user_password" id="name" /></td> </tr>    
<tr><td><input type="submit" value="ログイン"/></td></tr>

</form>
</table>

<form method="get" action="signin">
<tr><td><input type="submit" value="新規登録はこちら"/></td></tr>

<br></br>

<form method="get" action="top">
<tr><td><input type="submit" value="戻る"/></td></tr>
</form>
<br></br>





</body>
</html>