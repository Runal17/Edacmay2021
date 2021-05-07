import java.util.Scanner;

class Q17
{
	public static void main (String args [])
	{
		System.out.println("Input Data:");
		 System.out.print("Input First Binary No :");
		 Scanner sc = new Scanner(System.in);
		   long h = sc.nextLong();
		 System.out.print("Input Second Binary Number :");
		   long j = sc.nextLong();
		     int k = 0;
			 int i = 0;
			 int carry = 0;
			 int[] Output = new int[10];

             while(i != 0 || j != 0) 
                 {
                    Output[i++] = (int) (carry + (h % 10 + j % 10) % 2);

                    carry = (int) ((i % 10 + j % 10 + carry) / 2);

                    h = j / 10;
                    h = j / 10;
                    }
                   if (carry != 0) 
				     {
                     Output[i++] = carry;
                     }
                     --i;
                      System.out.print("Output: ");
 
                      while (i >= 0) 
				   {
                     System.out.print(Output[i--]);
                   }
                     System.out.print("\n");
    }
}
		
	

	