package health.back.a.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import health.back.a.dao.WorkReplyDao;
import health.back.a.dto.WorkReplyDto;

@Service
@Transactional
public class WorkReplyService {
	
	@Autowired
	WorkReplyDao dao;
	
	// 댓글 리스트 불러오기
	public List<WorkReplyDto> getReplyList(int seq) {
		return dao.getReplyList(seq);
	}
	
	// 댓글 작성하기
	public boolean writeReply(WorkReplyDto dto) {
		int n = dao.writeReply(dto);
		return n>0?true:false;
	}
	
	// 댓글 수정하기
	public boolean updateReply(WorkReplyDto dto) {
		int n = dao.updateReply(dto);
		return n>0?true:false;
	}
	
	// 댓글 삭제하기
	public boolean deleteReply(int seq) {
		int n = dao.deleteReply(seq);
		return n>0?true:false;
	}
	
	// 해당 게시글의 댓글 수
	public int getReplyCount(int seq) {
		return dao.getReplyCount(seq);
	}
}









