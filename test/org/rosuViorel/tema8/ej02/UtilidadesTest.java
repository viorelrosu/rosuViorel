package org.rosuViorel.tema8.ej02;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.rosuViorel.tema8.ej02.Utilidades;
import org.rosuViorel.tema8.ej02.exception.FechaException;

public class UtilidadesTest {
	
	private Utilidades utils;
	
	@BeforeEach
	public void setUp() {
		this.utils = new Utilidades();
	}
	
	@Test
	public void esFinDeSemana01() throws FechaException {		
		assertTrue(this.utils.esFinDeSemana(9,5,2020), "fecha 9/5/2020 es weekend - sábado");

	}
	
	@Test
	public void esFinDeSemana02() throws FechaException {		
		assertTrue(this.utils.esFinDeSemana(10,5,2020), "fecha 10/5/2020 es weekend - domingo");

	}
	
	@Test
	public void esFinDeSemana03() throws FechaException {
		assertFalse(this.utils.esFinDeSemana(7,5,2020), "fecha 7/5/2020 no es weekend");

	}
	
	@Test
	public void esFinDeSemana04() throws FechaException {
		assertFalse(this.utils.esFinDeSemana(1,1,1900), "fecha 1/1/1900 esta dentro del rango");

	}
	
	@Test
	public void esFinDeSemana05() throws FechaException {
		assertFalse(this.utils.esFinDeSemana(1,1,3000), "fecha 1/1/3000 esta dentro del rango");

	}
	
	@Test
	public void esFinDeSemana06() throws FechaException {
		assertThrows(FechaException.class, ()-> this.utils.esFinDeSemana(24,1,1899), "fecha 32/12/1899 no esta dentro del rango");

	}
	
	@Test
	public void esFinDeSemana07() throws FechaException {		
		assertThrows(FechaException.class, ()->this.utils.esFinDeSemana(24,1,3001), "fecha 2/1/3001 no esta dentro del rango");
	}

}
