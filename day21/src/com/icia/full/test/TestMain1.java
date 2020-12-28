package com.icia.full.test;

import com.icia.full.vo.Sungjuck;

public class TestMain1 {
	public static void main(String[] args) {
		// s : 객체의 이름이 아니라 리모콘의 이름
		// 참조 변호 s는 4바이트
		// new: heap메모리에 객체를 생성
		// heap: 필요할 때 사용 후 반납하는 메모리
		// stack: 프로그램 종료시 메모리 반납 -> 기본형 타입을 저장 
		Sungjuck s = new Sungjuck();
		System.out.println(s.hashCode());
		
		s = new Sungjuck();
		System.out.println(s.hashCode());
	}
}
