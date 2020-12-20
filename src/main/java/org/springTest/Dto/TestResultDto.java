package org.springTest.Dto;

import java.util.List;

/**
 * TestControllerに返すServiceの戻り値のDTO
 * 
 * @param <T> Serviceごとに型が違うので総称型で対応
 */

public class TestResultDto<T> {

	private T entity;
	private List<T> list;
	
	public T getEntity() {
		return entity;
	}
	public void setEntity(T entity) {
		this.entity = entity;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
		

}
