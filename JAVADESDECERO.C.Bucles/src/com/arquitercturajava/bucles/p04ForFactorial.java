package com.arquitercturajava.bucles;


import java.util.Scanner;

public class p04ForFactorial {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Introduce número:");
		int num=sc.nextInt();
		sc.close();
		//La función factorial se representa con un signo de exclamación “!” detrás de un número. Esta exclamación quiere decir que hay que multiplicar todos los números enteros positivos que hay entre ese número y el 1. A este número, 6! le llamamos generalmente “6 factorial”, aunque también es correcto decir “factorial de 6”.
		int factorial=1;
		for (int i = 1; i <= num; i++) {
			
			factorial=factorial*i;
			
		}
		System.out.println("El resultado de "+num+" factorial es: "+factorial);


	}

}
