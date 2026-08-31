import java.util.Scanner;

class NestedDecision3
{
    public static void main(String[] args)
    {
		Scanner s = new Scanner(System.in);

		System.out.println("================================");
		System.out.println("       NUMBER CHECKER           ");
		System.out.println("================================");

		System.out.print("Enter Any Number: ");
		int number = s.nextInt();

		if(number > 0)
		{
			if(number % 2 == 0)
			{
				System.out.println("\n" + number + " Is A Positive Even Number");
			}
			else
			{
				System.out.println("\n" + number + " Is A Positive Odd Number");
			}
		}
		else if(number < 0)
		{
			if(number % 2 == 0)
			{
				System.out.println("\n" + number + " Is A Negative Even Number");
			}
			else
			{
				System.out.println("\n" + number + " Is A Negative Odd Number");
			}
		}
		else
		{
			System.out.println("\nThe Number Is Zero");
		}

		System.out.println("\nThank You!");
	}
}