package com.icia.full.test;

public class Jjamppong {
	private int spicy;
	private String quantity;
	
	public Jjamppong() {
		this.spicy = 3;
		this.quantity="nomal";
	}
	public Jjamppong(int spicy) {
		this.spicy = spicy;
		this.quantity = "nomal";
	}public Jjamppong(String quantity){
		this.spicy = 3;
		this.quantity = quantity;
	}
	public Jjamppong(int spicy, String quantity) {
		this.spicy = spicy;
		this.quantity = quantity;
	}
}
