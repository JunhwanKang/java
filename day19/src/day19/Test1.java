package day19;

public class Test1 {
	public static void main(String[] args) {
		int sum1 = 0, sum2 = 0;
		for(int i=0; i<=100; i++) {
			sum1 += i;
		}
		int i=1;
		while(true) {
			sum2 = sum2+i;
			i++;
			if(i>=100)
				break;
		}
	}
}
