//this is the professor class with all of the variables as instructed, a default and an overloaded constructor, getter and setter methods for each variable and a getBonus method. 
import java.io.Serializable;

public class Professor extends Person implements Serializable {
	
	boolean partTime;
	boolean fullTime;
	int employeeId;
	double salary;
	double bonus;
	int yearsTaught;
	
	//default constructor
	public Professor() {
		
	}
	
	//overloaded constructor
	public Professor(boolean partTime, boolean fullTime, int employeeId, double salary, double bonus, int yearsTaught) {
		this.partTime = partTime;
		this.fullTime = fullTime;
		this.employeeId = employeeId;
		this.salary = salary;
		this.bonus = bonus;
		this.yearsTaught = yearsTaught;
	}
	
	public Professor(boolean partTime, boolean fullTime) {
		this.partTime = partTime;
		this.fullTime = fullTime;
	}

	//getter method
	public boolean getPartTime() {
		return partTime;
	}

	//setter method
	public void setPartTime(boolean partTime) {
		this.partTime = partTime;
	}

	//getter method
	public boolean getFullTime() {
		return fullTime;
	}

	//setter method
	public void setFullTime(boolean fullTime) {
		this.fullTime = fullTime;
	}

	//getter method
	public int getEmployeeId() {
		return employeeId;
	}

	//setter method
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	//getter method
	public double getSalary() {
		return salary;
	}

	//setter method
	public void setSalary(double salary) {
		this.salary = salary;
	}

	//getter method
	public double getBonus() {
		return bonus;
	}

	//setter method
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	//getter method
	public int getYearsTaught() {
		return yearsTaught;
	}

	//setter method
	public void setYearsTaught(int yearsTaught) {
		this.yearsTaught = yearsTaught;
	}

	//getter method
	//Overload
	//this method takes in salary and yearsTaught as the parameters. if the yearsTaught is greater than 3, the bonus is $5000.
	//if the yearsTaught is greater than 6, the bonus is $10000. If the yearsTaught is less than 3, the bonus is $500.
	public double getBonus(double salary, int yearsTaught) {
		if (yearsTaught > 3) {
			bonus = 5000;
			return bonus;
		}
		else if(yearsTaught > 6) {
			bonus = 10000;
			return bonus;
		}
		else {
			bonus = 500;
			return bonus;
		}
	}
	
}
