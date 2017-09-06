package edu.wust.io;

import java.io.File;

public class DirList {
	public static void main(String[] args) {
		try {
		File path = new File("c://CLASSPATH");
		String[] list;
		if(args.length == 0)
		list = path.list();
		else
		list = path.list(new DirFilter(args[0]));		

		for(String str:list)
			System.out.println(str);
		
		} catch(Exception e) {
		e.printStackTrace();
		}
		}
		}

