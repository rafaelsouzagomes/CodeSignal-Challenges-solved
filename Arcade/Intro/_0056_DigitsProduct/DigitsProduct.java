package _0056_DigitsProduct;

public class DigitsProduct {

	static int solution(int product) {
		for(int i=1; i < 2659; i++) {
			String iStr = String.valueOf(i);
			int multiplicacao = 1;
			for(int j=0; j < iStr.length(); j++) {
				multiplicacao *= Character.getNumericValue(iStr.charAt(j));
			}
			
			if(multiplicacao==product) {
				return i;
			}
		}
		
		return -1;
	}
}
