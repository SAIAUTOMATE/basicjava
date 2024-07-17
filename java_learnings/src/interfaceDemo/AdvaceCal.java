package interfaceDemo;

public class AdvaceCal implements Calc{

	public static void main(String[] args) {
		AdvaceCal obj1 = new AdvaceCal();
		obj1.sinmeth();
		obj1.cos();
		obj1.add();
		obj1.sub();
	}

	public void sinmeth() {
		System.out.println("I am in sin metrhod");	
		}

	public void cos() {
		System.out.println("I am in sin cos");	
		}


	
	 
	@Override
	public void add() {
	System.out.println("I am in addtion");	
	}

	@Override
	public void sub() {
		System.out.println("I am in Subs");	
		
	}

}
