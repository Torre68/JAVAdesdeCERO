package com.arquitectojava.ClasesyManejoFicheros;

public class Persona01 {

	public static void main(String[] args) {
		Persona p = new Persona ();
		p.nombre= "Pepe";
		p.edad= 58;
		Persona p1 = new Persona ();
		p1.nombre= "Mayra";
		p1.edad= 33;
		
		System.out.println(p.nombre+" "+p.edad);
		System.out.println("A "+p.nombre+" le falta para jubilarse "+p.faltaparajubilarse()+ " años.");
		System.out.println(p1.nombre+" "+p1.edad);
		System.out.println("A "+p1.nombre+" le falta para jubilarse "+p1.faltaparajubilarse()+ " años.");
		

	}

}
