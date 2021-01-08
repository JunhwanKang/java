package day15_5;

public class TestMain2 {
	public static void main(String[] args) {
		// 익명 클래스
		Runnable obj = new Runnable() {
			
			@Override
			public void run() {
				for(int i=1; i<=100; i++)
					System.out.println(i+" ");
			}
		};
		new Thread(obj).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(char ch='A'; ch<='Z'; ch++)
					System.out.print(ch+" ");				
			}
		}).start();
		// Lambda
		new Thread(()->{
			for(char ch='a'; ch<='z'; ch++)
				System.out.print(ch+" ");
		}).start();
	}
}
