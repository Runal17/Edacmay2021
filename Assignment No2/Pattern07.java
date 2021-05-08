class Pattern07
{
     public static void main(String args[])
        {
         for(int i=1;i<=5;i++)
          {
            for(int j=5;j>=i;j--)
           {
	          System.out.print(" ");
           }
           for(int k=1;k<=5;k++)
           { 
             if(k>i)
	           System.out.print(" ");
           else
	         System.out.print(k+" ");
           }
             System.out.println();
          }
        }
}