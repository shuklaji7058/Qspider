class Increment2
{
	public static void main(String [] args){
	int a = 7;
	int b = a++ + a-- + --a + ++a;
	int c = b++ + ++a - ++b - --b + a++;
	
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	}
}