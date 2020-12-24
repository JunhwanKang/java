package day19;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = 0;
		while(true) {
			score = sc.nextInt();
			if(score < 0) {
				System.out.println("종료합니다.");
				break;
			}
			if(score>=70)
				System.out.println("합격");
			else
				System.out.println("불합격");

		}
	}
}

