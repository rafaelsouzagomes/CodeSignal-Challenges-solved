package _0050_chessKnight;

public class ChessKnight {

	public int chessKnight(String cell) {
		
		int possibilities = 0;
		int asciiLetterTab = (int) cell.charAt(0);
		int numberTab = Character.getNumericValue(cell.charAt(1));
		
		if(asciiLetterTab+3 < 105 && numberTab+3 < 9 ) {
			possibilities += 2;
		}
		
		if(asciiLetterTab-3 > 96 && numberTab+3 < 9 ) {
			possibilities += 2;
		}
		
		if(asciiLetterTab+3 < 105 && numberTab-3 > 0 ) {
			possibilities += 2;
		}
		
		if(asciiLetterTab-3 > 96 &&  numberTab-3 > 0 ) {
			possibilities += 2;
		}
		
		return possibilities;
	}
	
	/*

	1. Pegar posicionamento do cavalo - ex: a1.
	2. tentar ir para diagonal varias maneiras
	    primeira maneira: a(+2) e 1(+2) = c3.
	        se c3 existe no tabuleiro
	            I1: então soma duas possibilidades de jogadas.
	    segunda maneira: a(-2) e 1(-2) = ? -1
	        se existe no tb.
	            faz I1
	        se não 
	            i2: como não existe, não vai somar novas possibilidades.
	    teceira maneira: a(-2) e 1(+2) 
	        se existe no tb
	            faz i1
	        se nao
	            i2
	    quarta maneira: a(+2) e 1(-2)
	        se existe no tb
	            faz i1
	        se não
	            i2
	retornar numero de possibilidades contabilizados. 
	    
	    



	alcance 9 ==>  2 jogadas possiveis
	alcance 20 ==> 6

	alcance 25  quadrados ->  8 JD
	alcance 20  quadrados ->  6 JD
	alcance 15  quadrados ->  4
	alcance 10  quadrados ->  2
	alcance  5  quadrados ->  1 jd


	alcance
	3 = 1
	20 = x

	20/3
	*/ 
}
