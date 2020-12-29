package com.icia.full.vo;

// 번호 지정 안하면 1번, size 지정 안하면 L, 컬러 지정 안하면 black
public class Clothes {
	private int number;
	private String size;
	private String color;
	
	public Clothes(int number, String size, String color) {
		this.number = number;
		this.size = size;
		this.color = color;
	}
	public Clothes() {
		this(1,"L","black");
	}
	public Clothes(int number) {
		this(number,"L","black");
	}
	
}
