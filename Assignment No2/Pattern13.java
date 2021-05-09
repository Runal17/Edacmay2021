class Pattern13
{
	public static void main(String args[])
	{
		int i;
		int j;
		int k;
		int l = 64;
		{
			for(i=1;i<=5;i++)
			{
				for(j=4;j>=i;j--)
				{
					System.out.print(" ");
				}
				{
					for(k=0;k<=j;k++)
					{
						System.out.print((char)(i+l)+" ");
					}
				}
				System.out.println();
			}
		}
	}
	
}