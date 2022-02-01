package _0004_adJacentElementsProduct;

import java.util.stream.IntStream;

public class adjacentElementsProduct {

	int solution(int[] inputArray) {
	    int atual = 0;
	    int proximo =1;
	    int maior = inputArray[atual]*inputArray[proximo];

	    while(proximo <= inputArray.length-1){
	        if( maior < (inputArray[atual]*inputArray[proximo]) )
	            maior = inputArray[atual]*inputArray[proximo];
	        atual++;
	        proximo++;
	    }
	    return maior;
	}
	
	int solution2(int[] inputArray) {
	    return IntStream.range(1, inputArray.length).map(i->inputArray[i]*inputArray[i-1]).max().getAsInt();
	}
}
