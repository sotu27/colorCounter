package org.springTest.Entity;

public class tools {
	private String itemNumber;
	private String colorName;
	private String maker;
	private int price;
	private int del_ind;
	private String gloss_level;
	private String color_attribute1;
	private String user_name;
	private String user_password;
	private String sys_add_dd;
	
	private int itemQty;
	
	public tools(String itemNumber,String colorName, String maker, int price, int del_ind) {
		this();
		this.itemNumber = itemNumber;
		this.colorName = colorName;
		this.maker =maker;
		this.price = price;
		this.del_ind = del_ind;
		this.gloss_level = gloss_level;
		this.color_attribute1 = color_attribute1;
		this.itemQty =itemQty;
	}

	public tools() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public String getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(String itemNumber) {
		this.itemNumber = itemNumber;
	}

	public String getColorName() {
		return colorName;
	}

	public void setColorName(String colorName) {
		this.colorName = colorName;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDel_ind() {
		return del_ind;
	}

	public void setDel_ind(int del_ind) {
		this.del_ind = del_ind;
	}
	
	public String getGloss_level() {
		return gloss_level;
	}

	public void setGloss_level(String gloss_level) {
		this.gloss_level = gloss_level;
	}

	public String getColor_attribute1() {
		return color_attribute1;
	}

	public void setColor_attribte1(String color_attribute1) {
		this.color_attribute1 = color_attribute1;
	}	

	public int getItemQty() {
		return itemQty;
	}

	public void setItemQty(int itemQty) {
		this.itemQty = itemQty;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public String getSys_add_dd() {
		return sys_add_dd;
	}

	public void setSys_add_dd(String sys_add_dd) {
		this.sys_add_dd = sys_add_dd;
	}		
	

}
