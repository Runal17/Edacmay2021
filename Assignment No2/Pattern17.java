class Pattern17
{
	public static void main(String args[])
	{
		int i;
		int j;
		int k =1;
		{
			for(i=1;i<=5;i++)
			{
				for(j=1;j<=i;j++)
				{
					System.out.print((k++)+" ");	
				}
				System.out.println();
			}
		}
	}
}