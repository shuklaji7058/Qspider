class Practise
{
	public static void main(String[] args)
	{
		int n = 4;
		int m = 5;
System.out.println("====================(1)======================");
		//outer loop
		for(int row=1;row<=n;row++)
		{
			//inner loop
			for(int col=1;col<=m;col++)
			{
				System.out.print(" *");
			}	
			System.out.println();
		}
System.out.println("=====================(2)=====================");		 /*
			*****
			*   *
			*   *
			*****
		*/
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=m;col++)
			{
				if(row==1 || col==1|| row==n || col==m)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
System.out.println("=======================(3)===================");
		n = 4;
		for(int row=1;row<=n;row++)
		{
			for(int col=row;col<=n;col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
System.out.println("=======================(3)=========================");		
		for(int row=n;row>=1;row--)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
System.out.println("=======================(4)=========================");
		n=5;
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=n-row+1;col++)
			{
				System.out.print(col+" ");
			}
			System.out.println();
		}
System.out.println("=======================(5)=========================");

		int number=1;
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(number+" ");
				number++;
			}
			System.out.println();
		}
	}
}