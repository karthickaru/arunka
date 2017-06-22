package pro;
import java.util.Scanner;
public class strint 
{
	
		public static void main(String[] args) 
		{
			System.out.println("Enter the dimensions of a rectangle");
			System.out.print("L:");
			Scanner s = new Scanner(System.in);
			try
			{
			
				Integer length = Integer.parseInt(s.nextLine());
				System.out.print("W:");
				s = new Scanner(System.in);
				Integer width = Integer.parseInt(s.nextLine());
				
				System.out.println("Area of rectangle:"+width*length);
			}
			catch(NumberFormatException ne)
			{
				System.out.println("Invalid Input");
			}
			finally
			{
				s.close();
			}

		}

	}


