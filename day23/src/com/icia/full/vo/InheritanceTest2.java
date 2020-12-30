package com.icia.full.vo;

class Phone{
	private String tel;
	public void call() {
		System.out.println(tel+"로 전화합니다.");
	}
}
class SmartPhone extends Phone{
	
}

public class InheritanceTest2 {
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		
		// 부모의 private는 자식도 접근x
//		System.out.println(sp.tel);
	}
}
