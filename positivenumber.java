package pro;
import java.util.Scanner;
public class num {
	

	    public static void main (String[] args) 
	    {
          int number;
	    	Scanner s= new Scanner(System.in);
	  	  System.out.println("Enter the value:");
	  	  number=s.nextInt();
	    	
	        if (number > 0) 
	        {
	            System.out.println(number + " is a positive number");
	        }
	        else if (number < 0) 
	        {
	            System.out.println(number + " is a negative number");
	        } 
	        else
	        {
	            System.out.println(number + " is neither positive nor negative");
	        }
	    }
	}
