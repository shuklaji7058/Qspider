class pattern6
{
	public static void main(String[] args)
	{
		int n=3;
System.out.println("================(1)====================================");
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=n*2-1;col++)
			{
				if((col-row)<= (n-1) && (col+row)>=(n+1))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}	
			}
			System.out.println();
			
		}
System.out.println("================(2)====================================");
		for(int row=1;row<=n*2-1;row++)
		{
			for(int col=1;col<=n*2-1;col++)
			{
				if((col-row)<= (n-1) && (col+row)>=(n+1))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}	
			}
			System.out.println();
			
		}
System.out.println("=====================(3)====================================");
		for(int row=1;row<=n*2-1;row++)
		{
			for(int col=1;col<=n*2-1;col++)
			{
				if((col+row)>=(n+1) 
					&& (col-row)<= (n-1) 
					&& (row-col)<=(n-1) 
					&& (col+row)<=(n*3-1))
				{
					System.out.print(" *");
				}
				else
				{
					System.out.print("  ");
				}	
			}
			System.out.println();	
		}
System.out.println("=====================(4)====================================");
		n=3;
		for(int row=1;row<=n;row++)
		{
			int b = row+1;
			for(int col=1;col<=n*2-1;col++)
			{
				if((col+row)>=(n+1) && (col-row)<= (n-1))
				{
					if(col<=n)
					{
						b--;
						System.out.print(" " + b + " ");
					}
					else
					{
						b++;
						System.out.print(" "+b+" ");
					}
				}
				else
					System.out.print("   ");				
			}
			System.out.println();	
		}
System.out.println("===================(5)====================================");

		for(int row=1; row<=n; row++)
		{
			int a = 0;
			for(int col=0; col<=n*2-1; col++)
			{
				if((col+row) >= (n+1) && (col-row) <= (n-1))
				{
					if(col <= n)
					{
						a++;
						System.out.print(" " + a + " ");
					}
					else
					{
						a--;
						System.out.print(" " + a + " ");
					}
				}
				else
					System.out.print("   ");
			}
			System.out.println();
		}
	}
}