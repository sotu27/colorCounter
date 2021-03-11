package org.springTest.test;

import java.io.Serializable;
import org.springframework.stereotype.Component;

@Component
public class tool implements toolIf {
	
	private String maker;
	private String itemNumber;	
	private int qty;
	private String operation;
	private String colorName;
	private int price;
	private int del_ind;
	private String gloss_level;
	private String color_attribute1;
	private String sys_add_dd;
	private String user_password;
	private String user_name;
	private String rqst_message;
	
	public String getMaker() {
		return maker;
	}


	public void setMaker(String maker) {
		this.maker = maker;
	}
	

	public String getItemNumber() {
		// TODO 自動生成されたメソッド・スタブ
		return itemNumber;
	}


	public void setitemNumber(String itemNumber) {
		this.itemNumber = itemNumber;
		
	}


	public int getQty() {
		// TODO 自動生成されたメソッド・スタブ
		return qty;
	}


	public void setQty(int qty) {
		this.qty = qty;
		
	}


	public String getOperation() {
		return operation;
	}


	public void setOperation(String operation) {
		this.operation = operation;
		
	}


	@Override
	public String getColorName() {
		// TODO 自動生成されたメソッド・スタブ
		return colorName;
	}


	@Override
	public void setColorName(String colorName) {
		// TODO 自動生成されたメソッド・スタブ
		this.colorName = colorName;
	}


	@Override
	public int getPrice() {
		// TODO 自動生成されたメソッド・スタブ
		return price;
	}


	@Override
	public void setPrice(int price) {
		// TODO 自動生成されたメソッド・スタブ
		this.price = price;
	}


	@Override
	public int getDel_ind() {
		// TODO 自動生成されたメソッド・スタブ
		return del_ind;
	}


	@Override
	public void setDel_ind(int del_ind) {
		// TODO 自動生成されたメソッド・スタブ
		this.del_ind = del_ind;
	}


	@Override
	public String getGloss_level() {
		// TODO 自動生成されたメソッド・スタブ
		return gloss_level;
	}


	@Override
	public void setGloss_level(String gloss_level) {
		// TODO 自動生成されたメソッド・スタブ
		this.gloss_level = gloss_level;
	}


	@Override
	public String getColor_attribute1() {
		// TODO 自動生成されたメソッド・スタブ
		return color_attribute1;
	}


	@Override
	public void setColor_attribute1(String color_attribute1) {
		// TODO 自動生成されたメソッド・スタブ
		this.color_attribute1 = color_attribute1;
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
	
	@Override
	public void setUser_passsword(String user_password) {
		// TODO 自動生成されたメソッド・スタブ
		this.user_password = user_password;
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


	@Override
	public String getRqst_message() {
		// TODO 自動生成されたメソッド・スタブ
		return rqst_message;
	}


	@Override
	public void setRqst_message(String rqst_message) {
		this.rqst_message = rqst_message;
		
	}


	
	

}
