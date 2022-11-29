package src.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_1874_스택수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int num = 0;

        for (int i=0; i< N; i++){
            int value = Integer.parseInt(br.readLine());
            if(value > num ){
                for (int j = num+1; j <= value; j++){
                    stack.push(j);
                    sb.append("+").append("\n");
                }
                num = value;
            } else{
                if(stack.peek() != value){
                    System.out.println("NO");
                    return;
                }
            }
            stack.pop();
            sb.append("-").append("\n");
        }
        System.out.println(sb);
    }
}
