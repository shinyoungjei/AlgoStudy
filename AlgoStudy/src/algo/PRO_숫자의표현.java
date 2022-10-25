package src.algo;

public class PRO_숫자의표현 {
	
	static int count = 0;
	static int cnt = 0;

	public static void main(String[] args) {
		int n = 15;
		System.out.println(solution(n));
	}

	private static int solution(int n) {
		int answer = 0;
		while(true) {
			if(cnt > n) break;
			cnt++;
			goSum(cnt, n);
		}
		answer = count;
		return answer;
	}
	
	private static void goSum(int num, int n) {
		int sum = 0;
		
		for(int i=num; i <= n; i++) {
			sum += i;
			if(sum == 15) {
				count++;
				break;
			}
		}
	}
}
