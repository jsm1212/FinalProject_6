package health.back.a.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import health.back.a.dto.WorkBbsDto;

@Mapper
@Repository
public interface WorkBbsDao {

	// 게시판 전체리스트 불러오기
	public List<WorkBbsDto> getBbsList();
	
	// 게시판 글쓰기
	public int writeBbs(WorkBbsDto dto);
	
	// 선택한 게시글 불러오기(detail)
	public WorkBbsDto bbsDetail(int seq);
	
	// 게시글 수정
	public int updateBbs(WorkBbsDto dto);
}
