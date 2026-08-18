class Method4
{
	public static void main()
	{
		System.out.println("Welcome");
		v1();
		System.out.println(v2(3,50));//150 //53
		System.out.println(v3(3,"Ritu"));//3Ritu
		int age = 20;
		System.out.println(license2(age));//eligible
		System.out.println("Thank You");
	}
	
	public static void v1()
	{
		System.out.println("This is v1 method");
		v4();
	}
	
	public static int v2(int a, int b)
	{
		System.out.println(a*b);
		return (a + b);
	}
	
	public static String v3(int a, String b)
	{
		return a+b;
	}	
	
	public static boolean license(int age)
	{
		if(age>=18)
			return true;
		else
			return false;
	}
	
	public static String license2(int age2)
	{
		if(license(age2))
			return "eligible";
		else
			return "not eligible";
	}
	
	public static void v4()
	{
		System.out.println("calling in v1");
	}
}