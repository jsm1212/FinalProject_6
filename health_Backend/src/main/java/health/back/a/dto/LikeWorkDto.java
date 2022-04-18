package health.back.a.dto;

/*	CREATE TABLE LIKEWORK(
		WORK_NO NUMBER(8) REFERENCES WORK(WORKSEQ),
		USER_ID VARCHAR2(100) REFERENCES LOGINMEMBERS(ID)
	);*/

public class LikeWorkDto {
	private int work_no;
	private String user_id;
	
	public LikeWorkDto() {}
	public LikeWorkDto(int work_no, String user_id) {
		super();
		this.work_no = work_no;
		this.user_id = user_id;
	}
	
	public int getWork_no() {
		return work_no;
	}
	public void setWork_no(int work_no) {
		this.work_no = work_no;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	@Override
	public String toString() {
		return "LikeWorkDto [work_no=" + work_no + ", user_id=" + user_id + "]";
	}
}