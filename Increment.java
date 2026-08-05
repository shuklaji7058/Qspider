class Increment{

	public static void main(String args[]){
		
		int a = 9;
		
		int b = ++a + a++ + a++;
		
		int c = ++a + ++a + a++;
	
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);


	}
}