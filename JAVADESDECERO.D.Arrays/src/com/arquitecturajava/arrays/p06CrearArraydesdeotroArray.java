package com.arquitecturajava.arrays;

public class p06CrearArraydesdeotroArray {

	public static void main(String[] args) {
double [] lista = new double [] {3.5,5.5,7.5,2.5,9,8.5,5,0};
		
		
		
		double aprobados = 0;
		for (int i=0;i<lista.length;i++) {
			if (lista[i]>=5) {
				
			aprobados++;}
			
		}
		System.out.println("El numero de aprobados es: "+aprobados);
		double [] listaApr = new double [5];
		//Con esto creamos un nuevo Array de 5 elementos (los cinco aprobados) y a continuacion
		// vamos a crear un metodo para que ese Array sea rellenado "automaticamente" con solo
		//las notas de aprobados.
		int posicionApr = 0;
		//Cuidado con el tipo de variables, había puesto un double y no es necesario porque 
		//las POSICIONES (el continente, que no el contenido) de un array son enteras (int).
		
		for (int i=0;i<lista.length;i++) {
			if (lista[i]>=5) {
			listaApr[posicionApr]=lista[i];	
			//Con esto le estoy diciendo que en la nueva Array "listaApr", empezando por la posicion
			// "[posicionApr]"0 (para eso he declarado la variable posicionApr)
			//me la rellene con el valor de la posicion de la "lista[i]" que cumpla el criterio i=>5
			
			posicionApr++;}
		//Con esto hago que las posiciones se vayan rellenando
		
		
	}
		//System.out.println(listaApr.length);
		//Con esto comprobaria que la lista se haya rellenado correctamente
		
		for (int i=0;i<listaApr.length;i++) {
			
			System.out.println(listaApr[i]);
		}



	

	}
}