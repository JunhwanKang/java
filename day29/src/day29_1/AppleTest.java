package day29_1;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class AppleTest {
	@Test
	public void equalsTest() {
		Apple a1 = new Apple("충북", 300, 2500);
		Apple a2 = new Apple("경북", 320, 2300);
		Apple a3 = new Apple("전남", 290, 2500);
		assertThat(a1.equals(a2), is(false));
		assertThat(a1.equals(a3), is(true));
		
		System.out.println(a1.toString());
	}
}
