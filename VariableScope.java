class VariableScope
{
	static int b; //GLOBAL Static VARIABLE
	public static void main(String args[])
	{
		int a; //Local Variable
		a=10;
		System.out.println(a);
		System.out.println(b);  //Global variables are initialized with default values
		
	}
	static int h; //Global Static Variable
	int m; //Global Non-static Variable
	
	{
		System.out.println(m);
	}
}