package com.arquitectojava.ClasesyManejoFicheros;

import java.io.File;

public class p03ClaseFileRecursividad {

	public static void main(String[] args) {

		File fichero = new File("ManejoFicherosFolder");
		mostrarContenido(fichero);

	}
	// Para recorrer folders y su contenido deberiamos usar lo hecho en
	// p02ManejoFicherosFolder
	// Pero al empezar a haber mas carpetas y documentos el codigo se volveria
	// repetitivo y lioso.
	// Por cada carpeta habria que hacer los hecho en el ejercicio anterior,lo cual
	// se volveria mas
	// complicado con el bucle for each, y en este caso el bucle for resulta mejor.

	// Segun CHATGPT Si tu objetivo es simplemente iterar sobre una colección para
	// hacer una llamada recursiva, un bucle for-each es generalmente más limpio y
	// legible. Sin embargo, si necesitas acceder a los índices o realizar
	// operaciones más complejas basadas en la posición, un bucle for puede ser más
	// adecuado.

	// Por eso creamos una funcion recursiva (como en el caso del factorial) y con
	// solo ese codigo
	// nos valdra para recorrer todo el directorio y su contenido.
	public static void mostrarContenido(File fichero) {

		if (fichero.isDirectory()) {
			
			File[] contenido = fichero.listFiles();
			for (int i = 0; i < contenido.length; i++) {
				System.out.println(contenido[i].getName());
				if (contenido[i].isDirectory()) {
					mostrarContenido(contenido[i]);
				}

			}
		}
	}
}