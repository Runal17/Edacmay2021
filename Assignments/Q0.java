import java.util.*;

class Q20
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a decimal number:");
		int inp = sc.nextInt();//5
		int rem;
		int i=1;
		int binary = 0;
		while(inp!=0){ 
			
			rem = inp%16; 
			inp = inp/16; 
			binary = binary + rem * i; 
			i*=10;	
		}
		System.out.println(binary);
		
	}
}
