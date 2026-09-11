import java.util.Arrays;
class Array5
{
	public static void main(String[] args)
	{	
		int[] b = {10,20,30,40};
		
		int start = 0;
		int end = b.length-1;
		
		while(start<end)
		{
			int temp = b[start];
			
			b[start] = b[end];
			b[end] = temp;
			start++;
			end--;
		}
		System.out.println(Arrays.toString(b));
	
	
		for(start=0,end=b.length-1;start<end;start++,end--)
		{
			int temp = b[start];
			b[start] = b[end];
			b[end] = temp;
		}
	System.out.println(Arrays.toString(b));
	
//----------------------------------------------------------------------------
			//Merging two arrays
			
			int[] a = {12,13,14,15};
			int[] d = {16,17,18,19};
			int[] c = new int[a.length + d.length];
			
			int j=0,k=0;
			for(int i=0;i<c.length;i++)
			{
				if(i<a.length)
				{
					c[i]=a[j];
					j++;
				}
				else
				{
					c[i]=d[k];
					k++;
				}
			}
			System.out.println(Arrays.toString(c));
			
//---------------------------------------------------------------------			
			//ZigZag Array
			/*
			int[] a = {10,20,30,40};
			int[] d = {11,21,31,41};
			int[] c = new int[a.length + d.length];
			
			int j=0,k=0;
			for(int i=0;i<c.length;i++)
			{
				if(i%2==0)
				{
					c[i]=a[j];
					j++;
				}
				else
				{
					c[i]=d[k];
					k++;
				}
			}
			System.out.println(Arrays.toString(c));
			*/
	}
}