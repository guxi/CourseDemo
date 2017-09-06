package edu.wust.io;

import java.io.*;

public class readAndWrite {

	public static void main(String[] args) {
		
		 try{ 
			 File read = new File("c:\\a\\Hello33.txt");
			 File write = new File("c:\\a\\Hello.txt"); 
			 BufferedReader br = new BufferedReader( new FileReader(read)); 
			 BufferedWriter bw = new BufferedWriter( new FileWriter(write)); 
				 
			 String temp = null; 
			 temp = br.readLine();
			 while(temp!=null){			 
			 //写文件
			  bw.write(temp);
			  temp = br.readLine();
			  if(temp == null)break;
			  bw.write("\n");	  //只适用Windows系统 ,继续读文件 
			  } 
			 bw.close();
			br.close(); 
			 }catch(FileNotFoundException e)
		 		{ 
				 
				 System.out.println (e.getMessage());
				 e.printStackTrace();
			 }catch(IOException e)
		 		{e.printStackTrace(); } 
		 } 

	}



