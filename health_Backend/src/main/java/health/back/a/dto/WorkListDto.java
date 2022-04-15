package health.back.a.dto;

public class WorkListDto {
	private int seq;
	private String name;
	private String content;
	private String photo;
	private int workcategory;
	private int worklike;
	

	public WorkListDto() {
	}
	public WorkListDto(int seq, String name, String content, String photo, int workcategory, int worklike ) {
		this.seq=seq;
		this.name=name;
		this.content=content;
		this.photo=photo;
		this.workcategory=workcategory;
		this.worklike=worklike;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public int getWorkcategory() {
		return workcategory;
	}
	public void setWorkcategory(int workcategory) {
		this.workcategory = workcategory;
	}
	public int getWorklike() {
		return worklike;
	}
	public void setWorklike(int worklike) {
		this.worklike = worklike;
	}
	@Override
	public String toString() {
		return "WorklistDto [seq=" + seq + ", name=" + name + ", content=" + content + ", photo=" + photo
				+ ", workcategory=" + workcategory + ", worklike=" + worklike + "]";
	}
	
}
