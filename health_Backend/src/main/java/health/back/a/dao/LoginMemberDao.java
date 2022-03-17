package health.back.a.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import health.back.a.dto.LoginMemberDto;

@Mapper
@Repository
public interface LoginMemberDao {
	
	public int getId(LoginMemberDto dto);
	
	public LoginMemberDto login(LoginMemberDto dto);
	
	public int register(LoginMemberDto dto);
	
	public List<LoginMemberDto> allMember();
	
	public int checkEmail(LoginMemberDto dto);
	
	public int checkNickname(LoginMemberDto dto);
	
	public LoginMemberDto findId(LoginMemberDto dto);
	
	public LoginMemberDto findPwd(LoginMemberDto dto);
}
