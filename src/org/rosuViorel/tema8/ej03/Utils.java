package org.rosuViorel.tema8.ej03;

import org.rosuViorel.tema8.ej03.exception.NumeroException;

public class Utils {

	/**
	 * Devuelve true si el número pasado por parámetro es primo y falso en caso contrario.
	 * EL rango de edad debe estar entre 0 y 1000000 ambos incluidos. En caso contrario
	 * se lanzará una NumeroException
	 * 
	 * @param número
	 * @return true sí el número pasado por parámetro es primo y false en caso contrario.
	 * @throws Exception
	 */
	public boolean esPrimo(int i) throws NumeroException {
		
		if (i < 0 || i > 1000000) {
			throw new NumeroException();
		}
		
		boolean res = false;

		for(int j = 2; j <= i/2; ++j) {
            if(i % j != 0) {
                res = true;
                break;
            }
        }
		
		return res;
		
	}
}
