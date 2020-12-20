<% String name =  (String)request.getAttribute("text1");%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>RESPONSE</title>
</head>
<body>

<form method = Get action="first">
<input type = submit value = "戻る">
</form>

 <tr>
 <td>  ${MessageFormData.text1}</td>
 </tr>
 
 <h3>取得結果 </h3>
 <form method = post action="delete">
 <table border="1">
 <tr>
 <th>投稿日時</th>
 <th>内容</th>
 <th>削除</th> 
 </tr>

 <c:forEach var="ppp" items="${res}">
     <tr>
         <td><c:out value="${ppp.time}"/></td>
         <td><c:out value="${ppp.text1}"/></td>
         <td><input type=submit value="削除"></td>
     </tr>    
</c:forEach>


</table>
</form>

</body>
</html>