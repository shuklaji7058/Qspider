import java.util.Scanner;
class While2
{
	public static void main(String[] args) //throws InterruptedException
	{
		Scanner s = new Scanner(System.in);
		System.out.println("============================================");
		System.out.println("New York Count Down");
		System.out.println("============================================");
		
		int n = 10;
		System.out.println("DATE: 31 Decemeber");
		System.out.println("New York Count Down Starts");
		while(n >= 1)
		{
			System.out.println(n);
			//Thread.sleep(1000);
			n--;
		}
		System.out.println("Happ New Year");
		
		System.out.println("============================================");
		System.out.println("Shukla Bank of India");
		System.out.println("============================================");
		double balance = 20000;
		while(balance>0)
		{
			System.out.println("Enter amount to withdraw: ");
			double amount = s.nextDouble();
			if(amount<=balance)
			{
				balance = balance - amount;
				System.out.println("Remaining Balance: "+balance);
			}
			else
			{
			System.out.println("Available Balance: "+ balance);
			System.out.println("Your Account Has Insufficient Balance");
			break;

			}
		}
		
	}
}