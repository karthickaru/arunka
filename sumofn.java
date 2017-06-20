package pro;
import java.util.*;
public class sumn
  {
	 public static void main(String[]args)
	 {
	   Scanner input=new Scanner(System.in);
	   System.out.print("Enter value of n: ");
	   int n=input.nextInt();
	   long sum=0;
	   for(int i=1;i<=n;i++)
	   {
	     sum+=i;
	    }
	     System.out.println("Sum of Numbers from 1 to "+n+" : "+sum);
      }
	}
