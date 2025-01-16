package com.arquitecturajava.arrays;

public class p08OrdenarArrayFinal {

	public static void main(String[] args) {
		int[] lista = new int[] { 8, 2, 5, 1, 7, 9, 3, 4, 0 };
		
		boolean Noordenado = true;

		while (Noordenado) {
			// Mientras no este ordenado entro en el bucle while.
			Noordenado = false;
			// Una vez dentro del bucle while asumimos que esta todo ordenado
			for (int i = 0; i < lista.length - 1; i++) {
				if (lista[i] > lista[i + 1]) {
					int temporal = lista[i];
					lista[i] = lista[i + 1];
					lista[i + 1] = temporal;
					Noordenado = true;
					// Con esto lo que hago es: Si Noordenado (1er boolean)entro en el while, una
					// vez en el while asumo que esta todo ordenado (2do boolean) a no ser que al
					// hacer el bucle
					// for se tenga que entrar en el if, por lo cual volveriamos al último boolean,
					// que nos remitiria otra vez al inicio del while y asi sucesivamente hasta que
					// no se necesite mas entrar en el IF
				}
				System.out.println(lista[i]);
				//La ultima lista de 9 numeros es la ordenada, pero nos ha impreso 72 num,
				//por lo que los bucles se han repetido 8 veces hasta llegar a la solucion
			}

		}
	}

}
