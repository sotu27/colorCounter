
// dataTableを使用してtableの<tbody>タブに相当するページング機能付きリストを作成する

async function getTC001List(){
	
	//データを取得
	//const res = await fetch('http://localhost:8080/test_Project/getItemList');
	const res = await fetch('https:/c-counter.com/testProject/getItemList');
	const fff = await res.json();
	const dtSetting={
		       destroy: true,
		       data: fff,
		       language: {
		         url: "https://cdn.datatables.net/plug-ins/3cfcc339e89/i18n/Japanese.json"
		       },
		       columns: [
		         {data:"itemNumber"},
		         { data: "colorName"},
		         { data: "itemQty"}
		       ],
		       // 件数切替機能
		        lengthChange: true,
		        // 検索機能 
		        searching: true,
		        // ソート機能 
		        ordering: true,
		        // 情報表示 
		        info: false,
		        // ページング機能 
		        paging:false,
		        scrollX: false,
		        scrollY:"300"
		    };
	console.log(dtSetting);
	$('#foo-table').DataTable(dtSetting);
	};
	window.onload = getTC001List;
	
	getTC001List();