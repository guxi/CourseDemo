package edu.wust.io;

import java.io.File;

public class helloFile {

	public static void main(String[] args) {
		File file=new File("c:"+File.separator+"a"+File.separator+"Hello1.txt"); 		
		//File f=new File("c:\\a\\Hello.txt");
		if( file.exists() ) 
			 	file.delete();
		else
			 try{
			   	 file.createNewFile();
			   	 
			  }
			  catch(Exception e){ 	  
	          	System.out.println(e.getMessage());
			  }
		}
	}


