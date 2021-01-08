package day29;
// 자바 소스 : ObjectTest.java
// 자바 바이트 코드 : ObjectTest.class
class Apple{ }

public class ObjectTest {
	public static void main(String[] args) {
		Apple apple = new Apple();
		
		// 객체를 비교할 때는 equals() 사용
		apple.equals(apple);
	}
}
