package day15_3;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class UserTest {
	@Test
	public void equalsTest() {
		User u1 = new User("spring", "1234", "서울시");
		User u2 = new User("spring", "1234", "서울시");
		assertThat(u1.equals(u2), is(true));
	}
}
