//This code includes prime number, perfect number, factors
class LogicalMath
{
	public static void main(String[] args)
	{

		int num = 13;
		System.out.println("number of factors: "+ checkPrimeNumber(num));
		if(checkPrimeNumber(num)==1)
		{
			System.out.println(num + " is a prime number(checkPrimeNumber)");
		}
		else
		{
			System.out.println(num + " is composite number(checkPrimeNumber)");
		}
//-------------------------------------------------------------------------	
		int mum = 12;
		System.out.println("number of factors: "+ checkPrime(mum));	
		if(checkPrime(mum)==1)
		{
			System.out.println(mum + " is a prime number");
		}
		else
		{
			System.out.println(mum + " is composite number");
		}
//-------------------------------------------------------------------------	
		int bab = 13;
		if(checkPrimeBoolean(bab))
		{
			System.out.println(bab +" prime number");
		}
		else
		{
			System.out.println(bab +" composite number");
		}
//-------------------------------------------------------------------------	
		//System.out.println(checkPrimeBoolean(bab));
		System.out.println(checkPrimeString(bab));
//-------------------------------------------------------------------------	
		int k = 28;
		System.out.println("number of factors: "+ checkPerfect(num));
		if(checkPerfect(k)==k)
		{
			System.out.println(k + " is a perfect number");
		}
		else
		{
			System.out.println(k + " is not a perfect number");
		}
	}
//-------------------------------------------------------------------------	
	public static int checkPrimeNumber(int n)
	{
		int count = 0;
			//(initialization; Condition; Updation)
		for(int i=1; i<=n/2; i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		return count;
	}
//-------------------------------------------------------------------------	
	public static int checkPrime(int n)
	{
		int count = 0;
		for(int i=1; i<=n/2; i++)
		{
			if(n%i == 0)
			{
				count++;
			}
		}
		return count;
	}
//---------------------------------------------------------------------------------			
	public static boolean checkPrimeBoolean(int n)
	{
		int count = 0;
		for(int i=1; i<=n/2; i++)
		{
			if(n%i == 0)
			{
				count++;
			}
		}
		if(count==1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
//-------------------------------------------------------------------------------	
	public static String checkPrimeString(int n)
	{
		int count = 0;
		for(int i=1; i<=n/2; i++)
		{
			if(n%i==1)
			{
				count++;
			}
		}
		if(count==1)
		{
			return "prime number";
		}
		else
		{
			return "composite number";
		}
	}
//---------------------------------------------------------------------------------
	
	public static int checkPerfect(int n)
	{
		int sum = 0;
		for(int i=1; i<=n/2; i++)
		{
			if(n%i==0)
			{
				sum = sum + i;
			}
		}
		return sum;
	}
}