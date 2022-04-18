package health.back.a.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import health.back.a.dto.LoginMemberDto;
import health.back.a.dto.WorkBbsDto;
import health.back.a.dto.WorkListDto;
import health.back.a.dto.WorkReplyDto;

@Mapper
@Repository
public interface MypageDao {
	public LoginMemberDto getInformation(String id);	// 회원정보 호출
	public int updateMember(LoginMemberDto dto);		// 회원정보 수정
	public int updatePwd(LoginMemberDto dto);			// 비밀번호 수정
	public int deleteMember(String id);					// 회원 삭제
	public List<WorkListDto> getMyRoutine(String id);	// 운동 루틴
	public List<WorkBbsDto> getMyBbs(String id);		// 내 게시글 목록
	public List<WorkReplyDto> getMyReply(String id);	// 내 댓글 목록
	public List<WorkBbsDto> getMyLike(String id);		// 좋아요 누른 글 목록
	
	public List<LoginMemberDto> getMemberList();		// 회원 목록 조회(관리자)
}