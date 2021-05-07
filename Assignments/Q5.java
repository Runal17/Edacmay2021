import java.util.Scanner;

class Q5
{
	public static void main (String args[])
	{
	{
		System.out.println("Test Data :");
	}	
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Input first number :");
		int i = ip.nextInt();
		
		System.out.print("Input Second number :");
		int j = ip.nextInt();
		int ans = i*j;
		
		System.out.println("Expected output :");
		System.out.println (i+"X"+j+"="+ans);		
	}
}