import java.util.Scanner;
class DoWhile3
{
	public static void main(String[] args)
	{
		Scanner m = new Scanner(System.in);
		int  n = 37;
		
		do
		{
			System.out.println("Guess and enter the number");
			int num = m.nextInt();
			if(num==n)
			{
				System.out.println("You have Guessed it right!!!Congrats!!!");
				break;
			}
			else if(num>n)
			{
				System.out.println("Guess a Smaller number");
			}
			else
			{
				System.out.println("Guess a Larger number");
			}
		}while(true);
	}
}
