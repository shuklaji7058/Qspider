import java.util.Arrays;
class ZigZagArray
{
	public static void main(String[] args)
	{
//-------------------------------------(1)-----------------------------------------
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
//-------------------------------------(2)-----------------------------------------

		int[] m = {11,12,13,14,15,16};
		String[] z = {"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen"};
		
		String[] g = new String[m.length + z.length];
		
		int t=0,p=0;
		
		for(int f=0; f<g.length; f++)
		{
			if(f%2==0)
			{
				g[f]=String.valueOf(m[t]);
				t++;
			}
			else
			{
				g[f]=z[p];
				p++;
			}
		}
		System.out.println(Arrays.toString(g));
		
//------------------------------(3)-------------------------------------------------

		String[] str = {"Virat","Sachin","Sunil","Jasprit","Shubhman"};
		String[] snm = {"Kohli","Tendulkar","Chettri","Bhumrah","Gill"};
		
		String[] add = new String[str.length + snm.length];
		
		int pstr = 0,psnm=0;

		for(int name=0; name<add.length; name++)
		{
			if(name%2==0)
			{
				add[name]=str[pstr];
				pstr++;
			}
			else
			{
				add[name]=snm[psnm];
				psnm++;
			}
		}
		System.out.println(Arrays.toString(add));
	}
}	
		

			
