package edu.elsmancs.domain.kata_dni;
import java.util.*;

class Tabla_asignacion {
	
	private Map<Integer, Character> tabla;
	
	Tabla_asignacion(){
		Map<Integer, Character> tabla = new HashMap<Integer, Character>();
		tabla.put(0, 'T');
		tabla.put(1, 'R');
		tabla.put(2, 'W');
		tabla.put(3, 'A');
		tabla.put(4, 'G');
		tabla.put(5, 'M');
		tabla.put(6, 'Y');
		tabla.put(7, 'F');
		tabla.put(8, 'P');
		tabla.put(9, 'D');
		tabla.put(10, 'X');
		tabla.put(11, 'B');
		tabla.put(12, 'N');
		tabla.put(13, 'J');
		tabla.put(14, 'Z');
		tabla.put(15, 'S');
		tabla.put(16, 'Q');
		tabla.put(17, 'V');
		tabla.put(18, 'H');
		tabla.put(19, 'L');
		tabla.put(20, 'C');
		tabla.put(21, 'K');
		tabla.put(22, 'E');
		
		this.tabla = tabla;
	}
	
	char get_letter(int key) {
		return this.tabla.get(key);
	}
	
}
