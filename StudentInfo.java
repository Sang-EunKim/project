package softwareproject;

public class StudentInfo {
	
	private String stuId;
	private String stuNum;
	private String stupw;
	
	public StudentInfo(String id,String num,String pw){
		this.stuId = id;
		this.stuNum = num;
		this.stupw = pw;
	}
	
	public StudentInfo(){
		
	}
	
	public String getStuId() {
		return stuId;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	public String getStuNum() {
		return stuNum;
	}
	public void setStuNum(String stuNum) {
		this.stuNum = stuNum;
	}
	public String getStupw() {
		return stupw;
	}
	public void setStupw(String stupw) {
		this.stupw = stupw;
	}
}
