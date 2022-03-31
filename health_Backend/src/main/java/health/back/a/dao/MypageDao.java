package health.back.a.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import health.back.a.dto.LoginMemberDto;
import health.back.a.dto.WorkBbsDto;
import health.back.a.dto.WorkReplyDto;

@Mapper
@Repository
public interface MypageDao {
	public int updateMember(LoginMemberDto dto);	   // 회원정보 수정
//	public List<> getMyRoutine(String nick); // 운동 루틴
	public List<WorkBbsDto> getMyBbs(String id);	   // 내 게시글 목록
	public List<WorkReplyDto> getMyReply(String id); // 내 댓글 목록
	public List<WorkBbsDto> getMyLike(String id);	   // 좋아요 누른 글 목록	
}