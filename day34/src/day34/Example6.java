package day34;

import lombok.AllArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
class Account1{
	// 모든 계좌의 이자율이 다르고 변경가능
	double intersest;
}

class Account2{
	// 초기화가 가능한 함수
	final double interest;
	public Account2(double interest) {
		this.interest = interest;
	}
}

public class Example6 {

}
