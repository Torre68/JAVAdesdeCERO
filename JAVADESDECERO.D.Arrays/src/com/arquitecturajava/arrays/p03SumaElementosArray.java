package com.arquitecturajava.arrays;

public class p03SumaElementosArray {

	public static void main(String[] args) {

		int[] lista = new int[] { 2, 4, 6, 8 };
		int sumaTotal = 0;
		for (int i = 0; i < lista.length; i++) {
			// De esta manera con "sumaTotal" empezamos en valor cero. A cada iteracion se
			// le suma
			// al cero el primer valor de la lista y se almacena como el nuevo valor de
			// "sumaTotal"
			// en este caso 0+2=2, por lo que 2 seria el nuevo valor de "sumaTotal". En la
			// siguiente
			// iteracion hacemos lo mismo, sumando al nuevo valor de "sumaTotal" el valor de
			// la siguiente posicion
			// en este caso 2+4=6, por lo que 6 seria el nuevo valor de "sumaTotal"
			// y asi sucesivamente hasta finalizar el bucle y alcanzar la "sumaTotal" final.
			sumaTotal = sumaTotal + lista[i];

			System.out.println("La suma de los elementos de la iteracion "+i+" es: " + sumaTotal);
			//Al poner este "syso" dentro del bucle vemos como el bucle va haciendo lo arriba explicado
			//
		}
		System.out.println("La suma final de todos los elementos de la lista es: " + sumaTotal);
		//Al poner el "syso" aqui solo obtenemos el resultado completo del bucle 
	}
}
