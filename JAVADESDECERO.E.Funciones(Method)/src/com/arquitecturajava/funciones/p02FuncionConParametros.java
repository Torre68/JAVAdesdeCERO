package com.arquitecturajava.funciones;

public class p02FuncionConParametros {

	public static void main(String[] args) {
		//Nombre de variables del programa main.
		double num1 = 3654.333;
		double num2 = 97327.793;
		//No necesitan coincidir con el nombre de las variables en el metodo
		
		sumar (num1,num2);
		//Invocamos metodo y pasamos variables, no necesitan coincidir con el nombre de las variables
		//del metodo. Ademas podemos crear las variable como arriba, o pasarle directamente
		//dos numeros y el metodo se realiza directamente
	}
 static void sumar (double a, double b) {
	 System.out.println("El resultado es "+ (a + b));
	 //Creo el metodo y le paso los parametros (double a y b) No tienen que coincidir 
	 // con el nombre de las variables fuera del metodo ya que estas las pasamos al metodo
	 //al invocarlo y pasarle los parametros
 }
}
