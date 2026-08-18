class Method1
{
	public static void main(String []args)
	{
		odd(20);//argument
		odd(30);//argument
		odd(66);//argument
		odd(87);//argument
		add(10,20);
		System.out.println(bbc(30,40));
		
	}
	
	public static void odd(int n)//parameter
	{
		System.out.println((n%2==0) ? "even number" : "odd number");
	}
	
	public static void add(int a,int b)
	{
		//WITH COMPOUND ASSIGNMENT OPERATOR
		System.out.println("Addition: "+(a+=b));//30
		System.out.println(a);//30
		System.out.println(b);//20
		System.out.println("Subtraction: "+(a-=b));//10
		System.out.println(a);//10
		System.out.println(b);//20
		System.out.println("Multiple: "+(a*=b));//200
		System.out.println(a);//200
		System.out.println(b);//20
		
	}
	
	public static int bbc(int g,int h)
	{
		return g+h;

	}
	

}