package src.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1940_주몽 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = i+1; j < N; j++) {
                sum = arr[i] + arr[j];
                if (sum == M) {
                    count++;
                    sum = 0;
                } else {
                    sum = 0;
                }
            }
        }
        System.out.println(count);
    }
}
