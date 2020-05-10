package org.rosuViorel.tema8.ej04;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.rosuViorel.tema8.ej04.Vector;
import org.rosuViorel.tema8.ej04.exception.InputDataException;

public class VectorTest {

	private Vector vector;
	
	@BeforeEach
	public void setUp() {
		this.vector = new Vector();
	}
	
	@Test
	public void ordenar01() throws InputDataException{
		//ACT
		int[] array = {3,2,1};
		int[] esperado = {1,2,3};
		int[] res = this.vector.ordenar(array);
		
		//ARRANGE
		assertArrayEquals(esperado, res, "arrays iguales");
	}
	
	@Test
	public void ordenar02() throws InputDataException{
		//ACT
		int[] array = null;
		
		//ARRANGE
		assertThrows(InputDataException.class, ()->this.vector.ordenar(array), "array null - salta InputDataException");
	}
	
	@Test
	public void ordenar03() throws InputDataException{
		//ACT
		int[] array = {};
		
		//ARRANGE
		assertThrows(InputDataException.class, ()->this.vector.ordenar(array), "array empty - salta InputDataException");
	}
	
	@Test
	public void ordenar04() throws InputDataException{
		//ACT
		int[] array = new int[5001];
		for(int i=0; i<5001; i++) {
			array[i] = i;
		}

		//ARRANGE
		assertThrows(InputDataException.class, ()->this.vector.ordenar(array), "array length mayor de 5000 - salta InputDataException");
	}
}
