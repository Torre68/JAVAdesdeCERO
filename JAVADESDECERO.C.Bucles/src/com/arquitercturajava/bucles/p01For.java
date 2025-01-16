package com.arquitercturajava.bucles;

public class p01For {

	public static void main(String[] args) {
		// Primero declaro (int) la Iteración i=0;
		// Despues declaro el tope de iteraciones i<5
		// Finalizo declarando la manera de incrementar o decrementar i=i+1 (i++) || 
		// i=i-1 (i--)
		for (int i=0;i<5;i++) {

		// for (int i = 5; i >0; i--) { 
			//Bucle desde 5 hasta 1, en reverso
			System.out.println(i);
			//Esta linea imprime el numero de iteraciones
			System.out.println("Hola");
			//Esta linea es lo que se repite mientras el bucle no llegue a su fin i<5
			//Al empezar en cero el bucle llega hasta 4, pero son 5 iteraciones
			//Cuidado con los bucles en reverso
		}

	}

}
