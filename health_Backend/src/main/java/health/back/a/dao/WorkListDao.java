package health.back.a.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import health.back.a.dto.WorkListDto;

@Mapper
@Repository
public interface WorkListDao {
	
	//목록 전체 불러오기
	public List<WorkListDto> getWorkList();
	
	// 선택한 글 불러오기
	public WorkListDto getWorkDetail(int workseq);
	
	
	//조회수
	//public void readcount(int seq);
	

}
