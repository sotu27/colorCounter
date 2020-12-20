package org.springTest.Dao.Impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PlayerRepository<T> {
	public Page<T> findAll(Pageable pageable);

}
