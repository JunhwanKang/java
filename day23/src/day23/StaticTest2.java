package day23;

// singleton 패턴
// 어떤 클래스의 객체가 하나만 만들어지는 것을 보장
class SingleTonSamle{
	// 1. 생성자는 private : 임의로 객체를 만들 수 없다.
	private SingleTonSamle() {
		
	}
	// 2. 자신의 static 객체를 생성
	private static SingleTonSamle ss = new SingleTonSamle();
	
	// 3. 빌려주는 메소드 작성
	public static SingleTonSamle getInstance() {
		return ss;
	}
}
public class StaticTest2 {
	public static void main(String[] args) {
		SingleTonSamle s1 = SingleTonSamle.getInstance();
		SingleTonSamle s2 = SingleTonSamle.getInstance();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
