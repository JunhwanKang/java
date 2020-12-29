package day22;

class Calc{
	// 정적 멤버는 클래스만 만들면 태어난다. 일반 멤버는 객체를 만들어야 생성 됨.
	static double pi1 = 3.14;
	double pi2 = 3.14;
	public double getCircumference(int radius) {
		// 일반 멤버는 정적, 일반 모두 접근 가능
		return 2*pi1*radius;
	}
//	public static double getArea(int radius) {
		//정적 멤버는 정적멤버에만 접근 가능
//		return pi2*radius*radius;
		// 정적으로 메서드를 만들어서 생성 됬는데 pi2가 일반이라 아직 만들어지지 않음.
//	}
}

public class StaticTest3 {
	public static void main(String[] args) {
		System.out.println(Calc.pi1);
//		System.out.println(Calc.pi2);
	}
}
