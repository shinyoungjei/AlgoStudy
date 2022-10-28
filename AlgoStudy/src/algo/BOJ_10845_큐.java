package src.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_10845_큐 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        int sum =0;
        for(int i=0; i<N; i++){
            String dummy = br.readLine();
            String[] dummySplit = dummy.split(" ");
            if(dummySplit[0].equals("push")){
                sum = Integer.parseInt(dummySplit[1]);
                queue.add(sum);
            } else if (dummySplit[0].equals("pop")) {
                System.out.println(queue.isEmpty()?-1:queue.poll());
            } else if (dummySplit[0].equals("size")) {
                System.out.println(queue.size());
            } else if (dummySplit[0].equals("empty")) {
                System.out.println(queue.isEmpty()?1:0);
            } else if (dummySplit[0].equals("front")) {
                System.out.println(queue.isEmpty()?-1:queue.peek());
            } else if (dummySplit[0].equals("back")) {
                System.out.println(queue.isEmpty()?-1:sum);
            }
        }
    }
}
