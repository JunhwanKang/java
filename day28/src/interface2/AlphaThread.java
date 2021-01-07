package interface2;

public class AlphaThread implements Runnable {
	@Override
	public void run() {
		for(char ch='A'; ch<='z'; ch++) {
			System.out.print(ch+" ");
		}
	}
}
