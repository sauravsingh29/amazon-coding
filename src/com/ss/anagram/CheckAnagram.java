/**
 * 
 */
package com.ss.anagram;

import java.util.Arrays;

/**
 * @author Saurav Singh
 *
 */
public class CheckAnagram {

	public static void main(String[] args) {
		System.out.println(isAnagram("saurav", "ravsau"));
	}

	static boolean isAnagram(final String inpOne, final String inpTwo) {
		if (null == inpOne | null == inpTwo) {
			return false;
		}
		if (inpOne.length() != inpTwo.length()) {
			return false;
		}

		char[] one = inpOne.toCharArray();
		char[] two = inpTwo.toCharArray();
		Arrays.sort(one);
		Arrays.sort(two);
		return Arrays.equals(one, two);
	}

}
