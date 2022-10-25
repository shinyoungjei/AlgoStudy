package src.algo;

public class PRO_성격유형검사하기 {

	public static void main(String[] args) {
		String[] survey = { "TR", "RT", "TR"};
		int[] choice = { 7, 1, 3 };
		System.out.println(solution(survey, choice));
		
	}

	private static String solution(String[] survey, int[] choices) {
		String answer = "";
		String mbti[] = { "RT", "CF", "JM", "AN" };
		int cnt[] = new int[26];

		for (int i = 0; i < survey.length; i++) {
			char front = survey[i].charAt(0);
			char back = survey[i].charAt(1);

			int point = choices[i] - 4;

			if (point == 0)
				continue;

			if (point < 0) {
				cnt[front - 'A'] -= point;
			} else {
				cnt[back - 'A'] += point;
			}
		}
		
		 StringBuilder sb = new StringBuilder();
		for(int i=0; i<mbti.length; i++) {
			char mbtiFront = mbti[i].charAt(0);
			char mbtiBack = mbti[i].charAt(1);
			
			int cntFront = cnt[mbtiFront-'A'];
			int cntBack = cnt[mbtiBack - 'A'];
			
			if (cntFront == cntBack) sb.append(mbtiFront);
            else sb.append(cntFront>cntBack ? mbtiFront:mbtiBack);			
		}
		answer = sb.toString();
		return answer;
	}

}

//class Solution {
//    private static final String[] INDICATORS = {"RT", "CF", "JM", "AN"};
//    public String solution(String[] survey, int[] choices) {
//        int[] cnt = new int['Z'-'A'+1];
//        for (int i = 0; i < survey.length; i++) {
//            char a = survey[i].charAt(0);
//            char b = survey[i].charAt(1);
//            int score = choices[i]-4;
//            if (score == 0) continue;
//            if (score<0) cnt[a-'A']-=score;
//            else cnt[b-'A']+=score;
//        }
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < INDICATORS.length; i++) {
//            char a = INDICATORS[i].charAt(0);
//            char b = INDICATORS[i].charAt(1);
//            int cntA = cnt[a-'A'];
//            int cntB = cnt[b-'A'];
//            if (cntA == cntB) sb.append(a);
//            else sb.append(cntA>cntB ? a:b);
//        }
//        return sb.toString();
//    }
//}
