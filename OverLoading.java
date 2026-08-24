class OverLoading
{
	public static void main(String[] args)
	{
		System.out.println("******METHOD OVERLOADING*******");
		add(3);
		add(3,4);
		add("kaise","ho");
		add("Ben",10);
		add("B",4,"U");
	}
	
	public static int add(int a)
	{
		System.out.println("a: "+a);
		return a;
	}
	
	public static int add(int a, int b)
	{
		System.out.println("Sum of two numbers: "+(a+b));
		return a+b;
	}
	
	public static String add(String a, String b)
	{
		System.out.println("Concatenation: "+(a+b));
		return a+b;
	}
	
	public static void add(String a, int b)
	{
		System.out.println(a+b);
	}
	
	public static void add(String a, int c, String b )
	{
		System.out.println(a+c+b);
	}
}