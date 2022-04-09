package health.back.a.dto;

/*
CREATE TABLE LIKEBBS(
	BBS_NO NUMBER(8) REFERENCES WORKBBS(WORKBBSSEQ),
	USER_ID VARCHAR2(100) REFERENCES LOGINMEMBERS(ID)
);
*/

public class LikeBbsDto {
	private int bbs_no;
	private String user_id;
	
	public LikeBbsDto() {
		super();
	}

	public LikeBbsDto(int bbs_no, String user_id) {
		super();
		this.bbs_no = bbs_no;
		this.user_id = user_id;
	}

	public int getBbs_no() {
		return bbs_no;
	}

	public void setBbs_no(int bbs_no) {
		this.bbs_no = bbs_no;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	@Override
	public String toString() {
		return "LikeBbsDto [bbs_no=" + bbs_no + ", user_id=" + user_id + "]";
	}
}
