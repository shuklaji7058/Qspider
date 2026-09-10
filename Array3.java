//Array Method
class Array3
{
	public static void main(String[] args)
	{
		System.out.println("Method To Receive Array");
		
		int[] a = {5,6,7,8};
		System.out.println("address/reference in a: " + a);
		recieveArray(a);
		
		System.out.println("Method To Return Array");
		int[] s = returnArray();
		System.out.println("address/reference in s: " + s);
		for(int cat : s)
		{
			System.out.println(cat);
		}
		
		int[] z  = {20,30,40};
		System.out.println("returnSum is: ");
		System.out.println(returnSum(z));
	}
//-----------------------------------------------------------------------------------	
	public static void recieveArray(int[] m)
	{
		System.out.println("address/reference in m: " + m);
		for(int dog : m)
		{
			System.out.println(dog);
		}
	}
//------------------------------------------------------------------------------------	
	public static int[] returnArray()
	{
		int[] k = {10,11,12,13};
		System.out.println("address/reference in k: " + k);
		return k;
	}
//--------------------------------------------------------------------------------------	
	public static int returnSum(int[] w)
	{
		int sum = 0;
		for(int phone : w)
		{
			sum = sum + phone;
		}
		return sum;
	}
}
//create a method to recieve array add the elments of array return the sum of that array