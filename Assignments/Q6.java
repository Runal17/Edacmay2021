import java.util.Scanner;

class Q6
{
	public static void main(String args[])
	{
	{
		System.out.println("Test Data :");
	}	
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Input first number :");
		int i = ip.nextInt();
		
		System.out.print("Input Second number :");
		int j = ip.nextInt();		
		System.out.println("Expected output :");
		int ans = i+j;
		int ans1= i-j;
		int ans2= i*j;
		int ans3= i/j;
		int ans4= i%j;
		
		System.out.println (i+" + "+j+" = "+ans);		
		System.out.println (i+" - "+j+" = "+ans1);		
		System.out.println (i+" X "+j+" = "+ans2);		
		System.out.println (i+" / "+j+" = "+ans3);	
		System.out.println (i+" % "+j+" = "+ans4);		
	}
}