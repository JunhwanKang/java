import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekj10818 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int []arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int max = -1000000;
		int min = 1000000;
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if(arr[i]>max) 
				max = arr[i];
			if(arr[i]<min)
				min = arr[i];
		}
		System.out.print(min +" "+ max);
	}
}
