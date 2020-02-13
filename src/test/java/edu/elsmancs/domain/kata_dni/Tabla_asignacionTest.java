package edu.elsmancs.domain.kata_dni;

/*import static org.junit.Assert.*;*/

import org.junit.Test;

public class Tabla_asignacionTest {

	@Test
	public void test() {
		
		Tabla_asignacion tabla = new Tabla_asignacion();
		assert(tabla.get_letter(0) == 'T');
		assert(tabla.get_letter(1) == 'R');
		assert(tabla.get_letter(2) == 'W');
		assert(tabla.get_letter(3) == 'A');
		assert(tabla.get_letter(4) == 'G');
		assert(tabla.get_letter(5) == 'M');
		assert(tabla.get_letter(6) == 'Y');
		assert(tabla.get_letter(7) == 'F');
		assert(tabla.get_letter(8) == 'P');
		assert(tabla.get_letter(9) == 'D');
		assert(tabla.get_letter(10) == 'X');
		assert(tabla.get_letter(11) == 'B');
		assert(tabla.get_letter(12) == 'N');
		assert(tabla.get_letter(13) == 'J');
		assert(tabla.get_letter(14) == 'Z');
		assert(tabla.get_letter(15) == 'S');
		assert(tabla.get_letter(16) == 'Q');
		assert(tabla.get_letter(17) == 'V');
		assert(tabla.get_letter(18) == 'H');
		assert(tabla.get_letter(19) == 'L');
		assert(tabla.get_letter(20) == 'C');
		assert(tabla.get_letter(21) == 'K');
		assert(tabla.get_letter(22) == 'E');
	}

}
