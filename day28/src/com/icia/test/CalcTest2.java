package com.icia.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.icia.calc2.Calc;


public class CalcTest2 {
	Calc calc = null;
	
	@Test
	public void sumTest() {
		assertThat(calc.sum(10, 20), is(30));
	}
}
