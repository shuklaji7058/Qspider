import java.util.Scanner;

class SwitchEg
{
    public static void main(String[] args)
    {
	Scanner s = new Scanner(System.in);
        System.out.println("Welcome to Qspider");
	System.out.println("Course Available: \n1.Java \n2.JavaScript \n3.Python \n4.Devops \n5.AWS \n6.Oracle \n7.Manual Testing \n8.Automation Free For Manual Testing ");
		System.out.println("**Choose Your Favourite Course**");
		System.out.println("Choose the Favourite Option:");
		int choice = s.nextInt();
		
		switch(choice)
		{
		case 1:
		{
			System.out.println("Course Selected: Java");
			break;
		}
		case 2:
		{
			System.out.println("Course Selected: JavaScript");
			break;
		}
		case 3:
		{
			System.out.println("Course Selected: Python");
			break;
		}
		case 4:
		{
			System.out.println("Course Selected: Devops");
			break;
		}
		case 5:
		{
			System.out.println("Course Selected: AWS");
			break;
		}
		case 6:
		{
			System.out.println("Course Selected: Oracle");
			break;
		}
		case 7,8:
		{
			System.out.println("{!!!!!!!!!! Grouping Of Similar Cases!!!!!!!!!!]");
			System.out.println("Course Selected: Manual Testing");
			System.out.println("Course Selected: Automation Free For Manual Testing");
			
			break;
		}
		default:
		{
			System.out.println("Please Choice Correct Option!!!!!!!!");
			break;
		}
		
		}
	}
}