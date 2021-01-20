package day37;

// 익명 객체
// 자바에서 함수를 병렬 실행하려면 run()이라는 이름을 사용해야 한다 -> 인터페이스
// 인터페이스를 구현하려니까 클래스를 만들어야 한다 -> 이름이 부담..

class MultiThreadExample2{
	public MultiThreadExample2() {
		// 익명 객체
		new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=1; i<=50; i++)
					System.out.print(i + " ");
			}
		}).start();
		new Thread(new Runnable() {
			@Override
			public void run() {
				for(char ch='A'; ch<='Z'; ch++)
					System.out.print(ch+" ");
			}
		}).start();
	}
}
class MultiThreadExample3{
	public MultiThreadExample3() {
		// java8 람다식
		new Thread(()->{
			for(char ch='A'; ch<='Z'; ch++)
				System.out.print(ch+" ");
		}).start();
	}
}
public class Test7 {
	public static void main(String[] args) {
		new MultiThreadExample2();
	}
}
