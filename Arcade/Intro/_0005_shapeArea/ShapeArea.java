package _0005_shapeArea;

import java.util.stream.IntStream;

public class ShapeArea {

	int solution(int n) {
	    return (n*IntStream.rangeClosed(2, n).map(i -> 2 ).sum()) + 1;
	}
}
