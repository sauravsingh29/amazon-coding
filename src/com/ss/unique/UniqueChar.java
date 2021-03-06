/**
 * 
 */
package com.ss.unique;

import java.util.Scanner;

/**
 * @author Saurav Singh
 *
 */
public class UniqueChar {

	public static void main(String[] args) {
		String inp;
		Scanner scanner = null;
		try{
			scanner = new Scanner(System.in);
			System.out.print("Please enter the string  to check :: ");
			System.out.println("");
			inp = scanner.next();
		} finally {
			scanner.close();
		}
		System.out.println(isUniqueChar(inp));
		System.out.println(isUniqueCharByBooleans(inp));
	}

	private static boolean isUniqueChar(String inp) {
		char[] cs = inp.toCharArray();
		for (int i = 0; i < cs.length; i++) {
			for (int j = 1; j < cs.length; j++) {
				if (cs[i] == cs[j] && i != j) {
					return false;
				}
			}
		}
		return true;
	}

	private static boolean isUniqueCharByBooleans(String inp) {
		boolean[] bs = new boolean[26];
		if (null == inp) {
			return true;
		}
		String in = inp.toUpperCase();
		char[] cs = in.toCharArray();
		for (int i = 0; i < cs.length; i++) {
			if (!bs[cs[i] - 64]) {
				bs[cs[i] - 64] = true;
			}
			else {
				return false;
			}
		}
		return true;
	}

}
