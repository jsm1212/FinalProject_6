package health.back.a.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;

import health.back.a.dao.LoginMemberDao;
import health.back.a.dto.LoginMemberDto;

@Service
@Transactional
public class LoginMemberService {
	
	@Autowired
	LoginMemberDao dao;
	
	public boolean getId(LoginMemberDto dto) {
		int i = dao.getId(dto);
		return i>0?true:false;
	}
	
	public LoginMemberDto login(LoginMemberDto dto) {
		return dao.login(dto);
	}
	
	public boolean register(LoginMemberDto dto) {
		int i = dao.register(dto);
		
		return i>0?true:false;
	}
	
	public List<LoginMemberDto> allMember() {
		return dao.allMember();
	}
	
	public boolean checkEmail(LoginMemberDto dto) {
		int i = dao.checkEmail(dto);
		return i>0?true:false;
	}
	
	public boolean checkNickname(LoginMemberDto dto) {
		return dao.checkNickname(dto)>0?true:false;
	}
	
	public LoginMemberDto findId(LoginMemberDto dto) {
		return dao.findId(dto);
	}
	
	public LoginMemberDto findPwd(LoginMemberDto dto) {
		return dao.findPwd(dto);
	}
	
}
