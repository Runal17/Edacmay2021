class Pattern18
{	
	public static void main(String args[])
	{
		int a =64;
		int k = 0;
		{
		for(int i=1;i<=5;i++)
		{
		    for(int j=5;j>=i;j--)
		              {	
				        k++;
                        System.out.print((char)(a+k)+" ");		 
                      }
					    k=0;
						System.out.println();
			
		}
	    }
	}
}