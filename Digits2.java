import java.util.*;
class Digits2
{
	public static void main(String[] args)
	{
		/*
	Scanner num = new Scanner(System.in);
	System.out.println("Enter number whatever u want: ");
	int mum = num.nextInt();
	*/
	int mum = 1098;
	int count = 0;//
	while(mum!=0)
	{
		count++;
		mum = mum/10;
	}
	System.out.println("The count is: "+ count);
	star();
}

public static void star()
{
	int p = 1098;
	
	int jod = 0;
	
	while(p!=0)
	{
		jod++;
		p = p/10;
	}
	System.out.println(jod);
}
}
//until mum becomes 0 it will work like iteration and count increase by 1