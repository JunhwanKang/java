import java.util.Scanner;

public class beakj2577 {
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
//===================================================================
//		int[] num = new int[10];
//		
//		Scanner	sc = new Scanner(System.in);
//		int	first = sc.nextInt();
//		int	second = sc.nextInt();
//		int	third = sc.nextInt();
//		int multi= first*second*third;
//		
//		String result = Integer.toString(multi);
//		String[] resultArr = new String[result.length()];
//		
//		for(int i=0; i<num.length; i++) {
//			for(int j=0; j<resultArr.length; j++) {
//				resultArr[j] = result.substring(j, j+1);
//				if(i== Integer.parseInt(resultArr[j]))
//					num[i]++;				
//			}
//			System.out.println(num[i]);
//		}
//	}
//}