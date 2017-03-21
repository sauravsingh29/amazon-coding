/**
 * 
 */
package com.ss.rem.dup;

import java.util.Scanner;

/**
 * @author Saurav Singh
 *
 */
public class RemoveDuplicates {

	public static void main(String[] args) {
		String inp;
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			System.out.print("Please enter the string  for dups removal :: ");
			System.out.println("");
			inp = scanner.next();
			System.out.println(new String(removeDups(inp.toCharArray())));
		}
		finally {
			scanner.close();
		}
	}

	private static char[] removeDups(char[] cs) {
		int tail = 0;
		int dup = 0;
		if (cs == null) {
			return cs;
		}
		if (cs.length < 2) {
			return cs;
		}
		for (int i = 0; i < cs.length; i++) {
			boolean found = false;
			for (int j = 0; j < i; j++) {
				if (cs[i] == cs[j]) {
					found = true;
					break;
				}
			}
			if (found) {
				dup++;
				continue;
			}
			else {
				cs[tail] = cs[i];
				tail++;
			}
		}
		for (int i = dup; i > 0; i--) {
			cs[cs.length - i] = 0;
		}
		return cs;
	}

	public static String removeDuplicateWithBoolean(String s) {
		String retn = null;
		boolean[] b = new boolean[256];
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.println(b[ch[i]]);
			if (b[ch[i]]) {
				ch[i] = ' ';
			}
			else {
				b[ch[i]] = true;
			}
		}

		retn = new String(ch);
		return retn;

	}
}
