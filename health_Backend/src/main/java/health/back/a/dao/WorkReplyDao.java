package health.back.a.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import health.back.a.dto.WorkReplyDto;

@Mapper
@Repository
public interface WorkReplyDao {
	
	// 댓글 리스트 불러오기
	public List<WorkReplyDto> getReplyList(int seq);
	
	// 댓글 작성하기
	public int writeReply(WorkReplyDto dto);
	
	// 댓글 수정하기
	public int updateReply(WorkReplyDto dto);
	
	// 댓글 삭제하기
	public int deleteReply(int seq);
	
	// 해당 게시글의 댓글 수
	public int getReplyCount(int seq);
}









