class pattern4
{
	public static void main(String[] args)
	{
		int n = 5;
		for(int row=1;row<=n;row++)
		{
			for(int col=row;col<=n;col++)
			{
				System.out.print("  ");
			}
			for(int col=1;col<row;col++)
			{
				System.out.print("* ");
			}
			for(int col=1;col<=row;col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
System.out.println("===================================");	
	
	}
		
}
