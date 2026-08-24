import java.util.Scanner;

class ScannerEg
{
	public static void main(String [] args)
	{
		System.out.println("*********SCANNER CLASS************");
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter product name: ");
		String name = s.next();
		
		Scanner sh = new Scanner(System.in);
		System.out.println("enter product name: ");
		String name1 = sh.nextLine();
		
		Scanner shh = new Scanner(System.in);
		System.out.println("enter product name: ");
		String name12 = shh.nextLine();	
		
		System.out.println("enter product id");
		int id = s.nextInt();
		
		System.out.println("enter price of the product");
		double price = s.nextDouble();
		
		System.out.println("*********PRODUCT DETAILS************");
		System.out.println("PRODUCT NAME: " + name);
		System.out.println("PRODUCT NAME1: " + name1);		
		System.out.println("PRODUCT NAME12: " + name12);

		
		System.out.println("PRODUCT ID: " + id);
		System.out.println("PRODUCT PRICE: " + price);
		
		System.out.println("enter a char value");
		char ch = s.next().charAt(0);
		System.out.println("char entered: "+ ch);
		s.close();
		sh.close();
		shh.close();
		
	}
}