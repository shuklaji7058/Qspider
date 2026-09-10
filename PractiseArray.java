class PractiseArray
{
	public static void main(String[] args)
	{
		int[] s = {2,4,5,6,7};//receiveArray
		System.out.println("address of s:- " + s);
		receiveArray(s);
		
		int[] x = returnArray();//returnArray
		System.out.println("address of x:- "+ x);
		for(int mum : x)
		{
			System.out.println(mum);
		}
		
		int[] z = {4,6,7,9,1};//returnSum
		System.out.println(returnSum(z));
	}
	
	public static void receiveArray(int[] w)
	{
		System.out.println("address of w:- " + w);
		for(int dog : w)
		{
			System.out.println(dog);
		}
	}
	
	public static int[] returnArray()
	{
		int[] u = {1,6,7,8,9};
		System.out.println("address of u:- "+ u);
		return u;
	}
	
	public static int returnSum(int[] m)
	{
		int sum = 0;
		for(int add : m)
		{
			sum = sum + add;
		}
		return sum;
	}
}