package practiceDaoDto.demo;

public class StudentDTO {
	private int sid;
	private String sname;
	public StudentDTO(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	public String toString() {
		return "StudentDTO{"+"sid = "+sid+" sname = "+sname+"}";
	}
}
