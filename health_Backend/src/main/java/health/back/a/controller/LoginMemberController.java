package health.back.a.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.naming.spi.DirStateFactory.Result;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
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
	public String register(@Valid LoginMemberDto dto, Errors err) {
		log.info("LoginMemberController register()" + new Date());
		
		if(err.hasErrors()) {
			for(FieldError fe: err.getFieldErrors()) {
				System.out.println(fe.getField());
				log.info(fe.getDefaultMessage());
				return fe.getDefaultMessage();
				}
		}
		return service.register(dto)?"y":"n";
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
	
	// 닉네임 중복 검사
	@RequestMapping(value = "/checkNickname", method = {RequestMethod.GET, RequestMethod.POST})
	public String checkNickname(LoginMemberDto dto) {
		log.info("LoginMemberController checkNickname()" + new Date());
		
		boolean b = service.checkNickname(dto);
		
		if(b) {
			return "n";
		}
		return "y";
	}
	
	// 아이디 찾기
	@RequestMapping(value = "/findId", method = {RequestMethod.GET, RequestMethod.POST})
	public LoginMemberDto findId(LoginMemberDto dto) {
		log.info("LoginMemberController findId()" + new Date());
		
		LoginMemberDto info = service.findId(dto);
		
		return info;
	}
	
	// 비밀번호 찾기
	@RequestMapping(value = "/findPwd", method = {RequestMethod.GET, RequestMethod.POST})
	public LoginMemberDto findPwd(LoginMemberDto dto) {
		log.info("LoginMemberController findPwd()" + new Date());
		
		LoginMemberDto info = service.findPwd(dto);
		
		return info;
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
	public String register_M(@Valid @RequestBody LoginMemberDto dto, Errors err) {
		
		log.info("LoginMemberController register_M()" + new Date());
		
		if(err.hasErrors()) {
			for(FieldError fe: err.getFieldErrors()) {
				log.info(fe.getDefaultMessage());
				return fe.getDefaultMessage();
				}
		}
		
		return service.register(dto)?"y":"n";
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
	
	// 닉네임 중복 검사
	@RequestMapping(value = "/checkNickname_M", method = {RequestMethod.GET, RequestMethod.POST})
	public String checkNickname_M(@RequestBody LoginMemberDto dto) {
		log.info("LoginMemberController checkNickname_M()" + new Date());
		
		boolean b = service.checkNickname(dto);
		
		if(b) {
			return "n";
		}
		return "y";
	}
	
	// 아이디 찾기
	@RequestMapping(value = "/findId_M", method = {RequestMethod.GET, RequestMethod.POST})
	public LoginMemberDto findId_M(@RequestBody LoginMemberDto dto) {
		log.info("LoginMemberController findId_M()" + new Date());
			
		LoginMemberDto info = service.findId(dto);
			
		return info;
	}
		
	// 비밀번호 찾기
	@RequestMapping(value = "/findPwd_M", method = {RequestMethod.GET, RequestMethod.POST})
	public LoginMemberDto findPwd_M(@RequestBody LoginMemberDto dto) {
		log.info("LoginMemberController findPwd_M()" + new Date());
			
		LoginMemberDto info = service.findPwd(dto);
			
		return info;
	}
	
	
	
	
}
