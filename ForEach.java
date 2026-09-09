class ForEach
{
	public static void main(String[] args)
	{
		int[] c = {22,45,65,76,89,12};
		System.out.println("Sum and average using for loops");
		int sum = 0, avg = 0;
		for(int i=0;i<c.length; i++)
		{
			sum = sum + c[i];
		}
		System.out.println("sum of elements: " + sum);
		System.out.println("Average of elements: " + (sum/c.length));
	
//Using For Each Loop	
		System.out.println("Sum and average using for Each loops");
		int sum2 = 0;
		for(int a : c)
		{
			sum2 = sum2 + a;
		}
		System.out.println("sum of elements: " + sum2);
		System.out.println("Average of elements: " + (sum2/c.length));
	}
}