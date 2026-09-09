import java.util.Scanner;
class NumberPractise
{//Digits
	public static void main(String[] args)
	{
		/*
		int n = 45678;
		int count = 0;
		while(n!=0)
		{
			count++;
			n = n/10;
		}
		System.out.println(count);
//----------------------------------------------------------------------------------------

		System.out.println("Enter a number u want: ");
		Scanner sc = new Scanner(System.in);
		int u = sc.nextInt();
		
		int add = 0;
		while(u!=0)
		{
			add++;
			u = u/10;//without this this will having infinite loop
		}
		System.out.println(add);
		*/
//---------------------calling the method-----------------------------------------		
		kik();
		adding();
		multiply();
		
	}
//===================================================================================
	public static void kik()
	{
		int k = 9876;
		
		int mum = 0;
		while(k!=0)
		{
			mum++;
			k = k/10;//without this this will having infinite loop
		}
		System.out.println(mum);
		

	}
//====================================================================================
	//addDigits
	public static void adding()
	{
		int p = 23476;       // original number
		int coc = 0;         // sum starts from 0
		
		while(p != 0)
		{
			int rem = p % 10;    // get last digit
			coc = coc + rem;     // add digit to sum
			p = p / 10;          // remove last digit
		}	
		System.out.println(coc);
	}
//=====================================================================================	
	public static void multiply()
	{
		int s = 5432;
		int sum = 1;
		while(s!=0)
		{
			int min = s%10;
			sum = sum * min;
			s = s/10;
		}
		System.out.println(sum);
	}
}