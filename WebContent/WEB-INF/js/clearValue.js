const opSelect = document.getElementById("op");
const maker = document.getElementById("getMaker");

opSelect.onload = addEventListener("load",clearValue);
opSelect.onload = addEventListener("change",clearValue);

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
	} 
};