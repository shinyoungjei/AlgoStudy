package src.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//5 7 3
//0 2 4 4
//1 1 2 5
//4 0 6 2
public class BOJ_2583_영역구하기 {

	static int[][] arr;
	static boolean[][] visit;

	static int M, N, K;
	static int[] dx = { -1, 0, 1, 0 };
	static int[] dy = { 0, 1, 0, -1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;

		st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());

		int count = 0;
		ArrayList<Integer> list = new ArrayList<>();
		arr = new int[M][N];
		visit = new boolean[M][N];
		
		
		for(int i=0; i<K; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			for (int l = b; l < d; l++) {
				for (int j = a; j < c; j++) {
					arr[l][j] = 1;
				}
			}
		}
		
		
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				if(arr[i][j] == 0 && !visit[i][j]) {
					int data = BFS(i,j);
					list.add(data);
					count++;
				}
			}
		}
		
		System.out.println(count);
		Collections.sort(list);
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+ " ");
		}

	}

	private static int BFS(int a, int b) {
		Queue<int[]> q = new LinkedList<>();
		visit[a][b] = true;
		q.add(new int[] { a, b });
		int cnt = 1;

		while (!q.isEmpty()) {
			int[] poll = q.poll();
			int x = poll[0];
			int y = poll[1];
			

			for (int d = 0; d < 4; d++) {
				int nx = x + dx[d];
				int ny = y + dy[d];

				if (nx >= 0 && ny >= 0 && nx < M && ny < N && arr[nx][ny] == 0 && !visit[nx][ny]) {
					visit[nx][ny] = true;
					q.add(new int[] { nx, ny });
					cnt++;
				}

			}
		}

		return cnt;

	}

}
