package health.back.a.dto;

public class CalendarDto{
	
	private int calendarseq;
	private String title;
	private String wdate;
	private String content;
	private int del;
	private String id;
	private String calendardate;
	
	public CalendarDto() {
	}
	
	public CalendarDto(int calendarseq, String title,  String content, String wdate, int del, String id,
			String calendardate) {
		super();
		this.calendarseq = calendarseq;
		this.title = title;
		this.content = content;
		this.wdate = wdate;
		this.del = del;
		this.id = id;
		this.calendardate = calendardate;
	}

	public int getCalendarseq() {
		return calendarseq;
	}

	public void setCalendarseq(int calendarseq) {
		this.calendarseq = calendarseq;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getwDate() {
		return wdate;
	}

	public void setwDate(String wdate) {
		this.wdate = wdate;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getDel() {
		return del;
	}

	public void setDel(int del) {
		this.del = del;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCalendardate() {
		return calendardate;
	}

	public void setCalendardate(String calendardate) {
		this.calendardate = calendardate;
	}

	@Override
	public String toString() {
		return "CalendarDto [calendarseq=" + calendarseq + ", title=" + title + ", wdate=" + wdate + ", content="
				+ content + ", del=" + del + ", id=" + id + ", calendardate=" + calendardate + "]";
	}
	

	
		
}
