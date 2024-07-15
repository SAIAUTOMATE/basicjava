package loops;

public class loop_for_while {

	public static void main(String args[]) {

		int i;
		String[] x= {"sri","rama","krishna"};
	for(i=0;i<=x.length;i++)
	{
		System.out.println("raamaa"+i);
	}

	
	loop_for_while obj = new loop_for_while();
obj.whileloop();
obj.dowhileloop();
	
	}

	void whileloop()
	{
		System.out.println("come tro 2nd one");

		
		int cou=90;
		while(cou<=100)
		{
			
			System.out.println("ramaaaa!"+cou);
		cou++;
		}
		
		
	}


	
	void dowhileloop()
	{
		System.out.println("come third dowhile one");

		
		int count=90;
		 do
		 {
			 System.out.println("count"+count);
			 count++;
		 }while(count<100);
			 
		
	}

	
}
