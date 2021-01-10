package chap01;

import java.util.Scanner;

public class Q17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		nspira(n);
	}

	static void nspira(int n) {
		for (int i = 0; i < n; i++) {
			for (int k = i; k < n - 1; k++)
				System.out.print(" ");
			for (int j = 0; j < 2 * i + 1; j++)
				System.out.print(i+1);
			System.out.println();
		}
	}
}
