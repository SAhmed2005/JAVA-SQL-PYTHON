 
public class Circle { //Class Name
	
	
	//data field
	private double radius;
	
	//constructor - same as class name
	//2 types: default and overloaded.
	
	//default constructor
	Circle(){
		radius = 0;
	}
	
	
	//overloaded constructor
	Circle(double newRadius){
		radius = newRadius;
	}

	//get method
	public double getRadius() {
		return radius;
	}
	
	//set method
	public void setRadius(double newRadius) {
		radius = newRadius;
	}
	
	//toString method
	public String toString() {
		return "Circle [radius = " + radius + " ]";
	}
	
	
	
	
}
