package health.back.a.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import health.back.a.dao.AdminDao;
import health.back.a.dto.LoginMemberDto;

public class AdminService {
	@Autowired
	AdminDao dao;
	
	// 회원 목록
	public List<LoginMemberDto> getAdminMem(){
		return dao.getAdminMem();
	}
	
	// 회원 삭제
	public boolean deleteMem(String id) {
		int i = dao.deleteMem(id);
		return i>0? true:false;
	}
}
