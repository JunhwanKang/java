package day35;

// 부모의 private은 상속 x
class Saram{
	private String name;
}
class Emp extends Saram{
	private int sabun;
	private String dept;
}
class Salesman extends Emp{
	private int sales;
	public void info() {
		System.out.println(this.sales);
//		System.out.println(this.sabun);
//		System.out.println(this.dept);
//		System.out.println(super.name);
	}
}
public class Test3 {

}
