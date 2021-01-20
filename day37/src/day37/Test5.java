package day37;

class PrintNumberJob implements Runnable{
	@Override
	public void run() {
		for(int i=1; i<=50; i++)
			System.out.print(i+" ");
	}
}
// A~Z까지 출력하는 PrintCharJob
class PrintCharJob implements Runnable{
	public void run() {
		for(char ch='A'; ch<='Z'; ch++){
			System.out.print(ch+" ");
		}
	}
}
public class Test5 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new PrintNumberJob());
		Thread t2 = new Thread(new PrintCharJob());
		t1.start();
		t2.start();
	}
}
