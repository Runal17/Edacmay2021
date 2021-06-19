class c1
{
	int length;
	int breadth;
	
	void getdata(int x, int y)//to take input values
	{
		length=x;
		breadth=y;
	}
	int area()
	{
		int area = length*breadth;
		return area;
	}
	void display()
	{
		System.out.println("Area of Rectangle:");
	}
	
	
	public static void main(String args[])
	{
		c1 obj = new c1();
		
		obj.display();//call for method
		obj.getdata(10,20);
		
		System.out.println("Area= "+obj.area());
		
		
		//Method 1:
		/*obj.length=10;
		obj.breadth=20;
		int area = obj.length*obj.breadth;
		System.out.println(obj.length);
		System.out.println(obj.breadth);
		System.out.println(area);
		*/
		

		
	}
	
}
