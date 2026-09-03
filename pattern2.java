class pattern2
{
	public static void main(String[] args)
	{
		int n = 5;
		System.out.println("======================================");
		for(int row=1; row<=n; row++)
		{
			for(int col=1; col<=n; col++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		System.out.println("======================================");
		for(int row=1; row<=n; row++)
		{
			for(int col=1; col<=n; col++)
			{
				if(col<=row)
					System.out.print(" * ");
				else
					System.out.print("");
			}
			System.out.println();
		}
		System.out.println("======================================");
	}
}