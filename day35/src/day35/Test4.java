package day35;

import java.time.LocalDate;

// 부모의 private은 상속 x
class 사람{
	protected String name;
	protected LocalDate birthday;
	public 사람(String name, LocalDate birthday) {
		this.name = name;
		this.birthday = birthday;
	}
}
class 사원 extends 사람{
	protected int sabun;
	protected String dept;
	public 사원(String name, LocalDate birthday, int sabun, String dept) {
		super(name, birthday);
		this.sabun = sabun;
		this.dept = dept;
	}
}
class 영업사원 extends 사원{
	protected int sales;
	public 영업사원(String name, LocalDate birthday, int sabun, String dept, int sales) {
		super(name, birthday, sabun, dept);
		this.sales = sales;
	}
}
public class Test4 {
	public static void main(String[] args) {
		영업사원 obj = new 영업사원("홍길동", LocalDate.of(1990,11,20), 11, "영업1팀", 0);
	}
}
