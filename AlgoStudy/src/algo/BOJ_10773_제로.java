package src.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_10773_제로 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i=0; i<N; i++){
            int num = Integer.parseInt(br.readLine());
            if(num != 0) stack.add(num);
            else stack.pop();
        }

        int sum = 0;
        for(int o : stack) {
            sum += o;
        }
        System.out.println(sum);

    }
}