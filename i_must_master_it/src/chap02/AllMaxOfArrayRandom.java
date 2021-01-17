package chap02;

import java.util.Random;
import java.util.Scanner;

public class AllMaxOfArrayRandom {
	public static void main(String[] args) {
		System.out.println("최대값을 구합니다.");
		Random rand = new Random();
		int num = 1+rand.nextInt(9);
		int[] height = new int[num];
		for(int i=0; i<height.length; i++) {
			height[i] = 100+rand.nextInt(90);
			System.out.println("height["+i+"]: "+height[i]);
		}
		System.out.println("최댓값은 "+maxOf(height));
	}
	
	static int maxOf(int[] arr) {
		int max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>max)
				max = arr[i];
		}
		return max;
	}
}
