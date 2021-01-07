package interface1;

import lombok.AllArgsConstructor;

interface Seller{
	public void sell();
}

@AllArgsConstructor
class Mart2{
	Seller seller;
	public void doSell() {
		seller.sell();
	}
}

class CupSeller implements Seller{
	@Override
	public void sell() {
		System.out.println("컵 팔아요");
	}
}

public class InterfaceTest4 {
	public static void main(String[] args) {
		//전략 패턴
		Mart2 mart = new Mart2(new CupSeller());
		mart.doSell();
	}
}
