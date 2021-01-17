package chap02;

import java.util.Scanner;

public class CardConvRev4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] ch = new char[32];
		System.out.println("10진수를 기수 변환합니다.");
		System.out.print("변환하는 음이 아닌 정수 : ");
		int num = sc.nextInt();
		System.out.print("어떤 진수로 변환할까요?(2~36) : ");
		int jinsu = sc.nextInt();
		
		convJinsu(num, jinsu, ch); 
	}
	
	static int convJinsu (int x, int y, char[] ch) {
		String namerge = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int idx = 0;
		do {
			
			if(idx ==0) {
				System.out.println(y +"|"+x);
				System.out.println(" + -----------");
			}
			else if(x/y == 0) {
				System.out.println(" "+x/y+" "+(x%y));
			}
			else {
				System.out.println(y +"|"+x+" ... "+namerge.charAt(x%y));
				System.out.println(" + -----------");
			}
			ch[idx++] = namerge.charAt(x%y);
			x/=y;
			
		}while(x!=0);
		return idx;
		//다음에 다시 도전
	}
}
