package day33;

public class Example3 {
	public static void main(String[] args) {
		int sum=0;
		for(int i=1; i<=100; i++) {
			sum+=i;
			i++;
			sum-=i;
		}
		System.out.println(sum);
	}
}
