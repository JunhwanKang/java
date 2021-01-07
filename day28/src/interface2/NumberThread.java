package interface2;

//thread : 함수를 병렬 실행
public class NumberThread implements Runnable{
	@Override
	public void run() {
		for(int i=1; i<=100; i++) {
			System.out.print(i+" ");
		}
	}
}
