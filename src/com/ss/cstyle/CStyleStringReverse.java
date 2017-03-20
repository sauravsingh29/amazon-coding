/**
 * 
 */
package com.ss.cstyle;

import java.util.Scanner;

/**
 * @author Saurav Singh
 *
 */
public class CStyleStringReverse {

	public static void main(String[] args) {
		String inp;
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			System.out.print("Please enter the string  for C-Style conversion :: ");
			System.out.println("");
			inp = scanner.next();
		}
		finally {
			scanner.close();
		}
		System.out.println(reverseCStyle(inp));
	}

	static String reverseCStyle(String inp) {
		char[] cs = inp.toCharArray();
		int i = 0;
		int j = inp.length() - 1;
		char temp;
		while (i < j) {
			temp = cs[i];
			cs[i] = cs[j];
			cs[j] = temp;
			i++;
			j--;
		}

		return new String(cs);

	}
}
