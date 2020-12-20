<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>メンテナンスメニュー</title>
</head>
<body>

<form method="post" action="maintenance_add">
<td><input type="submit" value="ADD"/></td>
</form>

<form method="post" action="maintenance_change">
<td><input type="submit" value="CHANGE"/></td>
</form>

<form method="post" action="maintenance_delete">
<td><input type="submit" value="DELETE"/></td>
</form>

<form method="get" action="tools">
<td><input type="submit" value="戻る"/></td>
</form>


<br/>
<tr>ーーーーーーー使いませんーーーーーーーーーー</tr>
<br/>

<tr>新規商品メンテナンスメニュー！！</tr>
<table border="1">

<form method="post" action="maintenance">



 <tr><th>操作</th> <td><select name="op" id="op" >
                      <option value="nonSelect">---選択してください---</option>
                      <option value="add">追加</option>
                      <option value="delete">削除</option>
                      <option value="upd">変更</option> 
                      </select></td>  </tr>
 <tr><th>メーカー</th> <td><select name="maker" id="getMaker" onchange="addOption_itemNumber()" style="display:block;" disabled></select></td></tr>                     
 <tr><th>品番</th> <td><div id="form_area"><select name="itemNumber" id="lists" style="display:block;" disabled></select>
                       <input type="text" id="aaaa" style="display:block;" disabled/></div></td> </tr>
 <tr><th>名称</th> <td><input type="text" id="name" style="display:block;" disabled/></td> </tr>
 <tr><th>価格</th> <td><input type="text" id="price" style="display:block;" disabled/></td>  </tr>
 <tr><th>グロスレベル</th> <td><input type="text" id="gloss_level" style="display:block;" disabled/></td> </tr>
 <tr><th>属性</th> <td><input type="text" id="attribute1" style="display:block;" disabled/></td> </tr>



         <td><input type="submit" value="SUBMIT！" id="value1" ></td>
</form>
</table>


<!-- makerをDB(M002)から取得する！ -->

    <script src="<c:url value="/js/maintenance_menu.js" />" type="text/javascript"></script>
        <script src="<c:url value="/js/getMaker.js" />" type="text/javascript"></script>
    <script src="<c:url value="/js/getItemNumber_maintenance.js" />" type="text/javascript"></script>
    
   
</body>
</html>