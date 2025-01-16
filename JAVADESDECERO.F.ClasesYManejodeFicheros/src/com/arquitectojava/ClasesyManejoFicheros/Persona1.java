package com.arquitectojava.ClasesyManejoFicheros;

public class Persona1 {
	//Al declarar las variables como privadas comenzamos con la encapsulacion
	//a traves de los metodos getter and setter sera como accedamos a ellas a partir de ahor
	//esto se lleva a cabo a traves de Seleccionar las variables>boton derecho>
	//Source>Generate getters and setters

	private String nombre;
	private int edad;
	//El modificador de acceso PRIVATE solo permite el acceso a estas variabes dentro de
	//la propia clase
	
	
	//Los metodos GET devuelven el valor de la propiedad
	public String getNombre() {
		return nombre;
	}
// Los metodos SET establecen el valor de la propiedad
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		// Con este if delimito los valores que se pueden permitir.
		//en este caso es una mera demostracion, poco logica pero demostracion.
		if (edad < 100) {
			
		this.edad = edad;}
		else { 
			this.edad = 100;
		}
	}

	
	public int faltaparajubilarse () { 
		
		
		return 67-edad;
	
	}
	// METODO ESTATICO. NO hace falta crear un objeto para poder invocarlo. Nos ahorraremos
	//el Persona1 p = new Persona1 (); y luego para invocarlo solo hara falta el 
	//Clase.metodo(); en este caso Persona1.tiempojubilacion (int edad);
	public static int tiempojubilacion (int edad) {
		
		return 67-edad;
	}

}
