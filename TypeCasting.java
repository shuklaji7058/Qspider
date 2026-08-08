class TypeCasting
{
	public static void main(String args[])
	{
	//Implicitly
	int a = 234;
	double d = a;
	System.out.println("Implicitly: d: " + d);
	

	//Explicitly OR Narrowing & Data Loss
	
	//if we want to perform typecasting explicitly then we need to put datatype in between 2 ( ) round brackets.
	double d1 = 34.5;
	int a1 = (int) d1;  
	System.out.println("a1: " + a1);//output is 34
	
	int a4 = 130;
	byte b1 = (byte) a4;
	System.out.println("b1: " + b1); //output is -126

	int a3 = (int)b1;
	System.out.println("a3: " + a3);//output is -126
	
	
	//Explicitly OR Narrowing & No Data Loss
	double d2 = 33.0000;
	int a2 = (int) d2;
	System.out.println("a2: " + a2);//output is 33
	
	double d3 = 23456789125497L;
	//double d3 = 234567891254.97;
	int a5 = (int)d3;
	System.out.println("a5: " + a5);//output is 2147483647
	System.out.println("d3: " + d3);//output is 2.34567891254E11
	
	float f1 = 2.3f;	
	double d6 = f1;
	System.out.println("d6: " + d6);
	
	char ch1= 97;
	double d4 = (double) ch1;
	System.out.println("d4: " + d4);// output is 97.00
	
	double d5 = 97.89;
	char ch2 = (char) d5;
	System.out.println("ch2: " + ch2); //output is a

	}

}