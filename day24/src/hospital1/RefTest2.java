package hospital1;

class Animal{
	public void cry() {
		System.out.println("어떻게 울지");
	}
}
class Cat extends Animal{
	public void cry() {
		System.out.println("야옹");
	}
}
class Dog extends Animal{
	public void cry() {
		System.out.println("멍멍");
	}
}
class Hospital{
	public void inject(Animal animal) {
		animal.cry();
	}
}
public class RefTest2 {
	public static void main(String[] args) {
		Animal animal = new Cat();
		Hospital h = new Hospital();
		h.inject(animal);
	}
}
