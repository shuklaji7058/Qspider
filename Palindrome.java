import java.util.Scanner;
class Palindrome
{
	public static void main(String[] args)
	{
		Scanner m = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = m.nextInt();
		int temp = n;//to keep value original bcoz in loop the n value becomes Zero
		int rev = 0;
		while(n!=0)
		{
			int rem = n%10;//extracting last digit using this
			rev = rev*10 + rem;//and add that digit to this
			n = n/10;//remove the last digit
		}
		//at this point n is zero
		System.out.println("reverse of the number: "+rev);
		
		if(temp==rev)
		{
			System.out.println(temp + " is a palindrome");
		}
		else
		{
			System.out.println(temp + " is not a palindrome");
		}
	}
}