package hn.com.ceutec.examen_final.utils;

import java.util.Scanner;

/**
 * BidimensionalArray.
 *
 * @author Gary Gonzalez Zepeda <mailto:gary.gonzalez@tigo.com.hn />
 * @version 1.0.0
 * @see
 * @since 09-17-2019 04:13:42 PM 2019
 */
public final class BidimensionalArray {

	/**
	 * Instantiates a new bidimensional array.
	 */
	private BidimensionalArray() {
	}

	/**
	 * Retrieve array.
	 *
	 * @param read   the read
	 * @param row    the row
	 * @param column the column
	 * @return the int[][]
	 */
	public static int[][] retrieveArray(final Scanner read, final int row, final int column) {
		int[][] tmpArray = new int[row][column];
		for (int i = 0; i < tmpArray.length; i++) {
			for (int j = 0; j < tmpArray[0].length; j++) {
				System.out.print("Ingrese elemento [" + i + "][" + j + "]: ");
				tmpArray[i][j] = read.nextInt();
			}
		}
		return tmpArray;
	}

	/**
	 * Prints the array.
	 *
	 * @param array the array
	 */
	public static void printArray(final int[][] array) {
		System.out.println("***************");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + "     ");
			}
		}
		System.out.println();
		System.out.println("***************");
	}

}
