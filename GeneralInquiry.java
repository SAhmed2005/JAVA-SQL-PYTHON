//this is an abstract class with 1 default constructor and 2 methods of which 1 method is abstract.
public abstract class GeneralInquiry {
	
	boolean isEmployed;
	
	//default constructor
	protected GeneralInquiry() {
		
	}
	
	////this method returns true if age parameter holds a value thats above 18. if not it returns false
	public boolean isAdult(int age) {
		if (age >= 18) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//this is an abstract method, so it doesn't have any body. 
	public abstract boolean hasCar(int age);

}

