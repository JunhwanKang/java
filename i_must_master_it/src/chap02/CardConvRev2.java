package chap02;

import java.util.Scanner;

public class CardConvRev2 {
	public static void main(String[] args) {
		char[] ch = new char[32];
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		int num = sc.nextInt();
		System.out.print("변경할 진수를 입력해주세요 : ");
		int jinsu = sc.nextInt();
		int count = convJinsu(num, jinsu, ch);
		
		for(int i=0; i<count; i++) {
			System.out.print(ch[i]);
		}
	}
	static int convJinsu(int x, int y, char ch[]){
		String namerge = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int idx = 0;
		do {
			ch[idx++] = namerge.charAt(x%y);
			x/=y;
		}while(x!=0);
		for(int i=0; i<idx/2; i++) {
			char temp = ch[i];
			ch[i] = ch[idx-i-1]; 
			ch[idx-i-1] = temp;
		}
		return idx;
	}
}
