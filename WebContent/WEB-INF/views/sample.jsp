<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>SOサンプル</title>
</head>
<body>
<form method = post action="Servlet4">
<input type = text name=text1 >
<input type = submit value = "送信">
</form>

<form method = get action="top">
<input type = submit value = "トップページに戻る">
</form>

 <h3>今までの投稿内容はこちら！ </h3>
 <form method = get action="delete">
 <table border="1">
 <tr>
 <th>投稿日時</th>
 <th>内容</th>
 <th>削除</th> 
 </tr>

 <c:forEach var="ppp" items="${res}" step="1">
     <tr>
         <td><c:out value="${ppp.time}"/></td>
         <td><c:out value="${ppp.text1}"/></td>
         <td><a link href="/test_Project/delete?time=${ppp.time}">"削除"</a></td>
     </tr>    
</c:forEach>


</table>
</form>
<%= new java.util.Date() %>
</body>
</html>