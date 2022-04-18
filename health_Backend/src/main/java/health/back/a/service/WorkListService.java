package health.back.a.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import health.back.a.dao.WorkListDao;
import health.back.a.dto.LikeWorkDto;
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
	
	// 좋아요
	public void likeCountWork(int seq) {
		dao.likeCountWork(seq);
	}
	public boolean likeInfoWork(LikeWorkDto dto) {
		int n = dao.likeInfoWork(dto);
		return n>0?true:false;
	}
	
	// 좋아요 취소
	public void likeCountCancelWork(int seq) {
		dao.likeCountCancelWork(seq);
	}
	
	public boolean likeCancelWork(LikeWorkDto dto) {
		int n = dao.likeCancelWork(dto);
		return n>0?true:false;
	}
	// 좋아요 중복 제한
	public boolean checkLikeCountWork(LikeWorkDto dto) {
		int n = dao.checkLikeCountWork(dto);
		return n>0?true:false;
	}
}
