
public class Faculty extends Student{
	
	private String dept;
	private String pos;
	
	public Faculty() {
		super();
		super.getName();
		super.setName(getName());
		super.getAge();
		super.setAge(getAge());
		super.getGpa();
		super.setGpa(getGpa());
		
	}
	
	public Faculty(String name, int age, double gpa, String dept, String pos) {
		super(name, age, gpa);
	
		this.dept = dept;
		this.pos = pos;
	}
	
	public String getDept() {
		return dept;
	}
	
	public String getPos() {
		return pos;
	}
	
	public void setDept(String dept) {
		 this.dept = dept;
	 }
	
	public void setPos(String pos) {
		 this.pos = pos;
	 }
	
	 public String toString() {
	    	return "Dept" + dept + "\nPos" + pos;
	    }
}
