package pro;
import java.util.Scanner;

public class sum
{
	 public static void main(String[] args)
  	{
		             Scanner s = new Scanner(System.in);
		             System.out.println("Enter the value:");
		   	  	
		              double a = s.nextDouble();
		            for(int n=0;n<200000;n++)
		            {
		              double b=Math.pow(10, n);

		              double d=a/b; 
		             if(d>=0 & d<=9)
		             {
		                 System.out.println("The number has "+(n+1)+" DIGITS");
		                 break;
		             }
		            }

		     }	 
	}
