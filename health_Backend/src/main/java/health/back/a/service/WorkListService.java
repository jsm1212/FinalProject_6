package health.back.a.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import health.back.a.dao.WorkListDao;
import health.back.a.dto.WorkListDto;


@Service
@Transactional
public class WorkListService {
	@Autowired
	WorkListDao dao;
	
	public List<WorkListDto> getWorkList(){
		return dao.getWorkList();
	}
	public WorkListDto getWorkDetail(int workseq) {
		return dao.getWorkDetail(workseq);
	}

}
