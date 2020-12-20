package org.springTest.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import java.util.List;

import org.springTest.Dao.*;
import org.springTest.Dao.Impl.toolsDaoImpl;
import org.springTest.Entity.tools;
import org.springTest.Service.InfomationService;

@Service
@ComponentScan("org.springTest.Dao")
@ComponentScan("org.springTest.Dao.impl")
public class toolCalculation {
	
	@Autowired
	toolsDaoImpl toolsDaoImpl;
	
	public void toolCalulation(String itemNumber, int qty, String operation) {
		tools entity = new tools();
		entity.setItemNumber(itemNumber);
		entity.setItemQty(qty);
		
		if( operation.equals("plus")) {
			toolsServiceImpl tsi = new toolsServiceImpl();
			//tsi.itemCal_plus(String itemNumber, int qty);
		}
	}

}
