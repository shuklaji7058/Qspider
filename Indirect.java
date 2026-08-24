import java.util.Scanner;
class Indirect
{
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number to check for even or odd: ");
		int n = s.nextInt();
		first(n);
	}
	
	public static void first(int n)
	{
		if(n==0)
		{
			System.out.println("number is even");
			return;
		}
		next(n-1);
	}
	
	public static void next(int n)
	{
		if(n==0)
		{
			System.out.println("number is odd");
		return;
		}
		first(n-1);
	}
}