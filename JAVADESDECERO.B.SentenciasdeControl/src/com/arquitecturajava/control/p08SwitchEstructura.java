package com.arquitecturajava.control;

import java.util.Scanner;

public class p08SwitchEstructura {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("¿Qué día del finde es?");
		String día = sc.next();
		// Al introducir String estos deben ser exactos. Mayusculas, minusculas, acentos...
		switch (día) {
		case "Viernes":
			System.out.println("Viernes toca siesta y paseo");
			
			break;
		case "Sábado":
			System.out.println("Sábado toca siesta, entrenamiento y salir un rato");
			break;
			
		default:
		
			System.out.println("Domingo toca siesta y prepararse para el Lunes");
			break;
		}

	}

}
