package edu.wust.RTTI;

public class factoryTest {

	public static void main(String[] args) {
		Shape c=shapeFactory.shapeCreator(1);		
		c.draw();
		Shape s= shapeFactory. newShape("edu.wust.RTTI.Square");
		s.draw();
		
		//�ж�(�ǻ���)���������Ƿ���ͬ		
		System.out.println((c instanceof Shape));
		System.out.println((c instanceof Circle));		
		System.out.println((s instanceof Shape));
		
		/*int d;
		System.out.println((d instanceof int));*/
	}
}