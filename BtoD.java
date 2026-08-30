class BtoD
{
	public static void main(String[] args)
	{
		int n = 101101;
		int dec = 0;
		int pow = 0;
		System.out.println("***BINARY TO DECIMAL***");
		while(n!=0)
		{
			int rem = n%10;
			dec = dec + rem * expo(2, pow);
			pow++;
			n = n/10;
		}
		
		System.out.println(dec);
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