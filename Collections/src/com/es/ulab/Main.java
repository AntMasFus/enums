package com.es.ulab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import com.es.ulab.Fecha;

public class Main {

	public static void main(String[] args) {

//		Persona[] persona = new Persona[3];
//
//		persona[0].setNombre("Ana");
//		persona[0].setEdad(26);
//		persona[0].setAnonacimiento(2010);
//
//		persona[1].setNombre("Alba");
//		persona[1].setEdad(21);
//		persona[1].setAnonacimiento(1988);
//
//		persona[2].setNombre("Ana");
//		persona[2].setEdad(26);
//		persona[2].setAnonacimiento(2009);
//
//		persona[3].setNombre("Alba");
//		persona[3].setEdad(26);
//		persona[3].setAnonacimiento(2007);
//
//		List<Persona> personaList = Arrays.asList(persona);
//		
//		Collections.sort(personaList);
//		
//		for(Persona p : personaList) {
//			System.out.println(p.getNombre());
//		}
//
		// Primer apartado
		String primero = "Esto es una prueba";
		String primero2 = primero.toUpperCase();
		System.out.println(primero2);

		// Segundo apartado
		String segundo = "La clase String, tiene varios metodos, muy útiles, como saber su longitud, trocear la cadena,etc";
		String[] segundo2 = segundo.split(",");
		int i = 0;
		while (i < segundo2.length) {
			System.out.println(segundo2[i]);
			i++;
		}

		// tercer apartado
		String tercero = "Esto es un ejemplo usado para determinar un indice";
		int tercero2 = tercero.indexOf("ejemplo");
		System.out.println(tercero2);

		// cuarto apartado

		fecha("01/02/2009");

	}

	private static void fecha(String date) {

		String[] separador = date.split("/");
		int j = 0;
		while (j < separador.length) {
			System.out.println(separador[j]);
			j++;
		}
		
		String mes = separador[0];
		String dia = separador[1];
		String ano = separador[2];
		
		switch (mes) {
		case "01":
			System.out.println("Enero");
			break;

		default:
			break;
		}
		
		

	}

}
