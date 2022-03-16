package health.back.a.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import health.back.a.dao.WorkBbsDao;
import health.back.a.dto.WorkBbsDto;

@Service
@Transactional
public class WorkBbsService {
	
	@Autowired
	WorkBbsDao dao;

	// 게시판 전체리스트 불러오기
	public List<WorkBbsDto> getBbsList(){
		return dao.getBbsList();
	}
	
	// 게시판 글쓰기
	public boolean writeBbs(WorkBbsDto dto) {
		int n = dao.writeBbs(dto);
		return n>0?true:false;
	}
	
	// 선택한 게시글 불러오기(detail)
	public WorkBbsDto bbsDetail(int seq) {
		return dao.bbsDetail(seq);
	}
	
	// 게시글 수정
	public boolean updateBbs(WorkBbsDto dto) {
		int n = dao.updateBbs(dto);		
		return n>0?true:false;
	}
}








