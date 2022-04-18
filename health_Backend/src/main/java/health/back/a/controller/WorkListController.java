package health.back.a.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import health.back.a.dto.LikeBbsDto;
import health.back.a.dto.LikeWorkDto;
import health.back.a.dto.WorkListDto;
import health.back.a.service.WorkListService;

@RestController
public class WorkListController {
	@Autowired
	WorkListService service;

	// 게시판 전체불러오기
	@RequestMapping(value = "/getWorkList", method = { RequestMethod.GET, RequestMethod.POST })
	public List<WorkListDto> getWorkList() {
		System.out.println("운동목록 불러오기 " + new Date());

		List<WorkListDto> list = service.getWorkList();
		
		System.out.println(list);

		return list;
	}

	// 게시물 상세보기
	@RequestMapping(value = "/getWorkDetail", method = { RequestMethod.GET, RequestMethod.POST })
	public WorkListDto getWorkDetail(int workseq) {
		System.out.println("------" + workseq + " WorkListController, workListDetail");
		return service.getWorkDetail(workseq);
	}
	
	// 좋아요 Web
	@RequestMapping(value = "/likeCountWork", method = {RequestMethod.GET, RequestMethod.POST})
	public String likeCountWork(LikeWorkDto dto) {
		// 클라이언트에서 받은 정보 확인
		System.out.println("받은 정보(게시글 좋아요) : " + dto);
		
		boolean b = service.checkLikeCountWork(dto);
		System.out.println("현재 b의 값 : " + b);
		
		if(b) { // 해당 게시판 좋아요 기록 있을때
			System.out.println("좋아요 누른적이 있습니다");
			return "notCount";
		}else { // 해당 게시판 좋아요 기록 없을때
			service.likeInfoWork(dto);
			service.likeCountWork(dto.getWork_no());
			System.out.println("좋아요를 눌렀습니다");
			return "count";
		}
	}
	
	// 좋아요 App
	@RequestMapping(value = "/likeCountWork_M", method = {RequestMethod.GET, RequestMethod.POST})
	public String likeCountWork_M(@RequestBody LikeWorkDto dto) {
		// 클라이언트에서 받은 정보 확인
		System.out.println("받은 정보(게시글 좋아요) : " + dto);
		
		boolean b = service.checkLikeCountWork(dto);
		System.out.println("현재 b의 값 : " + b);
		
		if(b) { // 해당 게시판 좋아요 기록 있을때
			System.out.println("좋아요 누른적이 있습니다");
			return "notCount";
		}else { // 해당 게시판 좋아요 기록 없을때
			service.likeInfoWork(dto);
			service.likeCountWork(dto.getWork_no());
			System.out.println("좋아요를 눌렀습니다");
			return "count";
		}
	}
	
	// 좋아요 취소 Web
	@RequestMapping(value = "/likeCountCancelWork", method = {RequestMethod.GET, RequestMethod.POST})
	public String likeCountCancelWork(LikeWorkDto dto) {
		// 클라이언트에서 받은 정보 확인
		System.out.println("받은정보 (좋아요 취소) : " + dto);
		
		// 좋아요테이블 게시판 및 유저정보 삭제
		boolean b = service.likeCancelWork(dto);
		
		if(b) {
			// 게시판 좋아요 1감소
			service.likeCountCancelWork(dto.getWork_no());
			return "complete";
		}else {
			return "fail";
		}
	}
	
	// 좋아요 취소 App
	@RequestMapping(value = "/likeCountCancelWork_M", method = {RequestMethod.GET, RequestMethod.POST})
	public String likeCountCancelWork_M(@RequestBody LikeWorkDto dto) {
		// 클라이언트에서 받은 정보 확인
		System.out.println("받은정보 (좋아요 취소) : " + dto);
		
		// 좋아요테이블 게시판 및 유저정보 삭제
		boolean b = service.likeCancelWork(dto);
		
		if(b) {
			// 게시판 좋아요 1감소
			service.likeCountCancelWork(dto.getWork_no());
			return "complete";
		}else {
			return "fail";
		}
	}
}