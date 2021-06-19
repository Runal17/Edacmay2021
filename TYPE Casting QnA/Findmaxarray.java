import java.util.Scanner;

class Findmaxarray
{
    public static void main (String args [])
  {
	Scanner sc = new Scanner(System.in);
	int a[]= new int[6];
			
	for(int i=0;i<a.length;i++)
	{
	System.out.println("Enter No :");
				 
				 
	a[i]= sc.nextInt();
	}
	for(int i=0;i<a.length;i++)
	System.out.println(a[i]);
/*
	for (int x :a)
    System.out.print(x +" ");
    */
   
	int max	= a[0];
	for (int i=1;i<a.length;i++)
		if (a[i]>max)
		max =a[i]; 
	    {
	    System.out.println("Max");
		System.out.println(max);
        }
}
}