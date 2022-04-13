package health.back.a.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import health.back.a.dto.CalendarDto;
import health.back.a.service.CalendarService;

@RestController
public class CalendarController {
	
	@Autowired
	CalendarService service;
	
	@RequestMapping(value = "/writeCalendar_M", method = {RequestMethod.GET, RequestMethod.POST} )
	public String writeCalendar_M(@RequestBody CalendarDto dto) {
		//System.out.println("CalendarController_M writeCalendar " + new Date());
		//System.out.println(dto.toString());
		//객체라서 @RequestBody	
		boolean b = service.writeCalendar(dto);
		if(b) {
			return "YES";
		}
		return "NO";
}
	
	@RequestMapping(value = "/writeCalendar", method = {RequestMethod.GET, RequestMethod.POST} )
	public String writeCalendar(CalendarDto dto) {
		//System.out.println("CalendarController writeCalendar " + new Date());
		//System.out.println(dto.toString());
		boolean b;
		if(dto.getContent() != null && dto.getContent() != "") {
			 b = service.writeCalendar(dto);
		}else {
			 b = false;
			}
				if(b) {
				return "YES";
				}
				return "NO";
		}
	@RequestMapping(value = "/updateCalendar_M", method = {RequestMethod.GET, RequestMethod.POST} )
	public String updateCalendar_M(@RequestBody CalendarDto dto) {
		System.out.println("CalendarController updateCalendar_M " + new Date());
		
		boolean b = service.updateCalendar(dto);
		if(b) {
			return "OK";
		}
		return "NO";
	}
	@RequestMapping(value = "/updateCalendar", method = {RequestMethod.GET, RequestMethod.POST} )
	public String updateCalendar(CalendarDto dto) {
		System.out.println("CalendarController updateCalendar " + new Date());
		boolean b;
		if(dto.getContent() != null && dto.getContent() != "") {
			b = service.updateCalendar(dto);
		}else {
			b= false;
		}
		if(b) {
			return "OK";
		}
		return "NO";
	}
	
	@RequestMapping(value = "/deleteCalendar_M", method = {RequestMethod.GET, RequestMethod.POST} )
	public String deleteCalendar_M(@RequestBody CalendarDto dto) {
		System.out.println("CalendarController deleteCalendar_M " + new Date());
		boolean result = service.deleteCalendar(dto);		
		if(result) {
			return "OK";
		}
		return "NO";	
	}
	@RequestMapping(value = "/deleteCalendar", method = {RequestMethod.GET, RequestMethod.POST} )
	public String deleteCalendar(CalendarDto dto) {
		System.out.println("CalendarController deleteCalendar " + new Date());
		boolean result = service.deleteCalendar(dto);		
		if(result) {
			return "OK";
		}
		return "NO";	
	}
	//안드로이드에서 @RequestBody 는 객체여서 사용해야됨.
	@RequestMapping(value = "/searchCalendar_M", method = {RequestMethod.GET, RequestMethod.POST} )
	public CalendarDto searchCalendar_M(@RequestBody CalendarDto dto) {
		System.out.println("CalendarController searchCalendar_M " + new Date());
		
		return service.searchCalendar(dto);		
	}
	
	@RequestMapping(value = "/searchCalendar", method = {RequestMethod.GET, RequestMethod.POST} )
	public CalendarDto searchCalendar( CalendarDto dto) {
		System.out.println("CalendarController searchCalendar " + new Date());
		
		return service.searchCalendar(dto);		
	}

	// 기간검색
	@RequestMapping(value = "/psearchCalendar", method = {RequestMethod.GET, RequestMethod.POST} )
	public List<CalendarDto> psearchCalendar(int startDate, int endDate, String userId){
		System.out.println("시작기간 : " + startDate);
		System.out.println("종료기간 : " + endDate);
		
		List<CalendarDto> list = service.psearchCalendar(userId);
		List<CalendarDto> calList = new ArrayList<CalendarDto>();
		
		for(int i = 0; i <list.size(); i++) {
			if(Integer.parseInt(list.get(i).getCalendardate()) >= startDate && Integer.parseInt(list.get(i).getCalendardate()) <= endDate) {
				calList.add(list.get(i));
			}
		}
		System.out.println(calList);
		
		return calList;
	}
	@RequestMapping(value = "/psearchCalendar_M", method = {RequestMethod.GET, RequestMethod.POST} )
	public List<CalendarDto> psearchCalendar_M(int startDate, int endDate, String userId){
		System.out.println("시작기간 : " + startDate);
		System.out.println("종료기간 : " + endDate);
		
		List<CalendarDto> list = service.psearchCalendar(userId);
		List<CalendarDto> calList = new ArrayList<CalendarDto>();
		
		for(int i = 0; i <list.size(); i++) {
			if(Integer.parseInt(list.get(i).getCalendardate()) >= startDate && Integer.parseInt(list.get(i).getCalendardate()) <= endDate) {
				calList.add(list.get(i));
			}
		}
		System.out.println(calList);
		
		return calList;
	}
	
}
