/*
(&)-AND
(|)-OR
(^)-XOR
(~)-NOT (~n = -(n + 1))-flips every bit
Table (int a = 8(1000), b = 9(1001)))
-----| |--------------------
|a|b|| |(&)|(|)|(^) |(~a)|
-----| |--------------------
|1|1|| | 1 | 1  | 0  | 0  |
|0|0|| | 0 | 0  | 0  | 1  |
|0|0|| | 0 | 0  | 0  | 1  |
|0|1|| | 0 | 1  | 1  | 0  |
----------------------------
|8|9|| | 8 | 9  |  1 | -9 |
*/

//---------------------------------------------------------------
class Bitwise
{
	public static void main(String args[])
	{
		int a = 8, b = 9;
		System.out.println("AND: " + (a & b));
		System.out.println("OR: " + (a | b));
		System.out.println("XOR: " + (a ^ b));
		System.out.println("NOT: " + (~a));
//-----------------------------------------------------------------

		System.out.println("****Check Even number Using Modulus(%)****");
	
		int c = 26;
		if(c%2==0)
		{
			System.out.println("Even number");
		}
		else
		{
			System.out.println("Odd Number");
		}
//-----------------------------------------------------------------

		System.out.println("****Check Even number Using Bitwise AND(&) ****");
		
		int d = 23;
		if((d&1)==0)//this will give output as Odd Number
		//if((d&1)==1)//this will give output as Even Number
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("Odd Number");
		}		
		
//----------------------------------------------------------------

		System.out.println("****Check Even number Using (/ and *) ****");
		
		int e = 13;
		int m = e/2;
		
		if(m*2 == e)//This will give Odd number
		//if(m*2 != e)//This Will give Even Number

		{
			System.out.println("Even number");
		}
		else
		{
			System.out.println("Odd number");
		}
//-----------------------------------------------------------------------------------------------------------
		
		int ab = 5;
		System.out.println(~ab);
	}
}