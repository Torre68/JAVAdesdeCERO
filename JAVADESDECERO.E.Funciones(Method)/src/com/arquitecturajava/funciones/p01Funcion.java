package com.arquitecturajava.funciones;

public class p01Funcion {

	public static void main(String[] args) {

	//System.out.println("Hola");
	//System.out.println("Hola");
		//Ahora puedo invocar la funcion y ahorrar codigo obteniendo el mismo resultado
		holas();
	Adioses();
	holas();
	//System.out.println("Hola");
	//System.out.println("Hola");
	
	
	
	}
	//seleccionando con el raton el codigo del cual queremos extraer funcion solo basta con un
	//click boton derecho>Refactor>Extract Method y el IDE lo hace por si mismo solo teniendo
	//que aportar el nombre deseado.
	private static void Adioses() {
		System.out.println("Adios");
		System.out.println("Adios");
	}
	//Creamos la funcion
	static void holas () {
	//DEBE ESTAR FUERA DEL AMBITO DE public static void main(String[] args) {
		//Por ahora no tiene parametros y debe devolver void. Esto sera desarrollado mas adelante
		//En el curso Programacion Orientada a objeto (OOP)
		System.out.println("Hola");
		System.out.println("Hola");
	
	
	
	
	
	
	
	
	}
}