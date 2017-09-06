package edu.wust.array.lambdas;

import java.util.ArrayList;
import java.util.List;


public class peopleRun {
	 
	  public static void main(String[] args) {
		  
		   List<People> people=new ArrayList<People>();		   
		   people.add(new People("aa",10));
		   people.add(new People("cc",30));
		   people.add(new People("bb",20));
		   people.add(new People("ff",50));
		   people.add(new People("dd",40));
		  
		  //old
		   System.out.println("1111");
		   for(People p:people){
			   System.out.println(p.getName()); }
		   
		   //循环Person::getName 
		   System.out.println("2222");
		   people.forEach((People p)->System.out.println(p.getName()));
		   System.out.println("333333");
		   people.forEach(People::getName);
		   
		   System.out.println("444444");
		   //流
		   int sum= people.stream()
				   .filter((People p)->p.getAge()>21)   //过滤
				   .mapToInt((People p)->p.getAge())	//取值			  
				   .sum();      						//统计
		   System.out.println(sum);
		  }
}
