package com.icia.main;

import com.icia.calc1.Calc;

//SOLID 

public class TestMain {
	public static void main(String[] args) {
		Calc calc = new Calc();
		System.out.println(calc.sum(10,20)==30);
	}
}
