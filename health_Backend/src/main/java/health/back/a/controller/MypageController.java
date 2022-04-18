package health.back.a.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonProperty;

import health.back.a.dto.LoginMemberDto;
import health.back.a.dto.WorkBbsDto;
import health.back.a.dto.WorkListDto;
import health.back.a.dto.WorkReplyDto;
import health.back.a.service.MypageService;

@RestController
public class MypageController {
	@Autowired
	MypageService sv;
	
	// 회원정보 호출
	@RequestMapping(value = "/getInformation", method = {RequestMethod.GET, RequestMethod.POST})
	public LoginMemberDto getInformation(String id) {
		System.out.println("MypageController getInformation 웹" + new Date());

		LoginMemberDto dto = sv.getInformation(id);
		System.out.println("dto 확인" + dto);
		
		return dto;
	}
	@RequestMapping(value = "/getInformation_M", method = {RequestMethod.GET, RequestMethod.POST})
	public LoginMemberDto getInformation_M(@RequestBody String id) {
		System.out.println("MypageController getInformation 모바일" + new Date());

		LoginMemberDto dto = sv.getInformation(id);
		System.out.println("dto 확인" + dto);
		
		return dto;
	}
	
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
	
	// 비밀번호 수정
	@RequestMapping(value = "/updatePwd", method = {RequestMethod.GET, RequestMethod.POST})
	public String updatePwd(LoginMemberDto dto) {
		System.out.println("MypageController updatePwd 웹" + new Date());

	    boolean b = sv.updatePwd(dto);
	    if(b) {
	    	return "yes";
	    }
	    return "no";
	}
	@RequestMapping(value = "/updatePwd_M", method = {RequestMethod.GET, RequestMethod.POST})
	public String updatePwd_M(@RequestBody LoginMemberDto dto) {
		System.out.println("MypageController updatePwd 모바일" + new Date());

	    boolean b = sv.updatePwd(dto);
	    if(b) {
	    	return "yes";
	    }
	    return "no";
	}
	
	// 회원 삭제
	@RequestMapping(value = "/deleteMember", method = {RequestMethod.GET, RequestMethod.POST})
	public String deleteMember(String id){
		System.out.println("MypageController deleteMember 웹" + new Date());
		
		boolean b = sv.deleteMember(id);
		
		if(b) {
	    	return "yes";
	    }
	    return "no";
	}
	@RequestMapping(value = "/deleteMember_M", method = {RequestMethod.GET, RequestMethod.POST})
	public String deleteMember_M(@RequestBody String id){
		System.out.println("MypageController deleteMember 모바일" + new Date());
		
		boolean b = sv.deleteMember(id);
		
		if(b) {
	    	return "yes";
	    }
	    return "no";
	}
	
	// 운동 루틴
	@RequestMapping(value = "/getMyRoutine", method = {RequestMethod.GET, RequestMethod.POST})
	public List<WorkListDto> getMyRoutine(String id){
		System.out.println("MypageController getgetMyRoutineMyBbs 웹" + new Date());
		
		List<WorkListDto> list = sv.getMyRoutine(id);
		return list;
	}
	@RequestMapping(value = "/getMyRoutine_M", method = {RequestMethod.GET, RequestMethod.POST})
	public List<WorkListDto> getMyRoutine_M(@RequestBody String id){
		System.out.println("MypageController getgetMyRoutineMyBbs 모바일" + new Date());
		
		List<WorkListDto> list = sv.getMyRoutine(id);
		return list;
	}
	
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
		System.out.print("!!!!!좋아요 목록 확인 : " + list);
		
		return list;
	}
	@RequestMapping(value = "/getMyLike_M", method = {RequestMethod.GET, RequestMethod.POST})
	public List<WorkBbsDto> getMyLike_M(@RequestBody String id){
		System.out.println("MypageController getMyLike 모바일" + new Date());
		
		List<WorkBbsDto> list = sv.getMyLike(id);
		return list;
	}
	
	// 회원 목록 조회(관리자)
	@RequestMapping(value = "/getMemberList", method = {RequestMethod.GET, RequestMethod.POST})
	public List<LoginMemberDto> getMemberList(){
		System.out.println("MypageController getMemberList" + new Date());
		
		List<LoginMemberDto> list = sv.getMemberList();
		return list;
	}
}