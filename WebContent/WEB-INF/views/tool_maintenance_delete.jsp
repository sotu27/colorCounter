<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>メンテナンスメニュー 削除用</title>
</head>
<body>

<form method="post" action="maintenance_menu">
<td><input type="submit" value="戻る"/></td>
</form>

<tr>新規商品メンテナンスメニュー！！　削除用</tr>
<table border="1">

<form method="post" action="maintenance_delete_submit">



 <tr><th>メーカー</th> <td><select name="maker" id="getMaker" onchange="addOption_itemNumber()" ></select></td></tr>                     
 <tr><th>品番</th> <td><select name="itemNumber" id="lists" ></select></td> </tr>
 <tr><th>名称</th> <td><input type="text" id="name" style="display:block;" disabled/></td> </tr>
 <tr><th>価格</th> <td><input type="text" id="price" style="display:block;" disabled/></td>  </tr>
 <tr><th>グロスレベル</th> <td><input type="text" id="gloss_level" style="display:block;" disabled/></td> </tr>
 <tr><th>属性</th> <td><input type="text" id="attribute1" style="display:block;" disabled/></td> </tr>



         <td><input type="submit" value="SUBMIT！" id="value1" ></td>
</form>
</table>


<!-- makerをDB(M002)から取得する！ -->


        <script src="<c:url value="/js/getMaker.js" />" type="text/javascript"></script>
    <script src="<c:url value="/js/getItemNumber_maintenance.js" />" type="text/javascript"></script>
    
   
</body>
</html>