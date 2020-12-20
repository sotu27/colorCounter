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

import java.util.ArrayList;
import java.util.List;

@RestController
public class controller_rest {
	
	@Autowired
	org.springTest.test.Info  Info;
	@Autowired
	toolsServiceImpl toolsServiceImpl;
	@Autowired
	private toolIf tool;


	// form値とmodelのバインドを行う。
	@ModelAttribute("toolFormData")
	public toolIf setupBindFortool() {
		//上でDIされた（インスタンス化された）FormBeanを返します
		return this.tool;
	}	


	// javascriptからのAPI呼び出し用　toolリストを取得し、list型で返却する
	// 返却後は、js側でjsonに変換してくれる。
	@RequestMapping(value = "/test", method = GET)
		public List<tools> getlist() {
	    List<tools> list =  new ArrayList<>();
	    list = toolsServiceImpl.getAllEntity_Service();
	    return list;
	}
		

		@RequestMapping(value = "/getItemList", method = GET)
		public List<tools> getItemList(@ModelAttribute("toolFormData") toolIf formBean , Model model) {
	    List<tools> list =  new ArrayList<>();
		String userName = formBean.getUser_name();
	    list = toolsServiceImpl.getItemQty_Service(userName);
	    return list;
	}	
		
		
		@RequestMapping(value = "/getMaker", method = GET)
		public List<tools> getMaker() {
	    List<tools> list =  new ArrayList<>();
	    list = toolsServiceImpl.getMaker_Service();
	    return list;
	}

}
