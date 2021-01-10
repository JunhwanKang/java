package chap01;

import java.util.Scanner;

public class Q16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		spira(n);
	}
	static void spira(int n) {
		for(int i=0; i<n; i++) {
			for(int k=i; k<n-1; k++)
				System.out.print(" ");
			for(int j=0; j<2*i+1; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
