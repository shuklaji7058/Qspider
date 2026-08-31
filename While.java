class While
{
	public static void main(String[] args)
	{
		int a = 22; //initialization
		while(a>=10) //condition
		{
			System.out.println(a);
			a--;  //updation
		}
		System.out.println("=============================================");
		int b = 1;
		while(b <= 17)
		{
			System.out.println(b);
			b = b * 2;
			//b++;
		}
		System.out.println("=============================================");
		/*
		int d = 2;
		while(true)
		{
			System.out.println(d);
			a++;
		}
		*/
	}
}