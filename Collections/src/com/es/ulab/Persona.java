package com.es.ulab;

public class Persona implements Comparable<Persona> {

	private String nombre;
	private int edad;
	private int anonacimiento;
	private String DNI;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getAnonacimiento() {
		return anonacimiento;
	}

	public void setAnonacimiento(int anonacimiento) {
		this.anonacimiento = anonacimiento;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}
@Override
	public int compareTo(Persona o) {
		if (this.getNombre() == o.getNombre()) {
			return 0;
		} else if (this.getEdad() > o.getEdad()) {
			return 1;
		} else
			return -1;

	}

}
