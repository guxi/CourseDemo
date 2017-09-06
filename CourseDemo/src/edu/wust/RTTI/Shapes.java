package edu.wust.RTTI;
import java.util.ArrayList;

public class Shapes {
	public static void main(String[] args) {
		ArrayList<Shape> s = new ArrayList<Shape>();
		s.add(new Circle());
		s.add(new Square());
		s.add(new Triangle());		
		for(Shape S:s){
			S.draw();
		}
	}
}
