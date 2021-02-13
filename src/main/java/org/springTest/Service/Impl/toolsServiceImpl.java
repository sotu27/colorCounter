package org.springTest.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import java.util.List;

import org.springTest.Dao.*;
import org.springTest.Dao.Impl.toolsDaoImpl;
import org.springTest.Entity.tools;
import org.springTest.Service.toolsService;
import org.springTest.Method.*;

@Service
@ComponentScan("org.springTest.Dao")
@ComponentScan("org.springTest.Dao.impl")
public class toolsServiceImpl {
	
	@Autowired
	toolsDaoImpl toolsDaoImpl;
	@Autowired
	timeForInsert timeForInsert;
	
	// MC001から全件取得
	public List<tools> getAllEntity_Service() {
		return toolsDaoImpl.getAllEntity();
	}
	
	
	// TC001から数量を取得
	public List<tools> getItemQty_Service(String userName) {
		return toolsDaoImpl.getItemQty(userName);
	}
	
	
	// メーカ名を取得
	public List<tools> getMaker_Service() {
		return toolsDaoImpl.getM002();
	}
	
	
	// MC001登録
	public void registMC001_Service(String maker,String itemNumber,String name,int price,
			String gloss_level,String color_attribute1) {
		    toolsDaoImpl.registMC001(maker, itemNumber, name, price, gloss_level, color_attribute1);
	}
	
	
	// MC001削除
	public void deleteMC001_Service(String maker,String itemNumber) {
		    toolsDaoImpl.deleteMC001(maker, itemNumber);
	}
	
	
	// 計算メソッド
	public void itemCal_Service(String maker,String itemNumber, int qty,String operation, String userName) {
		
		// 変数宣言
		int baseQty ;
		boolean checkResultTC001;
		
		// TC001に「ユーザ×品番」の組み合わせのレコードが存在するかを判定
		// TC001にINSERTかUPDATEかを判定する。
		checkResultTC001 = toolsDaoImpl.checkTC001(maker, itemNumber, userName);		
		if (checkResultTC001) {
			// TC001にレコードが存在する場合⇒UPDATE処理		
			//現在の数量を取得する
			baseQty = toolsDaoImpl.getQty(itemNumber);
			//条件によって計算メソッドを呼び出す
			if (operation.equals("plus")) {
				int resultQty;  //計算結果用変数
				resultQty = baseQty + qty;
				toolsDaoImpl.itemCal_plus(maker,itemNumber,resultQty);
			} else if (operation.equals("minus")) {
				int resultQty;  //計算結果用変数
				resultQty = baseQty - qty;
				toolsDaoImpl.itemCal_minus(maker,itemNumber,resultQty);
			}
		}else {
			// TC001にレコードが存在しない場合⇒INSERT処理
			toolsDaoImpl.registTC001(maker, itemNumber, qty, userName);
		}
	}
	
	
	// ログイン画面でM000を判定する
	public boolean checkM000_service (String user_name,String user_password) {
		boolean checkM000  = false;
		checkM000 = toolsDaoImpl.checkM000(user_name, user_password);
		return checkM000;
	}
	
	
	// ログイン画面でM000を判定する
	public boolean checkM000_userName_service (String user_name) {
		boolean  M000_userName_service = false;
		M000_userName_service = toolsDaoImpl.checkM000_userName(user_name);
		return M000_userName_service;
	}
	
	
	// サインイン画面でユーザ新規登録M000登録
	public void registM000_Service(String user_name,String user_password) {
		String sys_add_dd = "";
		sys_add_dd = timeForInsert.timeFotInsert();
		toolsDaoImpl.registM000(user_name, user_password, sys_add_dd);
	}
	
	// M000から全件取得
	public List<tools> getM000() {
		return toolsDaoImpl.getM000();
	}

	
}
