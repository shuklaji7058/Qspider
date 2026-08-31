import java.util.Scanner;
class DoWhile4
{
	public static void main(String[] args)
	{
		Scanner m = new Scanner(System.in);
		
		int n = 55;
		
		do
		{
			System.out.println("Guess the number and Enter a number");
			int num = m.nextInt();
			if(num==n)
			{
				System.out.println("You guessed it right!!Hurrayy!!");
				break;
			}
			else if(num > n)
			{
				System.out.println("Guess Smaller number");
			}
			else
			{
				System.out.println("Guess Larger number");
			}
		}while(true);
	}
}