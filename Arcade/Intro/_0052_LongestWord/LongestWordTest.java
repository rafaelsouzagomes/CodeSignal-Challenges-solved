package _0052_LongestWord;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LongestWordTest {

	@Test
	void test() {
		LongestWord l = new LongestWord();
		
//		assertEquals(false, l.isLetra("aaaaaaa!a"));
		String text = "Ready, steady, go";
		assertEquals("steady",l.solution(text));
	}

}
