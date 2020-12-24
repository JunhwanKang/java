package com.icia.full;

import java.util.ArrayList;

public class Test7 {
	public static void main(String[] args) {
		// 자바의 어떤 객체라도 담을 수 있다.
		// <>여기에 담을 객체의 타입을 적어준다.
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(70);
		arrayList.add(90);
		arrayList.add(85);
		arrayList.add(75);
		int sum = 0;
		for(int i=0; i<arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
//			sum+= (int)arrayList.get(i);
			sum+= arrayList.get(i);
		}
		System.out.println(sum);
	}
	
}
