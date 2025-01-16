package com.arquitecturajava.control;

import java.util.Scanner;

public class p04Surroundwith {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce Nota");
		int nota = sc.nextInt();
		if (nota >= 5 && nota <= 10) {
			System.out.println("Has aprobado");
		} else if (nota >= 0 && nota < 5) {
			System.out.println("Has suspendido");
		} else {
			System.out.println("Nota introducida incorrecta");
		}
		sc.close();
	}

}
