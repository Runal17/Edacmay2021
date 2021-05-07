import java.util.Scanner;
class Q7
{
	public static void main (String args [])
	{ 
		System.out.println("Test Data :");
				System.out.print("Input a number :");
				
				Scanner sc = new Scanner(System.in);
				int i = sc.nextInt();
				System.out.println("Expected Output :");
				for(int j=1;j<=10;j++)
				{
						int ans = i*j;
						
						System.out.println(i+" X "+j+" = "+ans);
						
				}
				
	}
}