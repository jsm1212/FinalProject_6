package health.back.a.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import health.back.a.dao.LoginMemberDao;

@Service
@Transactional
public class LoginMemberService {
	
	@Autowired
	LoginMemberDao dao;
}
