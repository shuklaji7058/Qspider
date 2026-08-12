class Operators
{
	public static void main(String args[])
	{
	
	int a = 42;
	char ch = 'A';	
	System.out.println(a + ch);//107
	
	String str = "hello";
	System.out.println(str + ch);//helloA
	
	System.out.println(ch + '[');//156
	System.out.println(ch * '[');//5915
	
	
	System.out.println(ch + '[' + 'a' + "hello" + a);//253hello42
	
	System.out.println(26/7);//Quotient 3
	System.out.println(26%7);//Remainder 5
	
	System.out.println("sum "+ 10+2);//sum102
	System.out.println("sum " + (10+2));//sum 12
	
	System.out.println("****Compound Arithmetic*****");
	
	int m = 12;
	int n = 5;
	int c = 4;
	
	System.out.println(m+n);//17
	System.out.println(m);//12
	
	System.out.println(m+=n);//17
	System.out.println(m);//17
	System.out.println(m+n);//22
	
	System.out.println(n+=m);//22
	System.out.println(n);//22
	
	System.out.println(n+=c);//26
	System.out.println(n);//26
	System.out.println(m+n);//43
		System.out.println(m-n);//-9

	System.out.println(m-=n);//  (m = m-n) = -9
	System.out.println(n-=m);//35 bcoz of this(n = n-m) i.e (26 - (-9))

System.out.println("*****Relational operator*****");

	System.out.println('a' == 'a');
	//System.out.println("a" == 'a');//will get an error
	
	System.out.println(12.45f == 'a');



System.out.println("*****Logical AND operator*****");

	String brand = "Tata";
	double price = 2000000;
	
	if(brand == "Tata" && price <= 1900000)
	{
		System.out.println("Affordable");
	}
	else
	{
		System.out.println("Price is too much");
		
	}
	
	int bn = 5;
	int cn = 3;
	
	if(bn >= cn && cn <= bn)
	{
			System.out.println("Correct");
	}	
	else
	{
		System.out.println("Wrong");
	}
	
	System.out.println("*****Logical OR operator*****");
	
	if(bn < cn || cn < bn)
	{
		System.out.println("Awesome");
	}
	else
		System.out.println("Awful");
	
	System.out.println("*****Logical NOT(!) operator*****");
	int an = 4;
	int mn = 6;
	int fn = 7;
	
	boolean result = an > mn;
	System.out.println(!result); //force to change true to false | false to true 
	
	
	//boolean is_logged_in = false;
	boolean is_logged_in = true;

	if(! is_logged_in)
	{
		System.out.println("user is not logged in");
	}
	else
	{
		System.out.println("user is logged in");
	}
	
	boolean bnc = false;
	
	System.out.println("negate the input " + !bnc);
	
	
	char size = 'l';
	String color = "blue";
	
	if((size == 'l' || size == 'L') && color.equalsIgnoreCase("red"))
	{
		System.out.println("Buy that Product");
	}
	else
	{
		System.out.println("Do not buy");
	}
	
	int cd = 4;
	int bd = 9;
	int dd = 10;
	
	if((cd < bd || dd > cd) || (bd < dd && bd < cd))
	{
			System.out.println("You are right");
	}	
	else
	{
		System.out.println("You are Wrong");
	}
	
	String carbrand = "Suzuki";
	double rate = 3000000;
	
	if((carbrand.equals("Suzuki")) || (carbrand.equals("TATA")) && (rate >=3000000))
	{
		System.out.println("Afordable");
	}
	else
	{
		System.out.println("Not Afordable");
	}
	}
		
}