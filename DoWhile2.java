import java.util.Scanner;
class DoWhile2
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome to ATM");
		double amount = 0;
		double total = 0;
		int count = 1;
		
		do
		{
			System.out.println("Enter the amount to withdraw");
			amount = s.nextDouble();
			
			if(amount > 10000)
			{
				System.out.println("Each Withdrawal should not be more than 10000");
			}
			else if((amount + total) > 25000)
			{
				System.out.println("Per day total Withdrawal should be exceed 25000");
			}
			else 
			{
				total = total + amount;
				System.out.println("amount withdrawn " + amount);
				System.out.println("number of remaining attempts "+ (3 - count));
				count++;
			}
		}while(count<4 && total<25000);
		System.out.println("total amount withdrawn: "+ total);
	}
}