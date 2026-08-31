import java.util.Scanner;
class NestedDecision2
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("=============================================");
		System.out.println("***Welcome to Shukla's Pure veg Restaurant***");
		System.out.println("=============================================");
		System.out.println("\n========Menu=========");
		System.out.println("1. Paneer");
		System.out.println("2. Mashroom");
		System.out.println("3. Shukla's Special");
		System.out.println("=============================================");
		System.out.println("\nEnter Your Choice: ");
		int choice = s.nextInt();
		
		if(choice==1)
		{
			System.out.println("\n-----PANEER OPTIONS-----");
			System.out.println("A. Paneer Crispy");
			System.out.println("B. Paneer Handi");
			System.out.println("C. Paneer Lahori");
			System.out.println("Enter your Option (A/B/C): ");
			
			char user_option = s.next().charAt(0);
			char option = Character.toUpperCase(user_option);
			
			switch(option)
			{
				case 'A':
				{
					System.out.println("\nYou Have Selected: Paneer Crispy");
					break;
				}
				case 'B':
				{
					System.out.println("\nYou Have Selected: Paneer Handi");
					break;
				}
				case 'C':
				{
					System.out.println("\nYou Have Selected: Paneer Lahori");
					break;
				}
				default:
				{
					System.out.println("\nInvalid Option");
				}
			}
		}
		else if(choice==2)
		{
			System.out.println("\n-----Mashroom OPTIONS-----");
			System.out.println("A. Mashroom Special");
			System.out.println("B. Mashroom Handi");
			System.out.println("C. Mashroom 65");
			System.out.println("Enter your Option (A/B/C): ");
			
			char user_option = s.next().charAt(0);
			char option = Character.toUpperCase(user_option);
			
			switch(option)
			{
				case 'A':
				{
					System.out.println("\nYou Have Selected: Mashroom Special");
					break;
				}
				case 'B':
				{
					System.out.println("\nYou Have Selected: Mashroom Handi");
					break;
				}
				case 'C':
				{
					System.out.println("\nYou Have Selected: Mashroom 65");
					break;
				}
				default:
				{
					System.out.println("\nInvalid Option");
				}
			}
		}
		else if(choice==3)
		{
			System.out.println("\n-----Shukla's Special OPTIONS-----");
			System.out.println("A. Special Cheese Sandwich");
			System.out.println("B. Loaded Pizza with Choco Lava");
			System.out.println("C. Special chinese combo");
			System.out.println("Enter your Option (A/B/C): ");
			
			char user_option = s.next().charAt(0);
			char option = Character.toUpperCase(user_option);
			
			switch(option)
			{
				case 'A':
				{
					System.out.println("\nYou Have Selected:Special Cheese Sandwich");
					break;
				}
				case 'B':
				{
					System.out.println("\nYou Have Selected: Loaded Pizza with Choco Lava");
					break;
				}
				case 'C':
				{
					System.out.println("\nYou Have Selected: Special chinese combo");
					break;
				}
				default:
				{
					System.out.println("\nInvalid Option");
				}
			}
		}
		System.out.println("*********Atithi Devo Bhava!!!!********");
		System.out.println("*********ThankYou!!!!********");
	}
}