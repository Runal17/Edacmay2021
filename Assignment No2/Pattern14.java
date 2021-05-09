class Pattern14
{
	public static void main(String args[])
	{
		int i;
		int j;
		int k =0;
		{
			for(i=1;i<=5;i++)
			{
				for(j=5;j>=i;j--)
				{
					k++;
					System.out.print(k);	
				}
				k=0;
				System.out.println();
			}
		}
	}
}