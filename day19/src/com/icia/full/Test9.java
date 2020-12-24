package com.icia.full;

import java.util.ArrayList;

public class Test9 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(85);
		list.add(90);
		list.add(100);
		list.add(75);
		list.add(60);
		int count = 0;
		int min = 100;
		int sum = 0;
		int avg = 0;
		int sum2 = 0;
		for(int i=0; i<list.size(); i++) {			
			if(list.get(i)>=80) {
				count++;
			}
			if(list.get(i)<min)
				min = list.get(i);
			if(list.get(i)>=90)
				sum += list.get(i);
			if(list.get(i)>=80)
				sum2 += list.get(i);
			avg = sum2 / count;
		}
		System.out.println("80점 이상인 점수 개수: " + count);
		System.out.println("최소값: " + min);
		System.out.println("90점 합계: " + sum);
		System.out.println("80점 이상 평균:" + avg);
	}
}
