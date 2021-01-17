package chap02;

import java.util.Scanner;

public class SumOfArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("arr["+i+"] : ");
			arr[i] = sc.nextInt();
		}
		System.out.println("인덱스의 합계 : "+sumOfIdx(arr));
	}
	
	static int sumOfIdx(int[] a) {
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}
}
