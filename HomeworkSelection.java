import java.util.Scanner;

public class HomeworkSelection {
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		//Question 1: 
			int temperature;
	        
	       	System.out.print("Enter the current temperature: ");
	        temperature = kb.nextInt();

	     
	        System.out.println("You can do the following activities:");

	        if (temperature > 80) 
	        {
	            System.out.println("Swimming");
	        }

	        if (temperature > 20 && temperature < 80) 
	        {
	            System.out.println("Running");
	        }

	        if (temperature > 40 && temperature < 100) 
	        {
	            System.out.println("Tennis");
	        }

	        if (temperature > 40) 
	        {
	            System.out.println("Soccer");
	        }

	        if (temperature < 30) 
	        {
	            System.out.println("Skiing");
	        }

	        if (temperature < 70) 
	        {
	            System.out.println("Football");
	        }

	        if (temperature > 40 && temperature < 100)
	        {
	            System.out.println("Baseball");
	        }

	        System.out.println("Volleyball (inside) - Can be played anytime");
	        
	        if (temperature > 60) 
	        {
	            System.out.println("Volleyball (outside)");
	        }
	
	        
	    //Question 2:
	        	            
	            int month, day, year;
	            
	                System.out.println("Enter the month (1-12): ");
	                 month = kb.nextInt();
	                
	                System.out.print("Enter the day (1-31): ");
	                 day = kb.nextInt();
	                
	                System.out.print("Enter the year: ");
	                 year = kb.nextInt();
	                
	                if (isValidDate(month, day, year))
	                {
	                    System.out.println("The date is valid.");
	                } 
	                else 
	                {
	                    System.out.println("The date is invalid.");
	                }
	             
	     //Question 3
	                
	                double sale, discountAmt, discountPercent, discount;
	                boolean hasDiscountCard;
	                
	                	
	                System.out.println("Enter the sale amount: ");
	                sale = kb.nextDouble(); 
	                System.out.println("Do you have a discount card? Enter true or false: ");
	                hasDiscountCard = kb.nextBoolean(); 
	                discountPercent = calculateDiscount(sale, hasDiscountCard);
	                System.out.println("Discount Percent: " + discountPercent + "%");
	                discountAmt = (discountPercent/100) * sale;
	                System.out.println("Discount Amount: $" + discountAmt);
	                discount = sale - discountAmt;
	                System.out.println("Total Amount after Discount: $" + discount);	

	                
	      //Question 4
	                
	                int dayOfTheWeek;
	                System.out.println("Enter the day#: ");
	                dayOfTheWeek = kb.nextInt(); 
	                System.out.println("Day Name: " + getDayName(day));
	                System.out.println("Day Type: " + getDayType(day));
	                
	     //Question 5
	               float mass;
	               String size;
	               
	               System.out.println("Enter mass in grams: ");
	               mass = kb.nextFloat();
	               size = getEggSize(mass);
	               System.out.println("Egg size = " + size);
	        
	        kb.close();
	    }
	
	public static boolean isValidDate(int m, int d, int y) 
    {
       
        if (m < 1 || m > 12) 
        {
            return false;
        }
     
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
     
        if (d < 1 || d > daysInMonth[m - 1]) 
        {
            return false;
        }
        
        return true;
    }

	public static double calculateDiscount(double sale, boolean hasDiscountCard) 
	{
    	if (hasDiscountCard) 
    	{ 
    		if (sale <= 100) 
    		{
    				return 5.0;
    		} 
    		else if (sale <= 1000) 
    		{
    			return 10.0;
    		} 
    		else 
    		{
    			return 15.0;
    		}
    	} 
    	
    	else 
    	{ 
    		if (sale <= 100)
    		{
    			return 0.0;
    		} 
    		else if (sale <= 1000) 
    		{
    			return 5.0;
    		}
    		else 
    		{
    			return 10.0;
    		}
    	}

	}
	
	public static String getDayName(int day) 
	{
		switch (day) 
		{
		case 1: return "Monday";
		case 2: return "Tuesday";
		case 3: return "Wednesday";
		case 4: return "Thursday";
		case 5: return "Friday";
		case 6: return "Saturday";
		case 7: return "Sunday";
		default: return "Invalid day";
		}
	}


		public static String getDayType(int day)
		{
			if (day >= 1 && day <= 5) 
			{
				return "Weekday";
			}
			else if (day == 6 || day == 7) 
			{
				return "Weekend";
			}
			else
			{
				return "Invalid day";
			}
		}
		
		public static String getEggSize(float mass)
		{
			if (mass > 71)
			{
				return "Jumbo";
			}
			else if (mass > 64)
			{
				return "XL";
			}
			else if (mass > 57)
			{
				return "Large";
			}
			else if (mass > 50)
			{
				return "Medium";
			}
			else if (mass > 43)
			{
				return "Small";
			}
			else if (mass > 37)
			{
				return "Peewee";
			}
			else
			{
				return "Invalid Mass";
			}
		}
	}



