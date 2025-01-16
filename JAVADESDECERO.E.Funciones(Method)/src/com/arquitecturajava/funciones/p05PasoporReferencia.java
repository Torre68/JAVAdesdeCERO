package com.arquitecturajava.funciones;

public class p05PasoporReferencia {

	public static void main(String[] args) {
		
		int [] lista = new int [] {1,2,3,4,5};
		duplicar(lista);
		for (int i :lista ) {
			//Bucle FOR-EACH mas sencillo para colecciones de arreglos (nums) y listas (letras)
			
		System.out.println(i);}



	}
	public static void duplicar (int [] elementos) {
		for (int i=0;i<elementos.length;i++) {
		elementos[i]= elementos [i]*2; }
		
		}
	}	