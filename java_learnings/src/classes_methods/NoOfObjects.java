package classes_methods;

public class NoOfObjects {

static int	NoofObjects=0;
	public NoOfObjects()
	{NoofObjects++;
		
	}
	
	public static void main(String[] args) {
		NoOfObjects e1 = new NoOfObjects();
		NoOfObjects e2 = new NoOfObjects();
		NoOfObjects e3 = new NoOfObjects();
		NoOfObjects e4 = new NoOfObjects();
		NoOfObjects e5 = new NoOfObjects();
		NoOfObjects e6 = new NoOfObjects();

		
		
		System.out.println("no of objects: "+NoofObjects);
	}

}
