package com.arquitecturajava.basicos;

import java.util.Scanner;
//Esto aparece despues de clicar sobre la X y solicitar la importacion del Scanner
public class p04Scanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		//Al escribir esto el propio eclipse nos pide que importemos
		//la clase/utilidad Scanner. Pinchamos sobre la X y lo importamos
		System.out.println("dame un número");
		int nota = sc.nextInt();
		//Ahora con la utilidad Scanner sc y su funcionalidad .nextInt() hacemos que 
		//el programa lea los comandos introducidos por el usuario
		System.out.println("El doble del número es: ");
		System.out.println(nota*2);
		sc.close();
		//Este comando cierra el scanner.

		
	}

}
