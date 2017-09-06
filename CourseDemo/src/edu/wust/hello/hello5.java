package edu.wust.hello;

class hello5 { 
	public void show(String t)   //show方法的参数 t
     	{
             System.out.println(t);	
     	}
      public static void main(String[] arguments){ 
           hello5 h=new hello5();
           String s="Hello world."; //定义String类型变量，并赋值
           h.show(s); //调用方法，传入参数	
  } 
} 
