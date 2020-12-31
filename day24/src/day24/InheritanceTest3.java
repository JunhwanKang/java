package day24;

class Parent{
	int p = 10;
}
class Child extends Parent{
	int c = 20;
}
public class InheritanceTest3 {
	public static void main(String[] args) {
		// 자식의 참조변수로 부모 객체를 가리키게? x
//		Child obj1 = new Parent();
		// 부모의 참조변수로 자식 객체를 가리키게? o
		// 부모를 다룰 수 있다면 자식도 다룰 수 있다.
		Parent obj2 = new Child();
	}
}
