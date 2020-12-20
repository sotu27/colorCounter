/**
 * 
 */

const opSelect = document.getElementById("op");
const maker = document.getElementById("getMaker");
const area = document.getElementById("form_area");

//opSelect.onload = addEventListener("change",disable_by_delete);
// 「操作」選択内容ごとに、グレーアウト項目を設定。
function disable_by_delete(){
	var op = document.getElementById("op").value;
	var maker = document.getElementById("getMaker");
	var itemNumber = document.getElementById("lists");
	var name = document.getElementById("name");
	var price = document.getElementById("price");
	var gloss_level = document.getElementById("gloss_level");
	var attribute1 = document.getElementById("attribute1");
	
	if (op == "delete"){
		maker.disabled = false;
		itemNumber.disabled = false;
		name.disabled = true;
		price.disabled = true;
		gloss_level.disabled = true;
		attribute1.disabled = true;
	}else if (op == "nonSelect"){
		maker.disabled = true;
		itemNumber.disabled = true;
		name.disabled = true;
		price.disabled = true;
		gloss_level.disabled = true;
		attribute1.disabled = true;
	}else {
		maker.disabled = false;
		itemNumber.disabled = false;
		name.disabled = false;
		price.disabled = false;
		gloss_level.disabled = false;
		attribute1.disabled = false;
	}
};

// 「---選択してください---」選択時に、入力欄をクリアする。
//opSelect.onload = addEventListener("load",clearValue);
//opSelect.onload = addEventListener("change",clearValue);
//
function clearValue(){
	var op = document.getElementById("op").value;
	var maker = document.getElementById("getMaker");
	var itemNumber = document.getElementById("lists");
	var name = document.getElementById("name");
	var price = document.getElementById("price");
	var gloss_level = document.getElementById("gloss_level");
	var attribute1 = document.getElementById("attribute1");
	
	if (op == "nonSelect"){
		maker.value = '';
		itemNumber.value = '';
		name.value = '';
		price.value = '';
		gloss_level.value = '';
		attribute1.value = '';
		
		if(itemNumber.hasChildNodes()){
			while(itemNumber.firstChild){
				var child = document.getElementById('child');
				itemNumber.removeChild(child);
			}
		}
	} 
};


opSelect.onload = addEventListener("change",aaaa);
//「操作」選択内容ごとに、グレーアウト項目を設定。
function aaaa(){
	var op = document.getElementById("op").value;
	var maker = document.getElementById("getMaker");
	var itemNumber = document.getElementById("lists");
	var aaaa = document.getElementById("aaaa");
	var name = document.getElementById("name");
	var price = document.getElementById("price");
	var gloss_level = document.getElementById("gloss_level");
	var attribute1 = document.getElementById("attribute1");
	
	if (op == "add"){
		itemNumber.remove();
		aaaa.disabled = false;
	}else{
		if(!itemNumber.hasChildNodes()){
			aaaa.removed();
			const opt2 = document.createElement('select' );
			opt2.setAttribute('value',getName);
			opt2.id = 'child';
			opt2.innerHTML = nameAndColorName;
			area.appendChild(opt2);
		}
		
	}
};





