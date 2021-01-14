package day33;

public class Example6 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while(true) {
			sum+=i++;
			if(i>100)
				break;
		}
		System.out.println(sum);
	}
}
