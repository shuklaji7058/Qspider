import java.util.*;

class Twisted
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = s.nextInt();

        if(checkPrime(n))
        {
			if(checkPrime(reverse(n)))
			{
            System.out.println(n + " is a Twisted Prime Number");
        }
        else
        {
            System.out.println(n + " is not a Twisted Prime Number");
        }
	}
	else
	{
		System.out.println(n + "number is not prime number");
		
    }
}

    public static boolean checkPrime(int n)
    {
        

        for(int i = 2; i <= n / 2; i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }

        return true;
    }

    public static int reverse(int n)
    {
        int rev = 0;

        while(n != 0)
        {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }

        return rev;
    }
}