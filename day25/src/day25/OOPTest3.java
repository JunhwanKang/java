package day25;

// 상속은 분류 ~이다.
// 구성은 소유 ~를 가진다.

class Car{
}
class Tire{}
class Engine{}
class HankukTire extends Tire{}
class HyundaiEngine extends Engine{}

class K5 extends Car{
	Engine engine = new HyundaiEngine();
	Tire tire = new HankukTire();
}
public class OOPTest3 {

}
