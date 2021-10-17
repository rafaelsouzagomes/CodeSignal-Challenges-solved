package _0045_BuildPalindrome;

public class BuildPalindrome {

	public String buildPalindrome(String st) {
		String palindrome = st;
		for(int i=0; i < st.length(); i++) {
			if(palindrome.equals(new StringBuilder(palindrome).reverse().toString())) {
				return palindrome;
			}
			palindrome = st + new StringBuilder(st.substring(0, i)).reverse().toString();
		}
		return palindrome;
	}
}
