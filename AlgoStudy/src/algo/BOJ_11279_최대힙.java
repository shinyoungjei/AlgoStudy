package src.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class BOJ_11279_최대힙 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        while (N-- > 0){
            int num = Integer.parseInt(br.readLine());
            if(num != 0){
                pq.offer(num);
            } else {
                if(!pq.isEmpty()){
                    sb.append(pq.poll()).append("\n");
                }else {
                    sb.append(0).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
