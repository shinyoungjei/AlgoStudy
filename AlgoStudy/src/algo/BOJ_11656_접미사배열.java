package src.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BOJ_11656_접미사배열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        List<String> list = new ArrayList<>();
        for(int i=0; i<str.length(); i++){
            String st = str.substring(i, str.length());
            list.add(st);
        }
        Collections.sort(list);
        for(String a : list){
            System.out.println(a);
        }
    }
}
