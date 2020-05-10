package org.rosuViorel.tema8.ej01;

public class Cadena {
	private String cadena;

	public Cadena(String cadena) {
		this.cadena = cadena;
	}

	public String getCadena() {
		return this.cadena;
	}

	public void cDelante(String cadenaAConcatenar)  {
		this.cadena = cadenaAConcatenar + this.cadena;
	}

	public void cDetras(String cadena) {
		this.cadena = this.cadena + cadena;
	}

	public void quitar(char c) {
		this.cadena = this.cadena.replace("" + c + "", "");
	}
	
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
