//this is a demo class where we take input from the user with the help of scanner and assign it to the variables. 
// Then i created instances of person, student and professor class and plugged in the variables.
//I also wrote and read stu object using ObjectOutputStream and ObjectInput Stream.
//In the meanwhile I wrote multiple try and catch blocks to catch any and all exceptions.

import java.util.*;
import java.io.*;
public class Demo implements Serializable {

	public static void main(String[] args) throws fulltimePartTimeStatusException {
		
		Scanner input = new Scanner(System.in); // scanner to get the user input
		
		ArrayList<Person> per = new ArrayList<Person>(4); // arraylist that will contain professor and student objects
try {	
	System.out.println("Is the Professor part time? (true or false)");
	boolean partTime = input.nextBoolean();
	System.out.println("Is the Professor full time? (true or false)");
	boolean fullTime = input.nextBoolean();
	System.out.println("Enter professor's employee Id");
	int employeeId = input.nextInt();
	System.out.println("Enter professor's salary");
	double salary = input.nextDouble();
	System.out.println("Enter professor's bonus");
	double bonus = input.nextDouble();
	System.out.println("Enter the years that professor taught");
	int yearsTaught = input.nextInt();
	input.nextLine();
	
	
	System.out.println("Enter student's first name: ");
	String firstName = input.nextLine();
	System.out.println("Enter student's last name: ");
	String lastName = input.nextLine();
	System.out.println("Enter student's gpa: ");
	double gpa = input.nextDouble();
	input.nextLine();
	System.out.println("Enter student's major: ");
	String major = input.nextLine();
	System.out.println("Is the student full time:  (true or false)");
	boolean isFullTime = input.nextBoolean();
	System.out.println("Enter student's ID: ");
	int studentId = input.nextInt();
	System.out.println("Is the student honors student:  (true or false)");
	boolean isHonorstudent = input.nextBoolean();
	System.out.println("How many credits has the student completed: ");
	int creditCompleted = input.nextInt();
	input.nextLine();
	System.out.println("What is the student's status: ");
	String studentStatus = input.nextLine();
	
	//instances of professor and student class, with plugged in values that we got earlier from the user
	Professor prof = new Professor(partTime, fullTime, employeeId, salary, bonus, yearsTaught); //calling the overloaded constructor
	Student stu = new Student(firstName, lastName, gpa, major, isFullTime, studentId, isHonorstudent, creditCompleted, studentStatus); //calling the overloaded constructor
	
	//using methods declared in person class and general inquiry class
	System.out.println("Enter professor's age");
	int profAge = input.nextInt();
	System.out.println("Does professor have car? " + prof.hasCar(profAge));
	System.out.println("Enter student's age");
	int stuAge = input.nextInt();
	System.out.println("Is the student an adult? " + stu.isAdult(stuAge));
	input.nextLine();
	
	//using validateSsn method declared in person class
	System.out.println("Enter professor's ssn");
	String profSsn = input.nextLine();
	System.out.println("Is professor's ssn valid? " + prof.validateSsn(profSsn));
	System.out.println("Enter student's ssn");
	String stuSsn = input.nextLine();
	System.out.println("Is student's ssn valid? " + stu.validateSsn(stuSsn));
	
	
	
	//adding instance of professor class and student class to the arraylist
	per.add(prof);
	per.add(stu);
	
	//using methods declared in student class and professor class
	System.out.println("Student's Scholarship: " + stu.getScholarship(gpa));
	System.out.println("Professor's Bonus: " + prof.getBonus(salary, yearsTaught));
	
	
	//implementing object output stream to write object into student.ser file. This is all inside try block with catch block afterwards to catch IO Exception
	try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
	    oos.writeObject(stu);
	    
	    System.out.println(stu.toString());
	} catch (IOException e) {
	    System.out.println(e.getMessage());
	}

	//implementing object input stream to read object into student.ser file. This is all inside try block with catch block afterwards to catch IO Exception and class not found exception
	try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"))) {
	    Student inputStu = (Student) ois.readObject();
	    System.out.println(inputStu.toString());
	} catch (IOException | ClassNotFoundException e) {
	    System.out.println(e.getMessage());
	}
	input.close(); // closing scanner
	
	//if the user enters the professor as both full time and part time, then it throws the fulltimePartTimeStatusException.
	if (fullTime == partTime) {
		throw new fulltimePartTimeStatusException("The professor cannot be both part time and full time");
	}

//this catches the fulltimePartTimeStatusException
} catch (fulltimePartTimeStatusException e) {
	System.out.println("fulltimePartTimeStatusException has been caught" + e.getMessage()); //this prints the exception message to the user.

//this catches any other exception that could be thrown.
} catch (Exception e) {
	System.out.println(e.getMessage()); //this prints the exception message to the user.
}
}

}
