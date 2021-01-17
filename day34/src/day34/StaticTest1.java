package day34;

class product {
	// static 필드 - 공유 데이터
	static double rate = 0.01;  // 적립률
	
	static int sum(int x, int y) {
		return x+y;
	}
}

public class StaticTest1 {
	public static void main(String[] args) {
		
		System.out.println(product.rate);
		System.err.println(Math.PI);
		
		System.out.println(product.sum(10, 20));
	}
}
