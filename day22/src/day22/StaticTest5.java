package day22;

class Loan1 {
	// 모두가 동일 금리 -> 상수 처리 (변경 금지)
	final static double interest = 0.02;
}

class Loan2{
	// 사람마다 고정 금리 -> 상수는 상수인데 사람마다 틀림.
	final double interest;
	public Loan2(double interest) {
		// final 상수는 생성자에서 초기화 가능
		this.interest = interest;
	}
	public Loan2() {
		this.interest = 0.1;
	}
}

public class StaticTest5 {
	public static void main(String[] args) {
		
	}
}
