import java.util.*;
class VarArgsClargs
{
	public static void main(String[] args)
	{
		System.out.println("************************");
		m1(12,34,56,78,45);
		System.out.println("************************");
		m2("anish","ravi");
	
	}
	
	public static void m1(int... a)
	{
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}
	
	public static void m2(String... b)
	{
		for(String laptop : b)
		{
			System.out.println(laptop);
		}
	}
}