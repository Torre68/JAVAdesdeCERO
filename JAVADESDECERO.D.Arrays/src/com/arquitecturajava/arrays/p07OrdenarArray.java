package com.arquitecturajava.arrays;

public class p07OrdenarArray {

	public static void main(String[] args) {
		
		int [] lista = new int [] {8,2,5,1,7,9,3,4,0};
		
		//for (int i=0;i<lista.length;i++) 
		//De ejecutar el programa asi,nos daria un error the ArrayOutofBounds
		//ya que recorreria el bucle intentando llegar a la posicion 9, y la posicion 9
		//no existe porque al empezar en 0, la ultima possicion en este caso es la 8.
		//ademas el if esta invocando la posicion [i+1] por lo tanto siempre se saldra del array.
		//Esto lo arreglamos con un simple
		for (int i=0;i<lista.length-1;i++)
		{
			if (lista[i]>lista[i+1]) {
				int temporal = lista[i];
						lista[i]=lista[i+1];
						lista[i+1]=temporal;
			}
			
			
			System.out.println(lista[i]);
		}
	//Con esto simplemente no valdria porque hay muchos cambios
		//necesarios y el bucle no realiza las iteraciones suficientes.
		
	}

}
