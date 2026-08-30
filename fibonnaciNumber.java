import java.util.*;
class fibonnaciNumber
{
	public static void main(String[] args)
	{
		Scanner fibo = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = fibo.nextInt();
		fibonnaci(num);
	}
	
	public static void fibonnaci(int n)
	{
		int f = 0;
		int s = 1;
		for(int i=1; i<=n; i++)
		{
		System.out.println(f);
		
		int t = f+s;
		f=s;
		s=t;
		}
	}
}

