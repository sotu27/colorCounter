package org.springTest.Dao.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
 import org.springframework.web.context.support.SpringBeanAutowiringSupport;
import org.springTest.Entity.*;
import org.aspectj.weaver.ast.Test;
import org.springTest.Dao.*;
import org.springTest.test.*;


@Repository
public class InfomationDaoImpl {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	//public InfomationDaoImpl() {
	//	init();
	//}
	
	//public void init(){
	//	// @Autowired がうまく機能しない場合は以下のコメントを外す
	//	 SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
	//}
	
	public void addEntity(Infomation entity) {
	//public void addEntity(String time , String text1) {
		jdbcTemplate.update("INSERT INTO inf VALUES(?, ?)",
				entity.getTime(), entity.getText1());
				//time,text1);
	}
	
	public List<Infomation> getAllEntity(){
		String sql = "SELECT * FROM inf ORDER BY inf.time DESC ";
		RowMapper<Infomation> rowMapper = new BeanPropertyRowMapper<Infomation>(Infomation.class);
		List<Infomation> infList = jdbcTemplate.query(sql, rowMapper);
		return infList;	
	}
	
	public void delete(String time) {
		String sql = "DELETE FROM inf WHERE time = ?";
		jdbcTemplate.update(sql,time);
	}

	public Page<Infomation> findAll(Pageable pageable) {
		
		String sql = "SELECT * FROM inf " +
		                   "LIMIT " + pageable.getPageSize() + " " +
				           "OFFSET " + pageable.getOffset() + " " +
		                   "ORDER BY inf.time DESC ";
		RowMapper<Infomation> rowMapper = new BeanPropertyRowMapper<Infomation>(Infomation.class);
		List<Infomation> list = jdbcTemplate.query(sql, rowMapper);
		int total = list.size();
        Page<Infomation> pageList = new PageImpl(list,pageable,total);
        return pageList;
	}
}
