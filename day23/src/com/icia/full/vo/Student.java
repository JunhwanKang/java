package com.icia.full.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor // 생성자
@NoArgsConstructor  // 기본 생성자
public class Student {
	private int bunho;
	private String name;
}
