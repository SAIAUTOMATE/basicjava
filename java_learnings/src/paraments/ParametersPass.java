package paraments;

public class ParametersPass {

	public static void main(String[] args) {
		ParametersPass obj1 = new ParametersPass();
		obj1.add(22, 110);
		obj1.sub(22, 110);
	}
	
	public void add(int a, int b)
	{
		int c=a+b;
		System.out.println("additon of c is:"+c);
		
	}
	
	public void sub(int a, int b)
	{
		int c=b-a;
		System.out.println("subs of c is:"+c);
		
	}

}
