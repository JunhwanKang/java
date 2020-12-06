import java.io.IOException;
import java.util.Scanner;


public class beakj2562 {
	public static void main(String[] args) throws IOException {
		int []arr = new int[9];
		int max = 0;
		int index = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			if(arr[i]>max) {
				max = arr[i];
				index = i;
			}
		}
		System.out.println(max);
		System.out.println(index+1);
	}
}
