package src.algo;

public class PRO_최대값최소값 {

	public static void main(String[] args) {
		String str = "-1 -2 -3 -4";
		System.out.println(soultion(str));
	}

	private static String soultion(String str) {
		String answer = "";
        String[] numbers = str.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){
            int num = Integer.parseInt(numbers[i]);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        answer = min + " " + max;
        return answer;
    }
}
