package com.es.ulab;

public class GenerarTablero {

	public static void main(String[] args) {
		
		generartablero(8, 4);
	}
	
	public static void generartablero(int a,int b) {
		for (int i = 0; i < a; i++) {
			System.out.println();
			for (int j = 0; j < b; j++) {
				System.out.print("[]");
			}
		}
	}
}

