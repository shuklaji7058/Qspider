import java.util.Scanner;
class Task
{
	public static void main(String[] args)
	{
		Scanner  s = new Scanner(System.in);
		System.out.println("Enter 4 numbers");
		
		int m = 4;
		int sum = 0;
		
		for(int i=1;i<=m;i++)
		{
			System.out.println("Enter the number");
			char n = s.next().charAt(0);  //fetch as char
			
			sum = sum + (n - '0');  //subtract 48
		}
		System.out.println("Sum: "+ sum);
	}
}