class Qn1
{
	public static void main(String args[])
	{
		byte x;
		int a=270;
		double b=128.128;
		x =(byte) a;
				System.out.println("a and x "+ a + " "+ x);
				
		a =(int) b;
				System.out.println( "b and a " + b +" "+ a);
				
		x = (byte)b;
				System.out.println("b and x " + b +" " + x);
	}
}
//a and x 270 14
//b and a 128.128 128
//b and x 128.128 -128