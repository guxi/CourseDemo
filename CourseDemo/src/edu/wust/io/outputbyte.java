package edu.wust.io;

import java.io.*;

public class outputbyte {
	public static void main ( String[] args ) { 
	    String fileName = "c://a//data1.dat" ;
	     int value0  = 255, value1  = 0, value2 = -1;
	     try {
	        DataOutputStream out = new DataOutputStream(
	                                        new FileOutputStream( fileName  ) );
	        out.writeInt( value0 );
	        out.writeInt( value1 );
	        out.writeInt( value2 );
	        out.close();
	      }
	      catch ( IOException iox ){
	     	 System.out.println("Problem writing " + fileName );   }
	      }

}
