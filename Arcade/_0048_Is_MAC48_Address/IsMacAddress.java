package _0048_Is_MAC48_Address;

import java.util.regex.Pattern;

public class IsMacAddress {
	
	boolean isMAC48Address(String inputString) {
		return Pattern.compile("[A-F0-9][A-F0-9][-][A-F0-9][A-F0-9][-][A-F0-9][A-F0-9][-][A-F0-9][A-F0-9][-][A-F0-9][A-F0-9][-][A-F0-9][A-F0-9]")
				.matcher(inputString).matches();
	}
}

