import java.util.Scanner;

class Q15
{
	public static void main (String args [])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter a First No : ");
		int i = sc.nextInt();
		
		System.out.print("Enter a Second No :");
		int j = sc.nextInt();
		int k;
		
		
		 k = i;
		 i = j;
		 j = k;
		
		 System.out.println("Swaped No : "+i);
		 System.out.println("Swaped No : "+j);
		
		
	}
}