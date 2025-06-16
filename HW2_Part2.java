//Sami
//HW 2 Question 2
//Checking the validity of statements
public class HW2_Part2 {
	public static void main (String [] args) {
		
		//Variables
		int i1,i2,i3,i4,i5,i6;
		long l1;
		float f1,f2,f3,f4,f5,f6,f7;
		double d1,d2;
		
		
		//Assignments
		i1=5;
		i2=3;
		i3=8;
		f1=2.5f;
		f2=8.6f;
		
		//Calculations
		
		//A
		f4 = f1/3 + f2/2.5f;
		//INVALID: Since 2.5 was a double, we have to put 'f' next to it to convert it to double so that it could run
		
		//B
		f5 = i1/3 + i2*5;
		//VALID
		
		//C
		i4 = 3*i1 + i2/5;
		//VALID
		
		//D
		i5 = i1 + i2 + i3/4;
		//VALID
		
		//E
		i6 = (i1 + i2 + i3)%4;
		//VALID
		
		//F
		d1 = Math.pow(i1,3);
		//VALID
		
		//G
		d2 = f1*2.5 / f2 * 3.6;
		//VALID
		
		//H
		l1 = i5 + i6;
		//VALID
		
		//I
		f6 = (float) Math.pow(f1,2) + (float) Math.sqrt(f2);
		//INVALID: since math.sqrt would return double, and f6 cannot contain double, we have to convert math.sqrt to a float by typing it in right before the math.sqrt statement
		
		//J
		f7 = f2 + 1/2* f1;
		//INVALID: casting wise this was a correct statement but there were a few minor errors:- 1) 'F2' variables does not exist because no variable starts with a capital letter and 2) f3 variables wasn't initialized so we either initialize it or replace it with another variable which I did.

		
		//Output
		System.out.println("F4:" + f4);
		System.out.println("F5:" + f5);
		System.out.println("I4:" + i4);
		System.out.println("I5:" + i5);
		System.out.println("I6:" + i6);
		System.out.println("D1:" + d1);
		System.out.println("D2:" + d2);
		System.out.println("L1:" + l1);
		System.out.println("F6:" + f6);
		System.out.println("F7:" + f7);
	}
}

/*
F4:4.2733335
F5:16.0
I4:15
I5:10
I6:0
D1:125.0
D2:2.6162789537173
L1:10
F6:9.182575
F7:8.6
*/