package com.icia.full.test;

public class StudentTest {
	public static void main(String[] args) {
		// 필드에 값을 주지 않으면...
		Student s1 = new Student(1, "홍길동");
		Student s2 = new Student(2, "전우치");
		System.out.println(s1.getBunho());
		System.out.println(s2.getBunho());
		System.out.println(s1.getIrum());
		System.out.println(s2.getIrum());
		// 객체를 생성할 때 초기화 전용 함수 -> 생성자
		// 특징: 클래스이름과 같다, return 개념이 없다. 
	}
}
