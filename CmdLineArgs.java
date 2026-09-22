class CmdLineArgs
{
	public static void main(String[] args)
	{
		//command line arguments
		/*for(String fan : args)
		  {
			System.out.println(fan);
		  }*/
		
		System.out.println(args);
		System.out.println(args.length);
		System.out.println("using s.o.pln- " + args[0]);
		
		for(int i=0; i<args.length;i++)
		{
			System.out.println(args[i]);
		}
		
	}
}