import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekj10809 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		// a = 97
		str = str.toLowerCase();
		for(char i=97; i<123; i++) {
			System.out.printf("%d ",str.indexOf(i));
		}
	}
}
