package src.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2018_수들의합5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int count = 1;
        int startIndex = 1;
        int endIndex = 1;
        int sum = 1;

        while (endIndex != N){
            if (sum == N){
                count ++;
                endIndex ++;
                sum = sum + endIndex;
            } else if (sum > N) {
                sum = sum - startIndex;
                startIndex++;
            } else { // sum < N
                endIndex++;
                sum = sum + endIndex;
            }
        }
        System.out.println(count);
    }
}
