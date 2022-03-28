package health.back.a.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import health.back.a.dto.LoginMemberDto;
import health.back.a.dto.WorkBbsDto;
import health.back.a.dto.WorkReplyDto;
import health.back.a.service.MypageService;

@RestController
public class MypageController {
	@Autowired
	MypageService sv;
	
	// 회원정보 수정
	@RequestMapping(value = "/updateMember", method = {RequestMethod.GET, RequestMethod.POST})
	public String updateMember(LoginMemberDto dto) {
		System.out.println("MypageController updateMember()" + new Date());

	    boolean b = sv.updateMember(dto);
	    if(b) {
	    	return "yes";
	    }
		
	    return "no";
	}
	// 운동 루틴
	// 내 게시글 목록
	@RequestMapping(value = "/getMyBbs", method = {RequestMethod.GET, RequestMethod.POST})
	public List<WorkBbsDto> getMyBbs(LoginMemberDto dto){
		System.out.println("MypageController getMyBbs()" + new Date());
		
		List<WorkBbsDto> list = sv.getMyBbs(dto);
		return list;
	}
	
	// 내 댓글 목록
	@RequestMapping(value = "/getMyReply", method = {RequestMethod.GET, RequestMethod.POST})
	public List<WorkReplyDto> getMyReply(LoginMemberDto dto){
		System.out.println("MypageController getMyReply()" + new Date());
		
		List<WorkReplyDto> list = sv.getMyReply(dto);
		return list;
	}
	
	// 좋아요 누른 글 목록	
}