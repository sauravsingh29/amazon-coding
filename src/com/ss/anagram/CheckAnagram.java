/**
 * 
 */
package com.ss.anagram;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Saurav Singh
 *
 */
public class CheckAnagram {

	public static void main(String[] args) {
		String inpOne;
		String inpTwo;
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			System.out.print("Please enter the first string :: ");
			System.out.println("");
			inpOne = scanner.next();
			System.out.print("Please enter the two string :: ");
			System.out.println("");
			inpTwo = scanner.next();
		}
		finally {
			scanner.close();
		}
		System.out.println(isAnagram(inpOne, inpTwo));
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
