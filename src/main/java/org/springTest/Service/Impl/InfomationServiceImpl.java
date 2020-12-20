package org.springTest.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import org.springTest.Dao.*;
import org.springTest.Dao.Impl.InfomationDaoImpl;
import org.springTest.Dto.TestResultDto;
import org.springTest.Entity.Infomation;
import org.springTest.Method.timeForInsert;
import org.springTest.Service.InfomationService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


@Service
@ComponentScan("org.springTest.Dao")
@ComponentScan("org.springTest.Dao.impl")
@ComponentScan("org.springTest.Method")
public class InfomationServiceImpl   {
	//public class InfomationServiceImpl implements InfomationService<Infomation>  {
	
	
	@Autowired
	//InfomationDao<Infomation>  dao;
	InfomationDaoImpl idi;
	@Autowired
	timeForInsert tfi;
	Infomation inf;
	
	//@Override
	//public Page<Infomation> findAll(Pageable pageable){
		//return dao.findAllPage(pageable);
	//}
	
	// 全件取得
	public List<Infomation> getAllEntity() {
		return idi.getAllEntity();
		
	}
	
	// 追加
	public void addEntity(Infomation entity) {
		String time = tfi.timeFotInsert();
		//Infomation entity = new Infomation(time,text1)
		entity.setTime(time);
		idi.addEntity(entity);
	}
	
	//　削除
	public void delete(String time) {
		idi.delete(time);
	}
}
	

	

	//public TestResultDto<Infomation> execute(Infomation entity) {
	//	TestResultDto<Infomation> result = new TestResultDto<Infomation>();
		
	//	// INSERT
	//	dao.addEntity(entity);
		
	//	// SELECT
	//	dao.getAllEntity();
	

	//	return result;
	//}	

//}
