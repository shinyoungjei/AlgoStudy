package src.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_18258_큐2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int num = 0;
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            switch (str){
                case "push":
                    num = Integer.parseInt(st.nextToken());
                    queue.add(num);
                    break;
                case "pop":
                   sb.append(queue.isEmpty()?-1:queue.poll()).append("\n");
                    break;
                case "size":
                   sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    sb.append(queue.isEmpty()?1:0).append("\n");
                    break;
                case "front":
                    sb.append(queue.isEmpty()?-1:queue.peek()).append("\n");
                    break;
                case "back":
                    sb.append(queue.isEmpty()?-1:num).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}
