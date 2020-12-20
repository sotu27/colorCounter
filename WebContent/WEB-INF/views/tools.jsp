<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
<!DOCTYPE html>

<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://cdn.datatables.net/t/bs-3.3.6/jqc-1.12.0,dt-1.10.11/datatables.min.css"/> 

    <script src="<c:url value="/js/jquery.dataTables.min.js" />" type="text/javascript"></script>
    <script>jQuery(function($){});</script>

    
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.19/css/dataTables.bootstrap4.min.css"/>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	<title>SOサンプル</title>
</head>
<body>

<form method="post" action="logout">

<tr><td><input type="submit" value="ログアウト"/></td></tr>

</form>


<form method="post" action="maintenance_menu">

<tr><td><input type="submit" value="メンテナンスメニューへ"/></td></tr>

</form>

<table border="1">

<tr>
 <th>検索</th>
 <th>操作</th>
 </tr>
</table>

<br></br>



<br></br>

<table border="1">
<tr>数量変更メニュー</tr>
<tr>
 <th>メーカー</th>
 <th>品番</th>
 <th>数量</th>
 <th>計算</th>
 <th>操作</th>


<form method="post" action="itemCal">
<tr>
　　　　　　　　<td><select name="maker" id="getMaker" onchange="addOption_itemNumber()"></select></td>　　
		 <td><select name="itemNumber"id="lists"></select></td>
         <td><select name="qty">
              <option value="1">1</option>
              <option value="2">2</option>
              <option value="3">3</option>
              <option value="4">4</option>
              <option value="5">5</option>
              <option value="6">6</option>
              <option value="7">7</option>
              <option value="8">8</option>
              <option value="9">9</option>
              <option value="10">10</option>
              </select></td>
         <td><select name="operation" >
              <option value="plus">＋</option>
              <option value="minus">－</option>
               </select></td>
         <td><input type="submit" value="変更する！" id="value2" onClick="alert('操作しました！');">
</tr>   
</form>
</table>

<br></br>


 <table border="1" id="foo-table" class="table table-stripe">
      <thead>
             <tr><th>品番</th>
                 <th>カラー</th>
                 <th>在庫数量</th>  
             </tr>
      </thead>
</table>





<!-- dataTableを使用してtableの<tbody>タブに相当するページング機能付きリストを作成する -->
 <script  src="https://code.jquery.com/jquery-3.3.1.min.js"
          integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
          crossorigin="anonymous"></script>
<script   src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" 
          integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" 
          crossorigin="anonymous"></script>
<script   src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" 
          integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" 
          crossorigin="anonymous"></script>
<script   type="text/javascript" 
          src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
<script   type="text/javascript" 
          src="https://cdn.datatables.net/1.10.19/js/dataTables.bootstrap4.min.js"></script>
<script   src="<c:url value="/js/getTC001List.js" />" type="text/javascript"></script>

<!-- makerをDB(M002)から取得する！ -->
    <script src="<c:url value="/js/getMaker.js" />" type="text/javascript"></script>
<!-- itemNumberをDB(TC001)から取得する！ -->
<script src="<c:url value="/js/getItemNumber.js" />" type="text/javascript"></script>

<%= new java.util.Date() %>
</body>
</html>