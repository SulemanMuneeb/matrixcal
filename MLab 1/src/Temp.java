import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * This program reads a text file line by line and print to the console. It uses
 * FileOutputStream to read the file.
 * 
 */
public class Temp {

	

	
	
  @SuppressWarnings("deprecation")
public static void main(String[] args) {
	  
	  

		int[ ][ ] Mat1 = new int[3][3];
		int[ ][ ] Mat2 = new int[3][3];
		int[ ][ ] Mat3 = new int[3][3];
		
		int row=0;
		int col=0;
		int matCounter=0;

    File file = new File("C:/Users/BlackSpider/Desktop/matrix.txt");
    FileInputStream fis = null;
    BufferedInputStream bis = null;
    DataInputStream dis = null;

    try {
      fis = new FileInputStream(file);

      // Here BufferedInputStream is added for fast reading.
      bis = new BufferedInputStream(fis);
      dis = new DataInputStream(bis);

      // dis.available() returns 0 if the file does not have more lines.
      while (dis.available() != 0) {

      // this statement reads the line from the file and print it to
        // the console.
    	  String temp=dis.readLine();
    	  if (temp.equals("["))
    	  {
    	
    		  row=0;
    	  col=0;
    	  matCounter++;}

   if (matCounter==1)
	{
    
	   if(!temp.equals("[") && (col<3) )
	   
	   {
		   int aInt = Integer.parseInt(temp);
		   Mat1 [row][col] = aInt;   
		   col++;
	
	   }
	   
	   
		if(temp.equals(","))
		{
		 row++;
		 col=0;
		}
	
		
    	
}   //matrix 2	
   if (matCounter==2)
	{   
    
	   if(!temp.equals("[") && (col<3) )
	   
	   {
		   int aInt = Integer.parseInt(temp);
		   Mat2 [row][col] = aInt;   
		   col++;
	
	   }
	   
	   
		if(temp.equals(","))
		{
		 row++;
		 col=0;
		}
	
		
    	
}  //matrix 3
   if (matCounter==3)
	{
    
	   if(!temp.equals("[") && (col<3) )
	   
	   {
		   int aInt = Integer.parseInt(temp);
		   Mat3 [row][col] = aInt;   
		   col++;
	
	   }
	   
	   
		if(temp.equals(","))
		{
		 row++;
		 col=0;
		}
	
		
    	
}  
    	  
      
      }
      

      //add class object 
      Add a =null;
      a.addMul(Mat1, Mat2, Mat3);
    
      //multiplication class object 
      Multiplication m=null;
      int[ ][ ] temp = new int[3][3];
      temp=m.multiply(Mat1, Mat2);
      temp=m.multiply(temp, Mat3);
      
      for (int i=0;i<3;i++)
      {
    	  for (int j=0;j<3;j++)
      
    	  {
  
     System.out.println("The Multiplication result of three marix is Row "+i+" Column "+j +" "+ temp[i][j]);
     
    	  }}
      
      
      Matrix hyb=null;
      hyb.Hybrid(Mat1, Mat2, Mat3);
      
      
      
      // dispose all the resources after using them.
      fis.close();
      bis.close();
      dis.close();

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}