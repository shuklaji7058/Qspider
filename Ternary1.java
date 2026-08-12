class Ternary1
{
	public static void main(String args[])
	{
		int a = 9;
		int b = 8;
		int c = 7;


		String res = (a>b && a>c) ? "a is greatest" : (b>c ? "b is greatest" : "c is greatest");
				System.out.println(res);

		
		String res1 = (a>b && a<c) ? "a is greatest" : (b>c ? "b is greatest" : "c is greatest");
				System.out.println(res1);
				
		int d = 6;

				
		String res3 = (a>b && a<c && a>d) ? "a is greatest" : ((b>a && b>c) ? "b is greatest" : (c<d) ? "c is greatest" : "d is greatest");
				System.out.println("res3: " +res3);

				
System.out.println("****Without using && operator****");
			
		String res4 = a>b ? (a>c ? "a is greatest" : "c is greatest"):
							(b>c ? "b is greatest" : "c is greatest");
							
		System.out.println(res4);
		
		
		String res5 = a<b ? (a>c ? (a>d ? "a":"d")
						:(c>d ? "c":"d") )//if true
		                : b>c ? (b>d ? "b":"d")//if false
						:(c>d ? "c" : "d") ;
			System.out.println(res5);
/*	
a > b ?
│
├── TRUE → check a > c
│            │
│            ├── TRUE → check a > d
│            │             │
│            │             ├── TRUE → "a"  ← selected
│            │             └── FALSE → "d"
│            │
│            └── FALSE → check c > d
│                          ├── TRUE → "c"
│                          └── FALSE → "d"
│
└── FALSE → check b < c
*/


			
			int e = 7;
			int f = 8;
			int g = 9;
			int h = 10;
		
		String res6 = e>f ? (e<g ? (e<h ? "e":"g")
					  :(g>h ? "g":"h"))
					  :f<g ? (f<h ? "f":"h")
					  :(g<h ? "g":"h");
					  
			System.out.println(res6);
			
	}
}