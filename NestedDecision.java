import java.util.Scanner;
class NestedDecision
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("***Welcome to Shukla's Electronic Shop***");
		System.out.println("-------------------------------------------");
		System.out.println("Enter Your Budget to buy a laptop");
		int cost = s.nextInt();
		if(cost<=45000)
		{
			System.out.println("\n----Laptop Option under 45000----");
			System.out.println("A. Dell");
			System.out.println("B. HP");
			System.out.println("C. Acer");
			System.out.println("Enter your Option (A/B/C): ");
			
			char customer_option = s.next().charAt(0);
			char option = Character.toUpperCase(customer_option);
			
			switch(option)
			{
				case 'A':
				{
					System.out.println("\nYou Have Selected: Dell");
					break;
				}
				case 'B':
				{
					System.out.println("\nYou Have Selected: HP");
					break;
				}
				case 'C':
				{
					System.out.println("\nYou Have Selected: Acer");
					break;
				}
				default:
				{
					System.out.println("\nInvalid option");
				}
			}
		}
		else if(cost>=46000)
		{
			System.out.println("\n----Laptop Option Starting from 46000----");
			System.out.println("A. Asus");
			System.out.println("B. MacBook");
			System.out.println("C. Victus");
			System.out.println("Enter your Option (A/B/C): ");
			
			char customer_option = s.next().charAt(0);
			char option = Character.toUpperCase(customer_option);
			
			switch(option)
			{
				case 'A':
				{
					System.out.println("\nYou Have Selected: Asus");
					break;
				}
				case 'B':
				{
					System.out.println("\nYou Have Selected: MacBook");
					break;
				}
				case 'C':
				{
					System.out.println("\nYou Have Selected: Victus");
					break;
				}
				default:
				{
					System.out.println("\nInvalid option");
				}
			}
		}
		System.out.println("Thank you for Choosing Shukla's Electronic");
		System.out.println("Visit Again!!");
		
	}
}