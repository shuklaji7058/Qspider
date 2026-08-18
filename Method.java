class Method
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to method chapter");
		m1();
		m2(10,"Hello",20,'6');
	}
	
	public static void m1()
	{
		System.out.println("no arguments");
		
	}
	public static void m2(int a, String b,int c,char d)//WITH ARGUMENTS 
	{
		System.out.println("A :"+ a);
		System.out.println("B :"+ b);
		System.out.println("C :"+ c);
		System.out.println("D :"+ d);
	}
	
}