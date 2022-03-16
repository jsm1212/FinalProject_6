package health.back.a.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import health.back.a.dto.WorkBbsDto;
import health.back.a.service.WorkBbsService;

@RestController
public class WorkBbsController {
	
	@Autowired
	WorkBbsService sv;
	
	// 게시판 전체리스트 불러오기
	@RequestMapping(value = "/getBbsList", method = {RequestMethod.GET, RequestMethod.POST})
	public List<WorkBbsDto> getBbsList(){
		System.out.println("WorkBbsController getBbsList " + new Date());
		
		List<WorkBbsDto> list = sv.getBbsList();
		return list;
	}
	
	// 게시판 글쓰기_Web
	@RequestMapping(value = "/writebbs", method = {RequestMethod.GET, RequestMethod.POST})
	public String writebbs(WorkBbsDto dto) {
		// 클라이언트에서 받은 데이터 확인
		System.out.println("받은데이터 : " + dto);
		
		boolean b = sv.writeBbs(dto);
		if(b) {
			// 게시글 작성 성공시(DB에 데이터가 들어간경우)
			return "success";
		}
		// 게시글 작성 실패시(DB에 데이터가 들어가지 않은경우)
		return "fail";
	}
	
	// 게시판 글쓰기_App
	@RequestMapping(value = "/writebbs_M", method = {RequestMethod.GET, RequestMethod.POST})
	public String writebbs_M(@RequestBody WorkBbsDto dto) {
		// 클라이언트에서 받은 데이터 확인
		System.out.println("받은데이터 : " + dto);
		
		boolean b = sv.writeBbs(dto);
		if(b) {
			// 게시글 작성 성공시(DB에 데이터가 들어간경우)
			return "success";
		}
		// 게시글 작성 실패시(DB에 데이터가 들어가지 않은경우)
		return "fail";
	}
	
	// 선택한 게시글 불러오기_Web
	@RequestMapping(value = "/bbsDetail", method = {RequestMethod.GET, RequestMethod.POST})
	public WorkBbsDto bbsDetail(int seq) {
		// 클라이언트에서 받은 seq번호 확인
		System.out.println("받은 seq번호 : " + seq);
		
		return sv.bbsDetail(seq);
	}
	
	// 선택한 게시글 불러오기_App
	@RequestMapping(value = "/bbsDetail_M", method = {RequestMethod.GET, RequestMethod.POST})
	public WorkBbsDto bbsDetail_M(@RequestBody int seq) {
		// 클라이언트에서 받은 seq번호 확인
		System.out.println("받은 seq번호 : " + seq);
		
		return sv.bbsDetail(seq);
	}
	
	// 게시글 수정_Web
	@RequestMapping(value = "/updateBbs", method = {RequestMethod.GET, RequestMethod.POST})
	public String updateBbs(WorkBbsDto dto) {
		// 클라이언트에서 받은 수정된 게시글 데이터
		System.out.println("수정된 게시글 정보 : " + dto);
		
		boolean b = sv.updateBbs(dto);
		if(b) {
			// 수정된 데이터가 정상적으로 DB에 반영됐을 경우
			return "success";
		}
		// 수정된 데이터가 DB에 반영 실패했을 경우
		return "fail";
	}
	
	// 게시글 수정_App
		@RequestMapping(value = "/updateBbs_M", method = {RequestMethod.GET, RequestMethod.POST})
		public String updateBbs_M(@RequestBody WorkBbsDto dto) {
			// 클라이언트에서 받은 수정된 게시글 데이터
			System.out.println("수정된 게시글 정보 : " + dto);
			
			boolean b = sv.updateBbs(dto);
			if(b) {
				// 수정된 데이터가 정상적으로 DB에 반영됐을 경우
				return "success";
			}
			// 수정된 데이터가 DB에 반영 실패했을 경우
			return "fail";
		}
}






















