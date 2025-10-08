package com.app.presentacion;
import com.app.logica.Celular;
import com.app.logica.ControladoraLogica;

public class Main {
	public static void main(String[] args) {
	// INSTANCIAR DOS ARTISTAS
		Celular c1 = new Celular("Samsung", "a06" , 2000);
	// INSTANCIAR DOS CANCIONES

		ControladoraLogica conLog = new ControladoraLogica();
		try {
		// CREAR AL MENOS DOS ARTISTAS, Y DOS CANCIONES
			conLog.crearCelular(c1);

		} catch (Exception e) {
			System.out.println("No se pudo crear el elemento: " + e.getMessage());
		}

	}
}
