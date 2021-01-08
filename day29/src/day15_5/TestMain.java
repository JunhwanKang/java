package day15_5;

// process : 실행 중인 프로그램. 멀티 프로세스
// Thread : 실행 중인 메소드(함수). 멀티 스레드
class NumberPrint implements Runnable{
	@Override
	public void run() {
		for(int i=1; i<=100; i++)
			System.out.print(i+" ");
	}
}
class AlphabetPrint implements Runnable{
	@Override
	public void run() {
		for(char ch='A'; ch<='Z'; ch++)
			System.err.print(ch+" ");
	}
}

public class TestMain {
	public static void main(String[] args) {
		// 참조변수가 없는 객체 -> 익명 객체
		Thread thread1 = new Thread(new NumberPrint());
		thread1.start();
		new Thread(new AlphabetPrint()).start();
	}
}
