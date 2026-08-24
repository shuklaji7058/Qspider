import java.util.Scanner;
class Digits
{
	public static void main(String [] args)
	{
		System.out.println("********Count the digits of number********");
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = s.nextInt();
		
		int count = 0;
		while(n!=0)
		{
			count++;
			n = n/10;
		}
			System.out.println("Number entered: "+count);
		
		
		
	}
}