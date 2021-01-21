package day38;

//class ThreadJob implements Runnable{
//	@Override
//	public void run() {
//		System.out.println("병렬 작업 1");
//	}
//}
class SampleApp{
// 종속된 클래스
	class ThreadJob implements Runnable{
		@Override
		public void run() {
			System.out.println("병렬 작업 1");
		}
	}
	public SampleApp() {
		Thread thread1 = new Thread(new ThreadJob());
		thread1.start();
		
		Thread thread2 = new Thread(()->{System.out.println("병렬 작업 2");});
		thread2.start();
		
		new Thread(()->{System.out.println("병렬 작업 4");});
	}
}
public class Test1 {
	public static void main(String[] args) {
		new SampleApp();
	}
}
