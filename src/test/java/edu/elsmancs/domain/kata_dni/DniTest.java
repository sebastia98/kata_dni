package edu.elsmancs.domain.kata_dni;

import static org.junit.Assert.*;

import org.junit.Test;

public class DniTest {

	@Test
	public void test() {
		Dni myDni = new Dni(41543118);
		assertEquals(myDni.get_dni(), 41543118, 0);
	}

}
