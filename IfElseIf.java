import java.util.Scanner;
class IfElseIf
{
	public static void main(String[] args)
	{
		Scanner n = new Scanner(System.in);
		System.out.println("Enter your Batting Position");
		int bat = n.nextInt();
		
		if(bat<=2)
		{
			System.out.println("You are Opener Batsman");
		}
		else if(bat<=6)
		{
			System.out.println("You are Middle Order Batsman");
		}
		else if(bat<=8)
		{
			System.out.println("You are Lower order Batsman");
		}
		else if(bat<=11)
		{
			System.out.println("You are Bowler");
		}
		else
		{
			System.out.println("You are Twelveth Player!!");
		}
	}
}