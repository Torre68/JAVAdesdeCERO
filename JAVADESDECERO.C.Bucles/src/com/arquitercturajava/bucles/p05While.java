package com.arquitercturajava.bucles;



public class p05While {

	public static void main(String[] args) {
		
		
		int i=1;
		// Inicializacion se fija a parte, la i la declaro fuera del bucle.
		while (i<=10) {
			
			System.out.println("2x"+i+"="+i*2);
			i++;
			
			//NO olvidarse del incrementador o se entra en bucle infinito/erroneo
		}
		
	}

}
