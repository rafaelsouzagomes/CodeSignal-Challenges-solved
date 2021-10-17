package _0046_ElectionsWinners;

import java.util.Arrays;

public class ElectionsWinners {

	public int electionsWinners(int[] votes, int k) {
		Arrays.sort(votes);  
		if(k==0) {
			return Arrays.stream(votes).filter(vote -> vote == votes[votes.length-1]).count() == 1? 1:0;
		}
		return (int) Arrays.stream(votes).filter(vote -> vote + k > votes[votes.length-1]).count();
	}
}
