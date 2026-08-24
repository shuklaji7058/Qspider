import java.util.Scanner;
class multiplyDigits
{
	public static void main(String[] args)
	{
	Scanner k = new Scanner(System.in);
	System.out.println("Enter a number whatever u want: ");
	int n = k.nextInt();
	
	int prod = 1;
	while(n!=0)
	{
		int rem = n%10;
		prod = prod * rem;
		n = n/10;
	}
	System.out.println("The prod is: "+ prod);
	mamu();
	}
	
	public static void mamu()
	{
		int m = 1234;
		int min = 1;
	while(m!=0)
	{
		int mul = m%10;
		min = min * mul;
		m = m/10;
	}
	System.out.println(min);
	}
}
