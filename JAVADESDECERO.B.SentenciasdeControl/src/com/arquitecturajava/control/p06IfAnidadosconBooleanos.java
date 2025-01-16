package com.arquitecturajava.control;

import java.util.Scanner;

public class p06IfAnidadosconBooleanos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("¿Qué nota tienes?");
		int nota = sc.nextInt();
		boolean oferta = true;
		 
		//Creamos boolean y pedimos info por escaner

		if (nota >= 5 && nota <= 10) {
			System.out.println("Has aprobado, obtienes Regalode un balón.");
			System.out.println("¿Hay oferta en la tienda?");
			oferta = sc.nextBoolean();
			//if (oferta) es la compactación de (oferta == true)
			if (oferta) {
				System.out.println("Además del balón, te llevas una camiseta.");
				//Aqui vemos el if anidado dentro del otro if.
				////if (!oferta) es la compactación de (oferta != true)
				} if (!oferta){System.out.println("Sin oferta aplicable solo te llevas el balón");
			//Otro if anidado
				}
		} else if (nota >= 0 && nota < 5) {
			System.out.println("Has suspendido, no obtienes Regalo");

		} else {
			System.out.println("Nota incorrecta");
			// Este ultimo else podria sustituirse por un if (nota<0 || nota<10)
			// {System.out.println("Nota incorrecta");} pero el else es una forma mas
			// reducida de hacerlo mismo.
		}

	}

}
