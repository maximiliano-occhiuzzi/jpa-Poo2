package com.app.persistencia;


import com.app.logica.Celular;

public class ControladoraPersistencia {
	// Artista: Creamos una instancia del controlador que sabe cómo hablar con la
	// base de datos
	CelularJpaController CelularJpa = new CelularJpaController();

	// Cancion: Creamos una instancia del controlador que sabe cómo hablar con la
	// base de datos
	// INSTANCIAR OBJETO DE CANCIONJPACONTROLER AL IGUAL QUE SE HIZO CON ARTISTA

	// Este método es el que se usa desde otras capas para crear un ARTISTA
	public void crearCelular(Celular Celular) {
		// Delegamos la tarea al controlador especializado
		CelularJpa.crear(Celular);
	}

	

}
