package src.algo;

public class PRO_JadenCase문자열만들기 {

	public static void main(String[] args) {
		String s = "3people unFollowed me";
		System.out.println(soultion(s));
	}

	private static String soultion(String s) {
		String answer =" ";
		String[] str=s.toLowerCase().split(" ");
		for(int i=0; i<str.length; i++) {
			if('a' <= str[i].charAt(0) && 'z' >= str[i].charAt(0)) {
				System.out.println(str[i]);
			}
		}
		return answer;
	}

}
