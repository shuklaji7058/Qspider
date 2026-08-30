import java.util.Scanner;
class IfElse
{
	public static void main(String[] args)
	{
		System.out.println("***Welcome to voting verification***");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = s.nextInt();
		
		if(age>=18)
		{
			System.out.println("Your age is eligible");
			System.out.println("You can vote!!");
		}
		else
		{
			System.out.println("Your age is below 18");
			System.out.println("You are not eligible to vote!!");
		}
		
		System.out.println("Thank You");
	}
}