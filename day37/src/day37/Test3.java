package day37;

class MyJob implements Runnable{
	 @Override
	public void run() {
		 for(int i=1; i<=20; i++) {
			 System.out.print(i+" ");
		 }
	}
}

public class Test3 {
	public static void main(String[] args) {
		System.out.println("메인 스레드 시작");
		Thread thread = new Thread(new MyJob());
		thread.start();
		System.out.println("메인 스레드 종료");
	}
}
