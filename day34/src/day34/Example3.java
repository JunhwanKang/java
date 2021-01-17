package day34;

public class Example3 {
	public static void main(String[] args) {
		// 약수의 합계
		for (int val = 1; val <= 1000; val++) {
			int sum = 0;
			int half = val/2;
			for (int i = 1; i <= half; i++) {
				if (val % i == 0)
					sum += i;
			}
			if(val==sum)
			System.out.println("완전수: "+sum);
		}
	}
}
