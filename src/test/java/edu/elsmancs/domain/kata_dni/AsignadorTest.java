package edu.elsmancs.domain.kata_dni;

import static org.junit.Assert.*;

import org.junit.Test;

public class AsignadorTest {

	@Test
	public void test() {
		Asignador asignador = new Asignador(41543118);
		asignador.set_key();
		assertEquals(asignador.get_key(), 12, 0);
	}
	
	public void test2() {
		Asignador asignador = new Asignador(49481602);
		asignador.set_key();
		assertEquals(asignador.get_key(), 0, 0);
	}

}
