package day35;

// 정적 : 모든 사람들의 이자율이 똑같다 -> 변경 가능
class Account1{
	static double interest = 0.02;
}

// 사람마다 이자율이 다르다
class Account2{
	final double interest;
	public Account2(double interest) {
		this.interest = interest;
	}
}

// 기본 이자율(하나만 존재, 변경 불가능) + 우대 이자율
class Account3{
	final static double baseInterest = 0.015;
	final double myInterest;
	public Account3(double interest) {
		myInterest = baseInterest + interest;
	}
}
public class Test1 {

}
