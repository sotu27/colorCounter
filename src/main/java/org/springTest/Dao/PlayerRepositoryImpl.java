package org.springTest.Dao;

import java.util.List;

import org.springTest.Dao.Impl.PlayerRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springTest.Entity.*;

@Repository
public class PlayerRepositoryImpl implements PlayerRepository<Infomation> {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
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
