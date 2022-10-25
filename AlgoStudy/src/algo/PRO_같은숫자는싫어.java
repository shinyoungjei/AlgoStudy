package src.algo;

import java.util.ArrayList;
import java.util.Arrays;

public class PRO_같은숫자는싫어 {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 3, 3, 0, 1, 1 };
		System.out.println(Arrays.toString(solution(arr)));
	}

	private static int[] solution(int[] arr) {
		int[] answer = {};
		ArrayList<Integer> list = new ArrayList<>();
		
		int num = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != num) {
				list.add(arr[i]);
				num = arr[i];
			}
		}
		
		answer = new int[list.size()];
		
		for(int i=0; i<list.size();i++) {
			answer[i] = list.get(i);
		}
		
		return answer;
	}
}