class LogicalMath4
{
	public static void main(String[] args)
	{
		System.out.println("********Disarium Number*********");
		
		int n = 153;
		int temp = n;
		int count = 0;
		
		while(n!=0)
		{
			count++;
			n = n/10;
		}
		
		n = temp;
		
		int sum = 0;
		while(n!=0)
		{
			int rem = n%10;
			sum = sum + expo(rem, count);
			count--;
			n = n/10;
		}
		
		System.out.println("sum: "+ sum);
		
		if(temp==sum)
		{
			System.out.println(temp + " is a Disarium Number");
		}
		else
		{
			System.out.println(temp + " is not a Disarium Number");

		}
	}
	
	public static int expo(int base, int pow)
	{
		int exp = 1;
		for(int i=1; i<=pow; i++)
		{
			exp = exp * base;
		}
		return exp;
	}
}