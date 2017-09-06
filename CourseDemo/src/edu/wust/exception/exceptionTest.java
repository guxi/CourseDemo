package edu.wust.exception;

public class exceptionTest {

	public static void main(String[] args)  {
		
		try{
			ThrowTest t=new ThrowTest();
			//t.throwTest();
			try {
				t.throwTest();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}	
			
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
		TryCatchTest gtry=new TryCatchTest();		
		gtry.getFile("sadf.txt");
	
	}
}
