import java.util.Scanner;
class Scanner2
{
	public static void main(String[] args)
	{
		Scanner hotel = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = hotel.nextLine();
		System.out.println("You name is: "+ name);
		
		System.out.println("Enter hotel name: ");
		String str = hotel.nextLine();
		System.out.println("Hotel name is: "+str);
		
		System.out.println("Number of characters in Hotel: "+ str.length());
		
		//char ch = str.charAt(5);
		//System.out.println(ch);
		
		System.out.println("Enter hotel id: ");
		int id = hotel.nextInt();
		System.out.println("Hotel id is: "+ id);
		
		hotel.nextLine();//consume leftover
		
		System.out.println("Enter Ordered food: ");
		String food = hotel.nextLine();
		System.out.println("Your order is: "+food);
	}
}