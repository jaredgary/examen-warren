package hn.com.ceutec.examen_final;

import java.util.Scanner;

import hn.com.ceutec.examen_final.utils.BidimensionalArray;
import hn.com.ceutec.examen_final.utils.Menu;
import hn.com.ceutec.examen_final.utils.UnidimensionalArray;

/**
 * Hello world!.
 *
 * @author Gary Gonzalez Zepeda <mailto:gary.gonzalez@tigo.com.hn />
 * @version 1.0.0
 * @see
 * @since 09-17-2019 03:33:46 PM 2019
 */
public class App {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		String order = null;
		int size = 0, option = -1, row = 0, column = 0;
		int[] simpleArray = {};
		int[][] multiArray = {};
		final Scanner read = new Scanner(System.in);

		while (option != 0) {
			Menu.menuPrincipal();
			System.out.print("Seleccione una opcion: ");
			option = read.nextInt();

			switch (option) {
			case 0:
				break;
			case 1:
				System.out.print("Ingrese tamano de arreglo: ");
				size = read.nextInt();

				if (size > 20) {
					System.out.print("El tamano maximo debe ser de 20.");
					break;
				}

				simpleArray = UnidimensionalArray.retrieveArray(read, size);

				break;
			case 2:
				System.out.print("Ingrese método de ordenamiento (a - Ascendente, b - Descendente): ");
				order = read.next();

				if (!order.endsWith("a") && !order.endsWith("b")) {
					System.out.print("Selección invalida.");
					break;
				}

				UnidimensionalArray.printArray(simpleArray, order);
				break;
			case 3:
				UnidimensionalArray.printArray(simpleArray);
				break;
			case 4:
				System.out.print("Ingrese tamano de filas: ");
				row = read.nextInt();

				if (row > 20) {
					System.out.print("El tamano maximo debe ser de 20.");
					break;
				}

				System.out.print("Ingrese tamano de columnas: ");
				column = read.nextInt();

				if (column > 20) {
					System.out.print("El tamano maximo debe ser de 20.");
					break;
				}

				multiArray = BidimensionalArray.retrieveArray(read, row, column);

				break;
			case 5:
				BidimensionalArray.printArray(multiArray);
				break;
			default:
				System.out.print("Selección invalida.");
				break;
			}
		}
		System.out.println("***************");
		System.out.println("******END******");
		System.out.println("***************");
		read.close();
	}

}
