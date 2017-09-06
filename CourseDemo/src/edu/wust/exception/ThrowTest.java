package edu.wust.exception;

import java.io.FileInputStream;
import java.io.IOException;

public class ThrowTest {
	
	void throwTest() throws Exception  {
		//void throwTest()   {
		/**************** 除零 ********************/
		
		int i = 1;
		int j = 0;
		if(j==0)throw new Exception("j不能为0！！！！");	
		
		int z = i / j;		
	}
	
	
	/*void getFile(String file)throws Exception{
		*//**************** 除零 ********************//*
		
		int i = 1;
		int j = 0;
		if(j==0)throw new Exception("j不能为0！！！！");	
		int z = i / j;		
		
		
		FileInputStream in = null;
		
			in = new FileInputStream(file);
			int b;
			b = in.read();
			while (b != -1) {
				System.out.print((char) b);
				b = in.read();
			}
	
			   // 关闭文件 成功时执行
				try {
					System.out.println("throwsfinally has done");
					if(in!=null)in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}*/
		}
		
	

