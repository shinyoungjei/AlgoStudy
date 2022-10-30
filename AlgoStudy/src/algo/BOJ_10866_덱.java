package src.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class BOJ_10866_덱 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new LinkedList<>();

        for(int i=0; i<N; i++){
            String[] str = br.readLine().split(" ");
            String firstStr = str[0];
            if(firstStr.equals("push_front"))deque.offerFirst(Integer.parseInt(str[1]));
            if(firstStr.equals("push_back"))deque.offerLast(Integer.parseInt(str[1]));
            if(firstStr.equals("pop_front")) System.out.println(deque.isEmpty()?-1:deque.pollFirst());
            if(firstStr.equals("pop_back")) System.out.println(deque.isEmpty()?-1:deque.pollLast());
            if(firstStr.equals("size")) System.out.println(deque.size());
            if(firstStr.equals("empty")) System.out.println(deque.isEmpty()?1:0);
            if(firstStr.equals("front")) System.out.println(deque.isEmpty()?-1:deque.peekFirst());
            if(firstStr.equals("back")) System.out.println(deque.isEmpty()?-1:deque.peekLast());
        }
    }
}
