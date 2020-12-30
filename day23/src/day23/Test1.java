package day23;

class Sample{
	static int a = 10;
	int b = 20;
	int c;
	public void test() {
		int x;
		System.out.println(c);
//		System.out.println(x);
	}
}

public class Test1 {
	public static void main(String[] args) {
		// 현재 Sample 객체는 존재하지 않는다.
		// this도 당연히 없다.
		
		// static은 this가 없다
		Sample sample = new Sample();
		sample.test();
		//객체는 heap영역에 만들어진다. (공유)
		// 참조 변수는 stack영역에 만들어진다 (전용)
		
		//heap에 만들어진 변수는 0으로 초기화된다.
		//메소드는 heap으로 올라가지 않고 stack에 만들어진다.
	}
}
