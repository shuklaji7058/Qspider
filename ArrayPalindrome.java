class ArrayPalindrome
{
	public static void main(String[] args)
	{
		char[] ch = {'m','a','l','a','y','a','l','a','m'};
		
		int start = 0;
		int end = ch.length-1;
		boolean flag = true;
		
		while(start<end)
		{
			if(ch[start] != ch[end])
				{
					flag = false;
					break;
				}
				start++;
				end--;
		}
		
		if(flag)
			System.out.println("It is a Palindrome array");
		else
			System.out.println("It is not a Palindrome array");
	}
}