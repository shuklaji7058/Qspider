import java.util.Scanner;

class RecursionIndirect
{
	public static void main()
	{
		Scanner num = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = num.nextInt();
		System.out.println("Number Entered: "+n);
		
		babu(n);
	}
	
	public static void babu(int n)
	{
		if(n==0)
		{
			System.out.println("Even number");
			return;
		}
		else
		{
			sona(n-1);
		}
	}
	
	public static void sona(int n)
	{
		if(n==0)
		{
			System.out.println("Odd number");
			return;
		}
		else
		{
			babu(n-1);
		}
	}
	
}