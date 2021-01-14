package day33;

import java.util.Scanner;

import org.apache.commons.lang3.math.NumberUtils;

public class Example5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("구구단을 출력할 단 입력: ");
		String input = sc.next();
		int dan = NumberUtils.toInt(input, -1);
		if(dan<0|| dan>9) {
			System.out.println("단은 1~9사이의 값입니다.");
			return;
		}
		
		for(int i=1; i<=9; i++) {
			System.out.println(dan+"x"+i+"= "+dan*i);
		}
	}
}
