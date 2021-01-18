package day35;

class Grand {
	int a = 100;
}
class Parent extends Grand{
	int b = 200;
}
class Child extends Parent{
	int c = 300;
	void info() {
		System.out.println(this.a+this.b+this.c);
		System.out.println(super.a+super.b+this.c);
	}
}
public class Test2 {
	public static void main(String[] args) {
		new Child().info();
	}
}
