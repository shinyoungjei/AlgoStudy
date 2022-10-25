package src.algo;

public class PRO_최솟값만들기 {

	public static void main(String[] args) {
		String s = ")()(";		
		System.out.println(solution(s));
	}

	private static boolean solution(String s) {
        boolean answer = true;
        String[] str = s.split("");
        int openCal = 0;
        int closeCal = 0;
        for(int i=0; i<str.length; i++){
        	if(str[0].charAt(0)==')')closeCal++;
            if(str[i].charAt(0) == '('){
            	openCal++;
            	}else{
            	closeCal++;
            	}
        }
        answer = openCal == closeCal ? true : false;
        return answer;
	}

}
