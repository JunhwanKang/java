package chap02;

import java.util.Scanner;

public class LeftOfYear {
	static int[][] dayOfMonth = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, 
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};
	
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0; 
	}
	
	static int leftOfYear(int y, int m, int d) {
		int day = 0;
		for(int i=0; i<12; i++) {
			day += dayOfMonth[isLeap(y)][i];
		}
		while(--m != 0) {
			d += dayOfMonth[isLeap(y)][m-1];
		}
		return day-d;
	}
	

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("년 : "); int year = sc.nextInt();
		System.out.print("월 : "); int month = sc.nextInt();
		System.out.print("일 : "); int day = sc.nextInt();
		
		System.out.printf("그해 %d일 남음", leftOfYear(year, month, day));
	}
}
