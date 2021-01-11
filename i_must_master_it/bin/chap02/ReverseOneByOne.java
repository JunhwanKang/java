package chap02;

public class ReverseOneByOne {
	public static void main(String[] args) {
		int[] arr = new int[5];
		for(int i=0; i<arr.length; i++) {
			arr[i] = i;
		}
		for(int i=0; i<arr.length/2; i++) {
			swap(arr,i,arr.length-i-1);
			System.out.println("a["+i+"]과(와) a["+(arr.length-i-1)+"]을 교환합니다.");
		}
		System.out.println("역순 정렬을 마쳤습니다.");
	}
	static void swap(int[] arr, int idx1, int idx2) {
		int t = idx1; idx1 = idx2; idx2 = t;
	}
}
