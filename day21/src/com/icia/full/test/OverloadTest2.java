package com.icia.full.test;

class Sungjuck{
	private int kor;
	private int eng;
	public Sungjuck() {
		// TODO Auto-generated constructor stub
	}
	public Sungjuck(int kor, int eng) {
		this.kor = kor;
		this.eng = eng;
	}
}

public class OverloadTest2 {
	public static void main(String[] args) {
		// 기본 생성자(파라미터가 없는 생성자)
		// 생성자는 필수 -> 근데 자바는 클래스도 필수
		// 생성자가 없다면 자바가 자동으로 기본생성자를 만듬 
		
		Sungjuck s = new Sungjuck();
	}
}
