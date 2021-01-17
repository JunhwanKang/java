package day34;

import java.time.LocalDate;

class Saram{
	// 필드 : 데이터
	private String name;
	private LocalDate birthday;
	// 메소드
	public void info() {
		int age = birthday.getYear() - LocalDate.now().getYear();
		System.out.println(age+"살 "+name+"입니다.");
	}
	// 생성자
	public Saram() {
		
	}
	public Saram(String name, LocalDate birthday) {
		this.name = name;
		this.birthday = birthday;
	}
}

public class Example4 {
	public static void main(String[] args) {
		
		
	}
}
