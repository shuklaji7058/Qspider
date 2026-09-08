import java.util.Arrays;
class Array1
{
	public static void main(String[] args)
	{
		//Without new Keyword
		int [] a = {11, 22, 33};
		//index -   0,  1 , 2
		System.out.println(a); //output will be an address
		System.out.println(a[1]);//output is 22
		System.out.println(Arrays.toString(a));//output is [11, 22, 33]
		a[2] = 54;//Reassigned 33 to 54 
		System.out.println(Arrays.toString(a));//output becomes [11, 22, 54]
		System.out.println("Length of 'a' array: " + a.length);//length is 3
//-----------------------------------------------------------------------------		
		//With new Keyword
		int[] b = new int[5];
		System.out.println(b);//output will be an address
		System.out.println(Arrays.toString(b));//output is [0, 0, 0, 0, 0] bcoz default value of integer is 0
		
		System.out.println("Length of 'a' array: "+ b.length);//length is 5
		
		//Assigning value
		b[0] = 23;
		b[1] = 34;
		b[2] = 44;
		b[3] = 55;
		b[4] = 22;
		System.out.println(Arrays.toString(b));//output is [23, 34, 44, 55, 22]
//-----------------------------------------------------------------------------		
		int[] c = new int [1];
		System.out.println(c);//output will be an address
		System.out.println(Arrays.toString(c));//output is [0]
		c[0] = 65;// assign the value to the 0 index by 65
		System.out.println(Arrays.toString(c));//output is [65]
//-----------------------------------------------------------------------------

		int[] d = new int[0];
		System.out.println(d);//output will be an address
		System.out.println(Arrays.toString(d));//output will be blank []
		/*
		d[0] = 44;
		System.out.println(Arrays.toString(d));
		//when we try to assign value to this 0 size the output will be ArrayIndexOutOfBoundsException bcoz Index 0 out of bounds for length 0
		*/
//--------------------------------------------------------------------------------

		String[] str = new String[4];
		System.out.println(Arrays.toString(str));//output will be an default value of String that is [null, null, null, null]

//--------------------------------------------------------------------------------
		
		String[] s2 = {"Shiva", "Parvti", "Ganesh", "Hanuman", "Laxmi", "Vishnu"};
		for(int i=0; i<s2.length; i++)
		{
			System.out.println(s2[i]);
		}
		
		System.out.println(Arrays.toString(s2));//[Shiva, Parvti, Ganesh, Hanuman, Laxmi, Vishnu]
		System.out.println("Length of 's2' array: " + s2.length);//length is 6

	}
}