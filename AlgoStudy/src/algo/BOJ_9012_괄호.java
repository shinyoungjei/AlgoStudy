package src.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_9012_괄호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int TC = Integer.parseInt(br.readLine());
        for(int tc = 0; tc<TC; tc++){
            String s = br.readLine();
            Stack<Character> stack = new Stack<>();
            boolean flag = false;

            for(int i=0; i<s.length(); i++){
                char ch = s.charAt(i);
                if(ch == '(') stack.push(ch);
                else{
                    if(stack.isEmpty()){
                        flag=true;
                        break;
                    }else{
                        stack.pop();
                    }
                }
            }

            if(!stack.isEmpty() || flag){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}
