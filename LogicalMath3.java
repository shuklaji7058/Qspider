class LogicalMath3
{
	public static void main(String[] args)
	{
		System.out.println("exponential of 2 power 4: " + exponential(2,4));
		System.out.println("exponential of 2 power 4: " + exponential(6,2));
		System.out.println("exponential of 2 power 4: " + exponential(5,4));
		
		System.out.println("****ARMSTRONG NUMBER****");
		int n = 152;
		int temp = n;
		int count = count(n);
		System.out.println("number of digits: " + count);
		
		int sum = 0;
		while(n!=0)
		{
			int rem = n%10;
			sum = sum + exponential(rem, count);
			n = n/10;
		}
		
		System.out.println("sum of exponential: " + sum);
		
		if(temp==sum)
		{
			System.out.println(temp + " is an Armstrong number");
		}
		else
		{
			System.out.println(temp + " is not an Armstrong number");
		}
}
	
	public static int exponential(int base, int pow)
	{
		int exp = 1;
		for(int i=1; i<=pow; i++)
		{
			exp = exp * base;
		}
		return exp;
	}
	
	public static int count(int n)
	{
		int count = 0;
		while(n!=0)
		{
			count++;
			n = n/10;
		}
		return count;
	}
}