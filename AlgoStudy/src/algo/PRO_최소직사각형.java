package src.algo;

public class PRO_최소직사각형 {

	public static void main(String[] args) {
		int sizes[][] = { { 60, 50 }, { 30, 70 }, { 60, 30 }, { 80, 40 } };
		
		System.out.println( solution(sizes));
	}

	private static int solution(int[][] sizes) {
		int answer = 0;
		int width=0;
		int height=0;
		for(int i=0; i<sizes.length;i++) {
			// 가로 길이 최대값들 중 최대값 
			width = Math.max(width, Math.max(sizes[i][0], sizes[i][1]));
			// 세로 길이 최소값들 중 최대값
			height = Math.max(height, Math.min(sizes[i][0], sizes[i][1]));
		}
		answer = width * height;
		return answer;
	}

}
