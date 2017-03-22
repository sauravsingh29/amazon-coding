/**
 * 
 */
package com.ss.rotate;

import java.util.Scanner;

/**
 * @author Saurav Singh
 *
 */
public class RotateMatrix {

	public static void main(String[] args) {
		int n;
		int[][] mat;
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			System.out.print("Please enter the matrix size [ n x n ] :: ");
			n = scanner.nextInt();
			mat = new int[n][n];
			System.out.println(mat.length);
			for (int i = 0; i < n; i++) {
				System.out.println(String.format("Please enter element of row %d ", i + 1));
				for (int j = 0; j < n; j++) {
					mat[i][j] = scanner.nextInt();
				}
			}
			System.out.println("======= Before transpose =======");
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(mat[i][j] + "\t");
				}
				System.out.println("");
			}
//			System.out.println("======= After transpose =======");
//			for (int i = 0; i < n; i++) {
//				for (int j = 0; j < n; j++) {
//					System.out.print(mat[j][i] + "\t");
//				}
//				System.out.println("");
//			}
			
			System.out.println("======= After rotate =======");
			for (int i = 0; i < n; i++) {
				for (int j = n - 1; j >= 0; j--) {
					System.out.print(mat[j][i] + "\t");
				}
				System.out.println("");
			}
		}
		finally {
			scanner.close();
		}
	}
}
