package com.app.logica;

import jakarta.persistence.Basic;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
public class Celular {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;

	@Basic
	private String marca;

	private String modelo;

	private double precio;

	// AGREGAR CONSTRUCTOR
	public Celular() {
		// TODO Auto-generated constructor stub
	}

	public Celular( String marca, String modelo, double precio) {
		super();
	
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
