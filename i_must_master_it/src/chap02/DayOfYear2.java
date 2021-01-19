package chap02;

import java.util.Scanner;

public class DayOfYear2 {
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, 
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};
	static int isLeap(int year) {
		return (year % 4 ==0 && year % 100 !=0 || year % 400 == 0)? 1 : 0;
	}
	static int totalDay(int year, int month, int day) {
		int i = 0;
		while(i<month-1) {
			day+= mdays[isLeap(year)][i];
			i++;
		}
		return day;
	}
	public static void main(String[] args) {
		int retry;
		System.out.println("그 해 경과 일 수를 구합니다.");
		Scanner sc = new Scanner(System.in);
		
		do {				
			System.out.print("년 : ");  int year = sc.nextInt();
			System.out.print("월 : ");  int month = sc.nextInt();
			System.out.print("일 : ");  int day = sc.nextInt();
		
			System.out.printf("그 해 %d일째입니다.", totalDay(year,month,day));
			System.out.println("한 번 더 할까요? (1.예 / 0.아니오)");
			retry = sc.nextInt();
		}while(retry==1);
	}
}
