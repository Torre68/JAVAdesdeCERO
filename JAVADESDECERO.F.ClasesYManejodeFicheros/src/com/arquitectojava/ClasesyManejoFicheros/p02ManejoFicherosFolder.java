package com.arquitectojava.ClasesyManejoFicheros;

import java.io.File;

public class p02ManejoFicherosFolder {

	public static void main(String[] args) {
		
		File fichero = new File ("ManejoFicherosFolder");
		System.out.println(fichero.isDirectory());
		//esto nos dice si existe la carpeta ManejoFicherosFolder
		if (fichero.isDirectory()) {
			
			String  [] ficheros= fichero.list();
			//Con esto he convertido los contenidos del fichero en un Array de elementos (como en 
			//el ejemplo de Ejercicios p02 For Each)
			
			for (String i : ficheros) {
				System.out.println(i);
				//Con el bucle for-each lo recorro e imprimo por pantalla su contenido
			}
		}
	
	}

}
