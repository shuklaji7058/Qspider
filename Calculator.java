import java.util.*;
class Calculator
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enetr First Number: ");
		double a = s.nextDouble();
		
		System.out.println("Enter operator (+, -, *, /, %)");
		char op = s.next().charAt(0);
		
		System.out.println("Enter Second Number");
		double b = s.nextDouble();
		
		switch(op)
		{
			case '+':
			{
			System.out.println("Result: " + (a+b));
			break;
			}
			case '-':
			{
			System.out.println("Result: " + (a-b));
			break;
			}
			case '*':
			{
			System.out.println("Result: " + (a*b));
			break;
			}
			case '/':
			{
			System.out.println("Result: " + (a/b));
			break;
			}
			case '%':
			{
			System.out.println("Result: " + (a/b));
			break;
			}
			default:
			{
				System.out.println("Invalid operator");
			}
		}
	}
}