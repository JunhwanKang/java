package day25_1;

// 부모 클래스는 카테고리의 역할, 표준의 역할
class Vehicle {
	public void run() {
		System.out.println("달려갑니다");
	}
}

class Bus extends Vehicle{
}

class Train extends Vehicle{
}

class Taxi extends Vehicle{
}

public class OverrideTest2 {
	public static void main(String[] args) {
		Vehicle v = new Bus();
		v.run();
	}
}
