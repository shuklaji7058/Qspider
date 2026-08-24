import java.util.Scanner;
class ScannerM13
{
	public static void main(String[] args){
	Scanner s = new Scanner(System.in);
		System.out.println("*********SCANNER CLASS************");
		
		System.out.println("enter product name: ");
		String name = s.next();
		
		System.out.println("enter product id");
		int id = s.nextInt();
		
		System.out.println("enter price of the product");
		double price = s.nextDouble();
		
		System.out.println("enter a char value");
		char ch = s.next().charAt(0);
		
		System.out.println("*********PRODUCT DETAILS************");
		
		System.out.println("PRODUCT NAME: " + name);		
		System.out.println("PRODUCT ID: " + id);
		System.out.println("PRODUCT PRICE: " + price);
		System.out.println("char entered: "+ ch);
		
		System.out.println("*********Thank You************");
		s.close();

}
}