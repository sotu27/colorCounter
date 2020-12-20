package org.springTest.Dao.Impl;

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
import java.util.List;
import org.aspectj.weaver.ast.Test;
import org.springTest.Dao.*;
import org.springTest.test.*;

@Repository
public class toolsDaoImpl {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	//@Autowired
	//private BeanPropertyRowMapper aa;
	
	
	// MC001から全件取得
	public List<tools> getAllEntity(){
		String sql = "SELECT * FROM MC001 ORDER BY MC001.itemNumber ASC ";
		
		//RowMapper<tools> rowMapper = new BeanPropertyRowMapper<tools>(tools.class);
		RowMapper<tools> rowMapper = BeanPropertyRowMapper.newInstance(tools.class);
		List<tools> toolsList = jdbcTemplate.query(sql, rowMapper);
		return toolsList;	
	}
	
	// TC001から数量を取得
	public List<tools> getItemQty(String userName){
		String sql = "select mc001.itemNumber, mc001.colorName, tc001.itemQty "
				+ "from tc001 "
				+ "inner join mc001 on mc001.itemNumber = tc001.itemNumber and mc001.maker = tc001.maker "
				+ "WHERE tc001.user_name = '" + userName + "';";
		RowMapper<tools> rowMapper = new BeanPropertyRowMapper<tools>(tools.class);
		List<tools> toolsList = jdbcTemplate.query(sql, rowMapper);
		 jdbcTemplate.query(sql, rowMapper);
		return toolsList;
	}
	
	
	// 数量の足し算を行うメソッド
	public void itemCal_plus(String maker,String itemNumber, int resultQty) {
		// SQL文作成
		String sqlTest = "UPDATE TC001 SET itemQty = '" +
		                          resultQty +
		                          "'" +
		                          " WHERE itemNumber = '"+
		                          itemNumber +
		                          "'" +
		                          " AND "+
		                          " maker = '"+
		                          maker +
		                          "'; " ;
		//SQL実行
		jdbcTemplate.update(sqlTest);
	}
	
	
	// 数量の引き算を行うメソッド
	public void itemCal_minus(String maker,String itemNumber, int resultQty) {
		// SQL文作成
		String sqlTest = "UPDATE TC001 SET itemQty = '" +
		                          resultQty +
		                          "'" +
		                          " WHERE itemNumber = '"+
		                          itemNumber +
		                          "'" +
		                          " AND "+
		                          " maker = '"+
		                          maker +
		                          "'; " ;
		//SQL実行
		jdbcTemplate.update(sqlTest);
	}
	
	
	// 計算のもととなる数量を取得するメソッド
	public int getQty(String itemNumber) {
		String sql = "SELECT itemQty FROM TC001 WHERE itemNumber = " +
	                       " \"" +
	                      itemNumber +
	                       "\"" +
	                       " ; " ;
		RowMapper<tools> rowMapper = new BeanPropertyRowMapper<tools>(tools.class);
		List<tools> toolsList = jdbcTemplate.query(sql, rowMapper);
		int baseQty;
		baseQty = toolsList.get(0).getItemQty();
		return baseQty;
	}
	
	
	// M002(メーカーマスタ)からメーカー名を取得する
	public List<tools> getM002(){
		String sql = "select * FROM M002;";
		RowMapper<tools> rowMapper = new BeanPropertyRowMapper<tools>(tools.class);
		List<tools> toolsList = jdbcTemplate.query(sql, rowMapper);
		 jdbcTemplate.query(sql, rowMapper); 
		return toolsList;
	}
	
	
	// MC001(アイテムマスタ)に登録する
	public void registMC001(String maker,String itemNumber,String name,int price,
			String gloss_level,String color_attribute1){
		String sql = "INSERT MC001 (itemNumber,colorName,maker,price,del_ind,gloss_level,color_attribute1) VALUES" +
			               " ('" + 
				          itemNumber + 
				           "', '" + 
				          name + 
				           " ', '" +
				          maker +
				           "', '" +
				          price +
				           "', '" +
				          "0" +
				           "', '" +
				          gloss_level +	
				           "', '" +
				          color_attribute1 +	
				            "');"
				          ;
		 jdbcTemplate.update(sql);
	}
	
	
	public void deleteMC001(String maker,String itemNumber){
		String sql = "DELETE FROM MC001 WHERE " +
			               " itemNumber = '" + 
				          itemNumber + 
				           "'  " +
				          "AND " +
				           "MAKER = '" +
				          maker + 
				           "' ; ";
		 jdbcTemplate.update(sql);
	}
	
	
	// TC001に「ユーザ×品番」の組み合わせのレコードが存在するかを判定
	public boolean checkTC001(String maker,String itemNumber, String userName) {
		String sql = "select * FROM TC001 WHERE "+
	                        "MAKER = '"+  maker + "' " + "AND "+
				            "itemNumber = '" + itemNumber + "'"  + "AND "+
	                        "user_name = '" + userName + "';";
		RowMapper<tools> rowMapper = new BeanPropertyRowMapper<tools>(tools.class);
		List<tools> toolsList = jdbcTemplate.query(sql, rowMapper);
		
		if (toolsList.isEmpty()) {
			// TC001にレコードが存在しない場合
			return false;
		} else {
			// TC001にレコードが存在する場合
			return true;
		}
	}
	
	
	// TC001()に登録する
	public void registTC001(String maker,String itemNumber, int qty, String userName){
		String sql = "INSERT TC001 (itemNumber,maker,itemQty,user_name) VALUES" +
			               " ('" + 
				          itemNumber + 
				           "', '" + 
				          maker + 
				           "', '" +
				          qty +
				           "', '" +
				          userName +
				            "');"
				          ;
		 jdbcTemplate.update(sql);
	}
	
	
	// M000の存在チェック
	public boolean checkM000(String user_name,String user_password) {
		String sql = "select * FROM M000 WHERE "+
	                        "user_name = '"+  user_name + "' " + "AND "+
				            "user_password = '" + user_password + "';";
		RowMapper<tools> rowMapper = new BeanPropertyRowMapper<tools>(tools.class);
		List<tools> toolsList = jdbcTemplate.query(sql, rowMapper);
		
		if (toolsList.isEmpty()) {
			// M000にレコードが存在しない場合
			return false;
		} else {
			// M000にレコードが存在する場合
			return true;
		}
	}
	
	
	// M000を取得
	public boolean checkM000_userName(String user_name) {
		String sql = "select * FROM M000 WHERE "+
	                        "user_name = '"+  user_name + "' ;";
		RowMapper<tools> rowMapper = new BeanPropertyRowMapper<tools>(tools.class);
		List<tools> toolsList = jdbcTemplate.query(sql, rowMapper);
		if (toolsList.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
	
	
	// TC001()に登録する
	public void registM000(String user_name, String user_password,String sys_add_dd){
		String sql = "INSERT M000 (user_name,user_password,sys_add_dd) VALUES" +
			               " ('" + 
			               user_name + 
				           "', '" + 
				           user_password + 
				           "', '" +
				          sys_add_dd +
				            "');"
				          ;
		 jdbcTemplate.update(sql);
	}

	
}
