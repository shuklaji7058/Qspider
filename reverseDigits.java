class reverseDigits
{
	public static void main(String[] args)
	{
		int n = 12345;
		int rev = 0;
		while(n!=0)
		{
			int rem = n%10; //gets last digit
			rev = rev*10 + rem;//built reverse
			n = n/10; //removes last digit
		}
		System.out.println(rev);
				trying();

	}


public static void trying()
{
	int m = 98765;

	int mint = 0;
	while(m!=0)
	{
		int rev = m%10;
		mint  = mint*10 + rev;
		m = m/10;
	}
	System.out.println(mint);

	}
}