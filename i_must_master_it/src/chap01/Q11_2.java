package chap01;

import java.util.Scanner;

public class Q11_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		int count = 0;
		
		do {
			n = sc.nextInt();
		}while(n<=0);
		
		while(n>0) {
			n/=10;
			count++;
		}
		System.out.println(count);
	}
}
