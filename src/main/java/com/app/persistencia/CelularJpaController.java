package com.app.persistencia;

import com.app.logica.Celular;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class CelularJpaController {
	// "Fábrica" de conexiones (EntityManagerFactory).
		// Sirve para crear EntityManager, que son los que realmente hablan con la BD.
		private EntityManagerFactory emf = null;

		// En el constructor decimos con qué unidad de persistencia vamos a trabajar.
		// Esa unidad está definida en persistence.xml con el nombre "ejemplojpa".
		public CelularJpaController() {
			emf = Persistence.createEntityManagerFactory("unidadCelular");
		}

		// Método que crea y devuelve un nuevo "EntityManager".
		// Pensalo como: "dame un empleado que se conecte a la base para trabajar".
		public EntityManager getEntityManager() {
			return emf.createEntityManager();
		}

		// Método para guardar un Artista en la base de datos.
		public void crear(Celular cel) {
			EntityManager em = null;
			try {
				// Abrimos la conexión (pedimos un empleado).
				em = getEntityManager();
				
				// Iniciamos una transacción: empieza la "promesa".
				em.getTransaction().begin();
				
				// Guardamos el objeto en la base (pero todavía no está confirmado).
				em.persist(cel);
				
				// Confirmamos la transacción: ahora sí el objeto queda guardado.
				em.getTransaction().commit();
			} finally {
				// Cerramos la conexión (el empleado ya no hace falta).
				if (em != null) {
					em.close();
				}
}
		}}
