package _0053_ValidTime;

public class ValidTime {

	boolean solution(String time) {
		  return  time.matches("[0-1][0-9][:][0-5][0-9]") || time.matches("[2][0-3][:][0-5][0-9]");
	}
}
