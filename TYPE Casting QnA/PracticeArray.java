import java.util.Scanner;

class Practicearray
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
   
	int min= a[0];
	for (int i=1;i<a.length;i++)
		if (a[i]<min)
		min =a[i]; 
	    {
	    System.out.println("Min");
		System.out.println(min);
        }
}
}