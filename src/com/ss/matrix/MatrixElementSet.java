/**
 * 
 */
package com.ss.matrix;

import java.util.Scanner;

/**
 * @author saurav
 *
 */
public class MatrixElementSet {

	public static void main(String[] args) {
		int m, n;
		int[][] mat;
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			System.out.print("Please enter the row size:: ");
			m = scanner.nextInt();
			System.out.print("Please enter the cloumn size:: ");
			n = scanner.nextInt();
			mat = new int[m][n];
			for (int i = 0; i < m; i++) {
				System.out.println("Please enter elemnts in row :: " + (i + 1));
				for (int j = 0; j < n; j++) {
					mat[i][j] = scanner.nextInt();
				}
			}
			System.out.println("========== Input Matrix ==========");
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(mat[i][j] + "\t");
				}
				System.out.println("");
			}

			boolean isZero = false;
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					if (mat[i][j] == 0 && !isZero) {
						isZero = true;
						break;
					}
				}
				if (isZero) {
					break;
				}
			}

			if (isZero) {
				for (int i = 0; i < m; i++) {
					for (int j = 0; j < n; j++) {
						mat[i][j] = 0;
					}
				}
			}

			System.out.println("========== Output Matrix ==========");
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(mat[i][j] + "\t");
				}
				System.out.println("");
			}

		}
		finally {
			scanner.close();
		}
	}

}
