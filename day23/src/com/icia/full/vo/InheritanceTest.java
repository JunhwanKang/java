package com.icia.full.vo;

// 부모 것은 내 것이다.
class Parent{
	int pMoney = 1000000;
}
class Child extends Parent{
	int cMoney = 1000000;
	public int getMoney() {
		return pMoney+cMoney;
	}
}
public class InheritanceTest {
	public static void main(String[] args) {
		Child child = new Child();
		System.out.println(child.cMoney);
		System.out.println(child.pMoney);
	}
}
