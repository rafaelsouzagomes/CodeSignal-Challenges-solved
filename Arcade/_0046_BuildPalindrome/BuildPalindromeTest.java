package _0046_BuildPalindrome;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BuildPalindromeTest {

	/* Challenge: Given a string, find the shortest possible string which can be achieved by adding characters 
	 to the end of initial string to make it a palindrome.*/
	
	@Test
	void cenario_01() {
		BuildPalindrome bp = new BuildPalindrome();
		
		String st = "abcdc";
		assertEquals("abcdcba", bp.buildPalindrome(st ));
	}
	
	@Test
	void cenario_05() {
		BuildPalindrome bp = new BuildPalindrome();
		
		String st = "aaaaba";
		assertEquals("aaaabaaaa", bp.buildPalindrome(st ));
	}
	
	@Test
	void cenario_11() {
		BuildPalindrome bp = new BuildPalindrome();
		
		String st = "euotmn";
		assertEquals("euotmnmtoue", bp.buildPalindrome(st ));
	}

}
