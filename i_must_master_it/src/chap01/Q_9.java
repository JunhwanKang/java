package chap01;

public class Q_9 {
	public static void main(String[] args) {
		System.out.println(sumOf(6,4));
	}
	static int sumOf(int a, int b) {
		int sum = 0;
		
		if(a>b) {
			int temp = a;
			a=b;
			b=temp;
		}
		
		for(int i=a; i<=b; i++) {
			sum += i;
		}
		return sum;
	}
}
