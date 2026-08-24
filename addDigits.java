import java.util.Scanner;

class addDigits
{
	public static void main(String[] args)
	{
		Scanner n = new Scanner(System.in);
		System.out.println("Enter number: ");
		int m = n.nextInt();
		
		//int n = 56234;//initialization
		
		int sum = 0;
		
		while(m!=0)//condition
		{			
			int rem = m%10;
			sum = sum + rem;
			m = m/10; //updation
		}
		System.out.println("The number becomes: "+sum);
		babu();
	}
	
	public static void babu()
	{
		int o = 12345;
		int min = 0;
		while(o!=0)
		{
			int kit = o%10;
			min = min + kit;
			o = o/10;
		}
			System.out.println(min);

	}
}