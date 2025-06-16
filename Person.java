//this is a person class that extends general inquiry, has all the variables as instructed, a default and an overloaded constructor, getter and setter methods for each variable, hasCar method, validateSsn method and cleanUpSsn method.
import java.io.Serializable;

public class Person extends GeneralInquiry implements Serializable {
	private String firstName;
	private String lastName;
	private String ssn;
	private String age;
	
	//default constructor
	public Person() {
		
	}
	
	//overloaded constructor
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	//getter method
	public String getFirstName() {
		return firstName;
	}

	//setter method
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	//getter method
	public String getLastName() {
		return lastName;
	}

	//setter method
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	//getter method
	public String getSsn() {
		return ssn;
	}

	//setter method
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	//getter method
	public String getAge() {
		return age;
	}

	//setter method
	public void setAge(String age) {
		this.age = age;
	}

	//Override
	@Override
	public String toString() {
		return "First Name = " + firstName + "\nLast Name = " + lastName + "\nSSN = " + ssn + "\nAge = " + age;
	}

	//Override
	//this method returns true if age parameter holds a value thats above 18. if not it returns false
	@Override
	public boolean hasCar(int age) {
		if (age >= 18) {
			return true;
		}
		else {
			return false;
		}
	}
//this method takes ssn, calls the cleanUpSsn method to verify, checks if the length is 9 and returns true or false.
	public boolean validateSsn(String ssn) {
		String clean = cleanUpSsn(ssn);
		
		if (clean.length() == 9) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
	//this method used the for loop to read through the entire SSN to check if the content inside is a number that between 0 and 9. If it is, it copies it over to the str variable. If not, the str variables remains empty which then goes into the validateSsn method. that obviously is 0 in length which confrims that it is not a valid ssn.
	public String cleanUpSsn(String ssn) {
		String str = "";
		for (int i = 0; i < ssn.length(); i++) {
			char c = ssn.charAt(i);
			
			if (c >= '0' && c <= '9') {
				str += c;
			}
		} return str;
	}

	
	
}

