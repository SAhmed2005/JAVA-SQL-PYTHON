import java.util.ArrayList;

public class MyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Faculty f = new Faculty("John", 20, 4.0, "IT", "1");
		//f.setDept("IT");
		System.out.println(f.getDept());
		
		//f.setPos("1");
		System.out.println(f.getPos());
		
		//f.setName("John");
		System.out.println(f.getName());
		System.out.println(f.getAge());
		System.out.println(f.getGpa());
		
		Student s = new Faculty();
		
		s.setAge(20);
		System.out.println(s.getAge());
		
		s.setGpa(4.0);
		System.out.println(s.getGpa());
		
		ArrayList<Student> al = new ArrayList<Student>();
		
		al.add(new  Faculty());
		al.add(new Student());
		
		System.out.println(((Faculty)(al.get(0))).getPos());
		al.get(1).setGpa(4);
		System.out.println(al.get(1).getGpa());
	}

}
