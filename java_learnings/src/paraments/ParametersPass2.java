package paraments;

public class ParametersPass2 {

	public static void main(String[] args) {
		DynamicCalci obj1 = new DynamicCalci();
	
int sum=	obj1.add(22, 110);
		System.out.println("additon of c is:"+sum);
	double sub=	obj1.sub(2.12, 11.10);
		System.out.println("subs of c is:"+sub);
		
String fullname = DynamicCalci.fullname("sai", "krishna!");
System.out.println("yeahh!ramaaa your fullname is "+fullname);
	}
	
	public int  add(int a, int b)
	{
		int c=a+b;
//
		return c;
	}
	
	public double sub(double a, double b)
	{
		double c=b-a;
		return c;	
	}

}
