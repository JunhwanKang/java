package day23;

// 필드를 초기화하는 방법과 순서
class Product{
	String name;
	// 1. instance 초기화 
	int price = 1000;
	// 2. static 초기화 영역
	static int count;
	static {
		count=0;
		System.out.println("정적 초기화 영역");
	}
	// 3. 생성자 
	public Product() {
		System.out.println("생성자");
	}
	
}
public class StaticTest4 {
	public static void main(String[] args) {
		Product p = new Product();
	}
}
