
public class Add {
	
	
	public static void addMul(int a[][],int b[][],int c[][])
	
	{
		

		int[ ][ ] Mat = new int[3][3];
		 for (int i=0;i<3;i++)
	      {
	    	  for (int j=0;j<3;j++)
	      
	    	  {
	    		  Mat[i][j]=a[i][j]+b[i][j]+c[i][j];//adding matrix togather
	    	  }}
		
		 
		 
		 // display results
	     for (int i=0;i<3;i++)
	      {
	    	  for (int j=0;j<3;j++)
	      
	    	  {
	  
	     System.out.println("The addition result of three marix is Row "+i+" Column "+j +" "+ Mat[i][j]);
	     
	    	  }}
	}

}
