package com.arquitectojava.ClasesyManejoFicheros;

public class Persona101 {

	public static void main(String[] args) {
		Persona1 p = new Persona1 ();
		p.setNombre("Pepe");
		p.setEdad(58);
		Persona1 p1 = new Persona1 ();
		p1.setNombre("Mayra");
		p1.setEdad(33);
		
		System.out.println(p.getNombre()+" "+p.getEdad());
		System.out.println("A "+p.getNombre()+" le falta para jubilarse "+p.faltaparajubilarse()+ " años.");
		System.out.println(p1.getNombre()+" "+p1.getEdad());
		System.out.println("A "+p1.getNombre()+" le falta para jubilarse "+p1.faltaparajubilarse()+ " años.");
		

	}

}
