package hn.com.ceutec.examen_final.utils;

import java.util.Scanner;

/**
 * UnidimensionalArray.
 *
 * @author Gary Gonzalez Zepeda <mailto:gary.gonzalez@tigo.com.hn />
 * @version 1.0.0
 * @see
 * @since 09-17-2019 03:30:58 PM 2019
 */
public final class UnidimensionalArray {

	/**
	 * Instantiates a new unidimensional array.
	 */
	private UnidimensionalArray() {
	}

	/**
	 * Retrieve array.
	 *
	 * @param read the read
	 * @param size the size
	 * @return the int[]
	 */
	public static int[] retrieveArray(final Scanner read, final int size) {
		int[] tmpArray = new int[size];
		for (int i = 0; i < tmpArray.length; i++) {
			System.out.print("Ingrese elemento [" + i + "]: ");
			tmpArray[i] = read.nextInt();
		}
		return tmpArray;
	}

	/**
	 * Prints the array.
	 *
	 * @param array the array
	 */
	public static void printArray(final int[] array) {
		System.out.println("***************");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "     ");
		}
		System.out.println();
		System.out.println("***************");
	}

	/**
	 * Prints the array.
	 *
	 * @param array the array
	 * @param order the order
	 */
	public static void printArray(final int[] array, final String order) {

		if (order.equals("a")) {
			UnidimensionalArray.printArray(array);
		} else {
			System.out.println("***************");
			for (int i = array.length - 1; i >= 0; i--) {
				System.out.print(array[i] + "     ");
			}
			System.out.println();
			System.out.println("***************");
		}

	}

}
