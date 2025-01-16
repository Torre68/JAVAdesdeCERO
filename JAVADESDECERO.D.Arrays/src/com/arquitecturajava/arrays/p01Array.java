package com.arquitecturajava.arrays;

public class p01Array {

	public static void main(String[] args) {
		// Declaracion del Array

		int[] lista = new int[3];

		// Esta lista estaria vacia y consistiria de 3 posiciones con valor cero en
		// todas las posiciones
		// Array comienzan con la posicion cero.
		lista[0] = 3;
		lista[1] = 5;
		lista[2] = 7;

		// lista[3]=9;
		// Si quiero añadir de esta forma mas posiciones el programa no compila
		// Hay que añadirlas todas al inicializar el Array
		// System.out.println(lista[3]);
		// MENSAJE DE ERROR:Exception in thread "main"
		// java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
		// at D.Arrays/com.arquitecturajava.arrays.p01Array.main(p01Array.java:15)

		System.out.println(lista[0]);
		System.out.println(lista[1]);
		System.out.println(lista[2]);
		System.out.println("Con el comando lista.length vemos el num de posiciones: "+lista.length);
		int[] listaavanzada = new int[] { 3, 5, 7, 6 };
		// Esta es la forma de ahorrarse pasos e inicializar la lista ya con sus valores
		// definidos
		
		System.out.println(listaavanzada[3]);
		System.out.println(listaavanzada[2]);
		System.out.println(listaavanzada[1]);
		System.out.println(listaavanzada[0]);
		
		System.out.println("Con el comando lista.length vemos el num de posiciones: "+listaavanzada.length);
	}

}
