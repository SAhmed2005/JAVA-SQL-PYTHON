
public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student result1 = new Student();
		Student result2 = new Student("John", 25, 3.7);
		
		System.out.println(result1.getName());
		System.out.println(result1.getAge());
		System.out.println(result1.getGPA());
		
		System.out.println(result1.toString());
		
		result1.setName("Alex");
		System.out.println(result1.getName());
		System.out.println(result1.getAge());
		System.out.println(result1.getGPA());
		
		System.out.println(result1.toString());
		
		System.out.println(result2.getName());
		System.out.println(result2.getAge());
		System.out.println(result2.getGPA());
		
		System.out.println(result2.toString());
		
		
		result2.setName("Sam");
		result2.setAge(27);
		result2.setGPA(3.9);
		System.out.println(result2.getName());
		System.out.println(result2.getAge());
		System.out.println(result2.getGPA());
	}

}
