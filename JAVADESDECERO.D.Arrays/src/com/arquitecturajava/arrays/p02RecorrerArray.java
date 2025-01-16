package com.arquitecturajava.arrays;

public class p02RecorrerArray {

	public static void main(String[] args) {
		int[] lista = new int[] { 3, 5, 7, 6 };
		
		System.out.println("Numero de posiciones en la lista: "+lista.length);
		
		for (int i=0;i<lista.length;i++) {
			//Asi recorremos el Array e imprimimos sus posiciones
			//System.out.println("Posicion: "+i);
			//Y asi recorremos el Array imprimiendo sus valores
			//System.out.println("Valor en la posicion :"+lista[i]);
			// O de un modo compacto
			System.out.println("Posicion: "+i+"  Valor en la posicion: "+lista[i]);
		}
		
	}

}
