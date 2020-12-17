package day2;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		double pi = 3.14;
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름 입력:");
		int r = sc.nextInt();
		System.out.println("원 둘레: "+(2*r*pi));
	}
}
