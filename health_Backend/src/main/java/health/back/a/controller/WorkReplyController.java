package health.back.a.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import health.back.a.dto.WorkReplyDto;
import health.back.a.service.WorkReplyService;

@RestController
public class WorkReplyController {
	
	@Autowired
	WorkReplyService sv;
	
	// 댓글 리스트 불러오기_Web
	@RequestMapping(value = "/getReplyList", method = {RequestMethod.GET, RequestMethod.POST})
	public List<WorkReplyDto> getReplyList(int seq) {
		// 클라이언트에서 보낸 게시글의 seq 확인
		System.out.println("게시글의 seq : " + seq);
		
		// 클라이언트로 보낼 댓글 리스트 확인
		List<WorkReplyDto> list = sv.getReplyList(seq);
		System.out.println("해당 게시물 댓글 리스트 : " + list);
		
		return list;
	}
	
	// 댓글 리스트 불러오기_App
	@RequestMapping(value = "/getReplyList_M", method = {RequestMethod.GET, RequestMethod.POST})
	public List<WorkReplyDto> getReplyList_M(@RequestBody int seq) {
		// 클라이언트에서 보낸 게시글의 seq 확인
		System.out.println("게시글의 seq : " + seq);
		
		// 클라이언트로 보낼 댓글 리스트 확인
		List<WorkReplyDto> list = sv.getReplyList(seq);
		System.out.println("해당 게시물 댓글 리스트 : " + list);
		
		return list;
	}
	
	// 댓글 작성하기_Web
	@RequestMapping(value = "/writeReply", method = {RequestMethod.GET, RequestMethod.POST})
	public String writeReply(WorkReplyDto dto) {
		// 클라이언트에서 보낸 댓글 데이터 확인
		System.out.println("작성된 댓글 정보 : " + dto);
		
		boolean b = sv.writeReply(dto);
		if(b) {
			// 댓글 작성 성공
			return "success";
		}
		// 댓글 작성 실패
		return "fail";
	}
	
	// 댓글 작성하기_App
	@RequestMapping(value = "/writeReply_M", method = {RequestMethod.GET, RequestMethod.POST})
	public String writeReply_M(@RequestBody WorkReplyDto dto) {
		// 클라이언트에서 보낸 댓글 데이터 확인
		System.out.println("작성된 댓글 정보 : " + dto);
		
		boolean b = sv.writeReply(dto);
		if(b) {
			// 댓글 작성 성공
			return "success";
		}
		// 댓글 작성 실패
		return "fail";
	}
	
	// 댓글 수정하기_Web
	@RequestMapping(value = "/updateReply", method = {RequestMethod.GET, RequestMethod.POST})
	public String updateReply(WorkReplyDto dto) {
		// 클라이언트에서 보낸 수정된 댓글 데이터 확인
		System.out.println("수정된 댓글 정보 : " + dto);
		
		boolean b = sv.updateReply(dto);
		if(b) {
			// 댓글 수정 성공
			return "success";
		}
		// 댓글 수정 실패
		return "fail";
	}
	
	// 댓글 수정하기_App
	@RequestMapping(value = "/updateReply_M", method = {RequestMethod.GET, RequestMethod.POST})
	public String updateReply_M(@RequestBody WorkReplyDto dto) {
		// 클라이언트에서 보낸 수정된 댓글 데이터 확인
		System.out.println("수정된 댓글 정보 : " + dto);
		
		boolean b = sv.updateReply(dto);
		if(b) {
			// 댓글 수정 성공
			return "success";
		}
		// 댓글 수정 실패
		return "fail";
	}
	
	// 댓글 삭제하기_Web
	@RequestMapping(value = "/deleteReply", method = {RequestMethod.GET, RequestMethod.POST})
	public String deleteReply(int seq) {
		// 클라이언트에서 보낸 삭제할 게시글의 seq
		System.out.println("삭제할 게시글의 seq : " + seq);
		
		boolean b = sv.deleteReply(seq);
		if(b) {
			// 댓글 삭제 성공
			return "success";
		}
		// 댓글 삭제 실패
		return "fail";
	}
	
	// 댓글 삭제하기_App
	@RequestMapping(value = "/deleteReply_M", method = {RequestMethod.GET, RequestMethod.POST})
	public String deleteReply_M(int seq) {
		// 클라이언트에서 보낸 삭제할 게시글의 seq
		System.out.println("삭제할 게시글의 seq : " + seq);
		
		boolean b = sv.deleteReply(seq);
		if(b) {
			// 댓글 삭제 성공
			return "success";
		}
		// 댓글 삭제 실패
		return "fail";
	}
}










