package day33;

import java.util.Scanner;

public class Example10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.print("소수 판정할 숫자 입력: ");
		int val = sc.nextInt();

		for(int i=1; i<=val; i+=2) {
			if(val%i==0) 
				count++;
		}
		if(count==2) 
			System.out.println(val+"은 소수입니다.");
		else
			System.out.println(val+"은 소수가 아닙니다.");
		
	}
}
