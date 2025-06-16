import java.io.*;
import java.util.Scanner;

 public class Lab5 {
 public static void main (String [] args) throws IOException{

 //variable
 String deptName, barcode, str, monthName;
 int deptNumber, month, year, day, partNumber, reciept;
 float discountPercent;
 double taxPercent, discAmount, price, taxAmount, total;
 char input;
 boolean card, tax;

 //file Input Objects
 File myFile = new File("src/barcode.txt");
 Scanner inFile = new Scanner(myFile);

 Scanner kb = new Scanner(System.in);
 
 PrintWriter outFile = new PrintWriter("src/receipt.txt");

 //Infile input
 barcode = inFile.nextLine();
 str = barcode.substring(0,4);
 deptNumber = Integer.parseInt(str);
 str = barcode.substring(4,6);
 month = Integer.parseInt(str);
 str = barcode.substring(6,8);
 day = Integer.parseInt(str);
 str = barcode.substring(8,10);
 year = Integer.parseInt(str);
 year = 2000 + year;
 str = barcode.substring(10,16);
 partNumber = Integer.parseInt(str);
 str = barcode.substring(16,20);
 price = Float.parseFloat(str);
 price = price/100;

 System.out.println(price);

 deptName = "";
 monthName = "";

 if (deptNumber >= 1000 && deptNumber <= 1999)
 {
 deptName = "Clothing";
 }
 else if (deptNumber >= 2000 && deptNumber <= 2999)
 {
 deptName = "Hardware";
 }
 else if (deptNumber >= 3000 && deptNumber <= 3999)
 {
 deptName = "Toys";
 }
 else if (deptNumber >= 4000 && deptNumber <= 4999)


 {
 deptName = "Food";


 }
 else if (deptNumber >= 5000 && deptNumber <= 5999)
 {
 deptName = "Sporting Goods";
 }
 else if (deptNumber >= 6000 && deptNumber <= 9999)
 {
 deptName = "Misc";
 }

 switch(month) {
 case 1: monthName = "January";
 break;
 case 2: monthName = "February";
 break;
 case 3: monthName = "March";
 break;
 case 4: monthName = "April";
 break;
 case 5: monthName = "May";
 break;
 case 6: monthName = "June";
 break;
 case 7: monthName = "July";
 break;
 case 8: monthName = "August";
 break;
 case 9: monthName = "September";
 break;
 case 10: monthName = "October";
 break;
 case 11: monthName = "November";
 break;
 case 12: monthName = "December";
 break;
  }
 
 
  //Discount Card
  System.out.println("Do you have a discount card? YES/NO");
  str = kb.nextLine();
  str = str.toUpperCase();
  input = str.charAt(0);
 
  if (input =='Y')
  {
  card = true;
 
  }
  else
  {
  card = false;
 
 

 }


  //Tax
 
 
  if (deptName == "Clothing" || deptName == "Food")
  {
  tax = false;
  }
  else
  {
  tax = true;
  }
 
  //Calculation
  discAmount = 0;
  discountPercent = 0.0f;
  taxPercent = 0;
  taxAmount = 0;
 
  if (card)
  {
  discountPercent = 0.15f;
  discAmount = price * discountPercent;
  }
 
  if (tax)
  {
  taxPercent = 0.06625;
  taxAmount = (price - discAmount) * taxPercent;
  }
  
total = price - discAmount + taxAmount;

  //Output
  System.out.println("How do you want the reciept? Enter 1 for screen, 2 for data file and 3 for both: ");
  reciept = kb.nextInt();
 
  if (reciept==1 || reciept ==3)
  {
  System.out.printf("%-15s%15s%3d,%5d\n", "ACME STORE", monthName, day, year);
  System.out.printf("%-8s%11s\n", deptName.toUpperCase(), "DEPARTMENT");
  System.out.printf("%-4s%2s%7d\n", "Item", "#", partNumber);
  System.out.printf("%-14s%12s\n", "Price", String.format("$ %.2f", price));
  System.out.printf("%-10s%2.0f%2s%12s\n", "Discount (", discountPercent * 100, "%)", String.format("$ %.2f", discAmount));
 System.out.printf("%-5s%2.3f%2s%14s\n", "Tax (", taxPercent * 100, "%)", String.format("$  %.2f", taxAmount));
 System.out.printf("%-14s%12s\n", "Total", String.format("$ %.2f", total));
  }
 
  if (reciept==2 || reciept==3)
  {
  outFile.printf("%-15s%15s%3d,%5d\n", "ACME STORE", monthName, day, year);
 
  outFile.printf("%-8s%11s\n", deptName.toUpperCase(), "DEPARTMENT");
  outFile.printf("%-4s%2s%7d\n", "Item", "#", partNumber);
  outFile.printf("%-14s%12s\n", "Price", String.format("$ %.2f", price));
  outFile.printf("%-10s%2.0f%2s%12s\n", "Discount (", discountPercent * 100, "%)", String.format("$ %.2f", discAmount));
  outFile.printf("%-5s%2.3f%2s%14s\n", "Tax (", taxPercent * 100, "%)", String.format("$  %.2f", taxAmount));
  outFile.printf("%-14s%12s\n", "Total", String.format("$ %.2f", total));
  }
 
  


 kb.close();
 inFile.close();
 outFile.close();
 }
 }
 
/* Output
 Do you have a discount card? YES/NO
 y
 How do you want the reciept? Enter 1 for screen, 2 for data file and 3 for both: 
 3
 ACME STORE            February 28, 2024
 HARDWARE DEPARTMENT
 Item # 999999
 Price              $ 31.50
 Discount (15%)      $ 4.73
 Tax (6.625%)       $  1.77
 Total              $ 28.55
*/