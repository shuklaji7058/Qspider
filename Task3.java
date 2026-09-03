class Task3
{
	public static void main(String[] args)
	{
		TypeInteger();
		TypeDouble();
		System.out.println(narrow(23.56));
		System.out.println(wide	(23));

	}
	
	public static void TypeInteger()
	{
		int m = 10;
		double b = m;
		System.out.println(b);
	}

	public static void TypeDouble()
	{
		double d = 23.23;
		int c = (int)d;
		System.out.println(c);
	}
	
	public static int narrow(double n)
	{
		return (int)n;
	}
	
	public static double wide(int k)
	{
		return k;
	}
}