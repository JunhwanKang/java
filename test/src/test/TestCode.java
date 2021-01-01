package test;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import calculator.Calcu;

public class TestCode {
	Calcu cal; 
	@Before
	public void setUp() {
		cal = new Calcu();
		System.out.println("Calcu°´Ã¼ »ý¼º");
	}
	@Test
	public void addTest() {
		int result = cal.add(3, 2);
		assertEquals(5, result);
		System.out.println("´õÇÏ±â");
	}
	@Test
	public void minusTest() {
		int result = cal.minus(3, 2);
		assertEquals(1, result);
		System.out.println("»©±â");
	}
}
