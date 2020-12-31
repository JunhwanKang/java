package cast;

class Parent{
	int p = 10;
}
class Child extends Parent{
	int c = 20;
}
public class CastTest {
	public static void main(String[] args) {
		Parent p = new Parent();
		Child c1 = new Child();
//		Child c2 = new Parent();
		
		// 참조변수 y는 Child객체를 가리키는 것이 아니라
		// Child 객체 내부의 Parent를 가리킨다.
		Parent y = new Child();
		System.out.println(y.p);
//		System.out.println(y.c);
		// .이 더 우선순위가 높기 때문에 가로를 쳐 준다.
		// 이런 형변환은 매우 위험하다.
		((Child)y).c = 30;
	}
}
