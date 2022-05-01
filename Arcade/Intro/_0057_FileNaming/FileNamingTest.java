package _0057_FileNaming;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.jupiter.api.Test;

class FileNamingTest {

	@Test
	void test() {
		String[] input = {	"doc", 
		                	"doc", 
		                	"image", 
		                	"doc(1)", 
		                	"doc" };
		
		String[] answer = {	"doc", 
				 			"doc(1)", 
				 			"image", 
				 			"doc(1)(1)", 
				 			"doc(2)"};
		
		int i=0;
		String[] myAnswer = FileNaming.solution(input);
		for(String inputCurrent: myAnswer) {
			assertEquals(answer[i], inputCurrent);
			i++;
		}
	}
	
	@Test
	void test2() {
		
		String[] input = 
			{"a(1)", 
					 "a(6)", 
					 "a", 
					 "a", 
					 "a", 
					 "a", 
					 "a", 
					 "a", 
					 
					 "a", 
					 "a", 
					 "a", 
					 "a"};

		String[] answer = {"a(1)", 
				 			"a(6)", 
				 			"a", 
				 			"a(2)", 
				 			"a(3)", 
				 			"a(4)", 
				 			"a(5)", 
				 			"a(7)", 
				 			
				 			"a(8)", 
				 			"a(9)", 
				 			"a(10)", 
				 			"a(11)"};
		
		int i=0;
		String[] myAnswer = FileNaming.solution(input);
		for(String inputCurrent: myAnswer) {
			System.out.println(inputCurrent);
			assertEquals(answer[i], inputCurrent);
			i++;
		}
	}
	

}
