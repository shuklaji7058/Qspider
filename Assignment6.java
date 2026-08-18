class Assignment6
{
	public static void main(String[] args)
	{
		int num = -10;
		String res = (num>=-10)?"Negative number":"Positive number";
		System.out.println(res);
		
//----------------------------------------------------------		
		int x =57;
		int y =0;
		int z=97;
		int k=-4;
		int res1 = x++ + --y - k++ + z-- + x++ + --z - k--;
		System.out.println(res1);//313
/*
57 + (-1)=56
56 - (-4)=60
60 + 97=157
157 + 58=215
215 + 95=310
310 - (-3)=313
output is 313
*/
//--------------------------------------------------------
		int s = 24;
		int w = 57;
		int f = -6;
		int g = 94;
		int ans = s++ + ++w + ++s + f-- - --w - ++g + --f;
		System.out.println(ans);//
/*
24 + 58 = 82
82 + 26 = 108
108 + (-6) = 102
102 - 57 = 45   
45 - 95 = -50
-50 + (-8) = -58
output is -58

*/
//--------------------------------------------------------

		int a =25;
		
		int b= a++ + ++a + --a + a--;
		int c= ++b + a++ + --b - b--;
		int d= c++ + --c + c-- + ++b;
		int e= d++ + --d - d-- + c++;
		System.out.println(a);//26
		System.out.println(b);//104
		System.out.println(c);//130
		System.out.println(d);//493
		System.out.println(e);//623

	}
	
}