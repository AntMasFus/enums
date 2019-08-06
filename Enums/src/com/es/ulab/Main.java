package com.es.ulab;

import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		GenerarMenu();

	}

	public static void GenerarMenu() {
		int option;
		do {
			System.out.println("Seleccione una opción.");
			System.out.println("1-Nueva calificación.");
			System.out.println("2-Listar calificaciones.");

			Scanner scan = new Scanner(System.in);
			option = scan.nextInt();

			switch (option) {
			case 1:
				Alumno();
				break;
			default:
				Listar();
				break;
			}

		} while (option != 1 && option != 2);
	}

	public static void Alumno() {
		Alumno alum = new Alumno();
		System.out.println("Introduce el nombre del alumno:");
		Scanner scan = new Scanner(System.in);
		String alumno = scan.next();
		alum.setNombre(alumno);

		System.out.println("Introduce la nota del alumno:");
		Scanner scan2 = new Scanner(System.in);
		int nota = scan2.nextInt();
		if (nota >= 0 && nota <= 10) {
			alum.setNota(nota);

			switch (nota) {
			case 0:
				alum.setNota2("INSUFICIENTE");
				break;
			case 1:
				alum.setNota2("INSUFICIENTE");
				break;
			case 2:
				alum.setNota2("INSUFICIENTE");
				break;

			case 3:
				alum.setNota2("INSUFICIENTE");
				break;

			case 4:
				alum.setNota2("INSUFICIENTE");
				break;

			case 5:
				alum.setNota2("SUFICIENTE");
				break;

			case 6:
				alum.setNota2("BIEN");
				break;

			case 7:
				alum.setNota2("NOTABLE");
				break;

			case 8:
				alum.setNota2("NOTABLE");
				break;

			case 9:
				alum.setNota2("SOBRESALIENTE");
				break;

			case 10:
				alum.setNota2("SOBRESALIENTE");
				break;

			default:
				break;
			}
			GenerarMenu();
		} else {
			System.out.println("Nota incorrecta, valor entre 0 y 10 incluidos");
			GenerarMenu();
		}

	}

	public static void Listar() {

	}
}
