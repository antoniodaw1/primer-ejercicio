/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Antonio
 */
package claves;
import java.util.Scanner;
public class ej {
 	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int aux = 0;
		int nummayor = 0;
		int nummenor = 0;
		int posicionmayor = 0;
		int posicionmenor = 0;
		int opcion;
		int array[] = new int[7];

		do {
			System.out.println("Introduce 1 si quieres introducir el número de ejercicios que has hecho a mano");
			System.out.println("Introduce 2 si quieres que el número de ejercicios se te asigne aleatoriamente ");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				for (int i = 0; i < array.length; i++) {
					System.out.println("Introduce desde el 1 al 20 los ejercicios que has hecho");
					if (i == 0) {
						System.out.println("Lunes");

					} else if (i == 1) {
						System.out.println("Martes");

					} else if (i == 2) {
						System.out.println("Miércoles");

					} else if (i == 3) {
						System.out.println("Jueves");

					} else if (i == 4) {
						System.out.println("Viernes");

					} else if (i == 5) {
						System.out.println("Sábado");

					} else if (i == 6) {
						System.out.println("Domingo");

					}
					array[i] = sc.nextInt();
				}
				break;

			case 2:
				for (int i = 0; i < array.length; i++) {
					array[i] = (int) (Math.random() * 20) + 1;
				}
				break;

			default:
				System.out.println("Te has equivocado de opción, vuelve a empezar");
				System.out.println();
				break;
			}

		} while (opcion < 0 || opcion > 3);

		System.out.println();
		System.out.println("Imprimiendo array original");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " * ");
		}

		int array2[] = new int[7];

		for (int i = 0; i < array2.length; i++) {
			array2[i] = array[i];

		}

		System.out.println();
		System.out.println("Imprimiendo copia");
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " * ");
		}

		for (int j = 0; j < array2.length - 1; j++) {
			for (int i = 0; i < array2.length - 1; i++) {
				if (array2[i] > array2[i + 1]) {
					aux = array2[i];
					array2[i] = array2[i + 1];
					array2[i + 1] = aux;
				}
			}

		}

		System.out.println();
		System.out.println("Imprimiendo la ordenación");
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " * ");
		}

		/* El mayor y el menor se puede obtener con acceso directo
		 * System.out.println("el número máximo de ejercicios"+ array2[array2.length-1]);
		boolean encontrado= false;
		for (int i = 0; i < array.length&&encontrado==false; i++) {
			if (array[i] == array2[array2.length-1]) {
				System.out.println(i+1);
				encontrado=true;
			}
		}
		*/
		/*int indice=0;
		do {
			indice++;
		}while (array2[indice]==0 && indice<array2.length);
		if (indice<array2.length)
		 	System.out.println("el número mínimo de ejercicios"+ array2[indice]);
		else 
			System.out.println("No has hecho ejercicios.");
		 //faltaría buscar el día como para el máximo
		 */
			
		for (int i = 0; i < array.length; i++) {
			if (array[i] > nummayor) {
				nummayor = array[i];
				posicionmayor = i + 1;

			}

		}
		nummenor = nummayor;
		for (int i = 0; i < array.length; i++) {
			if ((array[i] < nummenor) && (array[i] != 0)) {
				nummenor = array[i];
				posicionmenor = i + 1;

			}

		}
		System.out.println();
		switch (posicionmayor) {
		case 1:
			System.out.println("El numero mayor es " + nummayor + " y su día es Lunes");
			break;
		case 2:
			System.out.println("El numero mayor es " + nummayor + " y su día es Martes");
			break;
		case 3:
			System.out.println("El numero mayor es " + nummayor + " y su día es Miércoles");
			break;
		case 4:
			System.out.println("El numero mayor es " + nummayor + " y su día es Jueves");
			break;
		case 5:
			System.out.println("El numero mayor es " + nummayor + " y su día es Viernes");
			break;
		case 6:
			System.out.println("El numero mayor es " + nummayor + " y su día es Sábado");
			break;
		default:
			System.out.println("El numero mayor es " + nummayor + " y su día es Domingo");
			break;
		}

		switch (posicionmenor) {
		case 1:
			System.out.println("El número menor es " + nummenor + " y su día es Lunes");
			break;
		case 2:
			System.out.println("El número menor es " + nummenor + " y su día es Martes");
			break;
		case 3:
			System.out.println("El número menor es " + nummenor + " y su día es Miércoles");
			break;
		case 4:
			System.out.println("El número menor es " + nummenor + " y su día es Jueves");
			break;
		case 5:
			System.out.println("El número menor es " + nummenor + " y su día es Viernes");
			break;
		case 6:
			System.out.println("El número menor es " + nummenor + " y su día es Sábado");
			break;
		default:
			System.out.println("El número menor es " + nummenor + " y su día es Domingo");
			break;
		}
	}

}
