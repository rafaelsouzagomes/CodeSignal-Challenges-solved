package _0002_centuryFromYear;

public class CenturyFromYear {

	int solution(int year) {
	    return year%100!=0?year/100+1: year/100;
	}
}
