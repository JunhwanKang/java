package chap01;

import java.util.Scanner;

public class Q11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		do {
			n = sc.nextInt();
		}while(n<=0);
		System.out.println(String.valueOf(n).length());
	}
}
