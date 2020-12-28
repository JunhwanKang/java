package com.icia.full.test;

import org.junit.Test;

import com.icia.full.vo.Sungjuck;

public class TestMain2 {
	//annotation
	@Test
	public void test1() {
		Sungjuck s = new  Sungjuck();
		System.out.println(s.hashCode());
	}
}
