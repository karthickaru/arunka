package pro;
import java.io.*;
public class primerange 
{
  public static void main(String args[]) throws Exception
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int M, N, i, j, flag, temp, count = 0;
   
    System.out.print("\nEnter the value of M and N:\n");
    M = Integer.parseInt(br.readLine());
    N = Integer.parseInt(br.readLine());
   
    if(N < 2)
    {
      System.out.print("\nThere are no primes upto\n"+N);
    }

    System.out.print("\nPrime numbers are:");
    temp = M;
   
    if ( M % 2 == 0)
    {
      M++;
    }
    
    for (i=M; i<=N; i=i+2)
    {
      flag = 0;
   
      for (j=2; j<=i/2; j++)
      {
        if( (i%j) == 0)
        {
          flag = 1;
          break;
        }
      }
     
      if(flag == 0)
      {
          System.out.print("\n"+i);
          count++;
      }
    }
   System.out.println();
  }
}
