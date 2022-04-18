package health.back.a.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import health.back.a.dto.LikeWorkDto;
import health.back.a.dto.WorkListDto;

@Mapper
@Repository
public interface WorkListDao {
	
	//목록 전체 불러오기
	public List<WorkListDto> getWorkList();
	
	// 선택한 글 불러오기
	public WorkListDto getWorkDetail(int workseq);
		
	// 좋아요
	public void likeCountWork(int seq);
	public int likeInfoWork(LikeWorkDto dto);
	
	// 좋아요 취소
	public void likeCountCancelWork(int seq);
	public int likeCancelWork(LikeWorkDto dto);
	
	// 좋아요 중복 제한
	public int checkLikeCountWork(LikeWorkDto dto);
}