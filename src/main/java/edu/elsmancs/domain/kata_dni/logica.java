package edu.elsmancs.domain.kata_dni;

import java.util.Scanner;

class logica {
	
	private static Scanner input;
	
	public static void main(String[] args) {

		input = new Scanner(System.in);
		System.out.println("Inserta DNI:");
		
		Dni myDni = new Dni(input.nextInt());
		
		Asignador myAsignador = new Asignador(myDni.get_dni());
		myAsignador.set_key();
		
		Tabla_asignacion myTabla = new Tabla_asignacion();
		System.out.println(myTabla.get_letter(myAsignador.get_key()));
		
	}

}
