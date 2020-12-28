package com.icia.full.test;

// 사번 이름 나이 필드
public class Emp {
	private int empno;
	private String name;
	private int age;
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Emp(int empno, String name, int age) {
		this.empno = empno;
		this.name = name;
		this.age = age;
	}
}
