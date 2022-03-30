package health.back.a.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import health.back.a.dao.CalendarDao;
import health.back.a.dto.CalendarDto;

@Service
@Transactional
public class CalendarService {
	
	@Autowired
	CalendarDao dao;
	
	public boolean writeCalendar(CalendarDto dto) {
		int n = dao.writeCalendar(dto);
		return n>0?true:false;
	}
	
	public boolean updateCalendar(CalendarDto dto) {
		int n = dao.updateCalendar(dto);
		if(n > 0) {
			return true;
		}
		return false;
	}
	
	public boolean deleteCalendar(CalendarDto dto) {
		return dao.deleteCalendar(dto)>0?true:false;
	}
	
	public CalendarDto searchCalendar(CalendarDto dto) {
		return dao.searchCalendar(dto);
	}
	
	
}
