package com.arquitercturajava.bucles;

public class p08ControlyBucleRESTO {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double num1=6;
		double num2=3;
		double resto=num1 % num2;
		System.out.println("El resto de dividir 6 entre 3 es: "+resto);
		//El resto es lo que queda de dividir dos numeros. Si son divisibles entre si
		//Como el 6/3, el resto siempre es cero. Osea que el RESTO es lo que queda cuando una 
		//division es exacta
		
		//Ejercicio siguiente, Cuantos num del 1al 100 son divisibles entre 3;es decir
		// el resto es 0.
		int iteraciones=0;
		
		for (int i=1;i<=100;i++) {
			System.out.println(i);
			
			if (i%3==0) { iteraciones++;
		}
		
	}
		System.out.println("El numero de divisibles entre 3 es: "+iteraciones);
	}
}
