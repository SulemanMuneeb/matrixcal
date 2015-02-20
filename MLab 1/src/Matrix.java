
public class Matrix {

	
	public static void Hybrid(int a[][],int b[][],int d[][])
	 
	 {//multiplication o0f 2 matrix
	       int rowsInA = a.length;
	       int columnsInA = a[0].length; // same as rows in B
	       int columnsInB = b[0].length;
	       int[][] c = new int[rowsInA][columnsInB];
	       for (int i = 0; i < rowsInA; i++) {
	           for (int j = 0; j < columnsInB; j++) {
	               for (int k = 0; k < columnsInA; k++) {
	                   c[i][j] = c[i][j] + a[i][k] * b[k][j];
	               }
	           }
	       }
	       
	       // addition of third in above multiplication result.
	   	int[ ][ ] Mat = new int[3][3];
		 for (int i=0;i<3;i++)
	      {
	    	  for (int j=0;j<3;j++)
	      
	    	  {
	    		  Mat[i][j]=d[i][j]+c[i][j];
	    	  }}
		
		 
		 
		 
	     for (int i=0;i<3;i++)
	      {
	    	  for (int j=0;j<3;j++)
	      
	    	  {
	  
	     System.out.println("The multiplication of 1 & 2 and additionof 3 result of three marix is Row "+i+" Column "+j +" "+ Mat[i][j]);
	     
	    	  }}
	   }
	 
	 
}
