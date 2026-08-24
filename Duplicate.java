import java.util.Scanner;
class Duplicate
{
	public static void main(String [] args)
	{
		Scanner mom = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int dad = mom.nextInt();
		
		int temp = dad;
		int rev = 0;
		while(dad!=0)
		{
			int rem = dad%10;
			rev = rev*10 + rem;
			dad = dad/10;
		}
		System.out.println("reversed number is: "+rev);
		
		if(temp==rev)
		{
			System.out.println(temp +" is a palindrome");
		}
		else
		{
			System.out.println(temp + " is not a palindrome");
		}
	}
}