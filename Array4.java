import java.util.Arrays;
class Array4
{
	public static void main(String[] args)
	{
		int[] a = {9,15,30,2,22};
		System.out.println("array a: "+ Arrays.toString(a));
		System.out.println("Reverse Using Separate Array");
		int[] b = new int[a.length];
		System.out.println("array b: " + Arrays.toString(b));
		int j = b.length-1;
		for(int i=0; i<a.length; i++)
		{
			b[j] = a[i];
			j--;
		}
		System.out.println("Reverse Array: " + Arrays.toString(b));
	}
}