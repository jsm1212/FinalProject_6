package health.back.a.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import health.back.a.dao.MypageDao;
import health.back.a.dto.LoginMemberDto;
import health.back.a.dto.WorkBbsDto;
import health.back.a.dto.WorkReplyDto;

@Service
@Transactional
public class MypageService {
	@Autowired
	MypageDao dao;
	
	// 회원정보 수정
	public boolean updateMember(LoginMemberDto dto) {
		int i = dao.updateMember(dto);
		return i>0 ? true:false;
	}
	
	// 운동 루틴
//	public List<> getMyRoutine(String nick){
//		return dao.getMyRoutine(nick);
//	}
	
	// 내 게시글 목록
	public List<WorkBbsDto> getMyBbs(String nick){
		return dao.getMyBbs(nick);
	}
	
	// 내 댓글 목록
	public List<WorkReplyDto> getMyReply(String nick){
		return dao.getMyReply(nick);
	}
	
	// 좋아요 누른 글 목록
	public List<WorkBbsDto> getMyLike(String nick){
		return dao.getMyLike(nick);
	}
}