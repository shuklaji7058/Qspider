import java.util.Scanner;

class IfEg2
{
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Favourite jersey number: ");
		int jersey = s.nextInt();
		
		if(jersey<=7)
		
			System.out.println("You are fan of: \nMs Dhoni \nHarmanpreet kaur");
			System.out.println("I love Cricket");
		
	}
}