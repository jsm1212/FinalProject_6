package health.back.a.dto;

public class WorkListDto {
	private int workseq;
	private String workname;
	private String workcontent;
	private String workimage;
	private int part;
	private int worklike;
	

	public WorkListDto() {
		super();
	}
	public WorkListDto(int workseq, String name, String content, 
			int workcategory, int worklike , String photo) {
		super();
		this.workseq=workseq;
		this.workname=name;
		this.workcontent=content;
		this.part=workcategory;
		this.worklike=worklike;
		this.workimage=photo;
	}
	public int getWorkseq() {
		return workseq;
	}
	public void setWorkseq(int workseq) {
		this.workseq = workseq;
	}
	public String getWorkname() {
		return workname;
	}
	public void setWorkname(String workname) {
		this.workname = workname;
	}
	public String getWorkcontent() {
		return workcontent;
	}
	public void setWorkcontent(String workcontent) {
		this.workcontent = workcontent;
	}
	public String getWorkimage() {
		return workimage;
	}
	public void setWorkimage(String workimage) {
		this.workimage = workimage;
	}
	public int getPart() {
		return part;
	}
	public void setPart(int part) {
		this.part = part;
	}
	public int getWorklike() {
		return worklike;
	}
	public void setWorklike(int worklike) {
		this.worklike = worklike;
	}
	@Override
	public String toString() {
		return "WorkListDto [workseq=" + workseq + ", workname=" + workname + ", workcontent=" + workcontent
				+ ", workimage=" + workimage + ", part=" + part + ", worklike=" + worklike + "]";
	}
	
}
