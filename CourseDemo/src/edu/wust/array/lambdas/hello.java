package edu.wust.array.lambdas;

public class hello {
	  Runnable r1 = () -> { System.out.println("1"+this); };
	  Runnable r2 = () -> { System.out.println(toString()); };
	  public String toString() {  return "Hello, world"; }
	  
	  
	  
	  
	  public static void main(String[] args) {
		    new hello().r1.run();
		    new hello().r2.run();
		  }
}
