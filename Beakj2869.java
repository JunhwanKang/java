package test;

import java.util.Scanner;

public class Beakj2869 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int v = sc.nextInt();
		int count = 0;
		int sum = 0;
		while(true) {
			v-=a;
			count++;
			if(v<=0) {
				break;
			}else {
				v+=b;
			}
		}
		System.out.println(count);
	}
}
