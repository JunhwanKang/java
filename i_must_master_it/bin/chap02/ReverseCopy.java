package chap02;

import java.util.Scanner;

public class ReverseCopy {
	static void reCopy(int[] a, int[] b) {
		for(int i=0; i<b.length; i++) {
			a[i] = b[b.length-i-1];
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a의 요솟수: ");
		int na = sc.nextInt();
		int[] a = new int[na];
		for(int i=0; i<a.length; i++) {
			System.out.print("a["+i+"]: ");
			a[i] = sc.nextInt();
		}
		System.out.print("b의 요솟수: ");
		int nb = sc.nextInt();
		int[] b = new int[nb];
		for(int i=0; i<b.length; i++) {
			System.out.print("b["+i+"]: ");
			b[i] = sc.nextInt();
		}
		reCopy(a,b);
		System.out.println("역순 완료");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
