package src.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11720_숫자의합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String numberString = br.readLine();

        int sum = 0;
        for (int i=0; i < numberString.length(); i++){
            int num = numberString.charAt(i) - '0';
            sum += num;
        }
        System.out.println(sum);
    }
}
