class DtoB
{
	public static void main(String[] args)
	{
		int n = 43;
		System.out.println("****DECIMAL TO BINARY****");
		StringBuffer sb = new StringBuffer();
		while(n!=0)
		{
			int rem = n%2;
			sb.append(rem);
			n = n/2;
		}
		
		System.out.println(sb.reverse());
	}
}