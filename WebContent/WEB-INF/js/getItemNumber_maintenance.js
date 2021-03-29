const itemNumber = document.getElementById("itemNumber");
const maker1 = document.getElementById("getMaker");
const selectList = document.getElementById("lists");

//maker1.onload = addEventListener("change",addOption_itemNumber);
async function addOption_itemNumber(){
	var selectMaker = document.getElementById("getMaker").value;
	
	//データを取得
	//const res = await fetch('http://localhost:8080/test_Project/test');
	const res = await fetch('https://c-counter.com/testProject/test');
	const fff = await res.json();
	
	// 品番のoptionタブに既にデータがある場合、optionタブ要素を削除する。
	// メーカーを選択する（onchange）するたびに実行する。
	if(selectList.hasChildNodes()){
		while(selectList.firstChild){
			var child = document.getElementById('child');
			selectList.removeChild(child);
		}
	}
	// MC001の内容をoptionタブに設定する
	for (var i = 0; i<fff.length; i++){
		var getName = fff[i].itemNumber;
		var getColor = fff[i].colorName;
		var nameAndColorName = getName + ':' + getColor;
		var getMaker = fff[i].maker;
		
		// 選択したメーカーの品番をoptionタブに設定する。
		if ( getMaker == selectMaker){
				const opt2 = document.createElement('option' );
				opt2.setAttribute('value',getName);
				opt2.id = 'child';
				opt2.innerHTML = nameAndColorName;
				selectList.appendChild(opt2);
			}
		}
};

//addEventListener("①: 実行するきっかけとなる動作", 　②: ①を動作した際に実行するfunction名)
maker1.onload = addEventListener("load",addOption_itemNumber);

function aaa(){
	
	var op = document.getElementById("op").value;
	if (op == "add") {
		if (!itemNumber.hasChildNodes()){
			itemNumber.style.display = 'block';
			  var input_data = document.createElement('input');
			  input_data.type = 'text';
			  input_data.id = 'inputform_1';
			  input_data.placeholder = 'フォーム1-';
			  var parent = document.getElementById('form_area');
			  parent.appendChild(input_data);
		}
	}
};