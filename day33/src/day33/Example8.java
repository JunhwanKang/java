package day33;

import java.util.Scanner;

public class Example8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		while(true) {
			System.out.println("성적 입력(종료하려면 999)");
			score = sc.nextInt();
			if(score==999) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}
			if(score<0|| score>100) {
				System.out.println("성적은 0~100사이의 값입니다.");
				continue;
			}
			
			if(score>=70)
				System.out.println("합격");
			else
				System.out.println("불합격");
		}
	}
}
