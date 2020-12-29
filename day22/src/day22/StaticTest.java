package day22;

import org.junit.Test;

class Sample{
	//샘플 클래스의 객체 개수를 알고 싶다.
	//static 변수는 class 소속
	static int cnt;
	public Sample() {
		cnt++;
	}
}

public class StaticTest {
	@Test
	public void test() {
		Sample s1 = new Sample();  //1
		Sample s2 = new Sample();  //2
		Sample s3 = new Sample();  //3
//		System.out.println(s1.cnt);
//		System.out.println(s2.cnt);
//		System.out.println(s3.cnt);
		System.out.println(Sample.cnt);
	}
}
