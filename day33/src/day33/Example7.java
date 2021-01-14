package day33;

public class Example7 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		while(true) {
			sum += ++i;
			if(sum>100)
				break;
		}
		System.out.println(i);
	}
}
