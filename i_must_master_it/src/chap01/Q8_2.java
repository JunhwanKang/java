package chap01;

import java.util.Scanner;

public class Q8_2 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();

		int sum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0); // 합

		System.out.println(sum);
		long end = System.currentTimeMillis();
		System.out.println( "실행 시간 : " + ( end - start )/1000.0 +"초");
	}
}
