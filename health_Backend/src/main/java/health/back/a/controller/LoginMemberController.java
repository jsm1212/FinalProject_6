package health.back.a.controller;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import health.back.a.dto.LoginMemberDto;
import health.back.a.service.LoginMemberService;

@RestController
public class LoginMemberController {
	
	private static Logger log = LoggerFactory.getLogger(LoginMemberController.class);
	
	@Autowired
	LoginMemberService service;
	
	// 웹 
	
	// 아이디 중복검사
	@RequestMapping(value = "/getId", method = {RequestMethod.GET, RequestMethod.POST})
	public String getId(LoginMemberDto dto) {
		log.info("LoginMemberController getId()" + new Date());
		
		boolean b = service.getId(dto);
		
		if(b) {
			return "n";
		}
		return "y";
	}
	
	// 로그인
	@RequestMapping(value = "/login", method = {RequestMethod.GET, RequestMethod.POST})
	public LoginMemberDto login(LoginMemberDto dto) {
		log.info("LoginMemberController login()" + new Date());
		
		LoginMemberDto member = service.login(dto);
		return member;
	}
	
	// 회원가입
	@RequestMapping(value = "/register", method = {RequestMethod.GET, RequestMethod.POST})
	public String register(LoginMemberDto dto) {
		log.info("LoginMemberController register()" + new Date());
		
		boolean b = service.register(dto);
		
		if(b) {
			return "y";
		}
		return "n";
	}
	
	// 회원 전체 조회
	@RequestMapping(value = "/allMember", method = {RequestMethod.GET, RequestMethod.POST})
	public List<LoginMemberDto> allMember() {
		log.info("LoginMemberController allMember()" + new Date());
		
		List<LoginMemberDto> memberList = service.allMember();
		return memberList;
	}
	
	// 이메일 중복 검사
	@RequestMapping(value = "/checkEmail", method = {RequestMethod.GET, RequestMethod.POST})
	public String checkEmail(LoginMemberDto dto) {
		log.info("LoginMemberController checkEmail()" + new Date());
		
		boolean b = service.checkEmail(dto);
		
		if(b) {
			return "n";
		}
		return "y";
	}
	
	// 모바일
	
	// 아이디 중복 검사
	@RequestMapping(value = "/getId_M", method = {RequestMethod.GET, RequestMethod.POST})
	public String getId_M(@RequestBody LoginMemberDto dto) {
		log.info("LoginMemberController getId_M()" + new Date());
		
		boolean b = service.getId(dto);
		
		if(b) {
			return "n";
		}
		return "y";
	}
	
	// 로그인
	@RequestMapping(value = "/login_M", method = {RequestMethod.GET, RequestMethod.POST})
	public LoginMemberDto login_M(@RequestBody LoginMemberDto dto) {
		log.info("LoginMemberController login_M()" + new Date());
			
		LoginMemberDto member = service.login(dto);
		return member;
	}
	
	// 회원가입
	@RequestMapping(value = "/register_M", method = {RequestMethod.GET, RequestMethod.POST})
	public String register_M(@RequestBody LoginMemberDto dto) {
		log.info("LoginMemberController register_M()" + new Date());
			
		boolean b = service.register(dto);
			
		if(b) {
			return "y";
		}
		return "n";
	}
	
	// 이메일 중복 검사
	@RequestMapping(value = "/checkEmail_M", method = {RequestMethod.GET, RequestMethod.POST})
	public String checkEmail_M(@RequestBody LoginMemberDto dto) {
		log.info("LoginMemberController checkEmail_M()" + new Date());
			
		boolean b = service.checkEmail(dto);
			
		if(b) {
			return "n";
		}
		return "y";
	}
	
	
	
}
