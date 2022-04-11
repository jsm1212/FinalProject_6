package health.back.a.dao;

import java.util.List;

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
	
	public List<CalendarDto> psearchCalendar(String id);
}
