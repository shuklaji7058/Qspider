import java.util.Scanner;
class NestedLoop3
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter Start number: ");
		int start = s.nextInt();
		System.out.println("Enter End number: ");
		int end = s.nextInt();
		
		System.out.println("==================================");
		System.out.println("Prime numbers");
		
		for(int i=start; i<=end; i++)
		{
			int count = 0;
			for(int k=1; k<=i; k++)
			{
				if(i%k==0)
				{
					count++;
				}
			}
				if(count==2)
				{
				System.out.println(i);
				}
		}
		
		System.out.println("Reverse Number");
		for(int i=start; i<=end; i++)
		{
		int n = i;
		int rev = 0;
		while(n > 0)
		{
			int rem = n%10;
			rev = rev*10 + rem;
			n = n/10;
		}
		
		System.out.println(i+"="+rev);
		}
	}
}
/*
Outer loop
   ↓
   Inner loop
      ↓
      check all factors
      ↓
   Inner loop finishes
   ↓
   check count == 2
   ↓
   print prime
*/