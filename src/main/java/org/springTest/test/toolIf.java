package org.springTest.test;

public interface toolIf {
	
	// メーカー
	public String getMaker();
	void setMaker(String maker);
	// 品番	
	public String getItemNumber();
	void setitemNumber(String itemNumber);
	// カラー名	
	public String getColorName();
	void setColorName(String colorName);	
	// 価格	
	public int getPrice();
	void setPrice(int price);	
	// 削除フラグ	
	public int getDel_ind();
	void setDel_ind(int del_ind);	
	// 光沢度	
	public String getGloss_level();
	void setGloss_level(String gloss_level);	
	// 属性１	
	public String getColor_attribute1();
	void setColor_attribute1(String color_attribute1);	
	// 数量	
	public int getQty();
	void setQty(int qty);
	// 操作	
	public String getOperation();
	void setOperation(String operation);	
	// ユーザ名	
	public String getUser_name();
	void setUser_name(String user_name);	
	// ユーザパスワード
	public String getUser_password();
	void setUser_passsword(String user_password);	
	// システム追加日
	public String getSys_add_dd();
	void setSys_add_dd(String sys_add_dd);	
	

}
