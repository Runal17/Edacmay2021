class Qn6
{
	public static void main(String args[])
	{
		int i = 44;
		float f = 98.42F;
		double d = 103.67;
		
		f = (float)i;
		d = (double)f;
		i = (int) d;
			
				System.out.println("i = " + i);
				System.out.println("f = " + f);
				System.out.println("d = " + d);

	}
}

//i = 44
//f = 44.0
//d = 44.0