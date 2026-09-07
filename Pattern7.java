class Pattern7
{
	public static void main(String[] args)
	{
		int n = 5;
		System.out.println("**************************BUTTERFLY****************************");
		for(int row=1; row<=n*2-1; row++)
		{
			for(int col=1; col<=n*2-1; col++)
			{
				if((row>=col && row+col<=n*2) || (row+col>=n*2 &&row-col<=0))
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
		System.out.println("**************************HOUR GLASS**************************");
		
		for(int row=1; row<=n*2-1; row++)
		{
			for(int col=1; col<=n*2-1; col++)
			{
				if((row>=col || row+col<=n*2) && (row+col>=n*2 || row-col<=0))
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
	}
}