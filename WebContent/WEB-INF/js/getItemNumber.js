
// jsp上のidとjs上の変数を紐づける
const selectList = document.getElementById("lists");
const ListData = document.getElementById("testList");
const maker =  document.getElementById("getMaker");

//リストに要素を追加する
async function addOption_itemNumber(){
	var selectMaker = document.getElementById("getMaker").value;
	
	//データを取得
	const res = await fetch('http://localhost:8080/test_Project/test');
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

//onloadは同一要素の同一イベントに対して複数設定はできない。
//複数設定したい場合はaddEventListenerを使用することらしい。
maker.onload = addEventListener("load",addOption_itemNumber);
   
