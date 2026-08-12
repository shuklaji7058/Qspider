//Example - String res = 10 > 5 ? "Yes" : "No";

class Ternary
{
	public static void main(String args[])
	{
		int a = 10;
		int b = 15;
		
		System.out.println(a<b ? "a is smaller" : 'b');
//---------------------------------------------------------------

		String res = a>b ? "correct" : "Wrong";
		System.out.println(res);
//---------------------------------------------------------------
	
		int c = 12;
		System.out.println((c%2==0) ? "Even Number" : "Odd Number");
//---------------------------------------------------------------

		int d = 24;
		int e = c/2;
		System.out.println((e%2==0) ? "Even number" : "Odd Number");
//---------------------------------------------------------------

		boolean bn = false;
		double res2 = bn ? 20 : 40;//if we not give any value after 20 or 40 it will give default value as .0 bcoz datatype is in double
		System.out.println(res2);
//----------------------------------------------------------------

		int res3 = bn ? 20 : (int)40.34;
		System.out.println(res3);//bcoz of typecasting and int datatype this will give only 40
//----------------------------------------------------------------

		boolean has_license = true;
		int age = 23;
		
		String drive = (has_license && age>=18) ? "Can Drive" : "Can't Drive";
		System.out.println(drive);
		
		int ad = 5;
		int ba = 6;
		int cb = 7;
		
		System.out.println((ad<ba && ad<cb) ? "ad is lesser" : 'b');
	}
}