/**
 * 
 */
package com.ss.rem.dup;

/**
 * @author Saurav Singh
 *
 */
public class RemoveDuplicates {

	public static void main(String[] args) {
		String inp = "saurav"; //saurvingh
		char[] cs = inp.toCharArray();
		int tail = 0;
		int dup = 0;
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
		System.out.println(new String(cs));
		for (int i = dup; i > 0; i--) {
			cs[cs.length - i] = 0;
		}
		System.out.println(new String(cs));
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
