package _0054_sumUpNumbers;

public class SumUpNumbers {

	public int solution(String inputString) {
		String[] split = inputString.split("[^\\d]");
		int sum = 0;
		for( int i =0; i < split.length; i++) {
			if(!split[i].isEmpty()) {
				sum += Integer.parseInt(split[i]);
			}
		}

		return sum;
	}

}
