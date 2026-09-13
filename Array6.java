import java.util.Arrays;
import java.util.Scanner;
class Array6
{
	public static void main(String[] args)
	{
		System.out.println("Even Elements in a new Array");
		int[] a = {12,11,1,15,16,76,88,34};
		int count = 0;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2==0)
			{
				count++;
			}
		}
		System.out.println(count + " Size with default value as " + "[0,0,0,0,0]");//5

		
		int[] b = new int[count];
		int j=0;
		
		for(int i=0; i<a.length; i++)
			{
				if(a[i]%2==0)
				{
					b[j]=a[i];
					j++;
				}
			}
			System.out.println(Arrays.toString(b));
			
//----------------------------------------------------------------------------------

		
		System.out.println("Number of Occurence of a target element");
		
		Scanner sc = new Scanner(System.in);
		int[] d = {11,12,11,22,33,44,33,11,66,77,66,11,22,33};
		System.out.println(Arrays.toString(d));
		System.out.println("Enter the target Element- ");
		int target = sc.nextInt();
		
		int count2 = 0;
		int first = 0;
		for(int i=0; i<d.length; i++)
		{
			if(d[i]==target)
			{
				count2++;
				if(count2==1)
					first=i;//vo pehla value konse index pr mila vo print karega
			}
		}
		System.out.println("The element " + target + " is present for " + count2 + " times");
		System.out.println("Index of First occurence of the element: " + first);
	}
}