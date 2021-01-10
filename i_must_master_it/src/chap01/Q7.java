package chap01;

import java.util.Scanner;

public class Q7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		String str = "";
		for(int i=1; i<=n; i++) {
			
			sum+=i;
			if(i==n) {
				str += i+"="+sum;
			}else
				str += i+"+";
		}
		System.out.println(str);
	}
}
