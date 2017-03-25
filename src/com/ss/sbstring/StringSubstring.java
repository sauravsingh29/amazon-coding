/**
 * 
 */
package com.ss.sbstring;

import java.util.Arrays;

/**
 * @author Saurav Singh
 *
 */
public class StringSubstring {

	public static void main(String[] args) {
		String s1 = "waterbottle";
		String s2 = "erbottlewat";
		System.out.println(isSubstring(s1, s2));

	}

	public static boolean isSubstring(final String inp, final String inpTwo) {
		boolean isSubstring = false;
		if (inp.length() == inpTwo.length()) {
			char[] sArray = inp.toCharArray();
			char[] oArray = inp.toCharArray();
			Arrays.sort(sArray);
			Arrays.sort(oArray);
			isSubstring = Arrays.equals(sArray, oArray);
		}
		return isSubstring;
	}

}
