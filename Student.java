
public class Student {
	
 private String name;
 private int age;
 private double gpa;
 
 public Student() {
	 
 }

 public Student(String name, int age, double gpa) {
	 this.name = name;
	 this.age = age;
	 this.gpa = gpa;
 }
 
 public String getName() {
	 return name;
 }
 
 public int getAge() {
	return age; 
 }
 
 public double getGpa() {
	 return gpa;
 }
 
 public void setName(String name) {
	 this.name = name;
 }
 
 public void setAge(int age) {
	 this.age = age;
 }
 
 public void setGpa(double gpa) {
	 this.gpa = gpa;
 }
 
 public String toString() {
	 return "Name" + name + "\nAge" + age + "\nGPA" + gpa;
 }
}
