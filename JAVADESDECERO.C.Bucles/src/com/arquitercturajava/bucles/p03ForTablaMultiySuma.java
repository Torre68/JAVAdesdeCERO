package com.arquitercturajava.bucles;

import java.util.Scanner;

public class p03ForTablaMultiySuma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número");
		int num = sc.nextInt();
		sc.close();
		int suma=0;

		for (int i = 1; i <= 10; i++) {
			System.out.println("Iteración: "+i);
			suma=suma+i;
			// suma va cambiando de valor a cada iteracion, ya que es actualizado al ultimo valor
			//recibido por la iteracion 
			//System.out.println("El resultado de la suma de los 10 primeros núm es:" +suma);
			//MUCHISIMO CUIDADO LO QUE SE METE DENTRO DEL BUCLE
			System.out.println("Suma actual: "+suma );
		}
			
			System.out.println("El resultado de la suma de los 10 primeros núm es:" +suma);
		}
	}


