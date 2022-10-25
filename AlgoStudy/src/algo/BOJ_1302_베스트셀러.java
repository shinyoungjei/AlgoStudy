package src.algo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ_1302_베스트셀러 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null; 
		
		int N = Integer.parseInt(br.readLine());		
		Map<String, Integer> map = new HashMap<>();
		int cnt = 0;
		for(int i=0; i<N; i++) {
			String book = br.readLine();
			map.put(book, map.getOrDefault(book, 0)+1);
			cnt = Math.max(cnt, map.get(book));
		}
		List<String> list = new ArrayList<>();
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			if(entry.getValue() == cnt) list.add(entry.getKey());
		}
		Collections.sort(list);
		System.out.println(list.get(0));

	}

}
