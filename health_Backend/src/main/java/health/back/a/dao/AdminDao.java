package health.back.a.dao;

import java.util.List;

import health.back.a.dto.LoginMemberDto;
import health.back.a.dto.WorkBbsDto;

public interface AdminDao {
	public List<LoginMemberDto> getMem(); // 회원 목록
	public int deleteMem(String id);	       // 회원 삭제
}
