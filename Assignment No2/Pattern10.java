
class Pattern10
{
     public static void main(String args[])
        {
			int a = 64;
         for(int i=5;i>=1;i--)
          {
            for(int j=i-1;j>=1;j--)
           {
	          System.out.print(" ");
           }
           for(int k=i;k<=5;k++)
           { 
             System.out.print((char)(a + k) + " ");		            
			 }
             System.out.println();
          }
        }
}
                       // System.out.print((char)(a + k) + " ");		 
