
// jsp上のidとjs上の変数を紐づける
const makerList = document.getElementById("value2");

//リストに要素を追加する
async function addOption_maker(){
	
	//データを取得
	const res = await fetch('http://localhost:8080/test_Project/getMaker');
	const M002 = await res.json();
	
	// デフォルト値
	var defSelect = "---選択してください---";
	const opt1 = document.createElement('option');
	opt1.setAttribute('value','');　// value値
	opt1.innerHTML = defSelect;　　// jspでの表示名
	makerList.appendChild(opt1);
	
	// M002の内容をoptionタブに設定する
	for (var i = 0; i<M002.length; i++){
		var getMaker = M002[i].maker;
		const opt2 = document.createElement('option');
		opt2.setAttribute('value',getMaker);
		opt2.innerHTML = getMaker;
		makerList.appendChild(opt2);
	}
	//document.getElementById('getMaker').options[1].selected = true;
}
window.onload = addOption_maker;