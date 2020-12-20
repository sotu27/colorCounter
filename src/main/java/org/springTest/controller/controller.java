package org.springTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springTest.test.*;
import org.springTest.Dao.*;
import org.springTest.Dao.Impl.InfomationDaoImpl;
import org.springTest.Dao.Impl.toolsDaoImpl;
import org.springTest.Entity.*;

import org.springTest.Method.*;
import org.springTest.Service.InfomationService;
import org.springTest.Service.Impl.InfomationServiceImpl;
import org.springTest.Service.Impl.toolCalculation;
import org.springTest.Service.Impl.toolsServiceImpl;

import java.util.List;

@Controller
public class controller {


	//DIする変数の型は、クラスではなくインターフェースとします。
	//例）private インターフェース名　formクラス名(インターフェースを継承しているクラス);
	@Autowired
	private toolIf tool;
	@Autowired
	toolsServiceImpl toolsServiceImpl;
	
	
	// form値とmodelのバインドを行う。
	@ModelAttribute("MessageFormData")
	public MessageIf setupBind() {
		//上でDIされた（インスタンス化された）FormBeanを返します
		return this.Message;
	}
	
	
	// form値とmodelのバインドを行う。
	@ModelAttribute("toolFormData")
	public toolIf setupBindFortool() {
		//上でDIされた（インスタンス化された）FormBeanを返します
		return this.tool;
	}	
	
	
	// テスト用ページを表示する。
	@RequestMapping(value = "/testPage", method = GET)
	public String testPage_handler(Model model ) {
		return "testPage";
	}
	
	
	// メンテナンスメニュー画面へ戻る
	@RequestMapping(value = "/maintenance", method = GET)
	public String toolMaintenance_handler(Model model ) {
		return "tool_maintenance";
	}
	
	
	// メンテナンスメニュー画面へ
	@RequestMapping(value = "/maintenance_menu", method = POST)
	public String toolMaintenance_menu_handler(Model model ) {
		return "tool_maintenance";
	}
	
	
	// メンテナンスメニュー画面（追加）
	@RequestMapping(value = "/maintenance_add", method = POST)
	public String toolMaintenance_menu_add_handler(Model model ) {
		return "tool_maintenance_add";
	}
	

	// メンテナンスメニュー画面（変更）
	@RequestMapping(value = "/maintenance_change", method = POST)
	public String toolMaintenance_menu_change_handler(Model model ) {
		return "tool_maintenance_change";
	}
	
	
	// メンテナンスメニュー画面（削除）
	@RequestMapping(value = "/maintenance_delete", method = POST)
	public String toolMaintenance_menu_delete_handler(Model model ) {
		return "tool_maintenance_delete";
	}
	
	
	// MC001登録
	@RequestMapping(value = "/maintenance_add_submit", method = POST)
	public String toolMaintenance_menu_add_submit_handler(@ModelAttribute("toolFormData") toolIf formBean , Model model) {
		// form値を取得
		String maker = formBean.getMaker();
		String itemNumber = formBean.getItemNumber();
		String name = formBean.getColorName();
		int price = formBean.getPrice();
		String gloss_level = formBean.getGloss_level();
		String color_attribute1 = formBean.getColor_attribute1();
		
		toolsServiceImpl.registMC001_Service(maker, itemNumber, name, price, gloss_level, color_attribute1);
		System.out.println("追加しました！！！");
		return "tool_maintenance_add";
	}
	
	
	//  MC001削除
	@RequestMapping(value = "/maintenance_delete_submit", method = POST)
	public String toolMaintenance_menu_delete_submit_handler(@ModelAttribute("toolFormData") toolIf formBean , Model model) {
		// form値を取得
		String maker = formBean.getMaker();
		String itemNumber = formBean.getItemNumber();
		
		toolsServiceImpl.deleteMC001_Service(maker, itemNumber);
		System.out.println("削除しました！！！");
		return "tool_maintenance_delete";
	}
	
	
	// 初期表示画面 & 戻るボタンの結果
	@RequestMapping(value = "/top", method = GET)
	public String topPage_handler(Model model ) {
		return "topPage";
	}
	
	// ユーザの新規登録画面、サインイン
	@RequestMapping(value = "/signin", method = GET)
	public String signin_handler(Model model ) {
		return "signin";
	}
	
	// ユーザの新規登録、サインイン
	@RequestMapping(value = "/regist_signin", method = POST)
	public String regist_signin_handler(@ModelAttribute("toolFormData") toolIf formBean ,Model model  ) {
		// form値を取得
		String user_name = formBean.getUser_name();
		String user_password = formBean.getUser_password();
		
		boolean checkM000 = toolsServiceImpl.checkM000_userName_service(user_name);
	    if (checkM000) {
	    	toolsServiceImpl.registM000_Service(user_name, user_password);
	    	System.out.println("はじめまして！");
			return "tools";
		} else {
			System.out.println("入力されたユーザ名は既に使用されています・・・");
			return	"signin";
		}
	}
	
	
	// ログイン画面
	@RequestMapping(value = "/login", method = GET)
	public String login_handler(Model model ) {
		return "login";
	}
	
	
	// ログイン画面入力値の入力判定
	@RequestMapping(value = "/loginCheck", method = POST)
	public String loginCheck_handler(@ModelAttribute("toolFormData") toolIf formBean ,Model model ) {
		// form値を取得
		String user_name = formBean.getUser_name();
		String user_password = formBean.getUser_password();
		
		boolean checkM000 = toolsServiceImpl.checkM000_service(user_name, user_password);
	    if (checkM000) {
			return "tools";
		} else {
			System.out.println("ログインに失敗しました・・・");
			return	"topPage";
		}
	}
	
	
	// 塗料数量表示画面
	@RequestMapping(value = "/tools", method = GET)
	public String toolList_handler(@ModelAttribute("toolFormData") toolIf formBean ,Model model ) {
		// form値を取得	
		String userName = formBean.getUser_name();
		
		List<tools> tools = toolsServiceImpl.getItemQty_Service(userName);
		model.addAttribute("res",tools);
		return "tools";
	}	
	

	// 塗料数量表示画面　塗料数量計算ボタン押下
	@RequestMapping(value = "/itemCal", method = RequestMethod.POST)
	public String itemCal_handler(@ModelAttribute("toolFormData") toolIf formBean , Model model) {
		// form値を取得
		String maker = formBean.getMaker();
		String itemNumber = formBean.getItemNumber();
		int qty = formBean.getQty();
		String operation = formBean.getOperation();
		String userName = formBean.getUser_name();
		
		if (userName == null) {
			return "topPage";
		} else {
			toolsServiceImpl.itemCal_Service (maker,itemNumber,qty,operation, userName);
			List<tools> tools = toolsServiceImpl.getItemQty_Service(userName);
			model.addAttribute("res",tools);
		    return "tools";
		}
	}
	
	
	// ログアウト
	@RequestMapping(value = "/logout", method = RequestMethod.POST)
	public String logOut_handler(@ModelAttribute("toolFormData") toolIf formBean , Model model) {
		// form値を初期化(NULLに変換)する。
		formBean.setUser_name(null);
		formBean.setUser_passsword(null);
		
		return "login";
	}
	
	
	
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@Autowired 
	//DIする変数の型は、クラスではなくインターフェースとします。
	//例）private インターフェース名　formクラス名(インターフェースを継承しているクラス);
	private MessageIf Message;
	@Autowired
	InfomationServiceImpl infServiceImpl;
	
	
	// ブログ画面
	@RequestMapping(value = "/first", method = GET)
	public String sample(Model model ) {
		List<Infomation> inf = infServiceImpl.getAllEntity();
		//Pageable p = new Pageable();
		//Page<Infomation> fff = aaa.findAll(pageable);
		model.addAttribute("res",inf);
		System.out.println("1");
		return "sample";
	}

	// 削除ボタン
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(@RequestParam ("time") String time, Model model) {
	//public String delete( @PathVariable  String ys, String  time  , Model model) {
	//public String delete( @RequestParam String time ,@ModelAttribute("MessageFormData") MessageIf formBean , Model model) {		
		//String time = Message.getTime();	
		//String text1 = Message.getText1();
		//Infomation entity = new Infomation(tfi.timeFotInsert(), text1);		
		infServiceImpl.delete(time);
		System.out.println("投稿を削除しましたよん！！！");
		List<Infomation> inf = infServiceImpl.getAllEntity();
		model.addAttribute("res",inf);		
		return "sample";
	}
	
	// 投稿＆データ表示画面
	@RequestMapping(value ="/Servlet4" , method = RequestMethod.POST)
	//public String output1(@ModelAttribute("MessageFormData") MessageIf formBean) {
	//	System.out.println("2");		

	public String dept(@ModelAttribute("MessageFormData") MessageIf formBean , Model model) {
		// ------------------------------
		// 単テーブルのCURD確認
		// ------------------------------
		
		//String text1 = Message.getText1();
		Infomation entity = new Infomation(Message.getTime(), Message.getText1());
		
		
		// service実行
		infServiceImpl.addEntity(entity);
		List<Infomation> inf = infServiceImpl.getAllEntity();
		
		// 結果をセット
		model.addAttribute("res",inf);

		// view/test/result.jsp を表示
		return "NewFile2";
	}		
	
	
	
	
	//public String sample(Model model ,@PageableDefault(page = 0, size = 3, sort = {"time"}) Pageable pageable) {

}
