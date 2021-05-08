class Pattern09
{	
	public static void main(String args[])
	{
		
		int i;
		int j;
		int k;
		int a = 64;
		{
		for(i=1;i<=5;i++) //for rowws
		{
		    for(j=4;j>=i;j--)// for colums
		              {	
                        System.out.print(" ");		 
                      }
					  {
					  for(k=1;k<=i;k++)
					  {
                        System.out.print((char)(a + k) + " ");		 
					  }
					  System.out.println();
					  }
		}
	    }

	}
}