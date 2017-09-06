package edu.wust.io;

import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class GZIPSmpl {
	public static void main(String[] args) throws IOException {
		
	     FileInputStream in = new FileInputStream("c://a//Hello.txt"); 
	     GZIPOutputStream out = new GZIPOutputStream(
	                                   new FileOutputStream("c://a//test.gz"));
	    
	     int c;
	     while((c = in.read()) != -1) out.write(c); //Ð´Ñ¹ËõÎÄ¼þ    
	     in.close();
	     out.close();
	     
	     
	     System.out.println("Reading file form c:/test.gz to monitor");
	     BufferedReader in2 = new BufferedReader(
	                                         new InputStreamReader( 
	                                           new GZIPInputStream(
	                                             new FileInputStream("c://a//test.gz"))));
	     String s;
	     while((s = in2.readLine()) != null) System.out.println(s); 
	     in2.close();
	     
	     System.out.println("Writing decompression to c://a//newHello.txt");
	     GZIPInputStream in3=new GZIPInputStream(
	                                           new FileInputStream("c://a//test.gz"));
	     FileOutputStream out2=new FileOutputStream("c://a//newHello.txt");
	     while((c=in3.read())!=-1) out2.write(c);  
	     in3.close();
	     out2.close(); 	
	   }
	}



