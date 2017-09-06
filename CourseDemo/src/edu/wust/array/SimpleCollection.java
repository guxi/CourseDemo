package edu.wust.array;
import java.util.*;

public class SimpleCollection {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		for(int i = 0; i < 10; i++)
				c.add( Integer.toString(i) );
		Iterator<String> it = c.iterator();
		while(it.hasNext())
				System.out.println(it.next());
		}

}
