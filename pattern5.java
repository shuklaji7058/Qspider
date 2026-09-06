class pattern5
{
	public static void main(String[] args)
	{
		int n = 5;
System.out.println("====================(1)=======================");		
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=n;col++)
			{
				if(row>=col)
				{
					if(row%2 == 0)
						System.out.print("0 ");
					else
						System.out.print("1 ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
System.out.println("====================(2)=======================");
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=n;col++)
			{
				//System.out.print("");
				if(row>=col)
				{
					if(col%2 == 1)
						System.out.print("1 ");
					else
						System.out.print("0 ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
System.out.println("====================(3)=======================");

		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=n;col++)
			{
				if(row>=col)
				{
					if(row%2 == 1)
						System.out.print("0 ");
					else
						System.out.print("1 ");
				}
				else
				{
					System.out.print("");
				}
			}
			System.out.println();
		}
System.out.println("=====================(4)=====================");

		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(col+" ");		
			}
			System.out.println();
		}
System.out.println("======================(5)=====================");

		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print((n - col+ 1)+" ");		
			}
			System.out.println();
		}
System.out.println("=======================(6)====================");
		int num = 1;
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(num +" ");
				num++;
			}
			System.out.println();
		}
System.out.println("=======================(7)====================");		
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=n;col++)
			{
					if((row+col)%2 == 0)
					{
						System.out.print("x ");
					}
					else
					{
						System.out.print("  ");
					}
			}
			System.out.println();
		}
System.out.println("=======================(8)==============");		
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=row;col++)
			{
				if(row>=col)
				{
				System.out.print(row+col+" ");
				}
				
			}
			System.out.println();
		}

	}
}