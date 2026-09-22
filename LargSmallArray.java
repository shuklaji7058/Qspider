class LargSmallArray
{
	public static void main(String[] args)
	{
		/*
		System.out.println("=====Largest Element of an array");
		int[] a = {12,33,45,55,6,876,14,9,1};
		
		int m1 = Integer.MIN_VALUE;
		int m2 = Integer.MIN_VALUE;
		int m3 = Integer.MIN_VALUE;
		
		for(int v : a)
		{
			if(v > m1)
			{
				m3 = m2;
				m2 = m1;
				m1 = v;
			}
			if(v>m2 && v!=m1)
			{
				m3 = m2;
				m2 = v;
			}
			if(v>m3 && v!=m2 && v!=m1)
			{
				m3 = v;
			}
		}
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		*/
//-------------------------------------------------------------
		System.out.println("=====Smallest Element of an array");
		int[] a = {12,33,45,55,6,876,14,9,1};
		
		int m1 = Integer.MAX_VALUE;
		int m2 = Integer.MAX_VALUE;
		int m3 = Integer.MAX_VALUE;
		
		for(int v : a)
		{
			if(v < m1)
			{
				m3 = m2;
				m2 = m1;
				m1 = v;
			}
			if(v<m2 && v!=m1)
			{
				m3 = m2;
				m2 = v;
			}
			if(v<m3 && v!=m2 && v!=m1)
			{
				m3 = v;
			}
		}
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
	}
}