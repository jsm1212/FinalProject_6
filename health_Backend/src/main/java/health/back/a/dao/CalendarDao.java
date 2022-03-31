package health.back.a.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import health.back.a.dto.CalendarDto;

@Mapper
@Repository
public interface CalendarDao {

	public int writeCalendar(CalendarDto dto);
	
	public int updateCalendar(CalendarDto dto);
	
	public int deleteCalendar(CalendarDto dto);
	
	public CalendarDto searchCalendar(CalendarDto dto);
}
