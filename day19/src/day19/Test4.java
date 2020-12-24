package day19;

public class Test4 {
	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			if(i%5==0 && i%7==0)
				continue;
			if(i%5==0 || i%7==0) {
				System.out.print(i+" ");
			}
		}
	}
}
