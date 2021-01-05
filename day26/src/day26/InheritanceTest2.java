package day26;

import java.time.LocalDate;

// 도시락은 날짜다, 날짜는 도시락이다. (도시락 IS_A 날짜 관계 x)
// 도시락은 날짜를 가진다 (도시락 HAS_A 날짜 관계 o)

// 요즘에는 상속보다는 구성
// 상속은 더 이상 재사용이 아니라 자식을 만들기 위한 표준의 역할
//class Dosirak extends LocalData{
	//생산일, 유통일
//}
class Dosirak{
	LocalDate productDay;
	LocalDate validDay;
}

public class InheritanceTest2 {

}
