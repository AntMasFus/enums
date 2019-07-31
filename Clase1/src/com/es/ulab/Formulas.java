package com.es.ulab;

public class Formulas {

	public static void main(String[] args) {
		String a = String.valueOf("4");
		String b = String.valueOf("2");
		String c = String.valueOf("1");
		String d = String.valueOf("1");
	calculadora(args[a],args[b],args[c],args[d]);
	}
	
	public static void calculadora(double a,double b,double c,double d) {
		
	double resultado= ((a/b)*(c/d));
		System.out.println("El resultado es:"+resultado);
		
	}
}
