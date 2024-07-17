package ArrayLDemo;

public class singleArray {

	public static void main(String[] args) {

int studnet_id[] = new int[5];
	studnet_id[0]=99;
	studnet_id[1]=(int) 119.9;
	studnet_id[2]=991;
	studnet_id[3]=919;
	studnet_id[4]=199;
	
	int size_of_array =studnet_id.length;
	
	for(int i=0;i<size_of_array;i++)
	{
	System.out.println("sudnet id of "+i+" index value is "+studnet_id[i]);
	}
	
	}

}
