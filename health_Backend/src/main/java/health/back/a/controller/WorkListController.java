package health.back.a.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import health.back.a.dto.WorkListDto;
import health.back.a.service.WorkListService;

public class WorkListController {
	
	@Autowired
	WorkListService service;
	
	//게시판 전체불러오기
	@RequestMapping(value = "/getWorkList", method = {RequestMethod.GET, RequestMethod.POST})
	public List<WorkListDto> getWorkList(){
		 System.out.println("게시판 리스트 불러오기 " + new Date());
		
		// 클라이언트로 보내줄 데이터 확인
		List<WorkListDto> list = service.getWorkList();
		System.out.println(list);
		
		return list;
	}

	//게시물 상세보기
	@RequestMapping(value = "/getWorkDetail", method = {RequestMethod.GET, RequestMethod.POST})
	public WorkListDto workListDetail(int seq) {
		System.out.println("------"+seq+"WorkListController, workListDetail");
		return service.getWorkDetail(seq);
	}
	
	

}
