package health.back.a.dto;

/*
CREATE TABLE WORKREPLY(
   WORKREPLYSEQ NUMBER(8) PRIMARY KEY,
   REPLYNUM NUMBER(8) NOT NULL,
   ID VARCHAR2(100) NOT NULL,
   NICKNAME VARCHAR2(30) NOT NULL,
   TITLE VARCHAR2(200) NOT NULL,
   CONTENT VARCHAR2(4000) NOT NULL,
   REF NUMBER(8) NOT NULL,
   STEP NUMBER(8) NOT NULL,
   DEPTH NUMBER(8) NOT NULL,
   DEL NUMBER(1) NOT NULL,
   WDATE DATE NOT NULL,
   READCOUNT NUMBER(8) NOT NULL,
   REPLYLIKE NUMBER(8) NOT NULL,
   REPLYIMAGE VARCHAR2(300) UNIQUE
);
*/
public class WorkReplyDto {
	private int workreplyseq;
	private int replyNum;
	
	private String id;
	private String nickname;
	
	private String title;
	private String content;
	private String wdate;
	
	private int ref;
	private int step;
	private int depth;
	
	private int del;
	private int readcount;
	private int replyLike;
	private String replyImage;
	
	public WorkReplyDto() {
		super();
	}

	public WorkReplyDto(int seq, int replyNum, String id, String nickname, String title, String content, String wdate,
			int ref, int step, int depth, int del, int readcount, int replyLike, String replyImage) {
		super();
		this.workreplyseq = seq;
		this.replyNum = replyNum;
		this.id = id;
		this.nickname = nickname;
		this.title = title;
		this.content = content;
		this.wdate = wdate;
		this.ref = ref;
		this.step = step;
		this.depth = depth;
		this.del = del;
		this.readcount = readcount;
		this.replyLike = replyLike;
		this.replyImage = replyImage;
	}

	public int getSeq() {
		return workreplyseq;
	}

	public void setSeq(int seq) {
		this.workreplyseq = seq;
	}

	public int getReplyNum() {
		return replyNum;
	}

	public void setReplyNum(int replyNum) {
		this.replyNum = replyNum;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWdate() {
		return wdate;
	}

	public void setWdate(String wdate) {
		this.wdate = wdate;
	}

	public int getRef() {
		return ref;
	}

	public void setRef(int ref) {
		this.ref = ref;
	}

	public int getStep() {
		return step;
	}

	public void setStep(int step) {
		this.step = step;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public int getDel() {
		return del;
	}

	public void setDel(int del) {
		this.del = del;
	}

	public int getReadcount() {
		return readcount;
	}

	public void setReadcount(int readcount) {
		this.readcount = readcount;
	}

	public int getReplyLike() {
		return replyLike;
	}

	public void setReplyLike(int replyLike) {
		this.replyLike = replyLike;
	}

	public String getReplyImage() {
		return replyImage;
	}

	public void setReplyImage(String replyImage) {
		this.replyImage = replyImage;
	}

	@Override
	public String toString() {
		return "WorkReplyDto [seq=" + workreplyseq + ", replyNum=" + replyNum + ", id=" + id + ", nickname=" + nickname
				+ ", title=" + title + ", content=" + content + ", wdate=" + wdate + ", ref=" + ref + ", step=" + step
				+ ", depth=" + depth + ", del=" + del + ", readcount=" + readcount + ", ReplyLike=" + replyLike
				+ ", ReplyImage=" + replyImage + "]";
	}
	
}
