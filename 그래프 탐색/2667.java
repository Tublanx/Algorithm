import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	static int n;
	static int houseCount, complexNumber;
	static int map[][];
	static int dx[] = { 0, 1, 0, -1 };
	static int dy[] = { -1, 0, 1, 0 };
	static boolean isVisited[][];
	
	static ArrayList<Integer> countList = new ArrayList<Integer>();

	public static void main(String[] args) throws IOException {
		var br = new BufferedReader(new InputStreamReader(System.in));
		var bw = new BufferedWriter(new OutputStreamWriter(System.out));

		n = Integer.parseInt(br.readLine());

		map = new int[n][n];
		isVisited = new boolean[n][n];

		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			for (int j = 0; j < n; j++) {
				map[i][j] = Integer.parseInt(str.split("")[j]);
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				houseCount = 0;
				if (map[i][j] == 1 && !isVisited[i][j]) {
					complexNumber++;
					houseCount++;
					dfs(i, j);
					countList.add(houseCount);
				}
			}
		}
		
		Collections.sort(countList);
		
		bw.write(complexNumber + "\n");
		
		for (var li : countList) {
			bw.write(li + "\n");
		}
		
		bw.flush();
	}

	static void dfs(int x, int y) {
		isVisited[x][y] = true;

		int nx, ny;
		for (int i = 0; i < 4; i++) {
			nx = x + dy[i];
			ny = y + dx[i];

			if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
				if (!isVisited[nx][ny] && map[nx][ny] == 1) {
					houseCount++;
					dfs(nx, ny);
				}
			}
		}
	}

}