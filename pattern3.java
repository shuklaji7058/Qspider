class pattern3
{
	public static void main(String[] args)
	{
		int n = 5;
System.out.println("=====================(1)=================");		
		for(int row=1; row<=n; row++)
		{
			for(int col=1; col<=n; col++)
			{
				if(row>=col)
					System.out.print(" * ");
				else
					System.out.print("");
			}
			System.out.println();
		}
		System.out.println("===================(2)===================");
		for(int row=1; row<=n; row++)
		{
			for(int col=1; col<=n; col++)
			{
				if(row<=col)
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
		System.out.println("====================(3)==================");
		for(int row=1; row<=n; row++)
		{
			for(int col=1; col<=n; col++)
			{
				if(row+col >=(n+1))
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
		System.out.println("=====================(4)=================");
		for(int row=1; row<=n; row++)
		{
			for(int col=1; col<=n; col++)
			{
				if(row+col <=(n+1))
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
		System.out.println("======================(5)================");
		for(int row=1; row<=n; row++)
		{
			for(int col=1; col<=n; col++)
			{
				if(row+col <=(n+1))
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
		System.out.println("======================================");
	}
}
