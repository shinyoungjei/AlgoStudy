package src.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_12891_DNA비밀번호 {
    static int checkArr[];
    static int myArr[];
    static int checkSecret;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int Result = 0;

        char A[] = new char[S];
        checkArr = new int[4];
        myArr = new int[4];
        checkSecret = 0;

        A = br.readLine().toCharArray();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i ++){
            checkArr[i] = Integer.parseInt(st.nextToken());
            if (checkArr[i] == 0) checkSecret ++;
        }

        // 초기 P 부분 문자열 처리 부분
        for (int i=0; i < P; i++){
            Add(A[i]);
        }

        if (checkSecret == 4) Result ++;

        // 슬라이딩 윈도우 처리 부분
        for (int i = P; i < S; i++){
            int j = i - P;
            Add(A[i]);
            Remove(A[j]);
            if (checkSecret == 4) Result++;
        }
        System.out.println(Result);
    }

    private static void Remove(char c) {
        switch(c){
            case'A':
                Remove(0);
                break;
            case'C':
                Remove(1);
                break;
            case'G':
                Remove(2);
                break;
            case'T':
                Remove(3);
                break;

        }
    }
    private static void Remove(int num){
        if (myArr[num] == checkArr[num]) checkSecret--;
        myArr[num]--;
    }

    private static void Add(char c) {
        switch (c){
            case 'A':
                AddArr(0);
                break;
            case 'C':
                AddArr(1);
                break;
            case 'G':
                AddArr(2);
                break;
            case 'T':
                AddArr(3);
                break;
        }
    }
    private static void AddArr(int num){
        myArr[num]++;
        if (myArr[num] == checkArr[num]) checkSecret ++;
    }
}
