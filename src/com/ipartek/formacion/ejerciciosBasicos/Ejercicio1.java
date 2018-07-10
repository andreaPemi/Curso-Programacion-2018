package com.ipartek.formacion.ejerciciosBasicos;

/**
 * 
 * Programa java que realice lo siguiente: declarar una variable N de tipo int,
 * una variable A de tipo double y una variable C de tipo char. asigna a cada
 * una un valor.
 * 
 * @author andreaperez
 *
 */

public class Ejercicio1 {

	public static void main(String[] args) {

		int numero = 5;
		double decimal = 2.5;
		char caracter = 'a';

		// mostrar por pantalla: El valor de cada variable.
		System.out.println("valor de numero es: " + numero);
		System.out.println("valor del decimal es: " + decimal);
		System.out.println("valor del caracter es : " + caracter);

		// la suma de N + * A.
		System.out.println("La suma de " + numero + " y " + decimal + " es: " + (numero + decimal));

		// la diferencia de A - N
		System.out.println("La diferencia entre " + decimal + " y " + numero + " es: " + (decimal - numero));

		// el valor numérico correspondiente al carácter que contiene la variable C.
		System.out.println("el valor numérico de la variable \"" + caracter + "\" es: " + (int) caracter);
	}

}
