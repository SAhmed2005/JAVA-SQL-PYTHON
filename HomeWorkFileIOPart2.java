import java.io.*; 
import java.util.Scanner; 
public class HomeWorkFileIOPart2 {     
	public static void main (String[] args) throws IOException{         
//Variables         
		String student1, student2, str;         
		int student1Exam1, student1Exam2, student1Exam3;
		int student2Exam1, student2Exam2, student2Exam3;
		float student1Avg, student2Avg;
		char student1Grade; 
		char student2Grade;
		float student1GPA, student2GPA;    
		
		// file statements     
		File myFile = new File("src/student.txt");         
		Scanner inFile = new Scanner(myFile);         
		Scanner kb = new Scanner (System.in);         
		
		// outFile Statement         
		PrintWriter outFile = new PrintWriter("src/StudentReport.txt") ;                   
		
		// Input         
		student1 = inFile.nextLine();         
		student1Exam1 = inFile.nextInt();
		student1Exam2 = inFile.nextInt();
		student1Exam3 = inFile.nextInt(); 
		str = inFile.next();
		student1Grade = str.charAt(0);
		student1GPA = inFile.nextFloat();
		inFile.nextLine();
		student2 = inFile.nextLine();    
		student2Exam1 = inFile.nextInt();
		student2Exam2 = inFile.nextInt();
		student2Exam3 = inFile.nextInt();      
		str = inFile.next();
		student2Grade = str.charAt(0);
		student2GPA = inFile.nextFloat();  
		
		// Calculation          
		student1Avg = (student1Exam1 + student1Exam2 + student1Exam3)/ 3f;
		student2Avg = (student2Exam1 + student2Exam2 + student2Exam3)/ 3f;
		
		// Output   
		
		System.out.println("*****************************************************************************************");          
		System.out.printf("%8s%25s%8s%6s%4s%8s%7s\n", "Name", "Exams", "|", "Avg", "|", "Grade", "GPA");          
		System.out.println("-----------------------------------------------------------------------------------------");          
		System.out.printf("%-11s%12d%8d%8d%2s%8.1f%2s%6s%10.2f\n", student1, student1Exam1, student1Exam2, student1Exam3, "|", student1Avg, "|", student1Grade, student1GPA);
		System.out.printf("%-11s%12d%8d%8d%2s%8.1f%2s%6s%10.2f\n", student2, student2Exam1, student2Exam2, student2Exam3, "|", student2Avg, "|", student2Grade, student2GPA);
  		System.out.println("*****************************************************************************************");          
		
		// outFile          
  		outFile.println("*****************************************************************************************");          
  		outFile.printf("%8s%25s%8s%6s%4s%8s%7s\n", "Name", "Exams", "|", "Avg", "|", "Grade", "GPA");          
  		outFile.println("-----------------------------------------------------------------------------------------");          
  		outFile.printf("%-11s%12d%8d%8d%2s%8.1f%2s%6s%10.2f\n", student1, student1Exam1, student1Exam2, student1Exam3, "|", student1Avg, "|", student1Grade, student1GPA);
  		outFile.printf("%-11s%12d%8d%8d%2s%8.1f%2s%6s%10.2f\n", student2, student2Exam1, student2Exam2, student2Exam3, "|", student2Avg, "|", student2Grade, student2GPA);
  		outFile.println("*****************************************************************************************");          
		
		
		// Close file                         
		kb.close();             
		inFile.close();            
		outFile.close();                               
		

	}
}

/*
*****************************************************************************************
    Name                    Exams       |   Avg   |   Grade    GPA
-----------------------------------------------------------------------------------------
Joe Smith            85      86      87 |    86.0 |     B      3.56
Betty Jones          95      96      89 |    93.3 |     A      3.75
*****************************************************************************************

*/