package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakj2775 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int run = Integer.parseInt(br.readLine()); // 돌리는 횟수
		
		for (int r = 0; r < run; r++) {
			int k = Integer.parseInt(br.readLine()); // 층 수
			int n = Integer.parseInt(br.readLine()); // 호 수
			int[][] room = new int[k + 1][n + 1];
			
			for (int i = 1; i <= n; i++) {
				room[0][i] = i;
			}
			for (int i = 1; i <= k; i++) {
				for (int j = 1; j <= n; j++) {
					room[i][j] = room[i][j - 1] + room[i - 1][j];
				}
			}
			System.out.println(room[k][n]);
		}
	}
}
