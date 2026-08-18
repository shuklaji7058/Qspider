class OverLoad
{
	public static void main(String[] args)
	{
		System.out.println("method over loading - PlayerDetails");
		playerDetails("Anish",2,23456789L);
		System.out.println("------------------------------------------");
		playerDetails("Ravi",3,987654321L,10000.50);
		System.out.println("------------------------------------------");

		playerDetails("Ritu",4,12000.58,"ritu123@gmail.com",76554321L);

	}
	
	public static void playerDetails(String name,int order,long contact)
	{
		System.out.println("Name: "+name);
		System.out.println("Order: "+order);
		System.out.println("Contact: "+contact);
		
	}
	
	public static void playerDetails(String name,int order,long contact,double amount)
	{
		System.out.println("Name: "+name);
		System.out.println("Order: "+order);
		System.out.println("Contact: "+contact);
		System.out.println("Amount: "+amount);
	}
	
	public static void playerDetails(String name,int order,double amount,String email_id,long contact)
	{
		System.out.println("Name: "+name);
		System.out.println("Order: "+order);
		System.out.println("Amount: "+amount);
		System.out.println("Email_id: "+email_id);
		System.out.println("Contact: "+contact);
	}
}