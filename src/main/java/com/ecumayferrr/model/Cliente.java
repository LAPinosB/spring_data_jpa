package com.ecumayferrr.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombre", unique = true)
	private String nombre;
	
	private String email;
	
	public Cliente() {}

	public Cliente(Long id, String nombre, String birtDate) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.email = birtDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getBirtDate() {
		return email;
	}

	public void setBirtDate(String birtDate) {
		this.email = birtDate;
	}

}
