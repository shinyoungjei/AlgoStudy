package src.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_1746_듣보잡 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;


        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> hash = new HashSet<>();
        List<String> list = new ArrayList<>();

        for (int i=0; i<N; i++){
            String str = br.readLine();
            hash.add(str);
        }

        for (int i=0; i<M; i++){
            String str = br.readLine();
            if (hash.contains(str)) list.add(str);
        }

        Collections.sort(list);
        System.out.println(list.size());
        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
