package chap02;

public class MamOfArray {
	public static void main(String[] args) {
		System.out.println("키의 최댓값을 구합니다.");
		int[] height = {172, 153, 192, 140, 165};
		System.out.println("사람 수 : "+height.length);
		for(int i=0; i<height.length; i++) {
			System.out.println("height["+i+"]= "+height[i]);
		}
		System.out.println("최댓값은 "+maxOf(height)+"입니다.");
	}
	
	
	static int maxOf(int[] arr) {
		int max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>max)
				max = arr[i];
		}
		return max;
	}
}
