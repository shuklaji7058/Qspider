import java.util.*;
class ArrayPractise
{
	public static void main(String[] args)
	{
		/*
		int[] arr = new int[3];
		arr[0] = 23;
		arr[1] = 14;
		arr[2] = 34;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		int[] arr1 = {1,2,3,4};
		System.out.println(arr1[0]);
		
		for(int i = 0; i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		*/
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int numbers[] = new int[size];
		
		for(int i=0; i<size; i++)
		{
			numbers[i] = sc.nextInt();
		}
		for(int j=0; j<size; j++)
		{
			System.out.println(numbers[j]);
		}
	}
}