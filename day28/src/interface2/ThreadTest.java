package interface2;

public class ThreadTest {
	public static void main(String[] args) {
		new Thread(new NumberThread()).start();
		new Thread(new AlphaThread()).start();
		System.out.println("======= main 종료 =======");
	}
}
