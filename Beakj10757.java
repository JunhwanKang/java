package test;

public class Beakj10757 {
	public static void main(String[] args) {
		String a = "333";
		String b = "333";
		
		int max = (a.length() > b.length() ? b.length() : a.length());
		int sum = 0;
		int k = 0;
		int j = 0;
		for(int i=max-1; i>=0; i--) {
			k = (int)(a.charAt(i));
			j = (int)b.charAt(i);
			sum =  k + j;
			System.out.println("k ="+ k);
			System.out.println("j ="+ j);
			System.out.println("sum ="+ sum);
		}
	}
}
