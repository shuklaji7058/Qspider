class Recursion
{
	//Direct recursion
	public static void main(String[] args)
	{
		System.out.println("factorial: " + factorial(5));
		System.out.println("sum of numbers: "+sum(6));
		print(1,5);
	}
	
	public static int factorial(int n)
	{
		if(n==1)
		{
			return 1;//Stop calling yourself when n becomes 1(Base Condition)
		}
		else
		{
			return n * factorial(n-1);//recursive call
		}
		
	}
	
	public static int sum(int n)
	{
		if(n==0)
		{
			return 0;
		}
		else
		{
			return n + sum(n-1);
		}
	}
	
	public static void print(int start, int end)
	{
		if(start>end)
		{
			return;
		}
		else
		{
			System.out.println(start);
			start++;
			print(start, end);
		}
	}
}