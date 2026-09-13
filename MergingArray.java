import java.util.Arrays;
class MergingArray
{
	public static void main(String[] args)
	{
		//Merging two arrays
			/*
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
			*/
//---------------------(2)--------------------------------------------------
		
		int[] c = {12,13,14,15,16,17};
		int[] d = {18,19,20,21,22,23};
		
		int[] e = new int[c.length + d.length];
		
		int j=0,k=0;
		
		for(int v=0; v<e.length; v++)
		{
			if(v<c.length)
			{
				e[v]=c[j];
				j++;
			}
			else
			{
				e[v]=d[k];
				k++;
			}
		}
		System.out.println(Arrays.toString(e));
	}
}		
		
		
		