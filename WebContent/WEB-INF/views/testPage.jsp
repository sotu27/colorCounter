<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.19/css/dataTables.bootstrap4.min.css"/>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
  </head>
<body>
  <!-- 追加のCSS -->
  <style>

  </style>

  <table class='table table-stripe' id="lingTable">
    <thead>
      <tr><th>#</th><th>日本語</th><th>英語</th>
        <th>品詞</th></tr>
    </thead>
  </table>

  <!-- dataTables bootstrap4を使うためのJSファイル -->
  <script
  src="https://code.jquery.com/jquery-3.3.1.min.js"
  integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
  crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
  <script type="text/javascript" src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
  <script type="text/javascript" src="https://cdn.datatables.net/1.10.19/js/dataTables.bootstrap4.min.js"></script>
  <!-- 独自定義JS -->
  <script type="text/javascript">
    const lingData=[
      {id:1,japanese:"走る",english:"run",pos:"動詞"},
      {id:2,japanese:"歩く",english:"walk",pos:"動詞"},
      {id:3,japanese:"鉛筆",english:"pencil",pos:"名詞"},
      {id:4,japanese:"夢",english:"dream",pos:"名詞"},
    ]
    const dtSetting={
       destroy: true,
       data: lingData,
       language: {
         url: "https://cdn.datatables.net/plug-ins/3cfcc339e89/i18n/Japanese.json"
       },
       columns: [
         {data:"id"},
         { data: "japanese"},
         { data: "english"},
         { data: "pos"}
       ]
    };
    $('#lingTable').DataTable(dtSetting);
  </script>
</body>
</html>