package edu.wust.exception;

import java.io.FileInputStream;
import java.io.IOException;

public class ThrowTest {
	
	void throwTest() throws Exception  {
		//void throwTest()   {
		/**************** ���� ********************/
		
		int i = 1;
		int j = 0;
		if(j==0)throw new Exception("j����Ϊ0��������");	
		
		int z = i / j;		
	}
	
	
	/*void getFile(String file)throws Exception{
		*//**************** ���� ********************//*
		
		int i = 1;
		int j = 0;
		if(j==0)throw new Exception("j����Ϊ0��������");	
		int z = i / j;		
		
		
		FileInputStream in = null;
		
			in = new FileInputStream(file);
			int b;
			b = in.read();
			while (b != -1) {
				System.out.print((char) b);
				b = in.read();
			}
	
			   // �ر��ļ� �ɹ�ʱִ��
				try {
					System.out.println("throwsfinally has done");
					if(in!=null)in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}*/
		}
		
	

