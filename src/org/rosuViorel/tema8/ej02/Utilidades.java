package org.rosuViorel.tema8.ej02;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.rosuViorel.tema8.ej02.exception.FechaException;

public class Utilidades {

	public Utilidades() {
		super();
	}
	
	/**
	 * Devuelve true si la fecha proporcionada cae en sábado o domingo y falso en caso contrario.
	 * EL rango de edad debe estar entre 1/1/1900 y 1/1/3000 ambas fechas incluidas. En caso contrario
	 * se lanzará una FechaException
	 * 
	 * @param dia
	 * @param mes
	 * @param anio
	 * @return true si la fecha proporcionada cae en sábado o domingo y falso en caso contrario.
	 * @throws Exception
	 */
	public boolean esFinDeSemana(int dia, int mes, int anio) throws FechaException {
		boolean sol = false;
		Calendar fechaLimiteAnterior = new GregorianCalendar(1900,0,1);
		Calendar fechaLimitePosterior = new GregorianCalendar(3000,0,1);
		Calendar fecha = new GregorianCalendar(anio, (mes-1)<0 ? mes : mes-1, dia);
		if (( fecha.after(fechaLimiteAnterior) || fecha.equals(fechaLimiteAnterior) ) && ( fecha.before(fechaLimitePosterior) || fecha.equals(fechaLimitePosterior) ) ) {
			int dayOfWeek = fecha.get(Calendar.DAY_OF_WEEK);
			if((dayOfWeek == Calendar.SATURDAY) || (dayOfWeek == Calendar.SUNDAY)) {
				sol = true;
			}
		} else {
			throw new FechaException();
		}

		return sol;
	}
}
