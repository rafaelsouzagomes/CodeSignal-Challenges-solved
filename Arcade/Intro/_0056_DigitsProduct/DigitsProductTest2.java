package _0056_DigitsProduct;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DigitsProductTest2 {

	@Test
	void test() {
		assertEquals(26, DigitsProduct.solution(12));
	}
	
	@Test
	void teste_2() {
		assertEquals(2559, DigitsProduct.solution(450));
	}

}
