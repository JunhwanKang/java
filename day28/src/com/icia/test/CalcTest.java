package com.icia.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.icia.calc1.Calc;

public class CalcTest {
	Calc calc;
	@Before
	public void setUp(){
		calc = new Calc();
	}
	@Test
	public void sumTest() {
		
		assertThat(calc.sum(10, 20), is(30));
	}
	@Test
	public void subTest() {
		assertThat(calc.sub(20, 10), is(10));
	}
}
