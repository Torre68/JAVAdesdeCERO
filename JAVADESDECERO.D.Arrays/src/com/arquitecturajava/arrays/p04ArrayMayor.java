package com.arquitecturajava.arrays;

public class p04ArrayMayor {

	public static void main(String[] args) {
		
		int [] lista = new int [] {14,5,30,-8,12};
		//Declaro la variable "mayor" y la igualo a la primera posicion
		// lo que el bucle hace es recorrer la lista y lo que el if hace es comparar a cada valor
		// de cada posicion con el anterior y guardarlo si es mayor que el anterior. Guardando
		//el valor mayor. OJO! Esto se podria hacer con "int mayor=0; en vez de
		// "int mayor = lista[0];" pero solo funcionaria correctamente
		// en una lista con numeros mayores a 0 y para sacer el numero mayor. 
		//Al sacar el menor y haber numeros negativos con la int = 0; no valdria
		//habria que usar la declaracion de variable "int mayor = lista[0];"
		
		int mayor = lista[0];
		int menor = lista [0];
		for (int i=0;i<lista.length; i++) {
			if (mayor<lista[i]) 
				mayor=lista[i];
			if (menor>lista[i])
				//OJO con cambiar adecuadamente los parametros para adecuarlos a lo que
				// se requiere (mayor< y menor>) o no nos devolvera lo solicitado.
				menor=lista[i];
				//System.out.println("cambia"); 
			//con esto veriamos el num de veces que la variable
			//mayor o menor cambian, pero al ser dos variables no sale bien diferenciado
			//para verlo mejor hacerlo con solo una variable
			
		
		}
		System.out.println("El numero mayor es: "+ mayor);
		System.out.println("El numero menor es: "+ menor);
	}

}
