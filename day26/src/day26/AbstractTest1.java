package day26;

import java.util.ArrayList;
import java.util.List;

abstract class Shape{
	// 추상메소드
	// 추상메소드를 가진 클래스는 추상 클래스가 된다
	// 추상 클래스는 객체를 생성할 수 없다
	public abstract void draw();
}
class 삼각형 extends Shape{
	public void draw() {
		System.out.println("삼각형 출력");
	}
}
class 사각형 extends Shape{
	public void draw() {
		System.out.println("사각형 출력");
	}
}
public class AbstractTest1 {
	public static void main(String[] args) {
		List<Shape> list = new ArrayList<Shape>();
		list.add(new 삼각형());
		list.add(new 사각형());
		list.add(new 삼각형());
		
		for(Shape shape: list)
			shape.draw();
	}
}
