import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekj11720 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		String str = br.readLine();
		int sum = 0;
		for(int i=0; i<str.length(); i++){
			sum += Integer.parseInt((str.substring(i,i+1)));
		}
		System.out.println(sum);
	}
}
