class LogicalMath3
{
	public static void main(String[] args)
	{
		System.out.println("exponential of 2 power 4: " + exponential(2,4));
		System.out.println("exponential of 6 power 2: " + exponential(6,2));
		System.out.println("exponential of 5 power 4: " + exponential(5,4));
//------------------------------------------------------------------------	
		System.out.println("****ARMSTRONG NUMBER****");
		int n = 153	;
		int temp = n;//copy of n 
		int count = count(n);//counts the digits, o/p = 3
		System.out.println("number of digits: " + count);
//-------------------------------------------------------------------------
		int sum = 0;
		while(n!=0)//repeating until n becomes(false) NOT equal to 0
		{
			int rem = n%10;//to get last  digit
			sum = sum + exponential(rem, count);//sum + rem,count
			n = n/10;//quotient
		}
		
		System.out.println("sum of exponential: " + sum);
//---------------------------------------------------------------------		
		if(temp==sum)
		{
			System.out.println(temp + " is an Armstrong number");
		}
		else
		{
			System.out.println(temp + " is not an Armstrong number");
		}
}
//-----------------------------------------------------------------------
	public static int exponential(int base, int pow)
	{
		int exp = 1;//We start with 1 because we are going to multiply repeatedly
		for(int i=1; i<=pow; i++)
		{
			exp = exp * base;
		}
		return exp;
	}
//-------------------------------------------------------------------------	
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
/*
Complete logic in one flow

For:

n = 152
Step 1: Count digits
152 → 3 digits

So:

count = 3

Step 2: Extract each digit
152 % 10 = 2
15  % 10 = 5
1   % 10 = 1

Step 3: Raise every digit to the power of digit count
2³ = 8
5³ = 125
1³ = 1

Step 4: Add them
8 + 125 + 1 = 134

Step 5: Compare with original number
Original = 152
Sum      = 134

Not equal:

152 ≠ 134

Therefore:

152 is NOT an Armstrong number
*/