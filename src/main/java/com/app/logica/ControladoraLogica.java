package com.app.logica;

import com.app.persistencia.ControladoraPersistencia;

public class ControladoraLogica {

	// La controladora de persistencia se encarga de hablar con la BD.
	// Desde aquí la usamos como "puente" para guardar datos.
	ControladoraPersistencia controlPersis = new ControladoraPersistencia();

	// ----- Celular -----
	// Método de la capa lógica para crear un artista.
	// Antes de guardarlo en la BD, se hacen validaciones.
	public void crearCelular(Celular cel) throws Exception {
		// Validación: el artista debe tener un nombre
		if (cel.getMarca() == null || cel.getMarca().isEmpty()) {
			throw new Exception("El celular debe tener un modelo.");
		}
		// Validación: el artista debe tener un género musical
		if (cel.getModelo() == null || cel.getModelo().isEmpty()) {
			throw new Exception("El celular debe tener una marca");
		}
		// Validación: la edad debe ser positiva
		if (cel.getPrecio() <= 0) {
			throw new Exception("el precio del celular debe ser mayor a 0.") ;
		}

		// AGREGAR AL MENOS UNA VALIDACIÓN MAS
		
		// Si pasa todas las validaciones, recién ahí se manda a la persistencia
		controlPersis.crearCelular(cel);
	}
}
