package org.springTest.test;

import java.io.Serializable;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

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
	@NotEmpty(message = "名前を入力してください")
	@Size(max = 50, message = "名前は50桁以内で入力してください")
	public String getUser_name();
	void setUser_name(String user_name);	
	// ユーザパスワード
	@NotEmpty(message = "パスワードを入力してください")
	@Size(max = 50, message = "パスワードは50桁以内で入力してください")
	public String getUser_password();
	void setUser_passsword(String user_password);	
	// システム追加日
	public String getSys_add_dd();
	void setSys_add_dd(String sys_add_dd);	
	// お問い合わせメッセージ
//	@Size(max = 10, message = "お問い合わせ内容は250文字以内で入力してください")
	public String getRqst_message();
	void setRqst_message(String rqst_message);
	

}
