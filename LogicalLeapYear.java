import java.util.*;
class LogicalLeapYear
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter start year");
		int start = s.nextInt();
		
		System.out.println("enter end year");
		int end = s.nextInt();
		System.out.println("leap years in the range " + start + " to " + end + ": ");
		for(int i=start; i<=end; i++)
		{
			if(leap(i))
				System.out.println(i);
		}
	}
	
	public static boolean leap(int year)
	{
		if((year%4==0 && year%100!=0) || year%400==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}