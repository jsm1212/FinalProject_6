package health.back.a.controller;

import java.util.Date;

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

		boolean b = service.writeCalendar(dto);
		if(b) {
			return "YES";
		}
		return "NO";
}
	
	@RequestMapping(value = "/updateCalendar", method = {RequestMethod.GET, RequestMethod.POST} )
	public String updateCalendar(@RequestBody CalendarDto dto) {
		System.out.println("CalendarController updateCalendar " + new Date());
		
		boolean b = service.updateCalendar(dto);
		if(b) {
			return "OK";
		}
		return "NO";
	}
	
	@RequestMapping(value = "/deleteCalendar", method = {RequestMethod.GET, RequestMethod.POST} )
	public String deleteCalendar(@RequestBody CalendarDto dto) {
		System.out.println("CalendarController deleteCalendar " + new Date());
		boolean result = service.deleteCalendar(dto);		
		if(result) {
			return "OK";
		}
		return "NO";	
	}
	//안드로이드에서 @RequestBody 는 객체여서 사용해야됨.
	@RequestMapping(value = "/searchCalendar", method = {RequestMethod.GET, RequestMethod.POST} )
	public CalendarDto searchCalendar(@RequestBody CalendarDto dto) {
		System.out.println("CalendarController searchCalendar " + new Date());
		
		return service.searchCalendar(dto);
		
	}
	
}
