import java.util.Scanner;
class IfElse3
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your 12th Percentage");
		double percentage = s.nextDouble();
		System.out.println("Enter your CET Percentile");
		double score = s.nextDouble();
		
		if(percentage>=35 && score>=70)
		{
			System.out.println("You Percentage and CET score are matching the criteria");
			System.out.println("Your are admitted!! \nCONGRATULATIONSS!!");
		}
		else
		{
			System.out.println("You are not match the required criteria");
			System.out.println("You are not eligible for Admission");
			System.out.println("Get lost ");
		}
		
	}
}