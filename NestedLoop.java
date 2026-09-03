import java.util.Scanner;
//For each one execution of the outer loop, the entire inner loop runs.
class NestedLooping
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Start Number: ");
		int start = s.nextInt();
		System.out.println("Enter End Number: ");
		int end = s.nextInt();
		
		System.out.println("====Prime Numbers====");
		
		for(int i=start; i<=end; i++)
		{
			int count = 0;
				
			for(int j=1;j<=i/2;j++)
			{
				if(i%j == 0)
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(i);
			}	
		
		}
		System.out.println("====Reverse Numbers====");
		for(int i=start;i<=end;i++)
		{
		int  n = i;	
		int rev = 0;	
		while( n > 0)
        {
            int rem = n % 10;
			rev = rev * 10 + rem;
			n = n/10;
		}
		System.out.println(i+"="+rev);
		}
	}
}