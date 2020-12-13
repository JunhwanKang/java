import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekj4344 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		for(int k=0; k<num; k++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			int StudentNum = Integer.parseInt(str.nextToken());
			int sum   = 0;
			double avg   = 0;
			double count = 0;
			int[] arr = new int[StudentNum];
			
			for(int i=0; i<StudentNum; i++) {
				arr[i] = Integer.parseInt(str.nextToken());
	
				sum += arr[i];
			}
			avg = sum/StudentNum;
			for(int i=0; i<StudentNum; i++) {
				if(avg<arr[i]) {
					count++;
				}
			}
			double result = count/StudentNum;
			System.out.println(String.format("%.3f", result*100)+"%");
		}
	}
}
