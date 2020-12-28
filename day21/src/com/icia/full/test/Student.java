package com.icia.full.test;

public class Student {
	private int bunho;
	private String irum;
	
	public int getBunho() {
		return bunho;
	}
	public void setBunho(int bunho) {
		this.bunho = bunho;
	}
	public String getIrum() {
		return irum;
	}
	public void setIrum(String irum) {
		this.irum = irum;
	}
	
	public Student(int bunho, String irum) {
		this.bunho = bunho;
		this.irum = irum;
	}
}
