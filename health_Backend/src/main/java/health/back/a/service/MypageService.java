package health.back.a.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import health.back.a.dao.MypageDao;
import health.back.a.dto.LoginMemberDto;
import health.back.a.dto.WorkBbsDto;
import health.back.a.dto.WorkListDto;
import health.back.a.dto.WorkReplyDto;

@Service
@Transactional
public class MypageService {
	@Autowired
	MypageDao dao;
	
	// 회원정보 호출
	public LoginMemberDto getInformation(String id) {
		return dao.getInformation(id);
	}
	
	// 회원정보 수정
	public boolean updateMember(LoginMemberDto dto) {
		int i = dao.updateMember(dto);
		return i>0 ? true:false;
	}
	
	// 비밀번호 수정
	public boolean updatePwd(LoginMemberDto dto) {
		int i = dao.updatePwd(dto);
		return i>0 ? true:false;
	}
	
	// 회원 삭제
	public boolean deleteMember(String id) {
		int i = dao.deleteMember(id);
		return i>0? true:false;
	}
	
	// 운동 루틴
	public List<WorkListDto> getMyRoutine(String id){
		return dao.getMyRoutine(id);
	}
	
	// 내 게시글 목록
	public List<WorkBbsDto> getMyBbs(String id){
		return dao.getMyBbs(id);
	}
	
	// 내 댓글 목록
	public List<WorkReplyDto> getMyReply(String id){
		return dao.getMyReply(id);
	}
	
	// 좋아요 누른 글 목록
	public List<WorkBbsDto> getMyLike(String id){
		return dao.getMyLike(id);
	}
	
	// 회원 목록 조회(관리자)
	public List<LoginMemberDto> getMemberList(){
		return dao.getMemberList();
	}
}