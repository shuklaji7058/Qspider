//This Code icludes Strong Number, Factorial
class LogicalMath2
{
	public static void main(String[] args)
	{
		System.out.println("factorial of 5: " + factorial(5));
		System.out.println("*****STRONG NUMBER******");
		int n = 45;
		int temp = n;
		int sum = 0;
		
		while(n!=0)
		{
			int rem = n%10;
			sum = sum + factorial(rem);
			n=n/10;
		}
		System.out.println("sum: " + sum);
		
		if(sum==temp)
		{
			System.out.println(temp + " is a strong number");
		}
		else
		{
			System.out.println(temp + " is not a strong number");
		}
	}
	
	public static int factorial(int n)
	{
		int fact = 1;
		for(int i=n; i>=1; i--)
		{
			fact  = fact * i;
		}
		return fact;
	}
}