package _0047_ElectionsWinners;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ElectionsWinnersTest {

	@Test
	void cenario_1() {
		ElectionsWinners elc = new ElectionsWinners();
		
		int[] votes = {1,3,3,1,1};
		int k = 0;	
		assertEquals(0,elc.electionsWinners(votes, k));
	}
	
	@Test
	void cenario_2() {
		ElectionsWinners elc = new ElectionsWinners();
		
		int[] votes = {3, 1, 1, 3, 1};
		int k = 2;	
		assertEquals(2,elc.electionsWinners(votes, k));
	}
	
	@Test
	void cenario_3() {
		ElectionsWinners elc = new ElectionsWinners();
		
		int[] votes = {1, 1, 1, 1, 3};
		int k = 0;	
		assertEquals(1,elc.electionsWinners(votes, k));
	}
	
	@Test
	void cenario_4() {
		ElectionsWinners elc = new ElectionsWinners();
		
		int[] votes = {1, 1, 1, 1, 1};
		int k = 0;	
		assertEquals(0,elc.electionsWinners(votes, k));
	}
	
	
	@Test
	void cenario_5() {
		ElectionsWinners elc = new ElectionsWinners();
		
		int[] votes = {1, 1, 1, 1, 1};
		int k = 1;	
		assertEquals(5,elc.electionsWinners(votes, k));
	}
	
	@Test
	void cenario_6() {
		ElectionsWinners elc = new ElectionsWinners();
		
		int[] votes = {3, 3, 2, 2, 1};
		int k = 1;	
		assertEquals(2,elc.electionsWinners(votes, k));
	}

	@Test
	void cenario_7() {
		ElectionsWinners elc = new ElectionsWinners();
		
		int[] votes = {2, 3, 5, 2};
		int k = 3;	
		assertEquals(2,elc.electionsWinners(votes, k));
	}
	
	
	@Test
	void cenario_8() {
		ElectionsWinners elc = new ElectionsWinners();
		
		int[] votes = {2, 2, 1, 1};
		int k = 1;	
		assertEquals(2,elc.electionsWinners(votes, k));
	}
	
	@Test
	void cenario_9() {
		ElectionsWinners elc = new ElectionsWinners();
		
		int[] votes = {4, 3, 2, 1};
		int k = 2;	
		assertEquals(2,elc.electionsWinners(votes, k));
	}
	
	@Test
	void cenario_10() {
		ElectionsWinners elc = new ElectionsWinners();
		
		int[] votes = {2, 2, 1, 1};
		int k = 1;	
		assertEquals(2,elc.electionsWinners(votes, k));
	}
	
	@Test
	void cenario_11() {
		ElectionsWinners elc = new ElectionsWinners();
		
		int[] votes = {0, 0, 0, 0};
		int k = 1;	
		assertEquals(4,elc.electionsWinners(votes, k));
	}
	
	@Test
	void cenario_12() {
		ElectionsWinners elc = new ElectionsWinners();
		
		int[] votes = {0, 0, 0, 0};
		int k = 0;	
		assertEquals(0,elc.electionsWinners(votes, k));
	}
	
	@Test
	void cenario_13() {
		ElectionsWinners elc = new ElectionsWinners();
		
		int[] votes = {0, 0, 0, 0};
		int k = 3;	
		assertEquals(4,elc.electionsWinners(votes, k));
	}
}
