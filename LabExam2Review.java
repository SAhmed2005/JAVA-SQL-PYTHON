import java.io.*; 
import java.util.Scanner; 

public class LabExam2Review {
	public static void main (String[] args) throws IOException{         

		//Variables
			int id, salesPerson; 
			String state, str, str1;
			float sales, total, largest;
		
		// file statements     
				File myFile = new File("src/StateSales.txt");         
				Scanner inFile = new Scanner(myFile);         
				Scanner kb = new Scanner (System.in);         
				
		// outFile Statement         
		//PrintWriter outFile = new PrintWriter("src/SalesReport.txt") ;                   
		
		//Input
		System.out.println("Enter ID #:");
		id = kb.nextInt();
		
		largest = 0;
		total = 0;
		System.out.println("************************************************************");
		System.out.printf("%7s%20s%17s\n", "State", "Salesman", "Sales");
		System.out.println("************************************************************\n");
		
		while(inFile.hasNext())
		{
			str = inFile.nextLine();
			state = str.trim();
			str = inFile.nextLine();
			str1 = str.substring(0,2).trim();
			salesPerson = Integer.parseInt(str1);
			str1 = str.substring(15,25).trim();
			sales = Float.parseFloat(str1);
			
			if (salesPerson == id)
			{
				System.out.printf("%-13s%10d%23.2f\n", state, salesPerson, sales);
				
				total += sales;
			}
			
		}
		System.out.println("************************************************************");
		System.out.printf("%25s%21.2f", "Total", total);	
				
	
		// outFile          
  		//outFile.println("*****************************************************************************************");          
  		//outFile.printf("%8s%25s%8s%6s%4s%8s%7s\n", "Name", "Exams", "|", "Avg", "|", "Grade", "GPA");          
		
		
		// Close file                         
				kb.close();             
				inFile.close();      
				
				
	/*switch
	 * int choice
	 * switch (choice)
	 * {
	 * case 1: ""
	 * break;
	 * }
	 * 
	 * for loop
	 * for (count=0, count<=25, count++)
	 * 
	 *  outFile.printf("%-14s%12s\n", "Discount (12%)", String.format("$ %.2f", discAmount));
	 */
					
	}
}