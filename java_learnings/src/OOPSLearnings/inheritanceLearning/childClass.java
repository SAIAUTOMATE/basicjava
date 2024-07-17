package OOPSLearnings.inheritanceLearning;

public class childClass extends BaseClass {

	public static void main(String[] args)
	{
		childClass obj1= new childClass();
		obj1.add();
		obj1.div();
		BaseClass obj2= new BaseClass();
		obj2.add();
		obj2.sub();
		BaseClass obj3= new childClass();
		obj3.add();
		obj3.sub();
//		childClass obj3= new BaseClass();
		
	}

	public  void mul()
	{
			System.out.println("hey I am in the base class and the mult is 1250 ");
		}

	
	public  void div()
	{
			System.out.println("hey I am in the base class and the divison is 12 ");
		}

}
