package com.es.ulab;

public class Notas {

	private Nota palabra;
	
	public enum Nota{
		INSUFICIENTE,SUFICIENTE,BIEN,NOTABLE,SOBRESALIENTE;
	}

	public Nota getPalabra() {
		return palabra;
	}

	public void setPalabra(Nota palabra) {
		this.palabra = palabra;
	}
	
	
}
