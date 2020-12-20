<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
<!DOCTYPE html>

<head>
    <meta charset="UTF-8">
	<title>SIGNIN</title>
</head>
<body>

<td>サインイン画面でーす</td>
<table border="1">
<form method="post" action="regist_signin">

 <tr><th>ユーザネーム</th><td><input type="text" name="user_name"  /></td></tr>
 <tr><th>ユーザパス</th> <td><input type="text" name="user_password" id="name" /></td> </tr>    
<tr><td><input type="submit" value="signin_ユーザ登録する"/></td></tr>

</form>
</table>

<br></br>

<form method="get" action="login">
<tr><td><input type="submit" value="戻る"/></td></tr>
</form>
<br></br>





</body>
</html>