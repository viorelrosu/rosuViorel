package org.rosuViorel.tema8.ej03;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.rosuViorel.tema8.ej03.Utils;
import org.rosuViorel.tema8.ej03.exception.NumeroException;

public class UtilsTest {

	private Utils utils;
	
	@BeforeEach
	public void setUp() {
		this.utils = new Utils();
	}

	@Test
	public void esPrimo01() throws NumeroException {
		assertThrows(NumeroException.class, ()->this.utils.esPrimo(-1),"-1 esta fuera de rango");
	}

	@Test
	public void esPrimo02() throws NumeroException {
		assertFalse(this.utils.esPrimo(0), "0 NO es primo");
	}

	@Test
	public void esPrimo03() throws NumeroException {
		assertFalse(this.utils.esPrimo(1), "1 NO es primo");
	}

	@Test
	public void esPrimo04() throws NumeroException {
		assertTrue(this.utils.esPrimo(999983), "999983 es primo");
	}

	@Test
	public void esPrimo05() throws NumeroException {
		assertTrue(this.utils.esPrimo(999999), "999999 NO es primo");
	}
	
	@Test
	public void esPrimo06() throws NumeroException {
		assertTrue(this.utils.esPrimo(1000000), "1000000 NO es primo");
	}
	
	@Test
	public void esPrimo07() throws NumeroException {
		assertThrows(NumeroException.class, ()->this.utils.esPrimo(1000001), "1000001 esta fuera de rango");
	}

	
}
