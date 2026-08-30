import java.util.Scanner;
class IfElseIf2
{
	public static void main(String[] args)
	{
		Scanner n = new Scanner(System.in);
		System.out.println("****WELCOME TO PVR****");
		System.out.println("Enter the Movie name: ");
		String movie = n.nextLine();
		System.out.println("Enter number of tickets: ");
		int tickets = n.nextInt();
		System.out.println("Select Seats From the following: ");
		System.out.println("1.Standard \n2.Balcony \n3.Recliner");
		int choice = n.nextInt();
		System.out.println("Your Seat choice is: ");
		if(choice==1)
		{
			System.out.println("MOVIE NAME: "+ movie);
			System.out.println("NUMBER OF TICKETS: "+ tickets);
			System.out.println("CATEGORY: STANDARD");
			double price = 200;
			System.out.println("TOTAL TICKET PRICE IS: "+ calculate(tickets, price));
		}
		else if(choice==2)
		{
			System.out.println("MOVIE NAME: "+ movie);
			System.out.println("NUMBER OF TICKETS: "+ tickets);
			System.out.println("CATEGORY: BALCONY");
			double price = 290;
			System.out.println("TOTAL TICKET PRICE IS: "+ calculate(tickets, price));
		}
		else if(choice==3)
		{
			System.out.println("MOVIE NAME: "+ movie);
			System.out.println("NUMBER OF TICKETS: "+ tickets);
			System.out.println("CATEGORY: RECLINER");
			double price = 400;
			System.out.println("TOTAL TICKET PRICE IS: "+ calculate(tickets, price));
		}
		else
		{
			System.out.println("****Please enter a valid choice from the options displayed****");
			System.out.println("THANK YOU FOR CHOSSING PVR!!!");
		}
		
	}
	
	public static double calculate(int tickets, double price)
	{
		return tickets*price;
	}
}