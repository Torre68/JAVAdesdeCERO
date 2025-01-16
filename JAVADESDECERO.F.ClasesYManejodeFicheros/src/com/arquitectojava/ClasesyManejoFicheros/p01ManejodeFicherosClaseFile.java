package com.arquitectojava.ClasesyManejoFicheros;

import java.io.File;
import java.io.IOException;

public class p01ManejodeFicherosClaseFile {

	public static void main(String[] args) throws IOException {

File archivo = new File ("prueba.txt");
//Tras hacer esto hay que importar la herramienta File desde otro package, el package java.io
//Podemos hacerlo a traves del mensaje de error o, a traves de boton derecho>source>organiza imports

//archivo.createNewFile();

//al hacer esto nos sale error y tendremos que darle al mensaje y lanzar IOException
//una IOException es una clase que forma parte del paquete java.io 
//y representa una excepción que puede ocurrir durante operaciones de entrada/salida (I/O).
//Estas operaciones pueden incluir la lectura o escritura de archivos,
//la comunicación a través de redes, el acceso a dispositivos, entre otros.

//Al ejecutar el programa habra que refrescar para ver que ha tenido efecto.
File carpeta = new File ("carpeta");

//carpeta.mkdir();

archivo.delete();
carpeta.delete();
	}

}
