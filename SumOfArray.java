import java.util.Arrays;
class SumOfArray
{
	public static void main(String[] args)
	{
		System.out.println("Sum of Even index Elements");
		int[] a = {1, 2, 3, 4, 5,};
		  //index- 0, 1, 2, 3, 4
		int sum = 0;
		
		for(int i=0; i<a.length;i++)
		{
			if(i%2==0)
			{
				sum = sum + a[i];
			}
		}
		System.out.println(sum);
		
//-----------------------------------------------------------------------------------

		System.out.println("Sum of Even Elements");
		int[] a2 = {1, 2, 3, 4, 5,};
		   //index- 0, 1, 2, 3, 4
		int sum2 = 0;
		
		for(int i=0; i<a2.length;i++)
		{
			if(a2[i]%2==0)
			{
				sum2 = sum2 + a2[i];
			}
		}
		System.out.println(sum2);
		
//----------------------------------------------------------------------------------


		
	}
}