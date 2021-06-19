ort java.util.*;

class Array2{

public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	int a[][]=new int[2][2];
	int b[][]=new int[2][2];
	int c[][]=new int[2][2];
	
	//Input A Matrix
	System.out.println("M1");
	for(int i=0;i<2;i++)//Row
	{
		for(int j=0;j<2;j++)//Cols
		{
			a[i][j]= sc.nextInt();
		}
		System.out.println();
	}
	
	//Input B Matrix
	System.out.println("M2");
	for(int i=0;i<2;i++)//Row
	{
		for(int j=0;j<2;j++)//Cols
		{
			b[i][j]= sc.nextInt();
		}
		System.out.println();
	}
	
	//Addition:
	System.out.println("M3");
	for(int i=0;i<2;i++)//Row
	{
		for(int j=0;j<2;j++)//Cols
		{
			c[i][j]=a[i][j]+b[i][j];
			//System.out.print(c[i][j]+" ");
		}
		//System.out.println();
	}
	
	
	//Printing 2D array: Method 2
	
	for(int i=0;i<2;i++)//Row
	{
		for(int j=0;j<2;j++)//Cols
		{
			
			System.out.print(c[i][j]+" ");
		}
		System.out.println();
	}
	
	
}
}
