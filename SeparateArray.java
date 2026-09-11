import java.util.Arrays;
class SeparateArray
{
	public static void main(String[] args)
	{
		int[] a = {10,20,30,40,50};
		int[] b = new int[a.length];
		
		int j = b.length-1;
		for(int i=0; i<b.length;i++)
		{
			b[j] = a[i];
			j--;
		}
		System.out.println(Arrays.toString(b));
	}
}