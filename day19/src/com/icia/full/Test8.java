package com.icia.full;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test8 {
	public static void main(String[] args) {
//		배열을 이용해 List에 값을 대입
		List<Integer> ar = Arrays.asList(75,80,77,90,85);
		
		//ar의 최대값을 구해 출력
		int max= 0;
		for(int i=0; i<ar.size(); i++) {
			if(ar.get(i)>max)
				max= ar.get(i);
		}
		System.out.println(max);
		// ar의 합계
		int sum = 0;
		for(int i=0; i<ar.size(); i++) {
			sum += ar.get(i);
		}
		System.out.println(sum);
	}
}
