package day31;

// 변수 범위 : scope
public class Example3 {
	public static void main(String[] args) {

		int val1 = 10;
		{
			int val2 = 20;
			System.out.println(val1);
			System.out.println(val2);
//			System.out.println(val3);
		}
		{
			int val3 = 30;
			System.out.println(val1);
//			System.out.println(val2);
			System.out.println(val3);
		}
		System.out.println(val1);
//		System.out.println(val2);
//		System.out.println(val3);

	}
}
