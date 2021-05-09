class Pattern12
{
	public static void main(String args[])
	{
		int i;
		int j;
		int k;
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
						System.out.print(i+" ");
					}
				}
				System.out.println();
			}
		}
	}
	
}