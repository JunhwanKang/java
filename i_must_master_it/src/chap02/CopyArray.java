package chap02;

import java.util.Scanner;

public class CopyArray {
	static void copy(int[] a, int[] b) {
		for(int i=0; i<b.length; i++) {
			a[i] = b[i];
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("a의 요솟수: ");
		int na = sc.nextInt();
		int[] a = new int[na];
		for(int i=0; i<a.length; i++) {
			System.out.print("a["+i+"]: ");
			a[i] = sc.nextInt();
		}
		System.out.println("b의 요솟수: ");
		int nb = sc.nextInt();
		int[] b = new int[nb];
		for(int i=0; i<b.length; i++) {
			System.out.print("b["+i+"]: ");
			b[i] = sc.nextInt();
		}
		copy(a,b);
		
	}
}
