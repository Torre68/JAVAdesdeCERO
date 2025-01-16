package com.arquitercturajava.bucles;

import java.util.Scanner;

public class p02ForTablaMultiplicar {

	public static void main(String[] args) {
		//Tabla de multiplicar cualquier numero

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número");
		int num = sc.nextInt();
		sc.close();

		for (int i = 1; i <= 10; i++) {
			// i=1 es para que empieze desde uno y no saque la obviedad de x*0=0
			System.out.println(num*i);

		}

	}

}
