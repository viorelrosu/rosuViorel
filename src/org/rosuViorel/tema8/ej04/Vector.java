package org.rosuViorel.tema8.ej04;

import java.util.Arrays;

import org.rosuViorel.tema8.ej04.exception.InputDataException;

public class Vector {

	/**
	 * Ordena un vector de enteros proporcionado como parámetro
	 * EL rango de longitud del vector debe estar entre 0 y 5000 ambas incluidas. En caso contrario
	 * se lanzará una InputDataException
	 * 
	 * @param vector
	 * @return el vector ordenado
	 * @throws Exception
	 */
	public int[] ordenar(int[] vector) throws InputDataException {
		
		if((vector != null) && (vector.length > 0) && (vector.length < 5000)) {
			Arrays.sort(vector);
		} else {
			throw new InputDataException();
		}
		return vector;
	}
}
