package health.back.a.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import health.back.a.dto.LoginMemberDto;
import health.back.a.dto.WorkBbsDto;
import health.back.a.service.AdminService;

public class AdminController {
	@Autowired
	AdminService sv;
	
	// 회원목록
	@RequestMapping(value = "/getMem", method = {RequestMethod.GET, RequestMethod.POST})
	public List<LoginMemberDto> getMem(){
		System.out.println("MypageController getMem 웹" + new Date());
		
		List<LoginMemberDto> list = sv.getMem();
		return list;
	}
	@RequestMapping(value = "/getMem_M", method = {RequestMethod.GET, RequestMethod.POST})
	public List<LoginMemberDto> getMem_M(){
		System.out.println("MypageController getMem_M 모바일" + new Date());
		
		List<LoginMemberDto> list = sv.getMem();
		return list;
	}
	
	// 회원 삭제
	@RequestMapping(value = "/deleteMem", method = {RequestMethod.GET, RequestMethod.POST})
	public String deleteMem(String id){
		System.out.println("MypageController deleteMem 웹" + new Date());
		
		boolean b = sv.deleteMem(id);
		
		if(b) return "yes";
		return "no";
	}
	@RequestMapping(value = "/deleteMem_M", method = {RequestMethod.GET, RequestMethod.POST})
	public String deleteMem_M(String id){
		System.out.println("MypageController deleteMem_M 모바일" + new Date());
		
		boolean b = sv.deleteMem(id);
		
		if(b) return "yes";
		return "no";
	}
}