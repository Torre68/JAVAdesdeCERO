package com.arquitecturajava.funciones;

public class p03FuncionReturn {

	public static void main(String[] args) {
		
				double num1 = 3654.333;
				double num2 = 97327.793;
				double resultado=sumar (num1,num2);
				
				System.out.println("El resultado de la suma es "+resultado);
				
			}
		 static double sumar (double a, double b) {
			 
			 return a+b;
			
	}

}
