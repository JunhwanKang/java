package day19;

public class Test5 {
	public static void main(String[] args) {
		int state = 0;
		for(int i=0; i<=100; i++) {
			if(i%5==0)
				state++;
			if(i%7==0)
				state++;
			if(state==1)
				System.out.print(i+" ");
			state = 0;
		}
	}
}
