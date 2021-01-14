package day33;

public class Example1 {
	public static void main(String[] args) {
		Fruit fruit = Fruit.MELON;
		switch(fruit) {
			case APPLE:
				System.out.println("사과 선택");
				break;
			case ORANGE:
				System.out.println("오렌지 선택");
				break;
			case BANANA:
				System.out.println("바나나 선택");
				break;
			case MELON:
				System.out.println("멜론 선택");
				break;
		}
		System.out.println(fruit.name());
	}
}
