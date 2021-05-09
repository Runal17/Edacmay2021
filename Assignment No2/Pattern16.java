class Pattern16
{
	public static void main(String args[])
	{
		int i;
		int j;
		int k =5;
		{
			for(i=1;i<=5;i++)
			{
				for(j=1;j<=i;j++)
				{
					System.out.print(k--);	
				}
				k=5;
				System.out.println();
			}
		}
	}
}