package org.springTest.Service;

import org.springTest.Dto.*;
import org.springTest.Entity.*;
import org.springTest.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
 

@Component
public interface InfomationService<T> {
	//public TestResultDto<Infomation> execute(Infomation entity);
	 Page<Infomation> findAll(Pageable pageable);
	 List<Infomation>getAllEntity();
}
