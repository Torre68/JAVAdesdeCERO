package com.arquitecturajava.control;

import java.util.Scanner;

public class p02IfElse {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("¿Qué nota tienes?");
		int nota = sc.nextInt();
		sc.close();

		if (nota >= 5) {
			System.out.println("Has aprobado");
		} else {
			System.out.println("Has suspendido");
		}

	}

}
