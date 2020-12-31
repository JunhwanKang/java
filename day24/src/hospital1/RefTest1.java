package hospital1;
// SOLID 원칙
// 1. 단일 책임 원칙 : 클래스는 한가지 일만
// 2. 개방 폐쇄 원칙 : 코드 변경 영향을 폐쇄 (코드의 변경은 폐쇄, 기능 개선은 개방)
class Cat1{
	public void cry() {
		System.out.println("야옹");
	}
}
class Dog1{
	public void cry() {
		System.out.println("멍멍");
	}
}
class Cow{
	public void cry() {
		System.out.println("음메");
	}
}
class PetHospital{
	public void inject(Cat cat) {
		System.out.println("예방접종 합니다.");
		cat.cry();
	}
	public void inject(Dog dog) {
		System.out.println("예방접종 합니다.");
		dog.cry();
	}
}
public class RefTest1 {
	public static void main(String[] args) {
		Cat cat = new Cat();
		PetHospital h =new PetHospital();
		h.inject(cat);
	}
}
