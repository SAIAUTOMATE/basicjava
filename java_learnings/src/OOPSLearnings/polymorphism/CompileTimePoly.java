package OOPSLearnings.polymorphism;

public class CompileTimePoly {

	public static void main(String[] args) {
		CompileTimePoly obj1=new CompileTimePoly();
	
		obj1.add(11, 12);
		obj1.add(21, 220, 10);
		obj1.add(22.221, 222.221);
		obj1.add(22.22, 110);
	}

	public void add(int a, int b)
	{
		int c =a+b;
		System.out.println("sum is :"+c);
		
	}
	
	public void add(double a, double b)
	{
		double c =a+b;
		System.out.println("sum is :"+c);
		
	}
	
	public void add(double a, int b)
	{
		double c =a+b;
		System.out.println("sum is :"+c);
		
	}
	public void add(int a, double b)
	{
		double c =a+b;
		System.out.println("sum is :"+c);
		
	}
	
	public void add(int a, int b,int c)
	{
		int d =c+a+b;
		System.out.println("double sum is :"+d);
		
	}
}
