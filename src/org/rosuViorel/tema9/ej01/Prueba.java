package org.rosuViorel.tema9.ej01;

public class Prueba {
	public static void main(String[] args) {
		Prueba prueba = new Prueba();
		
		prueba.mControlVersiones();
		prueba.espacioLineas(2);
		prueba.mRefactorizacion();
		prueba.separador(2, 20, '=');
	}

	/**
	 * Metódo para el Control de Versiones.
	 * Este metódo describe el proceso de control de versiones.
	 * 
	 */
	private void mControlVersiones() {
		
		separador(2, 15, '=');
		mostrarTitulo("TEMA 1. CONTROL de VERSIONES");
		separador(2, 15, '=');
		
		mostrarTitulo("1. Conceptos generales");
		separador(1, 7, '*');
		
		mostrarTitulo("2. Repositorio centralizado. SVN");
		separador(1, 7, '*');
		
		mostrarTitulo("3. Repositorio distribuido. GIT");
		separador(2, 15, '=');
	}

	/**
	 * Metódo para la Refactorización.
	 * Este metódo describe el proceso de refactorización.
	 * 
	 */
	private void mRefactorizacion() {
		separador(2, 20, '=');
		mostrarTitulo("REFACTORIZACIÓN");
		separador(2, 20, '=');

		mostrarTitulo("1. Bad smells");
		separador(1, 7, '*');
		
		mostrarTitulo("2. Refactorizaciones habituales");
		separador(1, 7, '*');

		mostrarTitulo("3. Refactorizando con Eclipse");
	}

	/**
	 * Crea unas lineas de espacio para separar.
	 * 
	 * @param lineas es el número de lineas por crear
	 */
	private void espacioLineas(int lineas) {
		for (int i=0;i<lineas;i++) {
			System.out.println();
		}
	}
	
	/**
	 * Imprime un string pasado como parámetro.
	 * 
	 * @param string es el titulo por imprimir 
	 */
	private void mostrarTitulo(String string) {
		System.out.println(string);
	}

	/**
	 * Imprime un carácter por tantas lineas y columnas como se indica en los parámetros.
	 * 
	 * @param rows es el número de filas 
	 * @param cols es el número de columnas 
	 * @param car es el caráctero por imprimir 
	 */
	private void separador(int rows, int cols, char car) {
		for (int i=0;i<rows;i++) {
			for (int j=0;j<cols;j++) {
				System.out.print(car);
			}
			System.out.println();
		}
	}

}

