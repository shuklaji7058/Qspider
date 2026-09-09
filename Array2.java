import java.util.Scanner;
import java.util.Arrays;
class Array2
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = s.nextInt();
		int[] a = new int[size];
		System.out.println(Arrays.toString(a));
		System.out.println("enter " + size + " elements for the array");
		for(int i=0; i<size; i++)
		{
			System.out.println("enter element");
			a[i] = s.nextInt();
		}
		System.out.println(Arrays.toString(a));
	
System.out.println("---------SORTING ARRAYS--------------");	
		int[] b = {12,13,14,15,2,44};
		System.out.println(Arrays.toString(b));
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
	}
}