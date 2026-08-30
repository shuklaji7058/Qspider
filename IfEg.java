import java.util.Scanner;
class IfEg
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter jersey number of player: ");
		int jersey = s.nextInt();
		if(jersey==10)
			System.out.println("Player is: \nSachin Tendulkar \nSunil chettri");
		System.out.println("Thank you");
	}
}