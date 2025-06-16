import java.io.*; 
import java.util.Scanner; 
public class HomeWorkFileIOPart1 {     
	public static void main (String[] args) throws IOException{         
//Variables         
		float room1_length;         
		float room2_length;         
		float room1_width;         
		float room2_width;         
		float room1_price;         
		float room2_price;         
		float room1_cost;         
		float room2_cost;         
		float total;                           
		
		// file statements     
		File myFile = new File("src/carpet.txt");         
		Scanner inFile = new Scanner(myFile);         
		Scanner kb = new Scanner (System.in);         
		
		// outFile Statement         
		PrintWriter outFile = new PrintWriter("src/invoice.txt") ;                   
		
		// Input         
		inFile.next();         
		inFile.next();         
		inFile.next();         
		room1_length = inFile.nextFloat();          
		room1_width=inFile.nextFloat();          
		room1_price=inFile.nextFloat();          
		room2_length=inFile.nextFloat();          
		room2_width=inFile.nextFloat();          
		room2_price=inFile.nextFloat();                                         
		
		// Calculation          
		room1_cost = room1_price * room1_length * room1_width;          
		room2_cost = room2_price * room2_length * room2_width;          
		total = room1_cost + room2_cost;                    
		
		// Output                   
		System.out.println("*********************************************************************************************************");          
		System.out.printf("%37s%15s\n", "Room 1", "Room 2");          
		System.out.println("---------------------------------------------------------------------------------------------------------");          
		System.out.printf("Length (ft)%25.2f%15.2f\n", room1_length, room2_length);          
		System.out.printf("Width (ft)%26.2f%15.2f\n", room1_width, room2_width);          
		System.out.printf("Price ($/sqft)%22.2f%15.2f\n", room1_price, room2_price);          
		System.out.println("---------------------------------------------------------------------------------------------------------");         
		System.out.printf("Cost ($)%28.2f%15.2f\n", room1_cost, room2_cost);          
		System.out.println("---------------------------------------------------------------------------------------------------------");      
		System.out.printf("Total ($)%42.2f\n", total);          
		System.out.println("*********************************************************************************************************");          
		
		// outFile          
		outFile.println("*********************************************************************************************************");          
		outFile.printf("%37s%15s\n", "Room 1", "Room 2");          
		outFile.println("---------------------------------------------------------------------------------------------------------");          
		outFile.printf("Length (ft)%25.2f%15.2f\n", room1_length, room2_length);          
		outFile.printf("Width (ft)%26.2f%15.2f\n", room1_width, room2_width);          
		outFile.printf("Price ($/sqft)%22.2f%15.2f\n", room1_price, room2_price);          
		outFile.println("---------------------------------------------------------------------------------------------------------");         
		outFile.printf("Cost ($)%28.2f%15.2f\n", room1_cost, room2_cost);          
		outFile.println("---------------------------------------------------------------------------------------------------------");      
		outFile.printf("Total ($)%42.2f\n", total);          
		outFile.println("*********************************************************************************************************");          
		
		// Close file                         
		kb.close();             
		inFile.close();            
		outFile.close();                               
		

	}
}

/*
*********************************************************************************************************
                               Room 1         Room 2
---------------------------------------------------------------------------------------------------------
Length (ft)                    10.20          12.50
Width (ft)                     12.25          13.00
Price ($/sqft)                 15.65          10.25
---------------------------------------------------------------------------------------------------------
Cost ($)                     1955.47        1665.63
---------------------------------------------------------------------------------------------------------
Total ($)                                   3621.09
*********************************************************************************************************

*/