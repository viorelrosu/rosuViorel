package org.rosuViorel.tema8.ej01;

public class Cadena {
	private String cadena;

	public Cadena(String cadena) {
		this.cadena = cadena;
	}

	public String getCadena() {
		return this.cadena;
	}

	/**
	 * Método para concatenar una cadena de texto por delante.
	 * 
	 * @param cadenaAConcatenar
	 */
	public void cDelante(String cadenaAConcatenar)  {
		this.cadena = cadenaAConcatenar + this.cadena;
	}

	/**
	 * Método para concatenar una cadena de texto en la parte de atras.
	 * 
	 * @param cadenaAConcatenar
	 */
	public void cDetras(String cadenaAConcatenar) {
		this.cadena = this.cadena + cadenaAConcatenar;
	}

	/**
	 * Método para quitar un carácter pasado como parámetro.
	 * 
	 * @param c es el carácter por quitar
	 */
	public void quitar(char c) {
		this.cadena = this.cadena.replace("" + c + "", "");
	}
	
	/**
	 * Método para quitar un carácter pasado como parámetro tantas veces como se indica.
	 * 
	 * @param c es el carácter por quitar
	 * @param i es el número de veces 
	 */
	public void quitar(char c, int i) {
		int contador=0, contadorSubstring = 1;
		for(int j=0; j<this.cadena.length(); j++) {
			if((this.cadena.charAt(j) == c) && (contador<i)) {
				contador++;
			}
			if(contador<i) {
				contadorSubstring++;
			}
		}
		
		contadorSubstring = (contadorSubstring > this.cadena.length()) ? this.cadena.length() : contadorSubstring;
		
		String subcadena = this.cadena.substring(0,contadorSubstring).replace(""+c+"", "");
		this.cadena = this.cadena.replace(this.cadena.substring(0,contadorSubstring), subcadena);
	}
	
}
