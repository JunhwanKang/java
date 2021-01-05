package day26_1;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;

// extends 금지 : 부모와 자식은 똑같아야 한다. extends를 안쓰는게 아니라 확장을 금지한다
// SOLID -> Liskov 치환 원칙
class 직원{
	public int getSalary() {
		return 0;
	}
}

@AllArgsConstructor
class 정직원 extends 직원{
	int salary;
	public int getSalary() {
		return this.salary;
	}
}

@AllArgsConstructor
class 알바 extends 직원{
	int minimumWage;
	int hour;

	public int getSalary() {
		return this.minimumWage * this.hour;
	}
}

public class InheritanceTest_3_1 {
	public static void main(String[] args) {
		List<직원> list = new ArrayList<직원>();
		list.add(new 정직원(3000000));
		list.add(new 알바(8720, 48));
		list.add(new 정직원(3500000));

		for(직원 emp:list) {
			System.out.println(emp.getSalary());
		}
	}
}
