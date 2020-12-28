package com.icia.full.vo;

public class Sungjuck {
	//객체를 찍어내기 위한 설계도
	//멤버: 구성원. 필드 + 메소드(getter, setter)
	private String irum;
	private int kor;
	private int eng;
	private int tot;
	//데이터를 사용자로부터 보호하기 위해 private
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public String getIrum() {
		return irum;
	}
	public void setIrum(String irum) {
		this.irum = irum;
	}
	public int getTot() {
		return tot;
	}
	
}
