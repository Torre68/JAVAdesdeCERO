package com.arquitecturajava.arrays;

public class p05ArrayAprobadosMedia {

	

	public static void main(String[] args) {
		
		double [] lista = new double [] {3.5,5.5,7.5,2.5,9,8.5,5,0};
		
		//double aprobado=5;
		// No necesitaba declarar la variable aprobado porque se puede hacer simplemente
		//dentro del if (lista[i]>=5), por eso me salia mal ya que estaba añadiendo un +5 a
		// todas las operaciones.
		double total=0;
		double media = 0;
		for (int i=0;i<lista.length;i++) {
			if (lista[i]>=5) {
				total=total+lista[i];
			media++;}
			//Con el media++; (recordar media=media+1;) lo que hacemos es guardar el num
			// de veces que la condicion if se cumple, es decir el numero de aprobados
		}
		System.out.println("El numero de aprobados es: "+media);
		System.out.println("El valor total de los aprobados es: "+total);
		System.out.println("El valor medio de los aprobados es: "+total/media);
	}

}
