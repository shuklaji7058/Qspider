class ControlTransfer
{
	public static void main(String[] args)
	{
		System.out.println("=================================");
		System.out.println(add(12,5));
		System.out.println("=================================");
		for(int i=1; i<=10; i++)
		{
			System.out.println(i);
			if(i==9)
			{
				System.out.println("break statement executed");
				break;
			}
		}
		System.out.println("======================================");
		for(int i=1; i<=10; i++)
		{
			if(i%2==0)
			{
				System.out.println("continue statement executed");
				continue;
			}
			System.out.println(i);
		}
	}

	public static int add(int a, int b)
	{
		return a+b;
	}
}