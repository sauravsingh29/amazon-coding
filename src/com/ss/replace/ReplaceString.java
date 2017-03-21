/**
 * 
 */
package com.ss.replace;

import java.util.Scanner;

/**
 * @author Saurav Singh
 *
 */
public class ReplaceString {

	public static void main(String[] args) {
		String inp;
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			System.out.print("Please enter the string :: ");
			inp = scanner.next();
		}
		finally {
			scanner.close();
		}
		String[] split = inp.split("\\s+");
		StringBuffer buffer = new StringBuffer(split[0]);
		for (int i = 1; i < split.length; i++) {
			buffer.append("%20");
			buffer.append(split[i]);
		}
		System.out.println(buffer.toString());
	}
}
