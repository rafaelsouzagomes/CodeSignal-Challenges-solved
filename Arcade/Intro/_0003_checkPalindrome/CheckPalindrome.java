package _0003_checkPalindrome;

public class CheckPalindrome {

	boolean solution(String inputString) {
	    char[] stringVetor = inputString.toCharArray();
	    int vUltimaPosicao = stringVetor.length-1;
	    int vprimeiraposicao = 0;
	        while(vUltimaPosicao > vprimeiraposicao)
	        {
	            if(stringVetor[vUltimaPosicao] != stringVetor[vprimeiraposicao])   
	                return false;           
	        vUltimaPosicao--;
	        vprimeiraposicao++;
	        }    
	    return  true;
	}
	
	public boolean solution2(String inputString) {
	    return inputString.equals(new StringBuilder(inputString).reverse().toString());
	}
}
