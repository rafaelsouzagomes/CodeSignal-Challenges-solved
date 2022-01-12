package _0052_LongestWord;

import java.util.regex.Pattern;

public class LongestWord {

	String solution(String text) {
		
		 String[] wordsSeparated = text.split(", ");
		 String biggestWord = "";
		 for(String currentWord: wordsSeparated){
			 System.out.println(currentWord);
			 if(currentWord.length()>biggestWord.length() && isLetra(currentWord) ){
				 biggestWord = currentWord;
		     }
		  }
		 return biggestWord;
	}
	
	
	Boolean isLetra(String word) {
		for(char letter: word.toCharArray()) {
			if(!Character.isAlphabetic(letter)) {
				return false;
			}
		}
		return true;
	}
}
