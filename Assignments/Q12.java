import java.util.Scanner;

class Q12
{
	public static void main (String args [])
	{
	    Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a First No :");
	      int i = sc.nextInt();
		
		System.out.print("Enter a Second No :");
		  int j = sc.nextInt();
		
		System.out.print("Enter a Third No :");
		  int k = sc.nextInt();
					
				int avg= (i+j+k)/3;
				
				System.out.println();
				System.out.println("Avarage is = "+avg);
			
	}
		
	
}