package ArrayLDemo;

public class TwoD_arryas {

	public static void main(String[] args) {
 
		int school[][]= new int[2][2];
		
		school[0][0]=12;
		school[1][0]=12*3;
		school[0][1]=12*4;
		school[1][1]=12*5;
		
		for(int i=0;i<2;i++)
		{
			
			for(int j=0;j<2;j++)  
			{
				
				System.out.println("school values for elements i : "+i+" and j:"+j+"  : "+school[i][j]);
			}
		}
		
	}

}
