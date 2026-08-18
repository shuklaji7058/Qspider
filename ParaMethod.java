class ParaMethod
{
	static int a = 70;//global static  variable
	public static void main(String [] args)
	{
		System.out.println("main start");
		System.out.println(a); //global static method
		m1(20,"hello",40.23);
		
				m1(a+a,"shiva",a);//70

		System.out.println(m2(4,6));//10
		int a = m2(4,6);
		System.out.println(a);//10
						m1(a+a,"shiva",a);//70

		System.out.println(m3(2.3,2.5));//5.75
		System.out.println(m4("babu",56));//babu56
		System.out.println(m5(34,"Anish"));//n:Anish //44
		
		int marks = 45;
		System.out.println(m7(marks));
		System.out.println("main end");
	}
	
	public static void m1(int a, String b, double c)
	{
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("c: "+c);
	}
	
	public static int m2(int a, int b)
	{
		return a+b;
	}
	
	public static double m3(double a, double b)
	{
		return a*b;
	}
	
	public static String m4(String x, int y)
	{
		return x+y;
	}
	
	public static int m5(int m, String n)
	{
		System.out.println("n: " +n);
		return m+10;
	}
	
	public static boolean m6(int marks)
	{
		if(marks>=35)
			return true;
		else
			return false;
	}
	
	public static String m7(int marks2)
	{
		if(m6(marks2))
			return "pass";
		else
			return "fail";
	}
}