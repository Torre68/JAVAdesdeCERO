package com.arquitecturajava.funciones;

public class p04PasoporValor {
	// Para valores Primitivos
	//Se pasa una copia de la variable
	//El original no cambia tras pasarse por el metodo

	public static void main(String[] args) {
		int numero = 5;
        modificarNumero(numero);
        System.out.println(numero); // Imprime 5, no 10
    }

    public static void modificarNumero(int n) {
        n = 10; // Solo cambia la copia, no la variable original
    }
	}


