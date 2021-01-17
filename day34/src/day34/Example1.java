package day34;

public class Example1 {
	public static void main(String[] args) {
		int sum =0;
		for(int i=1; i<=20; i++) {
			if(i%2!=0 && i%3!=0)
				sum+=i;
		}
		System.out.println(sum);
		
		int hap = 0;
		for(int i=1; i<=100; i++) {
			if(i%5==0 && i%7==0)
				System.out.println(hap);
		}
		System.out.println();
	}
}
