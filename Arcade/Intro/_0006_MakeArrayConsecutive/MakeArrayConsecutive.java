package _0006_MakeArrayConsecutive;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MakeArrayConsecutive {

	public int solution(int[] statues) {
	    Arrays.sort(statues);
		return IntStream.range(0, statues.length-1)
				.filter(e -> statues[e + 1] - statues[e] > 1)
				.map(i -> statues[i + 1] - statues[i] - 1)
				.sum();
	}
}
