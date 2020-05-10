package org.rosuViorel.tema8.ej01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.rosuViorel.tema8.ej01.Cadena;

public class CadenaTest {

	@Test
	public void cDelante01() {
		// ARRANGE
		Cadena actual = new Cadena("caminos");

		// ACT
		actual.cDelante("corre");

		// ASSERT
		assertEquals("correcaminos", actual.getCadena(), "corre+caminos=correcaminos");
	}

	@Test
	public void cDelante02() {
		// ARRANGE
		Cadena actual = new Cadena("algo");

		// ACT
		actual.cDelante("");

		// ASSERT
		assertEquals("algo", actual.getCadena(), "NULL + algo = algo");
	}

	@Test
	public void cDelante03() {
		// ARRANGE
		Cadena actual = new Cadena("");

		// ACT
		actual.cDelante("algo");

		// ASSERT
		assertEquals("algo", actual.getCadena(), "algo + NULL = algo");
	}

	@Test
	public void cDelante04() {
		// ARRANGE
		Cadena actual = new Cadena("");

		// ACT
		actual.cDelante("");

		// ASSERT
		assertEquals("", actual.getCadena(), "NULL + NULL = NULL");
	}

	// ==========================================================================

	@Test
	public void cDetras01() {
		// ARRANGE
		Cadena actual = new Cadena("caminos");

		// ACT
		actual.cDetras("corre");

		// ASSERT
		assertEquals("caminoscorre", actual.getCadena(), "caminos+corre=caminoscorre");
	}

	@Test
	public void cDetras02() {
		// ARRANGE
		Cadena actual = new Cadena("algo");

		// ACT
		actual.cDetras("");

		// ASSERT
		assertEquals("algo", actual.getCadena(), "algo + NULL = algo");
	}

	@Test
	public void cDetras03() {
		// ARRANGE
		Cadena actual = new Cadena("");

		// ACT
		actual.cDetras("algo");

		// ASSERT
		assertEquals("algo", actual.getCadena(), "NULL + algo = algo");
	}

	@Test
	public void cDetras04() {
		// ARRANGE
		Cadena actual = new Cadena("");

		// ACT
		actual.cDetras("");

		// ASSERT
		assertEquals("", actual.getCadena(), "NULL + NULL = NULL");
	}

	// ==========================================================================

	@Test
	public void quitarChar01() {
		// ARRANGE
		Cadena actual = new Cadena("-x-");

		// ACT
		actual.quitar('x');

		// ASSERT
		assertEquals("--", actual.getCadena());
	}

	@Test
	public void quitarChar02() {
		// ARRANGE
		Cadena actual = new Cadena("-x-x-y-xxx-");

		// ACT
		actual.quitar('x');

		// ASSERT
		assertEquals("---y--", actual.getCadena());
	}

	@Test
	public void quitarChar03() {
		// ARRANGE
		Cadena actual = new Cadena("abecedario");

		// ACT
		actual.quitar('x');

		// ASSERT
		assertEquals("abecedario", actual.getCadena());
	}

	// ==========================================================================

	@Test
	public void quitarCharInt01() {
		// ARRANGE
		Cadena actual = new Cadena("-1x-2x-3x-");

		// ACT
		actual.quitar('x',1);

		// ASSERT
		assertEquals("-1-2x-3x-", actual.getCadena());
	}
	
	@Test
	public void quitarCharInt02() {
		// ARRANGE
		Cadena actual = new Cadena("-1x-2x-3x-");

		// ACT
		actual.quitar('x',2);

		// ASSERT
		assertEquals("-1-2-3x-", actual.getCadena());
	}
	
	@Test
	public void quitarCharInt03() {
		// ARRANGE
		Cadena actual = new Cadena("-1x-2x-3x-");

		// ACT
		actual.quitar('x',7);

		// ASSERT
		assertEquals("-1-2-3-", actual.getCadena());
	}
	
	@Test
	public void quitarCharInt04() {
		// ARRANGE
		Cadena actual = new Cadena("-1x-2x-3x-");

		// ACT
		actual.quitar('x',0);

		// ASSERT
		assertEquals("-1x-2x-3x-", actual.getCadena());
	}
	
	@Test
	public void quitarCharInt05() {
		// ARRANGE
		Cadena actual = new Cadena("-1x-2x-3x-");

		// ACT
		actual.quitar('x',-1);

		// ASSERT
		assertEquals("-1x-2x-3x-", actual.getCadena());
	}

}
