class Method2//NoArg
{
	public static void main(String args[])
	{
		System.out.println("main method start");
		m1();//METHOD CALL STATEMENT
		System.out.println(m2());//DIRECTLY PRINT VALUE RETURNED
		
		int a = m2();//STORE VALUE RETURNED IN A APPROPRIATE VARIABLE
		System.out.println("a :"+ a);
		
		System.out.println(m3());	
		System.out.println(m4());
		String str = m4();
		System.out.println(str + a);
		System.out.println(m5() + "hello");
		System.out.println(true + "hello");
		System.out.println("main method end");
		
	}
	
	public static void m1()
	{
		System.out.println("no arg void");

		return;//RETURN STATEMENT (optional)

	}
	
	public static int m2()
	{
		System.out.println("no arg int");
		return 12;//RETURN STATEMENT (mandatory)
		//RETURNING VALUE AND RETURN TYPE OF THE METHOD MUST MATCH
	}
	
	public static double m3()
	{
		System.out.println("no arg double");
		return m2();
	}
	
	public static String m4()
	{
		return "no arg string";
	}
	
	public static boolean m5()
	{
		return true;
	}
}