package health.back.a.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import health.back.a.service.LoginMemberService;

@RestController
public class LoginMemberController {
	
	@Autowired
	LoginMemberService service;
	
	
}
