package day23;

class AAA{
	private AAA() {
	}
	private static AAA aaa = new AAA();
	public static AAA getInstance() {
		return aaa;
	}
}

public class StaticTest3 {

}
