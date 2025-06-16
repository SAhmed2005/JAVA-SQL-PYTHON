
public class CircleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Circle obj1 = new Circle();
		Circle obj2 = new Circle(5); 
		Circle obj3 = new Circle(10);
		
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println(obj3.toString());
		
		System.out.println(obj1.getRadius());
		System.out.println(obj2.getRadius());
		System.out.println(obj3.getRadius());
		
	}

}
