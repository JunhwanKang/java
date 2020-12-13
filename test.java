import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		int multi = 1;
		int[] num = new int[10];
		
		Scanner	sc = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			multi *= sc.nextInt();
		}
		
		String result = Integer.toString(multi);
		String[] resultArr = new String[result.length()];
		
		for(int i=0; i<num.length; i++) {
		for(int j=0; j<resultArr.length; j++) {
			resultArr[j] = result.substring(j, j+1);
			if(i== Integer.parseInt(resultArr[j]))
				num[i]++;				
			}
			System.out.println(num[i]);
		}

	}
}
