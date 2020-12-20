package org.springTest.Dao;

import java.util.List;
import org.springTest.Entity.*;
import org.springframework.stereotype.Component;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


@Component
//public interface InfomationDao {
public interface InfomationDao<T> {
	public List<Infomation> getAllEntity();
	public Infomation findByTime(String time);
	public void addEntity(Infomation entity);
	public void updateEntity(Infomation entity);
	public void removeEntity(Infomation data);
	public void removeEntity(String text1);
	
	public Page<T> findAllPage(Pageable pageable);
}
