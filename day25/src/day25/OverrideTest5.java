package day25;

import java.util.ArrayList;

class Shape{
	public void draw() { }
}

class Triangle extends Shape{
	public void draw(){System.out.println("삼각형그리기");}
}
class Rect extends Shape{
	public void draw(){System.out.println("사각형그리기");}
}
class Circle extends Shape{
	public void draw(){System.out.println("원그리기");}
}

public class OverrideTest5 {
	public static void main(String[] args) {
		ArrayList<Shape> list = new ArrayList<Shape>();
		list.add(new Triangle());
		list.add(new Circle());
		list.add(new Rect());
		
		for(Shape s : list) {
			s.draw();
		}
	}
}
