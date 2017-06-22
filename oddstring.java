package pro;

public class oddstring 
{
	public static void main(String args[]){
	    swapPairs("hello the");
	}

	public static void swapPairs(String S){
	    int cl = S.length() - 1;
	    for(int i = 0; i < cl; i= i + 2) {
	        System.out.print(S.charAt(i + 1));
	        System.out.print(S.charAt(i));
	        if (i == cl -1 ) {
	            System.out.print(S.charAt(cl));
	        } else {
	        }
	    }
	    System.out.print("\n");
	}
}
