package health.back.a.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
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
		System.out.println("MypageController updateMember 웹" + new Date());

	    boolean b = sv.updateMember(dto);
	    if(b) {
	    	return "yes";
	    }
		
	    return "no";
	}
	@RequestMapping(value = "/updateMember_M", method = {RequestMethod.GET, RequestMethod.POST})
	public String updateMember_M(@RequestBody LoginMemberDto dto) {
		System.out.println("MypageController updateMember 모바일" + new Date());

	    boolean b = sv.updateMember(dto);
	    if(b) {
	    	return "yes";
	    }
		
	    return "no";
	}
	
	// 운동 루틴
	
	// 내 게시글 목록
	@RequestMapping(value = "/getMyBbs", method = {RequestMethod.GET, RequestMethod.POST})
	public List<WorkBbsDto> getMyBbs(String id){
		System.out.println("MypageController getMyBbs 웹" + new Date());
		
		List<WorkBbsDto> list = sv.getMyBbs(id);
		return list;
	}
	@RequestMapping(value = "/getMyBbs_M", method = {RequestMethod.GET, RequestMethod.POST})
	public List<WorkBbsDto> getMyBbs_M(@RequestBody String id){
		System.out.println("MypageController getMyBbs 모바일" + new Date());
		
		List<WorkBbsDto> list = sv.getMyBbs(id);
		return list;
	}
	
	// 내 댓글 목록
	@RequestMapping(value = "/getMyReply", method = {RequestMethod.GET, RequestMethod.POST})
	public List<WorkReplyDto> getMyReply(String id){
		System.out.println("MypageController getMyReply 웹" + new Date());
		
		List<WorkReplyDto> list = sv.getMyReply(id);
		return list;
	}
	@RequestMapping(value = "/getMyReply_M", method = {RequestMethod.GET, RequestMethod.POST})
	public List<WorkReplyDto> getMyReply_M(@RequestBody String id){
		System.out.println("MypageController getMyReply 모바일" + new Date());
		
		List<WorkReplyDto> list = sv.getMyReply(id);
		return list;
	}
	
	// 좋아요 누른 글 목록
	@RequestMapping(value = "/getMyLike", method = {RequestMethod.GET, RequestMethod.POST})
	public List<WorkBbsDto> getMyLike(String id){
		System.out.println("MypageController getMyLike 웹" + new Date());
		
		List<WorkBbsDto> list = sv.getMyLike(id);
		return list;
	}
	@RequestMapping(value = "/getMyLike_M", method = {RequestMethod.GET, RequestMethod.POST})
	public List<WorkBbsDto> getMyLike_M(@RequestBody String id){
		System.out.println("MypageController getMyLike 모바일" + new Date());
		
		List<WorkBbsDto> list = sv.getMyLike(id);
		return list;
	}
}