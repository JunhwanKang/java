package day2;

public class Test6 {
	public static void main(String[] args) {
		//등차수열인 양의 정수를 구하자 123 147 1357 258
		// 특징을 보면 일단 이것을 1번 2번  2번 3번 이렇게 비교
		//					n-2	n-1	n-1	n
		
		System.out.println(isCheck(1000));
	}
	public static int isCheck(int num) {
		
		//만약 count가 1보다 크면 지워라 이러는낌!!
		int len = (int)(Math.log10(num)+1);
		int count = 0;
		int[] arr = new int[len];
		for(int j=0; j<num; j++) {
			for(int i=len-1; i>=0; i--) {
				arr[i] = num/(int)(Math.pow(10,(i)));
				if(i==0) {
					arr[i] = num%10;
				}
				if(arr[i]-arr[i-1]==arr[i-1]-arr[i-2]) {
					count++;
				}
			}
		}
		return count;
	}
}

//		int count = 0;
//		for(int i=0; i<(int)(Math.log10(num)+1); i++) {
//			count++;
//		}