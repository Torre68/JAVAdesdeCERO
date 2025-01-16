package com.arquitecturajava.funciones;

public class p06Recursividad {

	public static void main(String[] args) {
		System.out.println(factorial(5));
		System.out.println(factorialRecursivo(5));
		System.out.println(factorialRecursivo(-7));

	}

	public static int factorial(int num) {
		int factorial = 1;
		// Si inicializamos en cero nos va a dar error porque cualquier cosa
		// multiplicada
		// por cero es cero. Atento a los detalles.
		for (int i = num; i > 0; i--) {
			// Ojo con los bucles inversos, razona las cosas cuando no sea el bucle for
			// habitual.
			// Estamos haciendo un factorial asi que empezamos desde el num que decidamos
			// y vamos haciendo iteraciones y multiplicandolo por el num inferior hasta que
			// lleguemos a 1 (Acuerdate del truco de Jose Luis en vez de usar <=10 usar <11
			// y en vez de usar >=0 usar >-1
			factorial = factorial * i;

		}
		return factorial;
	}

	public static int factorialRecursivo(int num) {

		if (num <= 1) {
			return num;}
		return num * factorialRecursivo(num - 1);

	}
}