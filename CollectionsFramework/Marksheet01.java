package CollectionsFramework;



public class Marksheet01 implements Comparable <Marksheet01> {

	private String rollNo;
	private String fName;
	private String lName;
	private int marks;
	
	
	
	public String getRollNo() {
		return rollNo;
	}
	public Marksheet01(String rollNo,String fname,String lName,int marks) {
		this.rollNo = rollNo;
		this.fName= fName;
		this.lName=lName;
		this.marks=marks;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
   @Override
	public int compareTo(Marksheet01 m) {
		return rollNo.compareTo(m.rollNo);
	}
	
	
	
	
	
	
	
	
	
	
}
