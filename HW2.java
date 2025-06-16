//Sami
//HW 2
//Practicing inputs and making corrections
import java.util.Scanner;
public class HW2 {
	public static void main (String [] args) {
		//Variables
		
		int firstXCoordinate,
		secondXCoordinate,
		firstYCoordinate,
		secondYCoordinate;
		double distance;
		
		Scanner kb = new Scanner(System.in);
		
		//Assignment
		System.out.println("Enter the coordinates of the first point, x1 and y1: ");
		firstXCoordinate = kb.nextInt();
		firstYCoordinate = kb.nextInt();
		
		System.out.println("Enter the coordinates of the second point, x2 and y2: ");
		secondXCoordinate = kb.nextInt();
		secondYCoordinate = kb.nextInt();
		
		//Calculations
		distance = Math.sqrt((Math.pow(secondXCoordinate - firstXCoordinate, 2)) + (Math.pow(secondYCoordinate - firstYCoordinate, 2)));
		
		//Output
		System.out.println("X1: " + firstXCoordinate);
		System.out.println("X2: " + secondXCoordinate);
		System.out.println("Y1: " + firstYCoordinate);
		System.out.println("Y2: " + secondYCoordinate);
		System.out.println("Distance: " + distance);
		
		kb.close();
		
	}
}
/*
Enter the coordinates of the first point, x1 and y1: 
2
4
Enter the coordinates of the second point, x2 and y2: 
3
6
X1: 2
X2: 3
Y1: 4
Y2: 6
Distance: 2.23606797749979
*/
