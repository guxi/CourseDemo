package edu.wust.exception;

import java.io.FileInputStream;
import java.io.IOException;

public class TryCatchTest {

	void getFile(String file) {
		FileInputStream in = null;
		try {

			/**************** 除零 ********************/
			

			/**************** 越界 ********************/
			
			 int[]arr={1,2,3}; int brr=arr[3];
			 

			/**************** iO ********************/
			in = new FileInputStream(file);
			int b;
			b = in.read();
			while (b != -1) {
				System.out.print((char) b);
				b = in.read();
			}
			
			/*****************************************/
			
		} catch (IOException e) {
			System.out.println("IOException do something!");
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("OutOfBounds do something!");
			System.out.println( e.getMessage());
			System.out.println(e.getStackTrace());
		} catch (Exception e) {
			System.out.println("Exception do something!");
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
		}

		finally {
			// 关闭文件流
			try {
				if (in != null)
					in.close();
				System.out.println("finally has done");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
